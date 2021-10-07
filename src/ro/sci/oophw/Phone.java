package ro.sci.oophw;

import java.util.ArrayList;

public abstract class Phone {

    private static final int MAX_SMS_LENGTH = 100;
    private ArrayList<Contact> contacts = new ArrayList<>();
    private ArrayList<SMS> textMessages = new ArrayList<>();
    private ArrayList<Call> calls = new ArrayList<>();
    private String IMEI;
    private int currentBatteryLevel;

    public String getIMEI() {
        return IMEI;
    }

    void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    int getCurrentBatteryLevel() {
        return currentBatteryLevel;
    }

    void setCurrentBatteryLevel(int currentBatteryLevel) {
        this.currentBatteryLevel = currentBatteryLevel;
    }

    abstract String getColor();

    abstract void setColor(String color);

    abstract String getMaterial();

    abstract void setMaterial(String material);

    void addContact(int id, String phoneNumber, String firstName, String lastName) {


        contacts.add(new Contact(id, phoneNumber, firstName, lastName));

    }

    void listContacts() {

        System.out.println("Listing all contacts: ");

        System.out.println(contacts.toString());
    }

    void sendMessage(String phone_number, String message_content) {

        //decrease battery level
        currentBatteryLevel -= 1;

        if (message_content.length() < MAX_SMS_LENGTH) {
            System.out.println("We have sent a message to " + phone_number);
            System.out.println("Message was " + message_content);

            textMessages.add(new SMS(phone_number, message_content));
        } else
            System.err.println("Message too long");

    }

    void listMessages(String phone_number) {

        int messageCounter = 0;
        for (SMS textMessage : textMessages) {

            if (textMessage.phoneNumber.equals(phone_number)) {
                System.out.println("Listing all messages to " + phone_number);
                System.out.println(textMessage.toString());
                messageCounter++;
            }

        }
        if (messageCounter == 0) {
            System.out.println("No messages sent to " + phone_number);
        }

    }

    void call(String phone_number) {


        char[] digits = phone_number.toCharArray();
        boolean validPhoneNumber = true;

        for (char digit : digits)
            if (!Character.isDigit(digit)) {
                System.err.println("Invalid phone number format");
                validPhoneNumber = false;
            }


        if ((digits[0] == '0') && (digits.length == 10) && (validPhoneNumber)) {

            calls.add(new Call(phone_number));
            System.out.println("We called somebody");

            // and we have less battery
            currentBatteryLevel -= 2;

        }
    }

    void viewHistory() {

        System.out.println("Listing all cals: ");

        for (Call c : calls) {
            System.out.println(c.toString());
        }

    }

    class SMS {

        private String phoneNumber;
        private String message;

        SMS(String phoneNumber, String message) {
            this.phoneNumber = phoneNumber;
            this.message = message;
        }

        @Override
        public String toString() {
            return "SMS { " +
                    "phoneNumber= '" + phoneNumber + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }
    }

    class Call {

        private String phoneNumber;


        Call(String phoneNumber) {
            this.phoneNumber = phoneNumber;

        }

        @Override
        public String toString() {
            return "Call to { " +
                    "phoneNumber= '" + phoneNumber + '\'' +
                    '}';
        }
    }
}

