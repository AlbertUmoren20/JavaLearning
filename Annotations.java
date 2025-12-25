// What are Annotations 
// Annotation  annotations are metadata that provide additional information about program e
// lements such as classes, methods, variables, or parameters. 
// They do not directly affect the program's execution but can influence how the compiler,
//  runtime, or other tools process the code. Annotations are widely used for documentation,
//  validation, configuration, and enhancing code readability.

//Annotations starts with a "@" symbol and can be applied to various program elements
//E.g @Override, @Depracated are commonly used to give specific instructions to the compiler


public class Annotations {
    class A{
        void ShowWhatIsInThePrintForThiss(){
            System.out.println("In A Show");
        }
    }
    class B extends A{
        void ShowWhatIsInThePrintForThis(){
            System.out.println("In B Show");
        }
    }
    public static void main(String [] args){
        Annotations a = new Annotations();
        B b = a.new B();
        b.ShowWhatIsInThePrintForThiss(); // in B show method
    }
}

