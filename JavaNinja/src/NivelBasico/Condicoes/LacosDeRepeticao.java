package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        Laços de Repetição: Vão repetir infinitamente ou até você atingir o parametro desejado
        WHILE
        FOR
         */

        /*
        While
        while (condicao) { tudo aqui vai acontecer}
         */

        int numeroDeClones = 0;
        int numeroMaxClones = 40;

        // Enquanto o número de clones atual for menor ou igual ao número máximo de clones ele irá fazer
        while (numeroDeClones < numeroMaxClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez " + numeroDeClones + " clones das sombras");
        }
        System.out.println("O Naruto atingiu o número máximo de clones que são " + numeroMaxClones + " clones");

        /*
        For
        fori
         */


        for (int i = 0; i <= numeroMaxClones; i++) {
            String qntClones = (i <= numeroMaxClones) ? "O Naruto ainda pode fazer mais clones" : "O Naruto chegou ao máximo de clones";
            System.out.println(qntClones);
            System.out.println("O Naruto fez " + i + " clones das sombras");
        }
        System.out.println("O Naruto atingiu o número máximo de clones que são " + numeroMaxClones + " clones");


    }
}
