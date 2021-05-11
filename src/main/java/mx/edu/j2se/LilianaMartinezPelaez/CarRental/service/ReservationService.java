package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;


/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Reservation;

import java.util.Optional;

public interface ReservationService {

    void saveReservation(Reservation reservation);
    void deleteReservation(Long ideReservation);
    Optional<Reservation> findReservationById(Long idReservation);
    Optional<Reservation> findReservationByUserGuest(String firstName, String lastName);
    Optional<Reservation> findReservationByUserId(Long ID_USER_GUEST);



}
