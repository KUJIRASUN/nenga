package jp.rync.nenga.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class NengaApplicationController {

    /**
     * Logger
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/mypage")
    public String showMyPage(Principal principal, Model model) {
        logger.debug("start showMyPage");
        Authentication authentication = (Authentication) principal;
        String userName = authentication.getName();
        model.addAttribute("username", userName);
        logger.debug("end showMyPage");
        return "mypage";
    }
}
