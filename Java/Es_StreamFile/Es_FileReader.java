import java.io.*;
public class Es_StreamFile {
    public static void main(String[] args) {
        FileReader fr = new FileReader("file.txt");
        int i;
        i = fr.read();
        while( i != -1){
            System.out.println((char)i);
            i = fr.read();
        }
        fr.close();
    }
}
