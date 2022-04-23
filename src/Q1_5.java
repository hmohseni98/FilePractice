import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Q1_5 {
    public static void main(String[] args) throws IOException {
        Scanner sc =
                new Scanner(
                        new File("C:\\Users\\Hassan\\IdeaProjects\\git project\\InputAndOutput\\src\\Files\\Q1_5.txt"));
        List<String> stringList = new LinkedList<>();
        while (sc.hasNextLine()) {
            stringList.add(sc.nextLine());
        }
        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }
    }
}
