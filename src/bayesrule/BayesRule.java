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
public class BayesRule {
    public static void main(String[] args) {
//        PriorOdds priorOdds = new PriorOdds();
//        int iPriorOdds = priorOdds.priorOdds(206,365);
//        System.out.println(priorOdds.getA() + "/" + priorOdds.getB());
//        
//        LikelihoodRatio likelihoodRatio = new LikelihoodRatio();
//        int iLikelihoodRatio = (int)likelihoodRatio.likelihoodRatio(9, 1);
//        System.out.println(iLikelihoodRatio);
//        
//        PosteriorOdds posteriorOdds = new PosteriorOdds();
//        int iPosteriorOdds = (int)posteriorOdds.posteriorOdds();
//        System.out.println(iPosteriorOdds + ":" + iPriorOdds);
//
//        System.out.println("");
//        
//        PriorOdds priorOddsBC = new PriorOdds();
//        int iPriorOddsBC = priorOddsBC.priorOdds(5, 95);
//        System.out.println(priorOddsBC.getA() + ":" + priorOddsBC.getB());
//        
//        LikelihoodRatio likelihoodRatioBC = new LikelihoodRatio();
//        int iLikelihoodRatioBC = (int)likelihoodRatioBC.likelihoodRatio(80,10);
//        System.out.println("Likelihood Ratio = " +iLikelihoodRatioBC);
//        
//        PosteriorOdds posteriorOddsBC = new PosteriorOdds();
//        int iPosteriorOddsBC = (int)posteriorOddsBC.posteriorOdds();
//        System.out.println(iPosteriorOddsBC + ":" + priorOddsBC.getB());

        Fraction likelihoodRatio = new Fraction(41,10);
        Fraction priorOdds = new Fraction(1,1);
        
        
        Fraction result = Fraction.divide(41, 10, 1, 1);
        System.out.println(result);
        
        
        
        
        
        
        
        
    } //end of main
} //end of class
