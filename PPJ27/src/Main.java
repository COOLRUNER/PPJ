import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("file1.txt");
            int ch;
            int arrlength = 0;
            while ((ch = fileInputStream.read()) != -1){
                System.out.print((char)ch + " ");
                arrlength++;
            }
            char[] arr = new char[arrlength];
            for (int i = 0; i < arrlength; i++) {
                arr[i] = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}