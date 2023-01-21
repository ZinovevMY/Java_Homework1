import java.util.Arrays;
import java.util.Scanner;

public class homework1 {


    //Просим пользователя задать кол-во элементов массива
    public static int get_count(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        String count = scn.nextLine();
        int res = Integer.parseInt(count);
        return res;
    }

    //Заполняем массив числами
    public static int[] fillarray(int elen_count){
        int[] res = new int[elen_count];
        for (int i = 0; i < elen_count; i++){
            res[i] = (int)(Math.random()*20);
        }
        return res;
    }
    //Находим максимальное значение в массиве
    public static int findmax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //Находим минимальное значение в массиве
    public static int findmin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //Находим среднее значение элементов массива
    public static int findaverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }



    //Сортируем массив пузырьком
    public static int[] bubblesort(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int elem_count = get_count();
        int[] arr = fillarray(elem_count);
        System.out.println("Заполненный массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение элемента в массиве = " + findmax(arr));
        System.out.println("Минимальное значение элемента в массиве = " + findmin(arr));
        System.out.println("Среднее значение элементов массива = " + findaverage(arr));
        arr = bubblesort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

    }
}
