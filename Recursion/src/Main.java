import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(Fibor(45));
        System.out.println(factR(12));
        System.out.println(GCD(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max : " + maxElem(a, 0));
        System.out.println("Num even: " + numEven2(a, 0));
        char[] b = {'a', 'p', 'p', 'a'};
        System.out.println(isPalindrome(b, 0, b.length -1));
    }

        public static int Fibor(int n){
        if (n < 2) return n;
        return Fibor(n-1) + Fibor(n-2);
    }

    public static int factR(int n){
        if (n == 1) return n;
        return n * factR(n-1);
    }

    public static int GCD(int n, int v){
        if (n==v) return n;
        return n > v ? GCD(n-v, v) : GCD(v-n, n);
    }

    public static int maxElem(int[] arr, int from){
        if (from == arr.length) return from;
        return Math.max(arr[from], maxElem(arr, from +1));
    }
    public static int numEven(int[] arr, int from){
        if (from == arr.length) return from;
        return (arr[from]%2 == 0 ? 1 : 0) + numEven(arr, from + 1);
    }

    public static int numEven2(int[] arr, int from) {
        //end condition
        if (arr.length == from) return 0;
        //looping part
        return arr[from] % 2 == 0 ? 1 + numEven(arr, from + 1) : numEven(arr, from + 1);
    }

    public static boolean isPalindrome(char[] a, int start, int end){
        if (start >= end){
            return true;
        }
        if (a[start] != a[end] ){
            return false;
        }
        return isPalindrome(a, start + 1, end -1);
    }




}