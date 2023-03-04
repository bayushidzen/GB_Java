// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Sem.Sem1;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int rand_num = new java.util.Random().nextInt(99 + 1);
        System.out.printf("Создаем массив длиной: %s \n", rand_num);
        int[] arr = new int[rand_num];
        for (int i = 0; i < rand_num; i++){
        arr[i] = new java.util.Random().nextInt(1+1);
        } 
        String arr_str = Arrays.toString(arr);
        System.out.println(arr_str); 
        
        int count = 0;
        int maxi = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] == 1){
                count++;
                if (count > maxi){ 
                    maxi = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.printf("В данном массиве максимально %s единиц подряд! \n", maxi);

    }
}
