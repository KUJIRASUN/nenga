package jp.rync.nenga.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginContoller {

    /**
     * Logger
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/signin")
    public String showSignInPage(Model model) {
        logger.debug("start showSignInPage");
        logger.debug("end showSignInPage");
        return "signin";
    }

    @PostMapping("/signout")
    public String signOut(Model model) {
        return "signin";
    }
}
