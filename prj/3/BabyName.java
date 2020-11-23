//package cmpt220;

public class BabyName {//public class named BabyName
	int rank;//store variable for rank
	int year;//store variable for year
	String name;//store variable for name
	String gender;//store variable for gender
	
	public BabyName(int rank, int year, String gender, String name) {
		this.rank = rank;
		this.year = year;
		this.gender = gender;
		this.name = name;}
	
	public String toString() {//this returns the the name its ranking and the year
		return this.name + " is ranked #" + rank + " in year " + year;
	}

}
