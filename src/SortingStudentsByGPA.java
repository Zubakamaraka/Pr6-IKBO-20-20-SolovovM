import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;

public class SortingStudentsByGPA { // Упражнение №2

    public static void quickSort(int[] Comparator,int low, int high, int size)
    {


        if (Comparator.length == 0)
        {
            return; //завершить выполнение, если длина массива равна 0
        }

        if (low >= high)
        {
            return;
        }

        // Выбор опорного элемента
        int middle = low + (high - low) / 2;
        int opora = Comparator[middle];

        // Разделение на подмассивы, которые больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j)
        {
            while (Comparator[i] < opora)
            {
                i++;
            }

            while (Comparator[j] > opora)
            {
                j--;
            }

            if (i <= j)
            {
                int temp = Comparator[i];
                Comparator[i] = Comparator[j];
                Comparator[j] = temp;
                i++;
                j--;
            }
            else{
                i++;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
        {
            quickSort(Comparator, low, j, size);
        }

        if (high > i)
        {
            quickSort(Comparator, i, high, size);
        }
    }
   public static void main(String[] args)
    {
        System.out.println(" Колличество студентов: ");
        Scanner str = new Scanner (System.in);
        int size = str.nextInt();
        System.out.println(" Исходный список баллов студентов: ");
        int Comparator[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            Comparator[i] = str.nextInt();
        }
        System.out.println();

        int low = 0;
        int high = Comparator.length - 1;

        quickSort(Comparator, low, high, size);
        System.out.println(" Отсортированный список: ");
        System.out.println(Arrays.toString(Comparator));
    }
}