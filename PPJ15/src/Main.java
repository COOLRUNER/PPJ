public class Main {
    public static void main(String[] args) {
        //Task 1
//        int value = 5;
//        Method(value);


        //Task 2
//        int wrt =5;
//        modifyValue(wrt);


        //Task 3
//        int[][] arr1 = {{1, 2, 3}, {4, 5, 9, 6}};
//        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
//        boolean equal = isEqual(arr1, arr2);
//        System.out.println(equal);

        //Task 4
        String str = "Sam has a cat";
        char[] arr = str.toCharArray();
        charactersCount(arr);

        //Task 5
//        int[] arr = {1, 9, 5, 6, 7, 2, 9, 10};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//        System.out.println();
//        sort(arr);
  }
        //task 1
        //    public static void Method(int a){
//        System.out.println(a);
//    }
        //task 2
//    public static void modifyValue(int a ){
//        System.out.println(a);
//        a = a * 5;
//        System.out.println(a);
//    }
        //task 3
//    public static boolean isEqual(int[][] a, int[][] b) {
//        if (a.length != b.length) {
//            return false;
//        } else {
//            for (int i = 0; i < a.length; i++) {
//                if (a[i].length != b[i].length) {
//                    return false;
//                } else {
//                    for (int j = 0; j < a[i].length; j++) {
//                        if (a[i][j] != b[i][j]) {
//                            return false;
//                        }
//                    }
//                }
//            }
//        }
//        return true;
//    }
        //task 4
    public static void charactersCount(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if(arr[i] == 0){
                continue;
            }
            for (int j = i + 1 ; j < arr.length; j++) {
                if(arr[i] == arr[j] ){
                    count++;
                    arr[j] = 0;
                }
            }
            System.out.println(arr[i] + " " + count);

        }

    }
        //task 5
//        public static void sort(int[] arr) {
//            for (int i = 0; i < arr.length; i++) {
//                int min = arr[i];
//                for (int j = i; j < arr.length; j++) {
//                    if (arr[j] < min) {
//                        min = arr[j];
//                        arr[j] = arr[i];
//                        arr[i] = min;
//                    }
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + "; ");
//            }
//        }
    }