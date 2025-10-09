package Username.Controler;
import Username.Interface.animal;
import Username.Interface.hand;
import Username.Interface.leg;

public class Human implements hand ,leg, animal {
    private String name;
    private int age;
    public Human(String n, int a){
        name = n;
        age = a;
    }
   public int getAge() {
       return age;
   }
    public String getName() {
         return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showHand() {
        
        System.out.println("Human have 2 hand.");
    }

    @Override
    public void showLeg() {
        System.out.println("Human have 2 leg.");
    }

    @Override
    public void sound() {
        
        System.out.println("Human say: Hello!");
    }
    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("Human chua doi.");
    }
}
