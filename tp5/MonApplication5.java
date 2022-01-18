public class MonApplication5 {

    public static void main (String arg[]) {
        System.out.println("démo switch");

        int note = 10;

        switch (note) {
            case 0:
                System.out.println("Ouch");
                break;
            
            case 10:
            System.out.println("Vous avez juste la moyenne");

                
                break;
            
            case 20:
                System.out.println("Parfait"); 
                break;
        
            default:
                System.out.println("il faut davantage travailler");

                break;
        }
    }
}