public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("O animal com " + legs + " não esta andando.");
    }
}


public class Fish extends Animal {
    public Fish() {
        super(0);
    }

    public void eat() {
        System.out.println("The fish is eating.");
    }

    public void walk() {
        System.out.println("Fish cannot walk.");
    }
}