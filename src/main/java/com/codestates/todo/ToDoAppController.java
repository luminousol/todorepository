package com.codestates.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoAppController {

    @GetMapping("/")
    public String todo() {
        return "To-do-Application";
    }
}
