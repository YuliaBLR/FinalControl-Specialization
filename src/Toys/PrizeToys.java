package Toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PrizeToys<T extends Toy> implements SaveInfo{

    private ArrayList<T> toys;
    private String name;

    public PrizeToys(String name) {
        this.name = name;
        toys = new ArrayList<>();
    }

    /**
     * Добавление игрушки в розыгрыш
     * @param toy игрушка
     */
    public void addToy(T toy){
        toys.add(toy);
    }

    /**
     * Метод выпадения случайной игрушки. Выводит в консоль наименование выпавшей игрушки.
     * Также сохраняет выпавшую игрушку в текстовый файл, затем удаляет ее из списка игрушек розыгрыша
     */
    public void Raffle(){
        Random random = new Random();
        for (T toy : toys) {
            int r = random.nextInt(1,101);
            if(r>=0 & r<= toy.getFrequency()){
                System.out.printf("Вам выпала игрушка: %s\n", toy.getName());
                SaveListToys(toy);
                toys.remove(toy);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s;
        s = "\nВ розыгрыше \"" + name + "\" участвуют:\n";
        for (T toy : toys) {
            s = s + "   " + toy.getName()+ " (вероятность выпадения " +  toy.getFrequency() +  "%)\n";
        }
        return s;
    }

    @Override
    public void SaveListToys(Toy toy)
    {
        try (FileWriter writerfile = new FileWriter(name + ".txt", true)){
            writerfile.write(toy.getName() + " (вероятность выпадения " +  toy.getFrequency() +  "%)");
            writerfile.write("\r\n");
        }catch (IOException e){
            System.out.println("При записи данных произошла ошибка");
        }
    }
}
