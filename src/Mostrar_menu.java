import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mostrar_menu {
    public static void main(String[] args) {
        System.out.println("Hellcom to the agenda, please choose an option:");
        System.out.println("  1. Create a new contact.");
        System.out.println("  2. Search for existing contacts.");
        System.out.println("  3. Update an existing contact.");
        System.out.println("  4. Delete an existing contact.");
        System.out.println("  5. Exit.");

        Scanner sc = new Scanner(System.in);

        int opcio = sc.nextInt();

        System.out.println("Has escollit l'opció " + opcio);

    }
}