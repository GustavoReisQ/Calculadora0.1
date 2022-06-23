package media.alunos01;

import java.util.Scanner;

public class OperacoesDeMedia extends Aluno {

    static Scanner scan1 = new Scanner(System.in);

    public OperacoesDeMedia() {
    }
    public static double mediaTotal() {

        System.out.println("\nDigite as 4 notas de " + Aluno.nomeResp());

        int cont = 1;
        double notaM = 0;
        while (cont <= 4) {
            System.out.print("Digite a nota " + cont + ": ");
            double n = scan1.nextDouble();
            notaM += n;
            cont++;
        }
        return notaM;
    }
}