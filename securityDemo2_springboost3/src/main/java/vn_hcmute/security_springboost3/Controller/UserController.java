package vn_hcmute.security_springboost3.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn_hcmute.security_springboost3.Service.UserService;
import vn_hcmute.security_springboost3.entity.UserInfor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/new")
    public String addUser(@RequestBody UserInfor userInfor) {
        return userService.addUser(userInfor);

    }
}
