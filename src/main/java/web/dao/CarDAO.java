package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("model1", 100, "red"));
        cars.add(new Car("model2", 200, "blue"));
        cars.add(new Car("model3", 300, "green"));
        cars.add(new Car("model4", 400, "white"));
        cars.add(new Car("model5", 500, "black"));
    }

    public List<Car> showCars(int i) {
        int indexTo = Math.min(i, cars.size());
        return  cars.subList(0, indexTo);
    }

}
