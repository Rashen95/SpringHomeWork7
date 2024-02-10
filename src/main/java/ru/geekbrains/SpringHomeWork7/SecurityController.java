package ru.geekbrains.SpringHomeWork7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/public-data")
    public String publicData() {
        return "public";
    }

    @GetMapping("/private-data")
    public String privateData() {
        return "private";
    }
}
