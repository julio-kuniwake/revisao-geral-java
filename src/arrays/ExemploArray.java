package arrays;

public class ExemploArray {
    public static void main(String[] args){
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        double total = 0;

        for (int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }

        System.out.println("O total das notas é: " + total);
        System.out.println("A media das notas é: " + total / notasAlunoA.length);
        System.out.println("Pegando a ultima nota do aluno: " + notasAlunoA[notasAlunoA.length - 1]);

        String[] nomeAlunos = {"Ana", "julio", "Carol"};
        for (String s : nomeAlunos){ // Exemplo de Foreach
            System.out.print(s + " ");
        }
    }
}
