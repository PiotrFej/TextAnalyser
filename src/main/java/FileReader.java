import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public static String getText(String fileName) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new java.io.FileReader(new File(fileName)));

            String row;
            StringBuilder sb = new StringBuilder();

            while ((row = br.readLine()) != null) {
                sb.append(row).append("\n");
            }

            return sb.toString();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("General error");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}