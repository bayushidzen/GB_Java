package Sem.Sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
     // Реализовать консольное приложение, которое:
    // Принимает от пользователя строку вида
    // text~num
    // Нужно рассплитить строку по ~, сохранить text в связный список на позицию
    // num.
    // Если введено print~num, выводит строку из позиции num в связном списке и
    // удаляет её из списка.
    Scanner scanner = new Scanner(System.in);
    boolean fl = true;
    int len = 10;
    LinkedList<String> linked = new LinkedList<>();
    for (int i = 0; i < len; i++) {
      linked.add("пусто");
    }
    do {
      System.out.print("\nВведите строку --> ");
      String inputed1 = scanner.nextLine();

      String[] arr = inputed1.split("~", 0);
      int pos = Integer.valueOf(arr[1]);

      if (arr[0].equals("print")) {
        System.out.println("Печать строки из позиции " + pos + " -> " + linked.get(pos));
        linked.remove(pos);
      } else {
        linked.add(pos, arr[0]);
      }
      // System.out.println(linked);

    } while (fl);
    scanner.close();

  }

}
