package mx.edu.j2se.LilianaMartinezPelaez.CarRental;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROYECT: CAR RENTAL
*/

public class Car {

    private int numberPlate;
    private String brand;
    private String model;
    private String gamma;
    private String transmission;
    private String seatsCapacity;
    private int availability;
    private boolean isAvailability;
    private float price;
    private int idReservation;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public Car(String brand, String model, String gamma,String transmission, String seatsCapacity, float price) {
        this.brand = brand;
        this.model = model;
        this.gamma = gamma;
        this.transmission = transmission;
        this.seatsCapacity = seatsCapacity;
        //this.availability = availability;
        this.price = price;
        //this.reservation = reservation;
    }

    public Car(int idReservation) {
        this.idReservation = idReservation;
    }

    //*********************************
    // METHODS                        *
    // ********************************

    // Reading and setting number plate (unique)
    public int getNumberPlate() {
        return numberPlate;
    }
    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    // Reading and setting brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Reading and setting model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Reading and setting gamma
    public String getGamma() {
        return gamma;
    }
    public void setGamma(String gamma) {
        this.gamma = gamma;
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
        return "Car [" +
                "Number plate= " + numberPlate +
                ", Brand= '" + brand + '\'' +
                ", Model= '" + model + '\'' +
                ", Gamma= '" + gamma + '\'' +
                ", Transmission='" + transmission + '\'' +
                ", Seats capacity=" + seatsCapacity +
                ", Price=" + price +
                ']';
    }



}
