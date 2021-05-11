package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.UserGuest;

import java.util.List;

public interface UserGuestService {

    List<UserGuest> getAllUserGuest();

    void saveUserGuest(UserGuest userGuest);

    UserGuest findUserGuestById(Long ID_USER_GUEST);

    void deleteUserGuest(UserGuest userGuest);
}
