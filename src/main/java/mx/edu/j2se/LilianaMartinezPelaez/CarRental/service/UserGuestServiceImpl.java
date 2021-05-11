package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.UserGuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository.UserGuestRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component
public class UserGuestServiceImpl implements UserGuestService {

    @Autowired
    private UserGuestRepository userGuestRepository;

    @Override
    @Transactional(readOnly = true)
    public List<UserGuest> getAllUserGuest() {
        return userGuestRepository.findAll();
    }

    @Override
    public void saveUserGuest(UserGuest userGuest) {
        userGuestRepository.save(userGuest);
    }

    @Override
    public UserGuest findUserGuestById(Long ID_USER_GUEST) {
        return userGuestRepository.findById(ID_USER_GUEST).orElse(null);
    }

    @Override
    public void deleteUserGuest(UserGuest userGuest) {
        userGuestRepository.delete(userGuest);
    }

}
