import java.util.Scanner;

public class Polinomios2 {
    private int grado;
    private int[] coeficientes;

    public Polinomios2(int g) {
        grado = g;
        coeficientes = new int[grado + 1];
    }

    public void setCoeficiente(int indice, int valor) {
        if (indice >= 0 && indice <= grado) {
            coeficientes[indice] = valor;
        }
    }

    public int getCoeficiente(int indice) {
        if (indice >= 0 && indice <= grado) {
            return coeficientes[indice];
        }
        return 0;
    }

    public int evaluar(int x) {
        int resultado = 0;
        for (int i = 0; i <= grado; i++) {
            resultado += coeficientes[i] * (int) Math.pow(x, grado - i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Polinomios");
        System.out.println("Ingrese el grado del polinomio: ");
        int m = sc.nextInt();

        Polinomios2 p = new Polinomios2(m);
        int exponente = m;
        int indice = 0;

        for (int i = 0; i <= m; i++) {
            System.out.println("Ingrese el coeficiente del termino de grado " + exponente + ": ");
            p.setCoeficiente(indice, sc.nextInt());
            indice++;
            exponente--;
        }

        System.out.print("El polinomio es: ");
        for (int i = 0; i <= m; i++) {
            if (i == 0) {
                System.out.print(p.getCoeficiente(i) + "x^" + (m - i));
            } else if (i == m) {
                System.out.print(" + " + p.getCoeficiente(i));
            } else {
                System.out.print(" + " + p.getCoeficiente(i) + "x^" + (m - i));
            }
        }
        System.out.println();

        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        int resultado = p.evaluar(x);

        System.out.println("El resultado del polinomio evaluado en x = " + x + " es: " + resultado);

        sc.close();
    }
}