package src.src.src.ru.itmo.java.basics.lesson6;

public class Truck extends Car {
    public int quantityWheels;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, int quantityWheels, int maxWeight) {
        super(w, m, c, s);
        this.quantityWheels = quantityWheels;
        this.maxWeight = maxWeight;
    }

    public void wheels(int k) {
        quantityWheels = k;
        System.out.println(k + " wheels");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "quantityWheels=" + quantityWheels +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}