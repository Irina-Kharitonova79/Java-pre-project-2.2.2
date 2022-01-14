package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carServise) {
        this.carService = carServise;
    }

    @GetMapping()
    public String carsByCount(@RequestParam(name="count", required = false) Integer count, Model model) {
        if (count == null) {
            count = Integer.MAX_VALUE;
        }
        model.addAttribute("cars", carService.showCars(count));
        return "cars/cars";
    }
}
