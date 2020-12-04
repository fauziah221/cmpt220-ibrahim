package cmpt220;

public class Complex extends Number implements Comparable<Complex>,Cloneable{//complex class implements cloneable interface and comparable interface to indicate comparing to other instances of complex

	       Double real;//variable "real" declared
		   Double imaginary;//variable"imaginary" declared

			Complex(){}//constructor is defined with no parameters therefore value will be set to null"{}"

		    public Complex(Double a, Double b){//constructor is defined with two parameters 
		        this.real = a; //"real" value assigned to the real parameter value
		        this.imaginary=b;//"imaginary" value assigned to the imaginary parameter value
		    }
		    Complex(double a) {//constructor is defined with one parameter
                this.real = a;//"real" value assigned to the real parameter
                this.imaginary = (double) 0;//"imaginary" value will be set to 0
        }
		    
		    // method to add two complex numbers and return the complex object result
		    public Complex add( Complex c2){//add method defined	      
		        Complex formula = new Complex(); 
		        formula.real = this.real + c2.real; 
		        formula.imaginary = this.imaginary + c2.imaginary; 
		        return formula;//returns the results after adding
		    } 
		    
		    // method to subtract two complex numbers and return the complex object result
		    public Complex subtract( Complex c2){//subtract method defined
		        Complex formula = new Complex();
		        formula.real =this.real - c2.real; 
		        formula.imaginary = this.imaginary - c2.imaginary; 
		        return formula;//returns the result after subtracting
		    }
		    
		    // method to multiply two complex numbers and return the complex object result
		    public Complex multiply(Complex c2){//multiply method defined
		        Complex formula = new Complex();
		        formula.real=this.real * c2.real - (this.imaginary * c2.imaginary);
		        formula.imaginary= this.real * c2.imaginary + this.imaginary * c2.real;
		        return formula;//return the result after multiplying
		    }
		    
		    // method to divide two complex numbers and return the complex object result
		    public Complex divide(Complex c2){//divide method defined
		        Complex formula=new Complex();
		        formula.real=((this.real*c2.real)+(this.imaginary*c2.imaginary))/((c2.real*c2.real)+(c2.imaginary*c2.imaginary));
		        formula.imaginary=((this.imaginary*c2.real)-(this.real*c2.imaginary))/((c2.real*c2.real)+(c2.imaginary*c2.imaginary));  
		        return formula;//returns the result after dividing
		    }
		    
		    // method to find the absolute value of a complex number and that is the distance between this number and origin (0,0)
		    public double abs(){//absolute value method defined
		        double formula=Math.sqrt(((real)*(real))+((imaginary)*(imaginary)));
		        return formula;//returns the absolute value as the result
		    }
		    

		    public double getReal(Complex c){//getReal method defined
		        return real;//returns real part of the complex number
		    }
		    
		    
		    public double getImaginary(){//getImaginary method defined
		        return imaginary;//returns imaginary part of the complex number
		    }
		    
			@Override//overrides a toString method
		    public String toString() {//toString method defined for returning a string representation for a complex number
		        return String.format(real + " + "+ imaginary +"i" );//returns a string in the form a + bi
		        }
			
			public int compareTo(Complex that) {//compareTo method used to compare abs
				    if (this.abs() < that.abs())//if abs value is smaller than the abs value being compared to 
				    	return -1;//return a negative
				    else if (this.abs() > that.abs())//if abs value is larger than the abs value being compared to 
				    	return 1;//return positive number
				    else//if the abs values are the same
				    	return 0;//return the number O
			 }

			@Override//allows subclass Number to provide a specific implementation of a method that is already provided by Complex
			public double doubleValue() {//method returns the double value of the Double object
				return 0;
			}

			@Override//allows subclass Number to provide a specific implementation of a method that is already provided by Complex
			public float floatValue() {//method returns the value specified by the calling object as float
				return 0;
			}

			@Override//allows subclass Number to provide a specific implementation of a method that is already provided by Complex
			public int intValue() {//method returns the value of this integer as an int
				return 0;
			}

			@Override//allows subclass Number to provide a specific implementation of a method that is already provided by Complex
			public long longValue() {//returns the value of the object as a long type after the conversion.
				return 0;
			}
}
                