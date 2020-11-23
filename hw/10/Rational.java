//package cmpt220;

public class Rational extends Number implements Comparable<Rational> {
         long num = 0;
         long den = 1;

        public Rational() {
                this(0, 1);}

        public Rational(long num, long den) {
                long calc = calc(num, den);
                this.num = ((den > 0) ? 1 : -1) * num/ calc;
                this.den = Math.abs(den) / calc;}

        private static long calc(long n, long d) {
                long n1 = Math.abs(n);
                long n2 = Math.abs(d);
                int calc = 1;

                for (int i = 1; i <= n1 && i <= n2; i++) {
                        if (n1 % i == 0 && n2 % i == 0) calc = i;}
                return calc;
                }
        
        public long getNumerator() {
                return num;
                }

        
        public long getDenominator() {
                return den;
                }

   
        public Rational addition(Rational r2) {
                long numerator = num * r2.getDenominator() + den * r2.getNumerator();
                long denominator = den * r2.getDenominator();
                return new Rational(numerator, denominator);
                }

        public Rational subtraction(Rational r2) {
                long numerator = num * r2.getDenominator() - den * r2.getNumerator();
                long denominator = den * r2.getDenominator();
                return new Rational(numerator, denominator);
        }


        public Rational multiplication(Rational r2) {
                long numerator = num * r2.getNumerator();
                long denominator = den * r2.getDenominator();
                return new Rational(numerator, denominator);
        }

        
        public Rational division(Rational r2) {
                long numerator = num* r2.getDenominator();
                long denominator = den * r2.num;
                return new Rational(numerator , denominator);
        }

        public String toString() {
                if (den == 1)
                        return num + "";
                else
                        return num+ "/" + den;
        }

  
        public boolean equals(Object other) {
                if ((this.subtraction((Rational) (other))).getNumerator() == 0)
                        return true;
                else
                        return false;}

 
        public int intValue() {
                return (int)doubleValue();}

        public float floatValue() {
                return (float)doubleValue();}

        public double doubleValue() {
                return num*1/den;}

        public long longValue() {
                return (long)doubleValue();}
        
        public int compareTo(Rational r) {
                if (this.subtraction(r).getNumerator() > 0)
                        return 1;
                else if (this.subtraction(r).getNumerator() < 0)
                        return -1;
                else
                        return 0;}

        public static Rational parseRationalNumber(String s) {
                if (s.contains("/")) {
                        String words[] = s.split("/");
                        long num = Long.parseLong(words[0].trim());
                        long den = Long.parseLong(words[1].trim());
                        return new Rational(num, den);} 
                else {
                        return new Rational(Long.parseLong(s.trim()), 1);}}
}

