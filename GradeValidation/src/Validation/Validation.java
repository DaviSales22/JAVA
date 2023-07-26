package Validation;

public class Validation {

    public static double nota1;
    public static double nota2;
    public static double nota3;
    public static double notaTotal;
    public static int notaMedia = 100 * 6 / 10;

    public static void Validar() {

        notaTotal = nota1 + nota2 + nota3;
        if (notaTotal >= notaMedia) {

            System.out.printf("Você passou de ano com %.2f pontos", notaTotal);

        } else {
            System.out.printf("Você ficou de recuperação faltando %.2f pontos", (notaMedia - notaTotal));
        }
    }
}