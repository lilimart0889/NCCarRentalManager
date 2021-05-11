package mx.edu.j2se.LilianaMartinezPelaez.CarRental.controller;

import com.example.demo.ThymeleafTestController;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Reservation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping({"/", "/index", "/views"})
    public String Welcome(HttpSession session, Model model) {
        Reservation newReservation = new Reservation();
        session.setAttribute("reservation", newReservation);
        return "views";
    }

}
