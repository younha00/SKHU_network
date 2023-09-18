package network.chap03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Example5b {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine(); // 한 줄씩 읽어야 하기 때문
            if (s == null) break;
            System.out.println(s);
        }
        reader.close();
    }
}