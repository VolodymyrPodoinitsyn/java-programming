package day43_list_castom_classes;

public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Vova";
        employee1.jobTitle = "SDET";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Vlad";
        employee2.jobTitle = "PO";
        employee2.work();

        Employee employee3 = new Employee();
        employee3.name = "Ihor";
        employee3.jobTitle = "Scram Master";
        employee3.work();



    }

}
