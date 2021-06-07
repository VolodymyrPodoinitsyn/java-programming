package day43_list_castom_classes;

public class Person {
    //Data -> variable
    String firstName;
    int age;
    char gender;
    //behaviour -> method
    public void speak() {
        System.out.println("Person is speaking");
    }

}

class People {

    public static void main(String[] args) {
        // created object of Person class - Instantiation Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 39;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Max";
        person2.age = 33;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }

}
