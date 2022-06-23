package media.alunos01;

import java.util.Scanner;

public class Aluno {

    static Scanner scan = new Scanner(System.in);

    static String nome1;
    static void nome (){
        System.out.print("Digite o nome do aluno: ");
        nome1 = scan.next();
    }

    static String nomeResp(){
        return nome1;
    }

    static String escola1;
    static void escola(){
        System.out.print("Digite o nome da sua escola: ");
        escola1 = scan.next();
    }

    static String escolaResp(){
        return escola1;
    }

    static double resultadoFim;
    static void resultadoMedia(){
        resultadoFim = OperacoesDeMedia.mediaTotal()/4;
    }

    static void mensagemFinal(){

                ModificacaoLinha.linha();
                System.out.println("A média final de " + Aluno.nomeResp() + ", da escola " + Aluno.escolaResp() + ", é: " + resultadoFim + "!");
                ModificacaoLinha.linha();
                ModificacaoLinha.statusFinal();
    }
}
