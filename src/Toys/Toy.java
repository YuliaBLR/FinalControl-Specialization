package Toys;

public class Toy {

    private static int counter = 10000;
    private int id;
    private String name; // наименование
    protected static int sum; // количество
    private int frequency; // частота выпадение игрушки, %

    public Toy(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
        id = ++counter;
        sum++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getSum() {
        return sum;
    }


    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
