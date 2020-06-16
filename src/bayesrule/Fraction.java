/*
 * credit to https://codippa.com/how-to-work-with-fractions-in-java/
 */
package bayesrule;

/**
 *
 * @author Duncan Skilton
 */
public final class Fraction {
    private int iNumerator;
    private int iDenominator;
    
    public Fraction(int iNum, int iDen){
        this.iNumerator = iNum;
        this.iDenominator = iDen;
        reduce();
    }
    
    public int getNumerator(){
        return getiNumerator();
    } 
    
    public void setNumerator(int iNum){
        this.setiNumerator(iNum);
    }
    
    public int getDenominator(){
        return getiDenominator();
    }
    
    public void setDenominator(int iDen){
        this.setiDenominator(iDen);
    }
    
    public int commonDen(int iNum, int iDen){
        if((getiNumerator() % getiDenominator()) == 0){
            return getiDenominator();
        }
        return 1;
    }
    
    public void reduce(){
        int commonDen = commonDen(getiNumerator(), getiDenominator());
        setiNumerator(getiNumerator() / commonDen);
        setiDenominator(getiDenominator() / commonDen);
    }
    
    public static Fraction divide(int iNum1, int iDen1, int iNum2, int iDen2){
        int iNewNum = iNum1 * iDen2;
        int iNewDen = iDen1 * iNum2;
        Fraction result = new Fraction(iNewNum, iNewDen);
        
        return result;
    }
    
    @Override
    public String toString(){
        return this.getiNumerator() + "/" + this.getiDenominator();
    }

   public int getiNumerator() {
        return iNumerator;
    }

    /**
     * @param iNumerator the iNumerator to set
     */
    public void setiNumerator(int iNumerator) {
        this.iNumerator = iNumerator;
    }

    /**
     * @return the iDenominator
     */
    public int getiDenominator() {
        return iDenominator;
    }

    /**
     * @param iDenominator the iDenominator to set
     */
    public void setiDenominator(int iDenominator) {
        this.iDenominator = iDenominator;
    }
}
