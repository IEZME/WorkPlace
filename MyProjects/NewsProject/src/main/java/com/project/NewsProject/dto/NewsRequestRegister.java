package com.project.NewsProject.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class NewsRequestRegister {

    private String name;
    private String login;
    private String password;
}
