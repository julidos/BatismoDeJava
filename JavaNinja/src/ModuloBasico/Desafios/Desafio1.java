package ModuloBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String nomeMissao1 = "Levar uma entrega";
        char difMissao1 = 'C';
        String statusMissao1 = "";

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 15;
        String nomeMissao2 = "Matar o Orochimaru";
        char difMissao2 = 'S';
        String statusMissao2 = "";

        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 14;
        String nomeMissao3 = "Procurar um pássaro perdido";
        char difMissao3 = 'D';
        String statusMissao3 = "";

        if (idadeNinja1 < 15 && (difMissao1 == 'C' || difMissao1 == 'D')) {
            statusMissao1 = "Concluída";
        } else if (idadeNinja1 >= 16) {
            statusMissao1 = "Concluída";
        } else {
            statusMissao1 = "Não concluída";
        }

        System.out.println("----------------------------------------");

        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idadeNinja1);
        System.out.println("Nome da missão: " + nomeMissao1);
        System.out.println("Rank da missão: " + difMissao1);
        System.out.println("Status da missão: " + statusMissao1);

        System.out.println("----------------------------------------");

        if (idadeNinja2 < 15 && (difMissao2 == 'C' || difMissao2 == 'D')) {
            statusMissao2 = "Concluída";
        } else if (idadeNinja2 >= 16) {
            statusMissao2 = "Concluída";
        } else {
            statusMissao2 = "Não concluída";
        }

        System.out.println("----------------------------------------");

        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idadeNinja2);
        System.out.println("Nome da missão: " + nomeMissao2);
        System.out.println("Rank da missão: " + difMissao2);
        System.out.println("Status da missão: " + statusMissao2);

        System.out.println("----------------------------------------");

        if (idadeNinja3 < 15 && (difMissao3 == 'C' || difMissao3 == 'D')) {
            statusMissao3 = "Concluída";
        } else if (idadeNinja1 >= 16) {
            statusMissao3 = "Concluída";
        } else {
            statusMissao3 = "Não concluída";
        }

        System.out.println("----------------------------------------");

        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idadeNinja3);
        System.out.println("Nome da missão: " + nomeMissao3);
        System.out.println("Rank da missão: " + difMissao3);
        System.out.println("Status da missão: " + statusMissao3);

        System.out.println("----------------------------------------");
    }

}
