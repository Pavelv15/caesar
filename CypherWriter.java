package caesar;
import java.io.*;

public class CypherWriter {
    private static BufferedReader reader;




    static void encrypt() throws NumberFormatException, IOException {
        String outText = "";
        System.out.println("Введите слово которое хотите зашифровать");
        reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ключ ");
        int key = Integer.parseInt(reader.readLine());

        for(char t : text.toCharArray()) {
            outText += new String(new char[] {(char) (t+key)});

        }
        //в new FileWriter("file")) указывается путь к файлу куда записывается шифр
        try(FileWriter writer = new FileWriter("file")) {
            writer.write(outText);
            writer.close();



        }
        catch(IOException exc) {
            System.out.println(exc);
        }

    }
}
