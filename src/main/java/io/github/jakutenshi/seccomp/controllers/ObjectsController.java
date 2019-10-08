package io.github.jakutenshi.seccomp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjectsController {

    @GetMapping("/objects")
    public String objects() {
        return "objects";
    }
}
