package lista01;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para gerar sua tabuada: ");
        int b = sc.nextInt();

        for (int a = 0; a <= 10; a++) {
            int teste = a * b;
            System.out.println(a + " x " + b + " = " + teste);
        }

      
    }
}
         
    
      

