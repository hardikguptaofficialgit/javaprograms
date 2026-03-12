import java.io.*;

public class CompareBinaryFiles {

    public static void main(String[] args) throws IOException {

        FileInputStream f1 = new FileInputStream("file1.bin");
        FileInputStream f2 = new FileInputStream("file2.bin");

        int b1, b2;
        int position = 0;
        boolean equal = true;

        while (true) {
            b1 = f1.read();
            b2 = f2.read();
            position++;

            if (b1 != b2) {
                equal = false;
                break;
            }

            if (b1 == -1 && b2 == -1) {
                break;
            }
        }

        if (equal)
            System.out.println("Two files are equal");
        else
            System.out.println("Two files are not equal: byte position at which two files differ is " + position);

        f1.close();
        f2.close();
    }
}
