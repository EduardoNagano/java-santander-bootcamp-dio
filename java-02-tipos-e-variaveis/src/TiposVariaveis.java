public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2.500;
        System.out.println("salarioMinimo: " + salarioMinimo);
        salarioMinimo = 2500;
        System.out.println("salarioMinimo: " + salarioMinimo);

        float pi = 3.14f; //tipo float precisa ter o f F no final
        System.out.println("pi: " + pi);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //isso é um Casting
        System.out.println("numeroCurto2: " + numeroCurto2);

        int numero = 1;
        numero = 2;
        System.out.println("numero: " + numero);

        //Constante: final
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 4; // Isso dá erro pois não é possível alterar uma constante
        System.out.println("VALOR_DE_PI: " + VALOR_DE_PI);
    }
}
