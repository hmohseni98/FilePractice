import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q1_4 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("C:\\Users\\Hassan\\IdeaProjects\\git project\\InputAndOutput\\src\\Files\\Q1_4.txt");
        String str = Files.readString(file);
        String newStr = str.replace("\n"," ");
        String[] array = newStr.split(" ");
        int length = 0;
        String bigger = "";
        for (String s : array) {
            if (length < s.length()) {
                length = s.length();
                bigger = s;
            }
        }
        System.out.println("string: " + bigger + " length: " + length);

    }
}
