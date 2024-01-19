package src.src.src.ru.itmo.java.basics.lesson6;

public class EmployeeBank extends Human {
    String bankName;

    public EmployeeBank(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String printData() {
        return this.getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' + '\'' +
                ", bank name='" + bankName + '\'' +
                '}';
    }
}
