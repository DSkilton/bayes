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
public class LikelihoodRatio {
    /***
    * The chances of having a cloudy morning on a rainy day are 9 out of 10 – 
    * that means that only one out of 10 rainy day start out with blue skies. 
    * Sometimes there are also clouds without rain: the chances of having clouds
    * on a rainless there day are 1 in 10. 
    * Note that even thought the two probabilities 9/10 and 1/10 sum up to 
    * 9/10 + 1/10 = 1, this is by no means always the case.
    */
    private static double a;
    private static double b;
    private static double c;
    
    public static double getA(){
        return a;
    }
    
    public static double getB(){
        return b;
    }
    
    public static double getC(){
        return c;
    }
     
    public static double likelihoodRatio(double a, double b){
        c = a / b;
        return c;
    }
}
