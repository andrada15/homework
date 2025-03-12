package ro.scoalainformala;

import java.util.ArrayList;
import java.util.List;

public class Phone implements FunctionsOfAPhone{
    private int numberOfContact;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private final List<String> messages = new ArrayList<>();
    private int batteryLife;
    List<Contact> contacts = new ArrayList<>();

    public Phone(int batteryLife, String color, String material, String IMEI)
    {
        this.batteryLife = batteryLife;
    }

    @Override
    public void addContact(int numberOfContact, String phoneNumber, String firsName, String lastName)
    {
        this.numberOfContact = numberOfContact;
        contacts.add(new Contact(numberOfContact, phoneNumber, firsName, lastName));
    }
    @Override
    public String existingContacts()
    {
        StringBuilder storedContacts = new StringBuilder();
        for(Contact contact : contacts)
        {
            storedContacts.append(contact);
        }
        return storedContacts.toString();

    }

    @Override
    public void sendMessage(String phoneNumber, String message)
    {
        if(message.length() < 500)
        {
            messages.add("To " + phoneNumber + ": " +  message);
            System.out.println("The message from the phone number: " + phoneNumber + " is: " + message);
            batteryLife --;
            System.out.println("Your battery life will last for: " + batteryLife + "hours");
        }

        else
        {
            System.out.println("Error: The message you wrote is too long");
        }

    }

    @Override
    public void seeMessages(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
        for(String message : messages)
        {
            System.out.println("All the messages from the phone number " + this.phoneNumber);
            System.out.println(message);
        }

    }

    public void getFirstMessage(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
        System.out.println("The message from the phone number " + phoneNumber + " is: ");
        System.out.println(messages.getFirst());

    }

    public void getSecondMessage(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
        System.out.println("The message from the phone number " + phoneNumber + " is: ");
        System.out.println(messages.get(1));

    }

    @Override
    public void call(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
        batteryLife = batteryLife -2;
        List<String> calls = new ArrayList<>();
        calls.add(phoneNumber);
        System.out.println("This number called: " + calls);

    }

    @Override
    public void viewHistory()
    {
        System.out.println("The calls history is: ");
        call(this.phoneNumber);
    }

    public void getFirstContact()
    {
        System.out.println("The first contact is: " + contacts.getFirst());
    }

    public void getLastContact()
    {
        System.out.println("The last contact is: " + contacts.getLast());
    }
}
