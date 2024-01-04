public class FluxoExpressãoCompleto {
    public static void main(String[] args) {
        int nota = 4;

        // O jeto de ler essa expressão fica da seguinte forma 
        
        // Se a nota for maior igual a 7 (? imprime aprovado) (: se não, nota for maior igual a 5 e se for menor que 7 imprima(?))
        // recuperação , e se o resultado não encaixar em nunhuma das condições vai para reprovada  

        // Outra explicação
        // Se a nota foi maior igual a 7, imprime aprovado, então é realizado outra condição (se não se)
        // Se nota for >= a 5 && nota < 7 ? (imprime recuperação) ( : se não ), reprovado
               
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 &&  nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}


// Essa é uma expressão completa de condição ternaria, isso são abreviações para a expressão 