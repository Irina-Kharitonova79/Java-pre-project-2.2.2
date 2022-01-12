package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
@RequestMapping("/cars")
public class CarList {

    private final CarDAO carDAO;

    public CarList(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String carsByCount(
            @RequestParam(name="count", required = false, defaultValue = "99999") int count, Model model
    ) {
        model.addAttribute("cars", carDAO.showCars(count));
        return "cars/cars";
    }
}
