import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long[] arr = new long[10];
//        System.out.println("type in 1 number");
//        int t = sc.nextInt();
//        arr[0] = t;
//        long buff;
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = t + 1;
//            t++;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                buff = arr[j];
//                arr[j] = arr[i];
//                arr[i] = buff;
//            }
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
        //Task 2
//        int length = (int) ((Math.random()*6 ) +10);
//        int arr[] = new int[length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        Random rand = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int randomIndexToSwap = rand.nextInt(arr.length);
//            int temp = arr[randomIndexToSwap];
//            arr[randomIndexToSwap] = arr[i];
//            arr[i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < length; j++) {
//                System.out.print(arr[j] == i? '*':'.');
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//
//        }
//        System.out.println(" length:" + length);
            //Task 4
        int[] a = {1, 2, 8,};
        int[] b = {9323, 43, 4};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = b.length; j > 0; j--) {
                if(a[i] < b[j]){
                    c[i] = a[i];
                    c[j] = b[j];
                }
                else if(a[i] > b[j]){
                    c[i] = b[i];
                    c[j] = a[j];
                }
                else if(a[i] == b[j]){
                    c[i] = a[i];
                    c[j] = b[j];
                }
            }
        }
        for (int i : c) {
            System.out.println(i);
        }
    }
}