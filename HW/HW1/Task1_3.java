//Реализовать простой калькулятор

package HW.HW1;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import com.sun.tools.javac.Main;

public class Task1_3 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.ALL);
        FileHandler fl = new FileHandler("HW/HW1/logfile%g.xml");
        logger.addHandler(fl);
        XMLFormatter xml = new XMLFormatter();
        fl.setFormatter(xml);
        logger.info("Включение системы!");
        Menu();
        logger.info("Вывод меню и запуск сканера!");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        System.out.print("Введите первое число: ");
        float num1 = scanner.nextFloat();
        System.out.print("Введите второе число: ");
        float num2 = scanner.nextFloat();
        logger.info("Запуск выбранного арифметического действия!");
        Actions(choose, num1, num2);
        scanner.close();
        logger.info("Спасибо за использование нашего калькулятора! Приходите еще!");
    }
    static void Menu(){
        System.out.print("1) Сложение 2) Вычитание \n3) Деление  4) Умножение \n");
        System.out.print("Выберите арифметическое действие: ");
    }

    static void Actions(String str, float num1, float num2)
    {

        switch (str) {
            case ("1"):
                System.out.printf("Сумма чисел %f и %f равна %f \n", num1, num2, num1 + num2);
                break;
            case ("2"):
                System.out.printf("Разность чисел %f и %f равна %f \n", num1, num2, num1 - num2);
                break;
            case ("3"):
                System.out.printf("Частное чисел %f и %f равно %f \n", num1, num2, num1 / num2);
                break;
            case ("4"):
                System.out.printf("Произведения чисел %f и %f равно %f \n", num1, num2, num1 * num2);
            default:
                System.out.println("Выберите действие из меню!");
                break;
        }
 
    }

}
