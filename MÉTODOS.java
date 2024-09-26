public class nums {

    // Método que mostra se um número é positivo ou negativo
    public static String verificarNumero(int numero) {
        return (numero >= 0) ? "O número " + numero + " é positivo." : "O número " + numero + " é negativo.";
    }

    // Método que recebe 3 números e informa a média aritmética
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Método que recebe três números e retorna o maior
    public static double encontrarMaior(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    // Método que recebe dois números, a e b, e retorna a^b
    public static double calcularPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    // Método que recebe uma quantidade de minutos e retorna em horas e mins
    public static String converterMinutos(int minutos) {
        int horas = minutos / 60;
        int restoMinutos = minutos % 60;
        return minutos + " min = " + horas + " hora(s) e " + restoMinutos + " minuto(s)";
    }

    // Método que retorna o fatorial de um número informado por parâmetro
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo.");
        }
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    // main para testar os métodos 
    public static void main(String[] args) {
        // Testando o método verificarNumero
        System.out.println(verificarNumero(10));  // O número 10 é positivo.
        System.out.println(verificarNumero(-5));   // O número -5 é negativo.

        // Testando o método calcularMedia
        System.out.println("Média: " + calcularMedia(5, 10, 15)); // Média: 10.0

        // Testando o método encontrarMaior
        System.out.println("Maior: " + encontrarMaior(5, 10, 3)); // Maior: 10.0

        // Testando o método calcularPotencia
        System.out.println("Potência: " + calcularPotencia(2, 3)); // Potência: 8.0

        // Testando o método converterMinutos
        System.out.println(converterMinutos(90)); // 90 min = 1 hora(s) e 30 minuto(s)

        // Testando o método calcularFatorial
        System.out.println("Fatorial: " + calcularFatorial(5)); // Fatorial: 120
    }
}