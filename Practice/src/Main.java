import java.nio.ByteBuffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2 ,3 ,4 ,5 ,6 ,76};
        int[] arr2 = {2, 4, 1, 5, 6, 2, 2, 4,1, 4,2,3};
        int [][] twodimarr = {{11,23,341,42},
                             {2,5,6,2,42},
                {231432,412, 3, -54321,5413,23}};
        int [][] inverseRow = {{1,2,12},
                {23,431,312},
                {2132,34,123}
        };
        howmanyOnes(82137213);
        System.out.println(maxInversed(inverseRow));
        System.out.println(occurenceCount(arr2, 3, 2));
        int[] Arrdiff = Arrdiff(arr1, arr2);
        int[] ShowDiff = Mintwodimarrvals(twodimarr);
        show(Arrdiff);
        show(ShowDiff);
        System.out.println(1%4);
        System.out.println((twodimarr.length* twodimarr[0].length));
        System.out.println(4/12);
    }

    public static void show(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

            if (i<a.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }


    public static int[] Arrdiff(int[] arr1, int[] arr2){
        int[] arr3 = new int[Math.max(arr1.length, arr2.length)];
        for (int i = 0; i < arr3.length; i++) {
            int val1 = (i < arr1.length ? arr1[i] : 0);
            int val2 = (i < arr2.length ? arr2[i] : 0);
            arr3[i] = val1 - val2;
        }
        return arr3;
    }
    public static int[] Mintwodimarrvals (int[][] a){
        int [] arr = new int [a.length];
        for (int i = 0; i < a.length; i++) {
         int[] row = a[i];
         int minval = row[0];
            for (int j = 0; j < row.length; j++) {
                if(row[j] < minval){
                    minval = row[j];
                }
                    arr[i] = minval;
            }
        }
        return arr;
    }
    public static int occurenceCount(int[] a, int initial, int value){
        if(initial == a.length){
            return 0;
        }
        return a[initial] == value ? 1 + occurenceCount(a, initial + 1, value) : occurenceCount(a, initial + 1, value);
    }
    public static int maxInversed(int[][] arr){
        int max = arr[0][arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[0].length - 1; j >=0 ; j--) {
                if (i + j == arr.length-1 && arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int howmanyOnes (int a){
        int count = 0;
        byte[] bytes = ByteBuffer.allocate(4).putInt(a).array();
        byte largest = bytes[0];
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] > largest){
                largest = bytes[i];
            }

        }
        System.out.println(largest);
        return count;
    }
}