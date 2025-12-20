//Checked Exceptions

import java.io.FileNotFoundException;
import java.io.FileReader;

// class Test{
//     public static void main (String [] args) {
//         FileReader fr = new FileReader("file.txt");
//         System.out.println("File opened successfully");
//     }
// }

class Test{
    public static void main (String [] args) throws FileNotFoundException{
        FileReader fr = new FileReader("file.txt");
        System.out.println("File opened successfully");
    }
}

class Test2{
    public static void main(String [] args){

        try{
        FileReader fr = new FileReader("file.txt");
        }
        catch (FileNotFoundException e){
            System.out.println ("File not found!");
        }
        finally{
            System.out.println("Execution completed.");
        }
   
    }
}

//Checked Exceptions 

//NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException are examples of unchecked exceptions in Java. Unchecked exceptions are not checked at compile-time but occur during runtime. They usually indicate programming errors, such as logic mistakes or improper use of APIs.

class Test3{
    public static void main (String [] args){
        int a = 10/0;
        System.out.println("The answer is: " + a); //Arithmetic exception
    }
}

class Test4{
    public static void main(String [] args){
        String name = null;
        System.out.println(name.length());  // Null pointer exception
    }
}

class Test5{
    public static void main (String [] args){
        int array[] = {1, 2, 3};
        System.out.println(array[5]); // Array index out of bounds exception
    }
}

// Handling Unchecked Exceptions

class Test6{
    public static void main(String [] args){
        try{
            int a = 10/0;
        System.out.println("The answer is: " + a);    
    }
    catch(ArithmeticException e){
        System.out.println("Error: Division by zero!");
    }
        try{
            String name = null;
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println("Error: Null value encountered!");
        }
        try{
            int array [] = {1, 2, 3};
            System.out.println(array[5]); // Array index out of bounds exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds!");
        }
    }
}