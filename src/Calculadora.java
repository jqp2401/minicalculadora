public class Calculadora {

    /**
     * Metodo que pasando numero devuelve un Double con el valor absoluto.
     * @author jqp2401
     * @version 1.0.0
     * @param numero
     * @return Double del valor absoluto
     */

    public double valorAbsoluto (double numero){
        double valAbs = numero;
        valAbs =Math.abs(valAbs);
        return valAbs;
    }

    /**
     * Metodo que pasando un numero devuelve la raiz cuadrada
     * @author jqp2401
     * @param numero double
     * @return Double del valor del resultado de la raiz cuadrada.
     */
    public double raizCuadrada (double numero){
        double raizC = numero;
        raizC = Math.sqrt(raizC);
        return raizC;
    }
}
