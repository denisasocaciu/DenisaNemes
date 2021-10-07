package ro.sci.oophw;

public class Contact {
    private int id;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    Contact(int id, String phoneNumber, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact { " +
                "id= " + id +
                ", phoneNumber= '" + phoneNumber + '\'' +
                ", firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' + " " +
                '}';
    }
}

