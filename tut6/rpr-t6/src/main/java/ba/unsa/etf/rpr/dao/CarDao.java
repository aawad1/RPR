package ba.unsa.etf.rpr.dao;

import ba.unsa.etf.rpr.domain.Car;
import ba.unsa.etf.rpr.domain.Model;

import java.util.List;

public interface CarDao extends DAO<Car> {
    List<CarDao> getByModel(Model model);
    List<CarDao> getByColor(String color);
    List<CarDao> getByPrice(String price);
}
