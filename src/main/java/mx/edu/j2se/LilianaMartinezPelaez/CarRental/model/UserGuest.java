package mx.edu.j2se.LilianaMartinezPelaez.CarRental.model;

/*AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL "TRIPS BY WHEELS"
 */

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users_guest")
public class UserGuest implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_USER_GUEST;

    @NotNull
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Column(name = "AGE")
    private String age;

    @Column(name = "RESIDENCE")
    private String residence;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL")
    private String eMail;

    //*********************************
    // CONSTRUCTORS                   *
    // ********************************

    public UserGuest() {
        super();
    }

    public UserGuest(Long ID_USER_GUEST) {
        this.ID_USER_GUEST = ID_USER_GUEST;
    }

    public UserGuest(String firstName, String lastName, String age, String residence, String phoneNumber, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.residence = residence;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public UserGuest(Long ID_USER_GUEST, String firstName, String lastName, String age, String residence, String phoneNumber, String eMail) {
        this.ID_USER_GUEST = ID_USER_GUEST;
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
    public Long getIdUserGuest() {
        return ID_USER_GUEST;
    }
    public void setIdUserGuest(Long ID_USER_GUEST) {
        this.ID_USER_GUEST = ID_USER_GUEST;
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
                "ID User Guest=" + ID_USER_GUEST +
                ", Firstname='" + firstName + '\'' +
                ", Lastname='" + lastName + '\'' +
                ", Age='" + age + '\'' +
                ", Residence='" + residence + '\'' +
                ", Phone number='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ']';
    }


}
