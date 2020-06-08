/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayesrule;

/**
 *
 * @author Duncan Skilton
 */
public class PriorOdds {
/**
 * Rain example 
 * The chances of rain are 206 in 365. Therefore the number of days without rain is 159. 
 * Prior odds of 206:159 for rain
 */
    private static int a;
    private static int b;
    private static int c;

    public static int getA(){
        return a;
    }
    
    public static int getB(){
        return b;
    }
    
    public static int getC(){
        return c;
    }
    
    public int priorOdds(int a, int b){
        PriorOdds.a = a;
        PriorOdds.b = b;
        c = b - a;
        return c;
    }
}
