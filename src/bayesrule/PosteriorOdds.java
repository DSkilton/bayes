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
public class PosteriorOdds {
    public static double posteriorOdds(){ 
        return LikelihoodRatio.getC() * PriorOdds.getA();
    } 
}
