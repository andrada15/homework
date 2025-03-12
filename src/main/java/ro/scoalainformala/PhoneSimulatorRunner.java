package ro.scoalainformala;

import ro.scoalainformala.samsung.SamsungGalaxy6;

public class PhoneSimulatorRunner {

    public void run()
    {
        //Phone phone= new Samsung(); // shouldn't compile

        Phone phone = new SamsungGalaxy6(15, "green", "aluminium","49015420323751");

        phone.addContact(1, "phone number", "first name", "last name");

        phone.addContact(2, "second phone number", "second first name", "second last name");

        phone.getFirstContact();

        phone.getLastContact();

// send a message to the first contact from the previously listed

// max number of characters - 100

        phone.sendMessage("phone number", "message content");
        phone.sendMessage("phone number", "message content");

        phone.getFirstMessage("phone number");

        phone.getSecondMessage("phone number");

// make a call to the second contact from the previously listed

        phone.call("second phone number");

        phone.viewHistory();
    }
}
