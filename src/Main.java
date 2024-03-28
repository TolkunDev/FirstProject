import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student adil = new Student("Adil",23,2,"IVT-1-22");
        adil.setName("Azamat");
         adil.setAge(12);
        System.out.println(adil.getName());
        System.out.println(adil.getAge());
        System.out.println(adil.getGroup());
        System.out.println(adil.getCourse());
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println(sumSevenNumber( x, y ));
//
////        int z = scanner.nextInt();
////        System.out.println(summa(x,y,z));
////        print();
//    }
//    public static void print(){
//        System.out.println("Это вывод");
//    }
//    public static int summa(int a, int b, int c){
//         int summa = a + b + c;
//
//        return summa;
//    }
//    public static int sumNumbers(int x){
//        int remainder;
//        int sum = 0;
//        while (x > 0){
//            remainder = x % 10;
//            sum += remainder;
//            x = x / 10;
//        }
//        return  sum;
//    }
//    public static int sumSevenNumber(int a, int b){
//        int summa = 0;
//        if (a < b) {
//            for (int i = a; i <= b; i++) {
//                if (i > 9 && i < 100 && i % 7 == 0) {
//                    summa += i % 10 + i / 10;
//                }
//            }
//        }
//        else {
//            for (int i = b; i >= a; i--) {
//                if (i > 9 && i < 100 && i % 7 == 0) {
//                    summa += i % 10 + i / 10;
//                }
//            }
//        }
//        return summa;
    }
}