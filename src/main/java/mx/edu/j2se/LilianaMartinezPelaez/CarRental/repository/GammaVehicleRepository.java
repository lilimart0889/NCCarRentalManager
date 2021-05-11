package mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository;


/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.GammaVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GammaVehicleRepository extends JpaRepository<GammaVehicle, String> {

    @Query(value = "SELECT gv from Category gv where gv.idGammaVehicle")
    List<GammaVehicle> findByGammaVehicle (String idGammaVehicle);
}
