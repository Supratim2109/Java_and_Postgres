import java.util.Scanner;
public class classes{
    static class car{
        String model="Ford";
        int year=1996;
    }
    public static void main(String[] args){
            car myCar= new car();
            System.out.println(myCar.model);
            System.out.println(myCar.year);
    }
    static class person{
        String name;
        int age;
    }
    public static void main(String[] args){
        person Person1 = new person();
        Scanner sc= new Scanner(System.in);
        Person1.name = sc.nextLine();
        Person1.age = sc.nextInt();
        System.out.println("Name" + Person1.name);
        System.out.println("Age"+Person1.age); 
    }
    Method
    static void myMethod(){
        System.out.println("Welcome to the program");
    }
    public static void main(String[] args){
        myMethod();
    }


    static class Main{
        int x;

        public Main(int y){
            this.x=y;
        }
    }

        public static void main(String[] args){
            Main myObj= new Main(5);
            System.out.println(myObj.x);
        }
}