import java.util.Scanner;
import java.lang.*;

public class Student // Упражнение №1
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner (System.in);
        int a, b, t;
        System.out.print(" Введите размер массива ");
        int size = str.nextInt();
        int iDNumber[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            iDNumber[i] = str.nextInt();
        }

        // Отображаем исходный массив
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(" " + iDNumber[i]);
        }
        System.out.println();

        // Реализация алгоритма сортировки вставкой
        for (b = 1; b < size; b++)
        {
            t = iDNumber[b];
            a = b-1;
            while(a>=0 && iDNumber[a] > t)
            {
                iDNumber[a+1]=iDNumber[a];
                a = a-1;
            }
            int tempInd = a + 1;
            iDNumber[tempInd] = t;
        }
        System.out.print("Отсортированный массив:");
        for(int i=0; i < size; i++)
        {
            System.out.print(" " + iDNumber[i]);
        }
        System.out.println();
    }
}
