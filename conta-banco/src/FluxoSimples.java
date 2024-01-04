public class FluxoSimples {
    public static void main(String[] args) {
        double saldo = 30;
        double valorSolicitado = 30;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("O valor solicitado é: " + saldo);
        }else{
            System.out.println("Não tem saldo.");
        }
    }
}
