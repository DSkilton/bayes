/*
 * credit to https://codippa.com/how-to-work-with-fractions-in-java/
 */
package bayesrule;

/**
 *
 * @author Duncan Skilton
 */
public class Fraction {
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
        if(getiNumerator() % getiDenominator() == 0){
            return getiDenominator();
        }
        return commonDen(getiDenominator(), getiNumerator() % getiDenominator());
    }
    
    public void reduce(){
        int commonDen = commonDen(getiNumerator(), getiDenominator());
        setiNumerator(getiNumerator() / commonDen);
        setiDenominator(getiDenominator() / commonDen);
    }
    
    public Fraction divide(Fraction fractionTwo){
        int iNum2 = getiNumerator() * fractionTwo.getDenominator();
        int iDen2 = getiDenominator() * fractionTwo.getiNumerator();
        Fraction result = new Fraction(iNum2, iDen2);
        return result;
    }
    
    @Override
    public String toString(){
        return this.getiNumerator() + "/" + this.getiDenominator();
    }

    /**
     * @return the iNumerator
     */
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
