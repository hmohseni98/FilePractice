import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Q1_3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Hassan\\IdeaProjects\\git project\\InputAndOutput\\src\\Files\\Q1_3.txt");
        String str = " append text to file";
        Files.write(
                path,
                str.getBytes(),
                StandardOpenOption.APPEND
        );
        System.out.println("success");
    }
}
