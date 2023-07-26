package Notes;

public class getNotes {
    public static int AnalisaNota(double numero, int indent) {
        int bimestre1 = 30;
        int bimestre23 = 35;

        int nota = 1;
        if (indent == 1) {
            if (numero > bimestre1) {
                System.out.println("ERRO: BIMESTRE 1: 30 PONTOS, BIMESTRE 2 E 3: 35 PONTOS");
                System.exit(0);
            }
        } else if (indent == 2 || indent == 3) {
            if (numero > bimestre23) {
                System.out.println("ERRO: BIMESTRE 1: 30 PONTOS, BIMESTRE 2 E 3: 35 PONTOS");
                System.exit(0);
            }
        } else {
            System.out.println("Coloque indentificador certo");
            System.exit(0);
        }

        return nota;

    }
}