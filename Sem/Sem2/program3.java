// Напишите метод, который составит строку, состоящую из 100 повторений слова 
// TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
package Sem.Sem2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = buildText(scaner.nextLine());
        System.out.println(text);
        
        saveToFile("text.txt", text);
        scaner.close();
    }    
    
    static String buildText(String text) {
        StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 100; i++)
                builder.append(text);
            return builder.toString();
        }
            
    public static void saveToFile(String nameFile, String s) {
        try (FileWriter fw = new FileWriter(nameFile, false)) {
            fw.write(s);
            System.out.println(nameFile + ": Даннные записаны");
            fw.flush();
            // fw.close();
            } catch (IOException ex) {
               System.out.println(ex.getMessage());
            }
            }
    }
