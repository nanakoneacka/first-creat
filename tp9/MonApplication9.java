public class MonApplication9 {
    public static void main (String arg[]){
        System.out.println ("Bienvenue dans mon application de gestionressources humaines");
        String employe1 = "Yves";
        
        int salaire1 ;
        
        ServicePaye servicePaye1;
        servicePaye1 = new ServicePaye();
        salaire1 = servicePaye1.calculerSalaire (employe1);
        System.out.println (employe1 + " a un salaire de " + salaire1);
    }
}