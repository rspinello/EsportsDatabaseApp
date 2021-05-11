package com.example.esportshub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerDetailController {
    
@GetMapping("/playerdetail")
public String playerDetail() {
    return "playdetail";
}

}
