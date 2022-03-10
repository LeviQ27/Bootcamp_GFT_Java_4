package other.desafio2;

import java.io.IOException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        char p = '%';

        if (B > A) 
        {

            double calcula = ((B - A)/A) * 100;
            System.out.printf("%.2f%c", calcula, p);
            
        } else 
        {
            System.out.printf("0.00%c", p);
        }
        
    }


    
}
