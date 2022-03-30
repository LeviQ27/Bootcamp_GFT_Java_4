import java.util.Scanner;

public class App_2 
{

    public static void main(String[] args) 
    {

        try (Scanner input = new Scanner(System.in)) {
            int b = 0;
            char c, r = '%';
            int d = 0, e = 0, f = 0, i, t;
            int a = input.nextInt();
            double pC, pR, pS;

            if (a >= 1 && a <= 15) 
            {
                for (i = 0; i < a ; i++)
                {
                    t = input.nextInt();
                    c = input.next().toUpperCase().charAt(0);

                    if (c == 'C') d += t;
                    
                    else if (c == 'R') e += t;

                    else if (c == 'S') f += t;

                    b += t;
                }

            }

            pC = ((double) d / (double) b) * 100;
            pR = ((double) e / (double) b) * 100;
            pS = ((double) f / (double) b) * 100;

            System.out.println("Total: " + b + "\n" + "Total de coelhos: " + d + "\n" + "Total de ratos: " + e + "\n" + "Total de sapos: " + f);
            System.out.printf("Percentual de coelhos: %.2f %c\n", pC, r);
            System.out.printf("Percentual de ratos: %.2f %c\n", pR, r);
            System.out.printf("Percentual de sapos: %.2f %c\n", pS, r);
        }
        
    }
    
}
