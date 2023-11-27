
package hengerprogram;

public class TomorHenger extends Henger {
    private double fajSuly;

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }

    public TomorHenger(double fajSuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajSuly = fajSuly;
    }
    
    
    public double suly(){
    
        return 0;
    
    }
}
