package ejercicios;

public class Ejercicio9 {

public static void main(String[] args) {
    int N = 50;
    long suma = 0L;

    for(int i = 1; i <= N; ++i) {
        suma += (long)i;
    }

    System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
}
}