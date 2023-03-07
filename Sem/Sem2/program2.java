// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).

package Sem.Sem2;

import java.util.Scanner;

public class program2 {
    static boolean Polindrom(String str){
        int len = str.length();
        for (int i =0; i < len/2; i++)
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (Polindrom(str)){
            System.out.println("Строка является полиндромом");
        }
        else{
            System.out.println("Строка не является полиндромом");
        }
        scanner.close();
    }
}
