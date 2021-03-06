package sookim.authServer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sookim.authServer.domain.User;
import sookim.authServer.service.UserService;

import java.util.List;

@RequestMapping("/admin")
@RequiredArgsConstructor
@RestController
public class AdminController {
    private final UserService userService;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<User>> getAdmin(){
        List<User> userList = userService.getUserList();
        return ResponseEntity.ok(userList);
    }
}