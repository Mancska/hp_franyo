
package hengerprogram;
public class Henger {
    private static int hengerDarab;
    private double sugar,magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static void setHengerDarab(int hengerDarab) {
        Henger.hengerDarab = hengerDarab;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat(){
        double pi= 3.141;
       double V=pi*(sugar*sugar)*magassag;
        return 0;
        
    }
    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
}
