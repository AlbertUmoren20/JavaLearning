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

