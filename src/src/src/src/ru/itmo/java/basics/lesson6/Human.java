package src.src.src.ru.itmo.java.basics.lesson6;

public abstract class Human implements Test {
    public String name;
    public String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String printData();

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void dateCreate() {
        System.out.println(this.getClass().getSimpleName() + " использовал интерфейс");
    }
}

