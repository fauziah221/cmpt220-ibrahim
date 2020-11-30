package cmpt220;

import java.util.Scanner;

public class PROBLEM1{
    public static double m(int i, double weightLimit, double[] w){
        if(i<=0||weightLimit <= 0)
            return 0;
        
        if(w[i-1]>weightLimit)
            return m(i-1, weightLimit, w);
        return Math.max(m(i-1, weightLimit, w), w[i-1] + m(i-1, weightLimit - w[i-1], w));
    }
    
    public static void main(String []args){
        Scanner knapsack = new Scanner(System.in);
        
        System.out.println("Please enter the number of items: ");
        int its = knapsack.nextInt();
        
        double [] w = new double[its];
        System.out.println("Please enter the weights for each item: ");
        for(int i=0; i<its; i++){
            w[i] = knapsack.nextDouble();}
        
        System.out.println("Please enter the weight limit for the bag: ");
        double weightLimit = knapsack.nextDouble();
        
        System.out.println("The maximum weight of the items placed in the bag is " + m(its, weightLimit, w));
    }
}