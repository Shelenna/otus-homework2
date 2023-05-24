import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class Homework12 {

    public static void quickSort(ArrayList<Integer> sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.size() == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr.get(middle);

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr.get(i) < border) i++;
            while (sortArr.get(j) > border) j--;
            if (i <= j) {
                int swap = sortArr.get(i);
                sortArr.set(i, sortArr.get(j));
                sortArr.set(j, swap);
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    private static ArrayList<Integer> randomNumberList(int arraySize, int arrayRange) {

        ArrayList<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            randomList.add(i, new Random().nextInt(arrayRange) + 1);
        }

        return randomList;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>(randomNumberList(10000, 99));
        ArrayList<Integer> arrayListStandart = new ArrayList<>(randomNumberList(10000, 99));


        long startTime = System.nanoTime();
        quickSort(arrayList, 0, arrayList.size() - 1);
        long finishTime = System.nanoTime();


        long startTimeStandart = System.nanoTime();
        Collections.sort(arrayListStandart);
        long finishTimeStandart = System.nanoTime();

        System.out.println((finishTime - startTime) + " - время сортировки созданным алгоритмом");
        System.out.println((finishTimeStandart - startTimeStandart) + " - время сортировки стандартным алгоритмом");
    }
}
