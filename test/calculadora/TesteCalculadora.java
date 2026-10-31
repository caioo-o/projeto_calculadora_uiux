package calculadora;

/**
 * Classe de testes da {@link Calculadora}.
 *
 * <p>Cada teste exibe a <strong>entrada utilizada</strong>, o
 * <strong>resultado esperado</strong> e o <strong>resultado obtido</strong>.
 * Os casos de erro (divisão por zero e operador inválido) verificam se a
 * exceção {@link IllegalArgumentException} é lançada e tratada sem
 * interromper a execução do programa.</p>
 *
 * @author Caio Sbardelotto de Oliveira RA: 251766
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa todos os testes de soma, subtração, multiplicação, divisão,
     * divisão por zero e operação inválida.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Operações válidas: imprime o resultado obtido
        System.out.println("Entrada: 2 + 3   | esperado: 5");
        System.out.println("Obtido: " + calc.calcular(2, 3, "+"));

        System.out.println("Entrada: 10 - 4  | esperado: 6");
        System.out.println("Obtido: " + calc.calcular(10, 4, "-"));

        System.out.println("Entrada: 3 * 5   | esperado: 15");
        System.out.println("Obtido: " + calc.calcular(3, 5, "*"));

        System.out.println("Entrada: 8 / 2   | esperado: 4");
        System.out.println("Obtido: " + calc.calcular(8, 2, "/"));

        // Divisão por zero: deve lançar exceção, tratada pelo catch
        System.out.println("Entrada: 8 / 0   | esperado: exceção 'Divisão por zero não é permitida.'");
        try {
            System.out.println("Obtido: " + calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Obtido: " + e.getMessage());
        }

        // Operação inválida: deve lançar exceção, tratada pelo catch
        System.out.println("Entrada: 5 x 5   | esperado: exceção 'Operador inválido: x'");
        try {
            System.out.println("Obtido: " + calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Obtido: " + e.getMessage());
        }
    }
}
