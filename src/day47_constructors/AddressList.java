package day47_conatructors;

public class AddressList {

    public static void main(String[] args) {
        Address cybertekAddress= new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setState("7902 Jones Branch Dr Suite 3200");
        System.out.println("address after update = " + cybertekAddress);
        System.out.println("Street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        System.out.println(newAddress.toString());
    }

}
