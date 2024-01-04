public class ResultadoEscolar {
    public static void main(String[] args) {
        
        double nota = 5;
        //Condicional Simples , quando se tem uma unica condicional simples no caso
        //Condicional Composta , quando se tem mais de uma condicional no caso do (else) 

        if (nota >= 5) {
            System.out.println("A nota do aluno foi aprovado : " + nota); // Condição verdadeira 
        }else{
            System.out.println("Reprovado"); // Condição falsa 
        }
    }
}
