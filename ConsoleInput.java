import java.io.*;

public class ConsoleInput{

    public static String readLine() {
        StringBuffer response = new StringBuffer();
        try {
            BufferedInputStream buff = new
                BufferedInputStream(System.in);
            int in = 0;
            char inChar;
            do {
                in = buff.read();
                inChar = (char) in;
                if (in != -1) {
                    response.append(inChar);
                }             
            } while ((in != -1) & (inChar != '\n'));
            // buff.close();
            return response.toString().trim();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
