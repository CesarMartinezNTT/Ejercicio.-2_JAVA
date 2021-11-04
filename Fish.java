
public class Fish extends Animal implements Pet{
    String name="fish";

    public Fish(){
        super(0);
    }

    @Override
    public void walk(){
        System.out.println("Fishes have no legs so they can´t walk :(");
    }
    @Override
    public void eat(){
        System.out.println(name+" eats shrimp flakes.");
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void play(){
        System.out.println(name+" likes to play with Dory");
    }
}
