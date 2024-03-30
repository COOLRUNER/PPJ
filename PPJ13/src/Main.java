import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int rows = 8;
//        int cols = 8;
//        float leftDiagSum = 0;
//        float rightDiagSum = 0;
//        float[][] matrix = new float[rows][cols];
//        Random random = new Random();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = random.nextFloat() * 10;
//            }
//        }
//        // Calculate the left diagonal sum
//        for (int i = 0; i < rows; i++) {
//            leftDiagSum += matrix[i][i];
//        }
//        // Calculate the right diagonal sum
//        for (int i = 0; i < rows; i++) {
//            rightDiagSum += matrix[i][cols - 1 - i];
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Left Diagonal Sum: " + leftDiagSum);
//        System.out.println("Right Diagonal Sum: " + rightDiagSum);
        //Task1
        int[] arr = {1,5,8,2,6};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] >= max - i){
                    System.out.print("*\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.println();

        }
    }
}
