import java.util.Scanner;

public class MonApplication7 {

    public static void main (String arg[]) {
        System.out.println("demo boucle while");

        String prenom;
        char reponse = 'o';
        Scanner sc =  new Scanner(System.in);
        while (reponse == 'o')
        {
            System.out.println("Donnez un prenom : ");
            prenom = sc.nextLine();
            System.out.println("Bonjour" + prenom + "comment vas tu ?");
            System.out.println("souhaitez  vous réessayer? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
        System.out.println("Au revoir...");
    }
}