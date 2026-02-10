interface Animal{
    public void animalSound();
    public void sleep();
}

class Dog implements Animal{
    public void animalSound(){
        System.out.println("Woof");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}

public class inter_face{
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}