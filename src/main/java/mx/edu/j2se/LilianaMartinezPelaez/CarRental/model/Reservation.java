package mx.edu.j2se.LilianaMartinezPelaez.CarRental.model;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL
 */

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    @Column(name = "PICKUP_DATE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pickUpDate;

    @Column(name = "RETURN_DATE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date returnDate;

    @Column(name = "TOTAL_PRICE")
    private float totalPrice;


    private int availability;
    @Column(name = "ISAVAILABILITY")
    private boolean isAvailability;

    @ManyToOne
    @JoinColumn(name= "ID_USER_GUEST")
    private int idUserGuest;

    @OneToOne
    @JoinColumn(name= "VEHICLES_NUMBER_PLATE")
    private int numberPlate;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public Reservation() {
        super();
    }

    public Reservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Reservation(int idReservation, int idUserGuest, int numberPlate, Date pickUpDate, Date returnDate, float totalPrice, int availability) {
        this.idReservation = idReservation;
        this.idUserGuest = idUserGuest;
        this.numberPlate = numberPlate;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.totalPrice = totalPrice;
        this.availability = availability;
    }

    //*********************************
    // METHODS                        *
    // ********************************

    // Reading and setting ID Reservation (unique)
    public int getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    // Reading and setting number plate (unique)
    public int getNumberPlate() {
        return numberPlate;
    }
    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    // Reading and setting id user guest (unique)
    public int getIdUserGuest() {
        return idUserGuest;
    }
    public void setIdUserGuest(int idUserGuest) {
        this.idUserGuest = idUserGuest;
    }

    // Reading and setting pickup date
    public Date getPickUpDate() {
        return pickUpDate;
    }
    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    // Reading and setting return date
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    // Reading and setting total price
    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    //Reading and setting availability
    public boolean isAvailability() {
        if (availability == 0 ) {
            return isAvailability = false;
        } else {
            return isAvailability = true;
        }
    }
    @Override
    public String toString() {
        return "Reservation [" +
                "ID Reservation=" + idReservation +
                ", Number plate=" + numberPlate +
                ", User guest=" + idUserGuest +
                ", Pick-up date=" + pickUpDate +
                ", Return date=" + returnDate +
                ", Total price=" + totalPrice +
                ']';
    }




}
