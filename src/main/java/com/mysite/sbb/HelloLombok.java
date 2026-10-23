package com.mysite.sbb;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@Controller
public class HelloController {
    private String hello;
    private int lombok;
}
