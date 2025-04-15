package ModuloBasico;

public class ArrayMulti {
    public static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]);
            for (int j = 1; j < ninjasEAldeias[i].length; j++) {
                System.out.println("Ninja: " + ninjasEAldeias[i][j]); } }

        String[][] ninjasEAldeias2 = new String[3][]; // Declaramos um array irregular

        ninjasEAldeias2[0] = new String[]{"Konoha", "Naruto Uzumaki", "Sasuke Uchiha", "Kakashi Hatake"};
        ninjasEAldeias2[1] = new String[]{"Nevoa", "Zabuza", "Haku"};
        ninjasEAldeias2[2] = new String[]{"Deserto", "Gaara", "Temari", "Kankuro"};

        for (int i = 0; i < ninjasEAldeias2.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias2[i][0]);
            for (int j = 1; j < ninjasEAldeias2[i].length; j++) {
                System.out.println("Ninja: " + ninjasEAldeias2[i][j]);
            }
        }

    }
}


