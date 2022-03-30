import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class App_2_1 
{

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(input.readLine());
        int d = 0, e = 0, f = 0;
        for (int i = 0; i < a; i++) {
            String info = input.readLine();
            String[] infos = info.split(" ");
            int t = Integer.valueOf(infos[0]);
            char c = infos[1].toUpperCase().charAt(0);
            switch (c) {
                case 'C':
                    d += t;
                    break;
                case 'R':
                    e += t;
                    break;
                case 'S':
                    f += t;
                    break;
            }
        }

        int b = d + e + f;
        double pC = (d * 100) / (double) b;
        double pR = (e * 100) / (double) b;
        double pS = (f * 100) / (double) b;
        System.out.println("Total: " + b + " cobaias");
        System.out.println("Total de coelhos: " + d);
        System.out.println("Total de ratos: " + e);
        System.out.println("Total de sapos: " + f);
        System.out.println(String.format("Percentual de coelhos: %.2f", pC) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", pR) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", pS) + " %");
    }
    
}
