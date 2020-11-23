//package cmpt220;

public class Animal implements Comparable<Animal>, Cloneable{
		   double weight;
		   double getWeight() {
		       return weight;
		   }

		   public void setWeight(double weight) {
		       this.weight = weight;}

		   
		   public int compareTo(Animal animal) {
		       double WeightOfAnimal= animal.getWeight();
		       return (int) (this.getWeight()-WeightOfAnimal);}
		  

		   protected Object clone() throws CloneNotSupportedException {
		       return super.clone();
		   }}

		   class Chicken extends Animal{
		   }
		   class Tiger extends Animal{
}

