import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double N = leitor.nextDouble();

        System.out.println(String.format((String.valueOf(N).startsWith("-") ? "" : "+") + "%.4E", N));

        leitor.close();

    }
    
}
