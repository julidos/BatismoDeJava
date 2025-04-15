package ModuloBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        Ternarios: Maneiras de reduzir o código
        variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
         */

        short numeroDeMissoes = 14;
        String nivelDoNinja = (numeroDeMissoes >= 10)
                ? "Esse ninja está com mais de 10 missões"
                : "Esse ninja está com " + numeroDeMissoes + " missões";
        System.out.println(nivelDoNinja);


    }
}
