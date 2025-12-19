// In Java, Method Overloading allows a class to have multiple methods with the same name but different parameters, enabling compile-time (static

class Product{

    public int multiply(int a, int b)
    {
        int prod = a * b;
        return prod;
    }

    public int multiply ( int a, int b, int c){
        int prod =  a * b * c;
        return prod;
    }

    public class Main{
        public static void main (String [] args){
            Product ob = new Product ();
            
            int prod1 = ob.multiply(1, 2);
            System.out.println(prod1);
        }
    }


}


//Method Overriding with unchecked Exception
class SuperClass{
    void method(){
        System.out.println("Superclass method executed");
    }

    class SubClass extends SuperClass{
        @Override
        void method() throws ArithmeticException{
            System.out.println("Subclass method executed");
            throw new ArithmeticException("Exception in Subclass method");
    }

    public static void main(String [] args){
        //Creat an object of SuperClass

        SuperClass s = new SuperClass();
        try{
            s.method();
        }
        catch(ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }
}
}