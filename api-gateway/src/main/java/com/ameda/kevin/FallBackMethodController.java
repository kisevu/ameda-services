package com.ameda.kevin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/stockServiceFallBackMethod")
    public String stockServiceFallBackMethod(){
        return "Stock service took longer than Expected to respond "+
                "please try again later";
    }
    @GetMapping("/customerServiceFallBackMethod")
    public String customerServiceFallBackMethod(){
        return "Customer service took longer than Expected to respond "+
                "please try again later";
    }
}
