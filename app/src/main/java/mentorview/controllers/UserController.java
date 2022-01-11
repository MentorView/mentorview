package mentorview.controllers;

import mentorview.application.UserService;
import mentorview.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    UserService userService;

    @GetMapping("/user")
    public Map<String, Object> signup(@AuthenticationPrincipal User )
}
