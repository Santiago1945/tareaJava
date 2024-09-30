package ejercicios;

public class Ejercicio18 {

public static void main(String[] args) {
    int a = 2;
    int b = 8;
    long potencia = 1L;

    for(int i = 1; i <= b; ++i) {
        potencia *= (long)a;
    }

    System.out.println("" + a + " elevado a la potencia de " + b + " es: " + potencia);
}
}