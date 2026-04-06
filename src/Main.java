public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.printf("Valor absoluto: %.2f%n", calculadora.valorAbsoluto(-8));
        System.out.printf("Raiz cuadrada: %.2f%n", calculadora.raizCuadrada(5));
    }
}