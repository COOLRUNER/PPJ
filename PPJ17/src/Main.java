public class Main {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},
                {4,5,6,7,8}};
        arrayMid(arr);

//        int [] x = {1,2,3,4,5};
//        int [] y = {1,9,0,6,7};
//        smallestRectangle(x,y);


//        int[][] arr = {{1, 2, 3, 4, 5}, {1, 9}, {3, 1, 8}};
//        calculateEvenandOdd(arr);
    }

    public static void arrayMid(int[][] a){
        int countRow = a.length;
        int countCol = a[0].length;
        int midRow = countRow/2;
        int midCol = countCol/2;
        int mid = a[midRow][midCol];
        System.out.println(mid);



//    public static void calculateEvenandOdd(int[][] a){
//        int countEven = 0;
//        int countOdd = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if ((a[i][j] % 2) == 0) {
//                    countEven++;x
//                } else {
//                    countOdd++;
//                }
//            }
//
//        }
//        int[] arr = new int[2];
//        arr[0] = countEven;
//        arr[1] = countOdd;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }


//    public static void smallestRectangle(int[] x, int[] y){
//        int xMin = x[0];
//        int xMax = x[0];
//        int yMin = y[0];
//        int yMax = y[0];
//        for (int i = 0; i < x.length; i++) {
//            if(x[i] < xMin){
//                xMin = x[i];
//            }
//            if(x[i] > xMax){
//                xMax = x[i];
//            }
//        }
//        for (int i = 0; i < y.length; i++) {
//            if(y[i] < yMin){
//                yMin = y[i];
//            }
//            if(y[i] > yMax){
//                yMax = y[i];
//            }
//        }
//        int centerX = (xMin + xMax)/2;
//        int centerY = (yMin + yMax)/2;
//        int height = yMax - yMin;
//        int width = xMax - xMin;
//        System.out.println("Lower left corner: (" + xMin + "," + yMin + ") Upper right corner: (" + xMax + "," + yMax + ") Center: (" + centerX + "," + centerY + ") height: " + height + " width: " + width);

    }
}