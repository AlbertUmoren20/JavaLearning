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
        finally{
            System.out.println("Exceution must complete. And program continues...");
        }
    }
}

// Final block example

