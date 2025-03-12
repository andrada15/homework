package ro.scoalainformala;

public class Contact{
    private final int numberOfContact;
    private final String phoneNumber;
    private final String firstName;
    private final String lastName;

    public Contact(int numberOfContact, String phoneNumber, String firstName, String lastName) {
        this.numberOfContact = numberOfContact;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "numberOfContact=" + numberOfContact +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
