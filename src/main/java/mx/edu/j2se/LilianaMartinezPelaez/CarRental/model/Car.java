package mx.edu.j2se.LilianaMartinezPelaez.CarRental.model;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehicles")

public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NUMBER_PLATE;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "mx/edu/j2se/LilianaMartinezPelaez/CarRental/model")
    private String model;

    @Column(name = "TRANSMISSION")
    private String transmission;

    @Column(name = "SEATS_CAPACITY")
    private String seatsCapacity;

    @Column(name = "PRICE")
    private float price;

    @Column(name = "ID_RESERVATION")
    private int idReservation;

    @Column(name = "IMAGE")
    private String image;

    @ManyToOne
    @JoinColumn(name= "ID_GAMMA_VEHICLES")
    private GammaVehicle idGammaVehicle;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public Car() {
        super();
    }

    public Car(Long numberPlate, String brand, GammaVehicle idGammaVehicle, String model, String transmission, String seatsCapacity, float price, String image) {
        this.NUMBER_PLATE = numberPlate;
        this.brand = brand;
        this.model = model;
        this.idGammaVehicle = idGammaVehicle;
        this.transmission = transmission;
        this.seatsCapacity = seatsCapacity;
        this.price = price;
        this.image = image;
    }

    public Car(int idReservation) {
        this.idReservation = idReservation;
    }

    //*********************************
    // METHODS                        *
    // ********************************

    // Reading and setting number plate (unique)
    public Long getNumberPlate() {
        return NUMBER_PLATE;
    }
    public void setNumberPlate(Long NUMBER_PLATE) {
        this.NUMBER_PLATE = NUMBER_PLATE;
    }

    // Reading and setting brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Reading and setting mx.edu.j2se.LilianaMartinezPelaez.CarRental.model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Reading and setting gamma
    public GammaVehicle getGammaVehicle() {
        return idGammaVehicle;
    }
    public void setGammaVehicle(GammaVehicle idGammaVehicle) {
        this.idGammaVehicle = idGammaVehicle;
    }

    // Reading and setting seats capacity
    public String getSeatsCapacity() {
        return seatsCapacity;
    }
    public void setSeatsCapacity(String seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
    }

    // Reading and setting transmission
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    // Reading and setting price
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    // Reading and setting price
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    // Reading and setting price
    public float getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    @Override
    public String toString() {
        return "Car [" +
                "Number plate= " + NUMBER_PLATE +
                ", Brand= '" + brand + '\'' +
                ", Model= '" + model + '\'' +
                ", Gamma= '" + idGammaVehicle + '\'' +
                ", Transmission='" + transmission + '\'' +
                ", Seats capacity=" + seatsCapacity + '\'' +
                ", Price=" + price + '\'' +
                ", Image=" + image +
                ']';
    }
}
