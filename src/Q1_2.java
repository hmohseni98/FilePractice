import java.io.*;

public class Q1_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Hassan\\IdeaProjects\\git project\\InputAndOutput\\src\\Files\\Q1_2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null){
            sb.append(line);
            sb.append("\n");
        }
        fileReader.close();
        System.out.println(sb.toString());
    }
}
