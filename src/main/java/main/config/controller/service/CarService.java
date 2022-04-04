package main.config.controller.service;

import main.config.controller.model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@PropertySource("classpath:application.properties")
public class CarService {
    List<Car> carList;

    @Value("${Car.max}")
    public int carMax;

    @PostConstruct
    public void init() {
        carList = new ArrayList<>();
        carList.add(new Car("Volkswagen", 1, 245));
        carList.add(new Car("Mazda", 2, 99));
        carList.add(new Car("Skoda", 3, 929));
        carList.add(new Car("Mazeratti", 4, 999));
        carList.add(new Car("lada", 5, 70));
        carList.add(new Car("VAZ", 6, 75));
        carList.add(new Car("GAZ", 7, 55));
        carList.add(new Car("UAZ", 8, 60));
        carList.add(new Car("MAZ", 9, 79));
        carList.add(new Car("Lada", 10, 70));
    }

    public List<Car> getCarList(Integer count) {
        if (count == null || count >= carMax){
            return carList;
        }
        return carList.subList(0, count);
    }
}
