package mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// JPA Entity
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Car;

import java.util.Date;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query(value ="SELECT v FROM vehicles v WHERE v.BRAND = ?1 ")
    List<Car> findByBrand(String brand);

    @Query(value ="SELECT v FROM vehicles v WHERE v.MODEL = ?1 ")
    List<Car> findByModel(String model);

    @Query(value ="SELECT v FROM vehicles LEFT JOIN reservation r ON v.NUMBER_PLATE = r.vehicles.NUMBER_PLATE WHERE r.pickUp is NULL")
    List<Car> availableVechicles(@Param("PickUpDate") Date pickUpDate);

    @Query(value ="SELECT gv FROM gamma_vehicles LEFT JOIN vehicles v ON gv.idGammaVehicle = v.idGammaVehicle")
    List<Car> findByGamma(@Param("GammaVehicles") String idGammaVehicle);

}
