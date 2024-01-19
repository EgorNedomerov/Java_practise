package src.src.src.ru.itmo.java.basics.lesson6;

public class Sonclass2 extends Godclass2 {
    @Override
    public String toString() {
        return "Sonclass2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void god() {
        super.god();
        name = scanner.next();

    }
}
