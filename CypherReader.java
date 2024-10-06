package caesar;
import java.io.*;

public class CypherReader {
    private static BufferedReader read;


    static void dencrypt() throws NumberFormatException, IOException {
        String outText = "";
        System.out.println("Введите ключ ");
        read = new BufferedReader(new InputStreamReader(System.in));

        int key =  Integer.parseInt(read.readLine());
        //в new FileReader("file")) указывается путь к файлу где находится зашифрованные данные
        try(FileReader reader = new FileReader("file")) {
            int c;
            while((c=reader.read()) != -1) {
                outText += new String(new char[] {(char) (c-key)});

            }

        }
        catch(IOException exc) {
            System.out.println(exc);
        }

        System.out.println(outText);


    }

}