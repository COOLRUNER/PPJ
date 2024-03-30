import java.util.Arrays;
public class Arr2DTr {

    public static void main (String[] args) {
        int[][] a = { {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : trans(a))
            System.out.println(Arrays.toString(r));
    }

    private static int[][] trans(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[n][m];
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                b[j][i] = a[i][j];
        return b;
    }

}
