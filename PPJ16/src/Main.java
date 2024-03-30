public class Main {
    public static void main(String[] args) {
        //Task1
//        int aa = 10;
//        int bb = 20;
//        int cc = 30;
//        findMax(aa, bb, cc);

        //Task2
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(isRectagular(arr));
        System.out.println(isSquare(arr));





    }
    public static boolean isRectagular(int [][] a){
        boolean isRectangular = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != a[0].length){
                isRectangular = false;
                break;
            }
        }
        return isRectangular;
    }

    public static boolean isSquare(int [][] a){
        boolean isSquare = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((a[i].length != a[j].length) || (a[i].length != a.length)){
                    isSquare = false;
                    break;
                }
            }
        }
        return isSquare;
    }
    

    //    //Task1
//    public static void findMax(int a, int b, int c){
//        int max = a;
//        if (b> max){
//            max = b;
//        }
//        if (c> max){
//            max = c;
//        }
//
//        System.out.println("Max is: " + max);    }
}