/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista01;

import java.util.Scanner;
public class fatorial {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

     System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);
      }
  }