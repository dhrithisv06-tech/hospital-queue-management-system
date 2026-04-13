package Hospital1Project;
import java.io.FileWriter;

public class FileLogger {

    public static void log(String msg) {
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(msg + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
