import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints the content of /files/party.txt to the terminal window.
        BufferedReader br = null;
        try {            
            br = new BufferedReader(new FileReader("files/party.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // try with ressources
        try (BufferedReader br2 = new BufferedReader(new FileReader("files/party.txt"))) {
            String line;
            while ((line = br2.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}