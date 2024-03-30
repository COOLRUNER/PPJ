public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        System.out.println(fiboR(a));
        System.out.println(factR(a));
        System.out.println(gcdR(12125, 40643));

    }
    public static int fiboR(int n){
        if (n < 2)  return n;
        return fiboR(n-1) + fiboR(n-2);
    }
    public static int factR(int n){
        if (n==0 || n==1 ) return 1;
        return n * factR(n-1);
    }
    public static int gcdR(int a, int b) {
        if (a == b) return b;
        if (b == 0) return a;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return gcdR(b, a%b);
    }
    public static int maxElem(int[] arr, int from){
        if (from == arr.length-1) return arr[arr.length -1];
        return 

}