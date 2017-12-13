package org.isotope.boot.sample.bootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by deepak on 12/13/17.
 */
@Controller
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String printHello() {
        return "Hello from " + System.getenv("HOSTNAME");
    }
}
