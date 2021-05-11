package mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query(value = "SELECT r FROM reservations r WHERE r.idReservation = ?1")
    Optional<Reservation> findByIdReservation(Long idReservation);

    @Query(value = "SELECT r FROM reservation r WHERE r.userguest.firstName AND  r.userguest.lastName = ?1")
    Optional<Reservation> findByUserGuest(String firstName, String lastName);

    @Query(value = "SELECT r FROM reservation r WHERE r.idUserGuest = ?1")
    Optional<Reservation> findByIdUserGuest(Long idUserGuest);

    @Query(value = "SELECT r FROM reservation r WHERE r.numberPlate = ?1")
    Optional<Reservation> findByINumberPlate(Long numberPlate);

}

