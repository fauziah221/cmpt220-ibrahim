package cmpt220;

public class Point {
	double x,y; 
    
    public Point(double x, double y) // Point constructor
    { 
            this.x = x; 
            this.y = y; 
    } 
    
    static void answerForPoint(Point p) // Displaying x and y coordinates 
    { 
            System.out.println("(" + p.x + ", " + p.y + ")"); 
    } 
} 



