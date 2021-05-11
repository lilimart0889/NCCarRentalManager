package mx.edu.j2se.LilianaMartinezPelaez.CarRental.controller;

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Car;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.service.CarService;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
@ComponentScan("mx/edu/j2se/LilianaMartinezPelaez/CarRental/")
@RequestMapping("templates/car")
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping("/showAllVehicles")
    public String showAllCars(HttpSession session, Model model) {

        if(session.getAttribute("showAll") == null) {
            session.setAttribute("showAll", carServiceImpl.getAllCar());
        }

        return "showAllVehicles/index";
    }

//    @GetMapping("/selectAVehicle")
//    public String showPickUpDate(HttpSession session, Model model) {
//        session.setAttribute("car",carServiceImpl.getAllCar());
//    }
}
