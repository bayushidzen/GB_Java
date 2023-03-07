//Вывести все простые числа от 1 до 1000

package HW.HW1;

public class Task1_2 {
    public static void main(String[] args) {
        int[] arr1000 = MakeArr();
        String result_str = SimpleString(arr1000);
        System.out.printf("Список простых чисел: \n%s \n",result_str);        
    }
    static int[] MakeArr(){
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) arr[i] = i+1;
        return arr;
    }
    static String SimpleString(int[] arr){
        StringBuilder arrs = new StringBuilder();
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count = 0;
            for (int j = 0; j < arr[i]/2; j++){
                if (arr[i] % (2 + j) == 0)
                    count += 1;
            }
            if (count <= 0){
                arrs.append(arr[i] + " ");
            }
        }

        return arrs.toString();
    }
}
