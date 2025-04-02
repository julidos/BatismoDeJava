package NivelBasico;

public class Array {
    public static void main(String[] args) {

        // Abrir um Array sempre com a tipagem seguida de colchetes
        // Poderia ser int[] idadeNinja = new int[3] (O "3" referencia quantos espaços na memória iremos utilizar)
        String[] nomeNinja = new String[6]; // Inicialização Array String = null
        //String[] nomeNinja = {"Naruto Uzumaki","Sasuke Uchiha","Sakura Haruno","Hinata Hyuga", "Kakashi Hatake"};

        // nomeNinja[0] por conta da indexação, sempre começa em 0
        nomeNinja[0] = "Naruto Uzumaki";
        nomeNinja[1] = "Sasuke Uchiha";
        nomeNinja[2] = "Sakura Haruno";
        nomeNinja[3] = "Hinata Hyuga";
        nomeNinja[4] = "Kakashi Hatake";
        System.out.println(nomeNinja);


        // Redeclarar Array (Sobrescreve aquele espaço da memória)
        nomeNinja = new String[7];
        nomeNinja[0] = "Hashirama Senju";
        nomeNinja[1] = "Tobirama Senju";
        nomeNinja[2] = "Hiruzen Sarutobi";
        nomeNinja[3] = "Minato Namikaze";
        nomeNinja[4] = "Tsunade";
        nomeNinja[5] = "Kakashi Hatake";
        nomeNinja[6] = "Naruto Uzumaki";
        System.out.println(nomeNinja[90]);

/*        // Array idade
        int[] idadeNinja = new int[2];
        idadeNinja[1] = 16;
        System.out.println(idadeNinja[0]); // Inicialização Array int = 0

        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]); // Inicialização Array boolean = false

        double[] flutuante = new double[1];
        System.out.println(flutuante[0]); // Inicialização Array Double = 0.0

        short[] short1 = new short[1];
        System.out.println(short1[0]); // Inicialização Array short = 0

        char[] char1 = new char[1];
        System.out.println(char1[0]); // Inicialização Array char =

        // Para printar usa o array e indica a posição que deve ser printada
        System.out.println(nomeNinja); //Se colocar assim printa a Referência de memória onde está o Array*/

        System.out.println(nomeNinja.length);

        for (int i = 0; i < nomeNinja.length; i++) {
            System.out.println(nomeNinja[i]);
        }
/*
Dessa forma eu gasto muita mais memória pois cada um ocupa um espaço na memória enquanto no Array ele ocupa apenas um
        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);

*/

    }
}
