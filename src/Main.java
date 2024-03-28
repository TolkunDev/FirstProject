import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
         int [] array = new int [length];
         int minValue = 0;
         int maxValue = 10;
         // Заполнение массива случайными числами
       for (int i = 0; i < length; i++){
           array[i] = (int) (minValue + Math.random() * (maxValue - minValue + 1));
       }
        // Вывод массива
        System.out.println("Ваш массив: ");
       for (int i = 0; i < length; i++) {
           System.out.print(array[i] + " ");
       }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int reserv = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = reserv;
                }
            }
        }
    for (int i = 0 ; i<length;i++) {
        System.out.print(array[i] + " ");
    }
    /*comment*/
        for (int i = 0 ; i<length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}