package ba.smoki.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class Demo {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("messages", Arrays.asList("Jedna", "dvije", "tri"));
        return "index";
    }
}
