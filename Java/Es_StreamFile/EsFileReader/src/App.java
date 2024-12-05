import java.io.*;

public class App {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("file.txt");
            int i;
            i = fr.read();
                while( i != -1){
                    System.out.println((char)i);
                    i = fr.read();
                }
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println("File non trovato");
        } catch(IOException e){
            System.err.println("Eccezione di IO");
        }
        
     

        System.out.println("Ciao");
    }
}
