package Homework15;

import java.io.*;
import java.util.ArrayList;

public class Exceptions {

    static ArrayList<Product> ProductList;

    public static void main(String[] args) throws IOException, PersException{

        try {
            ProductList = new ArrayList<>(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании ArrayList с initialCapacity (-1). с Finally");
        } finally {
            ProductList = new ArrayList<>();
        }

        String testFile = "demotxt";

        //ImportFromFile.writeProductFromFile(testFile);

        try {
            ProductList.add(3,new Product(1, 233));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка добавлнения по неправильному индексу. Печатаем StackTrace");
            e.printStackTrace();
        }
        AddProductToList.addProductToList(120, 233);
    }

}
