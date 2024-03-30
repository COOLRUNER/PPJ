import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sca = new java.util.Scanner(System.in);
//        int w = sca.nextInt();
//        int h = sca.nextInt();
//
//        for (int i = 0; i <= w; i++) {
//            for (int j = 0; j <= h; j++) {
//                if(i == 0 || i == w || j == 0 || j == h){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//
//            }
//            System.out.println();
//
//        }
        //Task 3
//        int[] arr = {1, 2, 3, 4, 5, 6,7,8,9,10};
//        for (int i = 0; i <= arr.length; i++) {
//            System.out.print(arr[i]);
//            System.out.print(", ");
//        }
//        System.out.println();
//        for (int i = 0; i <= arr.length; i++) {
//            if ( i % 2 == 0){
//                System.out.print(arr[i]);
//                System.out.print(", ");
//            }
//        }
//        for (int i = 0; i <= args.length; i++) {
//            if (arr[i] % 2 != 0){
//                System.out.print(arr[i]);
//                System.out.print(", ");
//            }
//        }
        //Task 5
//        boolean isPalindrome = false;
//        int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = i; j >= 0; j--) {
//                if(tab[i] == tab[j]){
//                    isPalindrome = true;
//                }
//                else{
//                    isPalindrome = false;
//                }
//
//            }
//        }
//        System.out.println(isPalindrome);
        //Task 6
        int count = 0;
        boolean[] arr = new boolean[100];
        boolean[] truearr = new boolean[100];
        boolean[] falsearr = new boolean[100];
        for (int i = 0; i < arr.length; i++) {
            if (Math.random() < 0.5) {
                arr[i] = true;
                count ++;
            } else {
                arr[i] = false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == true){

            }
        }
    }
}