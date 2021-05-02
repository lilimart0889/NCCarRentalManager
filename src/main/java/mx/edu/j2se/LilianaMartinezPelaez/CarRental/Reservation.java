package mx.edu.j2se.LilianaMartinezPelaez.CarRental;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROYECT: CAR RENTAL
 */

import java.util.Date;

public class Reservation {

    private int idReservation;
    private int idUserGuest;
    private int numberPlate;
    private Date pickUpDate;
    private Date returnDate;
    private float totalPrice;
    private int availability;
    private boolean isAvailability;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public Reservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public Reservation(int idReservation, int idUserGuest, int numberPlate, Date pickUpDate, Date returnDate, float totalPrice) {
        this.idReservation = idReservation;
        this.idUserGuest = idUserGuest;
        this.numberPlate = numberPlate;
        this.pickUpDate = pickUpDate;
        this.returnDate = returnDate;
        this.totalPrice = totalPrice;
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
    public void setIdUserGuest(int numberPlate) {
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
