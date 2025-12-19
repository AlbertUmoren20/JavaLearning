// In Java, exception handling is a mechanism to handle runtime errors, allowing the normal flow of a program to continue. Exceptions are events that occur during program eceution that disrupt the normal flow of instructions.

class Math{
    public static void main (String [] args){
        int a = 30;
        int b = 0;

        try{
            int ans = a/b;
            System.out.println("The answer is: " + ans);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by 0!");
        }

        int array[] = {1, 2, 3,};
        try{
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array indexing stops at 2!");
        }
        // Final block example
        finally{
            System.out.println("Exceution must complete. And program continues...");
        }
    }
}



