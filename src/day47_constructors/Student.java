package day47_conatructors;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("No-Args constructor");
    }

    public Student(String name) {
        System.out.println("name param constructor | name = " + name);
    }

    public Student(int age) {
        System.out.println("age param constructor | name = " + age);
    }

    public Student(String name, int age) {
        System.out.println("name$age param constructor | = " + name + " - " + age);
    }

}
