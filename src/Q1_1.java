import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Q1_1 {
    public static void main(String[] args) throws IOException {
        File path = new File(".\\src\\Files\\Q1_1.txt");
        Path txtFile = Path.of(path.getAbsolutePath());
        List<String> listOfLine = Files.readAllLines(txtFile);
        listOfLine.forEach(System.out::println);
    }
}
