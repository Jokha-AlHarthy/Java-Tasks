public class Cat implements AnimalBehaviour{
    @Override
    public void eat() {
        IO.println("The cat eats");
    }

    @Override
    public void sleep() {
        IO.println("The cat sleeps");
    }

    @Override
    public void makeSound() {
        IO.println("The cat make sound meow");
    }
}
