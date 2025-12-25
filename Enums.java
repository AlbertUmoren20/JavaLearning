// In Java Enums (Short for Enumerations) are a special type of class that represents a group of constants.
// They are used to define a set of named values that represent a fixed set of constants.
// Enums are declared using the enum keyword.
// Enums are used to represent a set of constants.
// Enums are used to represent a set of constants.

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

public class Enums{
    public static void main (String [] args){
        Day today = Day.Friday;
        System.out.println("Today is: " + today);
        System.out.println("Today is: " + today.ordinal());
        System.out.println("Today is: " + today.name());
        System.out.println("Today is: " + today.toString());
        System.out.println("Today is: " + today.values());
        System.out.println("Today is: " + today.values().length);
        System.out.println("Today is: " + today.values()[0]);
        System.out.println("Today is: " + today.values()[1]);
        System.out.println("Today is: " + today.values()[2]);
        System.out.println("Today is: " + today.values()[3]);


        
        switch(today){
            case Monday;
            System.out.println("Start of the week!");
            break;  
            case Friday;
            System.out.println("Almost weekend!")
            break:
            case Saturday;
            break;
            case Sunday;
            System.out.println("Weekend!")
            break;
            default:
                System.out.println("Mid week days")
        }

        //Loop through the days
        for (Day d : Day.values())
        System.out.println(d);
    }

} 