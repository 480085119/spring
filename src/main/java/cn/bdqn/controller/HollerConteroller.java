package cn.bdqn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HollerConteroller {
    @GetMapping
    public String Heller(){
        return "hello spring boot";
    }
}
