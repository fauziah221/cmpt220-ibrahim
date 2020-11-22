package cmpt220;

import java.io.File;//for working with different file formats
import java.util.ArrayList;//used for having a resizable-array and to implement the List interface
import java.util.Scanner;//for input from user

public class PROJECT3 {//class called PROJECT3
	public static void main(String[] args) throws Exception{
		Scanner project = new Scanner(System.in);//for input from user 
		Scanner sProject = new Scanner(System.in);//for input from user for string specifically
		
		System.out.print("Please enter the year:\n");//prompts user to enter the year
		int year = project.nextInt();
		
		System.out.print("Please enter the gender:\n");//prompts user to enter the gender
		String gender = sProject.nextLine();
		
		System.out.print("Please enter the name:\n");//prompts user to enter the name
		String name = sProject.nextLine();
		
		String fileName= "BabyNameRanking" + year + ".txt";//search for file linked to the year entered
		
		ArrayList<BabyName> list = loadNames(fileName);//this will define the ArrayList of the BabyName by calling the loadnames method
		BabyName temp = findName(name, gender, list);//this will create an instance for BabyName with the result being produced from the name method
		
		if
		(temp.rank == -1 && temp.year == -1 && temp.name.equals("x") && temp.gender.equals("x"))
			System.out.println("Name \'" + name + "\' not found");//this is used so that if findName could find name it prints the name not found
		else
			System.out.println(temp.toString());//if the name is found it prints out the other information under the baby name
		project.close();
		sProject.close();
		}
		
	private static ArrayList<BabyName> loadNames(String fileName) throws Exception{//this loads the names in to the ArrayList
		File names = new File("/Users/fauziahibrahim/Desktop/BabyNameRanking.txt/" + fileName);
		
		int year = Integer.parseInt(fileName.substring(15, 19));//this will take the year from fileName and then convert it to an integer
		Scanner project = new Scanner(names);
		
		ArrayList<BabyName> list = new ArrayList<>();//this will create a new ArrayList
		while(project.hasNextLine()) {//this will add each name from the files into the ArrayList
			int rank = Integer.parseInt(project.next());//this will indicate that the first part of the line is the rank which is a stored in int rank
			String gender = "M";//this indicates that the first name of each line of the baby names ranking will always be "M" which stands for male
			String name = project.next();//the next line for the name
		    list.add(new BabyName(rank, year, gender, name));
		    gender= "F";//this indicates that the next name of each line of the baby names ranking will always be "F" which stands for female
		    project.next();//this helps us to skip the number of babies with this name since it is not required in the output of the program
		    name = project.next();//female name which eliminates the male name
		    list.add(new BabyName(rank, year, gender, name));
		    project.next();//this helps us to skip the number of babies with this name since it is not required in the output of the program
		}//this loops for every line that is in the file
		project.close();
		return list;//this will return the list
	}
		
		private static BabyName findName(String name, String gender, ArrayList<BabyName> names) {//this will search the ArrayList for the name input by the user
		    boolean found = false;
		    int ind = -1;
		    for(int i= 0; i < names.size(); i++) {
		    	if(names.get(i).gender.equals(gender) && names.get(i).name.equals(name) ) {
		    		found = true;
		    		ind =i;//this display the index of the results found 
		    	}}
		    if (found)//if it is found in the ArrayList it will display the right babyname
		    	return names.get(ind);
		    else
		    	return new BabyName(-1, -1, "x", "x");//this will use to print "Name not found" if the babyname cannot be found
		    	}
	}
