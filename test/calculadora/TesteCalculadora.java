package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        System.out.println("Entrada: 2 + 3   | esperado: 5");
        calc.calc(2, 3, "+");  // esperado: 5

        System.out.println("Entrada: 10 - 4  | esperado: 6");
        calc.calc(10, 4, "-"); // esperado: 6

        System.out.println("Entrada: 3 * 5   | esperado: 15");
        calc.calc(3, 5, "*");  // esperado: 15

        System.out.println("Entrada: 8 / 2   | esperado: 4");
        calc.calc(8, 2, "/");  // esperado: 4

        System.out.println("Entrada: 8 / 0   | esperado: mensagem de divisao por zero e resultado 0");
        calc.calc(8, 0, "/");  // divisao por zero

        System.out.println("Entrada: 5 x 5   | esperado: mensagem de operacao invalida e resultado 0");
        calc.calc(5, 5, "x");  // operação inválida
    }
}
