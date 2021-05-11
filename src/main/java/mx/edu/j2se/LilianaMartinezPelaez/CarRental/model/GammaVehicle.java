package mx.edu.j2se.LilianaMartinezPelaez.CarRental.model;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gamma_vehicles")
public class GammaVehicle implements Serializable {

    @Column(name ="ID_GAMA_VEHICLES")
    private String idGammaVehicle;

    @Column(name ="DESCRIPTION")
    private String description;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public GammaVehicle() {
        super();
    }

    public GammaVehicle(String idGammaVehicle) {
        this.idGammaVehicle = idGammaVehicle;
    }

    public GammaVehicle(String idGammaVehicle, String description) {
        this.idGammaVehicle = idGammaVehicle;
        this.description = description;
    }

    //*********************************
    // METHODS                        *
    // ********************************

    public String getIdGammaVehicle() {
        return idGammaVehicle;
    }
    public void setIdGammaVehicle(String idGammaVehicle) {
        this.idGammaVehicle = idGammaVehicle;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) { this.description = description;}



}
