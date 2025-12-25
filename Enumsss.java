public class Enumsss {
    enum Status {
        Running, Failed, Pending, Stopped;
    }
    enum Laptops{ // Let's say we want to get the prices of these laptops
        Mackbook(2000), XPS(1500), ThinkPad(1200), ChromeBook(1000);

        private int price;
        Laptops(int price){
            this.price = price;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            this.price = price;
        }
    }

    public static void main (String [] args){
        Status s = Status.Running;
        System.out.println(s + " : " + s.ordinal());

        if (s == Status.Running){
            System.out.println("All Good");
        }
        else if (s == Status.Failed) {
            System.out.println("System Failed!!");
        }
        else if (s == Status.Pending) {
            System.out.println("Please Wait");
        }
        else
            System.out.println("Done");

        Laptops laps = Laptops.Mackbook;
        System.out.println(laps + " : " + laps.getPrice());
        // laps.setPrice(2500);
        // System.out.println(laps + " : " + laps.getPrice());

        for (Laptops laptops : Laptops.values()){
            System.out.println(laptops + " : " + laptops.getPrice());

    }

}
