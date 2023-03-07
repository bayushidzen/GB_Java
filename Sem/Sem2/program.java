package Sem.Sem2;

public class program {
    public static void main(String[] args) {
    
    String str = "aaaabbbcdd";
    int count = 0;
    StringBuilder new_str = new StringBuilder();
    char elem = str.charAt(0);
    for (int i = 0; i<str.length(); i++){
        System.out.println(str.charAt(i));
        if (elem == str.charAt(i)){
            count++;
            System.out.println("Условие выполнилось");
            System.out.print(str.charAt(i));
            System.out.print(count);
            System.out.println(elem);
        }
        else if (count == 1){
                System.out.println("Условие выполнилось для 1 элемента");
                new_str.append(str.charAt(i));
                System.out.print(str.charAt(i));
                System.out.print(count);
            }
        else {
            System.out.println("Условие не выполнилось");
            new_str.append(str.charAt(i-1)+String.valueOf(count));
            count = 0;
            elem = str.charAt(i);
        }
    }
    
    System.out.println(new_str);
}
}
