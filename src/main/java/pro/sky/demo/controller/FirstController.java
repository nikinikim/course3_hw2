package pro.sky.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String launchApp() {
        return "Приложение запущено!";
    }
    @GetMapping("/info")
    public String page() {
        return "Мосунов Николай Николаевич " +
                "Демо проект " +
                "04.02.2023 " +
                "Проект выполнен в рамках домашнего задания ";
    }
}
