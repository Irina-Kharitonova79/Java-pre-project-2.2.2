package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarDAO carDAO;

    public List<Car> showCars(int count) {
        return carDAO.showCars(count);
    }

}
