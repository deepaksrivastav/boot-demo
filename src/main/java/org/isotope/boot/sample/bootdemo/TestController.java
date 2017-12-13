package org.isotope.boot.sample.bootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by deepak on 12/13/17.
 */
@Controller
public class TestController {

    @GetMapping("/")
    @ResponseBody
    public String greet() {
        return "Greetings Earthlings! </br> You have reached the planet : <b>" + System.getenv("HOSTNAME") + "</b>";
    }
}
