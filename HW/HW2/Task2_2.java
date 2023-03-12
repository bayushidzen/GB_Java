//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package HW.HW2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) {
        int[] arr = make_random();
        write_data(arr);
    }

    public static void write_data(int[] data_arr) {
        try (PrintWriter pw = new PrintWriter("HW/HW2/log.txt")) {
            System.out.println(Arrays.toString(data_arr));
            pw.append(Arrays.toString(data_arr));
            pw.append("\n");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public static int[] make_random(){
        int rand_num = new Random().nextInt(20);
        System.out.printf("Создаем массив длиной: %s \n", rand_num);
        int[] arr = new int[rand_num];
        for (int i = 0; i < rand_num; i++){
            arr[i] = new java.util.Random().nextInt(100);
        }
        return arr;
    }
}
