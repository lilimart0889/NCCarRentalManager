package mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// JPA Entity
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.UserGuest;

import java.util.Optional;

@Repository
@ComponentScan(basePackages = "mx/edu/j2se/LilianaMartinezPelaez/CarRental")
public interface UserGuestRepository extends JpaRepository<UserGuest, Long> {

}
