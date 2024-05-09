package Toys;


import static Toys.Toy.getSum;

public class Main {
    public static void main(String[] args) {


        Toy car1 = new Car("Зеленая машинка");
        Toy car2 = new Car("Синяя машинка");
        Toy bear1 = new Bear("Бурый медведь");
        Toy bear2 = new Bear("Белый медведь");
        Toy bracelet1 = new Bracelet("Белый браслет");
        Toy bracelet2 = new Bracelet("Красный браслет");
        Toy bracelet3 = new Bracelet("Желтый браслет");
        Toy bracelet4 = new Bracelet("Зеленый браслет");


        PrizeToys<Toy> toys1 = new PrizeToys<>("Розыгрыш №1");
        toys1.addToy(car1);
        toys1.addToy(car2);
        toys1.addToy(bear1);
        toys1.addToy(bear2);
        toys1.addToy(bracelet1);
        toys1.addToy(bracelet2);
        toys1.addToy(bracelet3);
        toys1.addToy(bracelet4);

        System.out.println(toys1);
        toys1.Raffle();
        toys1.Raffle();
        toys1.Raffle();
        System.out.println(toys1);




    }
}