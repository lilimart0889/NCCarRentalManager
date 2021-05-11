package mx.edu.j2se.LilianaMartinezPelaez.CarRental.service;

import mx.edu.j2se.LilianaMartinezPelaez.CarRental.model.GammaVehicle;
import mx.edu.j2se.LilianaMartinezPelaez.CarRental.repository.GammaVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GammaVehicleServiceImpl implements GammaVehicleService {

    @Autowired
    private GammaVehicleRepository gammaVehicleRepository;


    @Transactional(readOnly = true)
    public List<GammaVehicle> getByGammaVehicle(String idGammaVehicle) {
        return gammaVehicleRepository.findByGammaVehicle(idGammaVehicle);
    }

    @Override
    public List<GammaVehicle> findAllGamma() {
        return gammaVehicleRepository.findAll();
    }
}
