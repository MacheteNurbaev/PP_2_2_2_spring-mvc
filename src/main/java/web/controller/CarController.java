package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;


@Controller
@RequestMapping(value = "cars")
public class CarController {

    private final Service service;

    @Autowired
    public CarController(Service service) {
        this.service = service;
    }

    @GetMapping()
    public String countCar(@RequestParam(defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", service.countCars(count));
        return "cars";

    }


}