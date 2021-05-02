package mx.edu.j2se.LilianaMartinezPelaez.CarRental;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROYECT: CAR RENTAL
 */

public class UserGuest {

    private int idUserGuest;
    private String firstName;
    private String lastName;
    private String age;
    private String residence;
    private String phoneNumber;
    private String eMail;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public UserGuest(int idUserGuest) {
        this.idUserGuest = idUserGuest;

    }

    public UserGuest(String firstName, String lastName, String age, String residence, String phoneNumber, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public UserGuest(int idUserGuest, String firstName, String lastName, String age, String residence, String phoneNumber, String eMail) {
        this.idUserGuest = idUserGuest;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    //*********************************
    // METHODS                        *
    // ********************************

    // Reading and setting id user guest (unique)
    public int getIdUserGuest() {
        return idUserGuest;
    }
    public void setIdUserGuest(int numberPlate) {
        this.idUserGuest = idUserGuest;
    }

    // Reading and setting first name
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Reading and setting last name
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Reading and setting age
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    // Reading and setting residence
    public String getResidence() {
        return residence;
    }
    public void setResidence(String residence) {
        this.residence = residence;
    }

    // Reading and setting phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Reading and setting  first name
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User guest [" +
                "ID User Guest=" + idUserGuest +
                ", Firstname='" + firstName + '\'' +
                ", Lastname='" + lastName + '\'' +
                ", Age='" + age + '\'' +
                ", Residence='" + residence + '\'' +
                ", Phone number='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ']';
    }




}
