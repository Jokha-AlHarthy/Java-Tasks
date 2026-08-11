public class Dog implements AnimalBehaviour{
    @Override
    public void eat() {
        IO.println("The dog eats");
    }

    @Override
    public void sleep() {
        IO.println("The dog sleep");
    }

    @Override
    public void makeSound() {
        IO.println("The dog bark");
    }
}
