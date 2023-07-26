
import java.util.Scanner;

import Notes.getNotes;
import Validation.Validation;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Me diga as 3 notas:");
        Validation.nota1 = sc.nextDouble();
        getNotes.AnalisaNota(Validation.nota1, 1);
        sc.nextLine();
        Validation.nota2 = sc.nextDouble();
        getNotes.AnalisaNota(Validation.nota2, 2);
        sc.nextLine();
        Validation.nota3 = sc.nextDouble();
        getNotes.AnalisaNota(Validation.nota3, 3);
        sc.nextLine();

        Validation.Validar();

        sc.close();
    }
}
