import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());
        System.out.println((money/500) + ((money%500)/100) + (money%500%100/50) + (money%500%100%50/10) + (money%500%100%50%10/5) + (money%500%100%50%10%5));
        br.close();
    }
}
