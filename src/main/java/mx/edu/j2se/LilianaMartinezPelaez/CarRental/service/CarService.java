package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Car;
import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getAllCar();
    Optional<Car> findById(Long NUMBER_PLATE);
    Car saveCar(Car car);
    void updateCar(Car car);
    void deleteCar(Long NUMBER_PLATE);
}
