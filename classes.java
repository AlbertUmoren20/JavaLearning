//Java classes example
// class Student{
//     String n;
//     int id;

//     public Student(String n, int id){
//         this.n= n;
//         this.id= id;
//     }

//     public static void main(String [] args){
//         Student s1 = new Student("Alice", 101);
//         System.out.println("Name: " + s1.n + ", ID: " + s1.id);
//     }
// }

class Dog{
    String name;
    int age; 


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter methods and setters

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

     @Override
    public String toString() {
        return "Name is: " + name +  " and I am: " + age + " years old";
    }

    public static void main (String [] args){
        Dog myDog = new Dog ("Tuffy", 3);
        System.out.println(myDog.toString());
    }

}

class Employee{
    private String name;
    private float salary;

    public Employee (String name, Float salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public Float getSalary(){
        return salary;
    }
    // public void setName(){
    //     this.name = name;
    // }
    // public void setSalary(){
    //     this.salary = salary
    // }

    public void getEmployees(){
        Employee emp1 = new Employee("John", 50000f);
        Employee emp2 = new Employee("Jane", 60000f);
        System.out.println("Employee 1: " + emp1.getName() + ", Salary: " + emp1.getSalary());
        System.out.println("Employee 2: " + emp2.getName() + ", Salary: " + emp2.getSalary());
    }
}