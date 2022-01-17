public class MonApplication10 {

    public static void main (String arg[]){
        System.out.println ("Bienvenue dans mon application de gestion ressources humaines");
        String employe1 = "Yves";

        ServicePaye2 servicePaye2;
        servicePaye2 = new ServicePaye2();
        
        int salaire1 = servicePaye2.calculerSalaire (employe1);
        
        System.out.println (employe1 + " a un salaire de " + salaire1);
    }
}