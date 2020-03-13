package com.project.NewsProject.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.NewsProject.dto.NewsRequestCreateNews;
import com.project.NewsProject.dto.NewsRequestPassword;
import com.project.NewsProject.dto.NewsRequestRegister;
import com.project.NewsProject.model.RussiaNewsArticles;
import com.project.NewsProject.model.UsaNewsArticles;
import com.project.NewsProject.model.User;

@Controller
public class NewsViewController {

	private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

	public NewsViewController() {
		users.put("Artem", new User("Artem", "Admin1"));
		users.put("Anton", new User("Anton", "Admin2"));
	}

	@GetMapping("/mainpage")
	private String mainpage(Model model) throws IOException, InterruptedException, URISyntaxException {

		var httpClient = HttpClient.newHttpClient();
		var httpClientU = HttpClient.newHttpClient();

		var httpRequest = HttpRequest.newBuilder()
				.GET()
				.uri(new URI("http://newsapi.org/v2/top-headlines?country=ru&apiKey=3082d30927ba48a2bdbb5db530ce3947"))
				.build();
		
		var httpRequestU = HttpRequest.newBuilder()
		        .GET()
		        .uri(new URI("http://newsapi.org/v2/top-headlines?country=us&apiKey=3082d30927ba48a2bdbb5db530ce3947"))
		        .build();

		var httpResponse = httpClient.send(httpRequest, BodyHandlers.ofString());
		var httpResponseU = httpClientU.send(httpRequestU, BodyHandlers.ofString());

		var objectMapper = new ObjectMapper();
		var objectMapperU = new ObjectMapper();
		

		var rus = objectMapper.readValue(httpResponse.body(), RussiaNewsArticles.class);
		var usa = objectMapperU.readValue(httpResponseU.body(), UsaNewsArticles.class);
		
		model.addAttribute("mainpage", rus.getArticles());
		model.addAttribute("news", usa.getArticles());

		return "mainpage";

	}

	@GetMapping("/login")
	private String login(Model model) {
		model.addAttribute("request", new NewsRequestPassword());
		return "login";
	}

	@PostMapping("/login")
	private String getUsername(Model model, @ModelAttribute NewsRequestPassword request) {
		System.out.println(request);
		System.out.println("login " + request.getLogin());
		System.out.println("password " + request.getPassword());
		if (!users.containsKey(request.getLogin())) {
			model.addAttribute("error", true);
			model.addAttribute("request", new NewsRequestPassword());
			System.out.println(users.get(request.getLogin()));
			return "login";
		}

		if (!users.get(request.getLogin()).getPassword().equals(request.getPassword())) {
			model.addAttribute("error", true);
			model.addAttribute("request", new NewsRequestPassword());
			return "login";

		}
		model.addAttribute("user", users.get(request.getLogin()));
		model.addAttribute("request", new NewsRequestPassword());
		return "redirect:/" + request.getLogin() + "/createNews?password=" + request.getPassword();
	}

	@GetMapping("/register")
	private String register(Model model) {
		model.addAttribute("request", new NewsRequestRegister());
		return "register";
	}

	@PostMapping("/register")
	private String registerNewUser(Model model, @ModelAttribute NewsRequestRegister request) {
		users.put(request.getLogin(), new User(request.getLogin(), request.getPassword()));
		return "redirect:/login";
	}

	@GetMapping("/{login}/createNews")
	private String getAdminPage(Model model, @PathVariable(name = "login") String login,
			@RequestParam(name = "password") String password) {
		model.addAttribute("request", new NewsRequestCreateNews(login, password));
		return "admin";

	}

	@PostMapping("/{login}/createNews")
	private String createNews(Model model, @PathVariable(name = "login") String login,
			@RequestParam(name = "password") String password) {
		model.addAttribute("request", new NewsRequestCreateNews(login, password));
		System.out.println("I try to creat, but no");
		return "admin";

	}

}
