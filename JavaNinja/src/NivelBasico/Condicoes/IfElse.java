package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
        *
        * IF e ELSE - Condições
        * Objetivo: Passar o ninja de nivel de acordo com o número de missões.
         */
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numMissoes = 10;

        // Se (condição) {faça isso} senão {faça isso}
        if (numMissoes >= 10 && idade > 15) {
            System.out.println("Naruto pode passar de nivel");
        }
        if (numMissoes >= 10 && idade > 15);
        System.out.println("teste");

        int a = 5, b = 3;
        System.out.println(a > b ? "Maior" : "Menor");

        boolean teste = false;
        if (!teste) {
            System.out.println("Negado");
        }

        int numeroDias = 1;//valor entre 1 e 30
        System.out.println((numMissoes >= 10 && idade > 15) ? "Rank: Chunnin" : "Rank: Gennim");
    }
}
