// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
package Sem.Sem1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Представьтесь, пожалуйста: ");
        Scanner scanner = new Scanner(System.in); 
        String value = scanner.nextLine();
        System.out.printf("Здравствуйте, %s! \n", value);
        scanner.close();
    }  
    
}
