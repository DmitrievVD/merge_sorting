import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {

    public static void write(File file, ArrayList<?> list){
        try (FileWriter wf = new FileWriter(file)){
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() -1) wf.write(list.get(i).toString());
                else wf.write(String.format(list.get(i) + "%n"));
            }
            System.out.println("Слияние завершено!!!");
        } catch (IOException e){
            System.err.println("Error" + e);
        }
    }

}
