package ro.sci.oophw;

public class Main {

    public static void main(String[] args) {

        Phone motorola = new MotorolaDefy("AAAAAA");

        motorola.addContact(1, "0755676767", "Mihai", "Sas");
        motorola.addContact(2, "0765342341", "Ioana", "Adi");
        motorola.listContacts();

        motorola.sendMessage("0755676767", "Good morning");
        motorola.listMessages("0755676767");
        motorola.sendMessage("0765342341", "How are you?");

        motorola.call("0765342341");
        motorola.call("0756879098");
        motorola.call("0745345432");
        motorola.call("0723009676");
        motorola.call("0789767676");
        motorola.call("0734122134");
        motorola.viewHistory();

        motorola.setColor("blue");
        System.out.println("Phone color is " + motorola.getColor());
        System.out.println("Battery level " + motorola.getCurrentBatteryLevel());
    }
}

