public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Declaração das variáveis
        double saldo = 25;
        double valorSolicitado = 18;

        // Verificação do saldo
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atualizado: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Segunda execução do programa
        saldo = 15;
        valorSolicitado = 22;

        // Verificação do saldo
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atualizado: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
