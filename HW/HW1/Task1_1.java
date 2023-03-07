// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW.HW1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.print("Введите N: ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int tri_num = tri_numb(n);
        int fact_num = factorial(n);
        System.out.printf("Треугольное число введеного N равно: %s \n" ,tri_num);
        System.out.printf("Факториал N равен: %s \n" ,fact_num);
        scan.close();
    }
    static int tri_numb(int n){
        int tri_num = 0;
        tri_num = (n*(n + 1))/2;
        return tri_num;
        }

    static int factorial(int n){
        if (n == 0 || n == 1) return 1;
        return n*factorial(n-1);
    }
}
