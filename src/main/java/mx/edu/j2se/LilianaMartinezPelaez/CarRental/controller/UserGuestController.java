package mx.edu.j2se.LilianaMartinezPelaez.CarRental.controller;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.UserGuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.service.UserGuestService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserGuestController {

    @Autowired
    public UserGuestService userGuestService;

    @GetMapping("/reservation/user")
    public String showClientDetailsForm() {
        return "/reservation/user/index";
    }

//    @PostMapping("/reseration/user")
//    public String login(@ModelAttribute("login") Login login, HttpSession session)

}
