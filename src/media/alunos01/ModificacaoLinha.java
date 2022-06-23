package media.alunos01;

public class ModificacaoLinha extends Aluno {
    static void linha() {
        System.out.println("============================================================");
    }
    static String aprovado() {
        System.out.println("*****|||||*****");
        System.out.println("    PARABÉNS,   ");
        System.out.println("    VOCÊ FOI   ");
        System.out.println("    APROVADO   ");
        System.out.println("*****|||||*****");
        return null;
    }
    static String reprovado() {
        System.out.println("Infelizmente você não atingiu a média mínima e foi reprovado.");
        return null;

    }
    static void apresentacao() {
        ModificacaoLinha.linha();
        System.out.println("Bem vindo ao programa para calcular a média dos seus alunos!");
        ModificacaoLinha.linha();
    }
    static void statusFinal() {

        if (OperacoesDeMedia.resultadoFim >= 6) {
            System.out.println(aprovado());
        } else {
            System.out.println(ModificacaoLinha.reprovado());
            }
        }
    }

