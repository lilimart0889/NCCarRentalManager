package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Car;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
//@ComponentScan("mx/edu/j2se/LilianaMartinezPelaez/CarRental/")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Car> getAllCar() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Car> findById(Long NUMBER_PLATE) {
        return carRepository.findById(NUMBER_PLATE) ;
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void updateCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void deleteCar(Long NUMBER_PLATE) {
        carRepository.deleteById(NUMBER_PLATE);
    }

    @Transactional(readOnly = true)
    public List<Car> getVehicleByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }

    @Transactional(readOnly = true)
    public List<Car> getVehicleByModel(String model) {
        return carRepository.findByModel(model);
    }

    @Transactional(readOnly = true)
    public List<Car> getVechicleByGamma(String idGammaVehicle) {
        return carRepository.findByGamma(idGammaVehicle);
    }

    @Transactional(readOnly = true)
    public List<Car> getVehicleByAvailability(Date pickUpDate) {
        return carRepository.availableVechicles(pickUpDate);
    }

}
