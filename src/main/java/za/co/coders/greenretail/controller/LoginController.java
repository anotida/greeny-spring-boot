package za.co.coders.greenretail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import za.co.coders.greenretail.dto.LoginDto;

@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String renderLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDto loginDto) {
        log.info("Request: {}", loginDto);
        return "redirect:/login";
    }

}
