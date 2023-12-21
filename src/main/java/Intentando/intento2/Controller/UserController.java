package Intentando.intento2.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/publico")
@RequiredArgsConstructor
public class UserController {
    @PostMapping(value = "/addToWishList")

    public String addToWishList()
    {
        System.out.println();
        return "agregaste wena wena";
    }
}