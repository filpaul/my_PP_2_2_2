package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("BMW", 3, 190));
        carList.add(new Car("AUDI", 6, 400));
        carList.add(new Car("BMW", 5, 380));
        carList.add(new Car("Mercedes-Benz", 450, 360));
        carList.add(new Car("Mazda", 6, 150));
    }


    @Override
    public List<Car> getCars(int count) {
        return count <= carList.size() && count >= 0 ? carList.subList(0, count) : carList;

    }
}
