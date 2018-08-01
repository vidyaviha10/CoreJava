package com.primitive;
//there are 8 primitive datatypes explained here. 
//the datatypes are byte, char, int, short, long, double, float,boolean.
public class PrimitiveDatatypesExample {
         byte a = 10;
         int b = 25;
         double d = 356478;
         short c = 1456;
         long l = -1234556;
         char e = 'D';
         float f= 5.6666f;
         boolean h = true;
    
         public void testMethod(){
        	 System.out.println(a);
     		System.out.println(b);
     		System.out.println(d);
     		System.out.println(c);
     		System.out.println(l);
     		System.out.println(e);
     		System.out.println(f);
     		System.out.println(h);
        	 
         }
        public void operation()
        {
        	int i = (int) (a+b*f/d);
        	System.out.println("the result is: "+i);
        }
	public static void main(String[] args) {
		PrimitiveDatatypesExample pdte = new PrimitiveDatatypesExample();
		pdte.testMethod();
		pdte.operation();
	}

}
