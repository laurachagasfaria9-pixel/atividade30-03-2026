
package lista01;

public class multiploofe235 {

    public static void main(String[] args) {
        int mult2 = 0;
        int mult3 = 0;
        int mult5 = 0;
        for (int x = 1; x <= 1000; x++) {
            if (x % 2 == 0) {
                mult2++;
            }
            if (x % 3 == 0) {
                mult3++;
            }
            if (x % 5 == 0) {
                mult5++;
            }
        }

        System.out.println("Multiplos de 2: " + mult2);
        System.out.println("Multiplos de 3: " + mult3);
        System.out.println("Multiplos de 5: " + mult5);
    }
}

