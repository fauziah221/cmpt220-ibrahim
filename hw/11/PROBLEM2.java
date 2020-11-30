package cmpt220;
import java.util.ArrayList;
import java.util.Scanner;

public class PROBLEM2{  
        public static void main(String[] args) {
                Scanner knapsack = new Scanner(System.in);
                System.out.println("Please enter the number of items: ");
                int items = knapsack.nextInt();
                
                System.out.println("Please enter the weights for each item: ");
                int[] weightsforArray = new int[items];
                for(int i = 0; i < items; i++) {
                        weightsforArray[i] = knapsack.nextInt();
                }
                
                System.out.println("Enter the weight limit for the bag: ");
                int weightLimit = knapsack.nextInt();
                knapsack.close();
                ArrayList<Integer> knapsackans = m(items, weightLimit, weightsforArray);                
        }
        
        
        public static ArrayList<Integer> m(int i, int weightLimit, int[] w) {
                ArrayList<Integer> knapsackans = new ArrayList<Integer>();
                System.out.println("The maximum weight of the items placed in the bag is " + weightLimit);
 
                boolean Identified = false;
                boolean IdentifiedbutIncomplete= false;
                int id1 = -1, id2 = -1;
                int maxWeight = -1;
                
                for(int j = 0; j < i-1; j++) {
                for(int k = j+1; k < i; k++) {
                	int sum = w[j] + w[k];
                	if(sum == weightLimit) {
                       Identified = true;
                       id1 = j;
                       id2 = k;
                       break;}
                	
               else if(sum < weightLimit) {
                    if(sum > maxWeight) {
                    maxWeight = sum;
                    id1 = j;
                    id2 = k;        
                    IdentifiedbutIncomplete= true;                                               
                    }}}       
                    
                if(Identified)
                  break;}       
   
                if(Identified || IdentifiedbutIncomplete) {
                        System.out.println("The items in the bag are #" + (id1+1) + " #" + (id2+1));
                        System.out.println("The weights of the items in the bag are " + w[id1] + " " + w[id2]);
                        knapsackans.add(w[id1]);
                        knapsackans.add(w[id2]);
                }
                return knapsackans;
        }
}  