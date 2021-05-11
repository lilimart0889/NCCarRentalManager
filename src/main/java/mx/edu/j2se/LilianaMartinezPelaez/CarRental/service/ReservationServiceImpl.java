package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.Reservation;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long ideReservation) {
        reservationRepository.deleteById(ideReservation);
    }

    @Override
    public Optional<Reservation> findReservationById(Long idReservation) {
        return reservationRepository.findByIdReservation(idReservation);
    }

    @Override
    public Optional<Reservation> findReservationByUserGuest(String firstName, String lastName) {
        return reservationRepository.findByUserGuest(firstName, lastName);
    }

    @Override
    public Optional<Reservation> findReservationByUserId(Long ID_USER_GUEST) {
        return reservationRepository.findByIdUserGuest(ID_USER_GUEST);
    }

    @Transactional
    public Optional<Reservation> findByINumberPlate(Long numberPlate) {
        return reservationRepository.findByINumberPlate(numberPlate);
    }
}
