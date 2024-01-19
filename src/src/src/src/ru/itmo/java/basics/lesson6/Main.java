package src.src.src.ru.itmo.java.basics.lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 and Task 2");
        Client client = new Client("John", "Wick", "Continental");
        System.out.println(client.printData());
        EmployeeBank employee = new EmployeeBank("John", "Cena", "WWE");
        System.out.println(employee.printData());
        employee.dateCreate();

        System.out.println("Task 3");
        Truck kamaz = new Truck(4500, "KAMAZ", 'B', 110, 6, 10000);
        System.out.println(kamaz.toString());
        kamaz.wheels(8);
        System.out.println(kamaz.toString());

        System.out.println("Task 4. Enter number");
        Sonclass son = new Sonclass();
        son.setNumber();
        son.son1();

        System.out.println("Task 5. Enter number and name");
        Sonclass2 son2 = new Sonclass2();
        son2.god();
        System.out.println(son2.toString());
    }

}
