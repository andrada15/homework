package ro.scoalainformala;

public interface FunctionsOfAPhone {

    void addContact(int numberOfContact, String phoneNumber, String firsName, String lastName);

    String existingContacts();

    void sendMessage(String phoneNumber, String message);

    void seeMessages(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory();

}
