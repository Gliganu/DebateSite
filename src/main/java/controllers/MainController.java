package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Andrei on 03/12/2015.
 */
@Controller
public class MainController {

    @RequestMapping("/home")
    public String showHome() {
        return "home";
    }
}
