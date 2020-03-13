package com.project.NewsProject.dto;

public class NewsRequestCreateNews extends NewsRequestPassword {

    private String title;
    private String content;

    public NewsRequestCreateNews() {
        super();
    }

    public NewsRequestCreateNews(String login, String password) {
        super(login, password);
    }

    public NewsRequestCreateNews(String login, String password, String title, String content) {
        super(login, password);
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NewsRequestCreateNews [title=" + title + ", content=" + content + "]";
    }

}
