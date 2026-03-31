package lista01;

public class tabuada1a10 {
    
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            System.out.println("Tabuada do " + a + ":");

            for (int b = 1; b <= 10; b++) {
                int resultado = a * b;
                System.out.println(a + " x " + b + " = " + resultado);
            }
        }
    }
}