public void main(){
    List<AnimalBehaviour>animal = new ArrayList<>();
    animal.add(new Cat());
    animal.add(new Dog());
    for(AnimalBehaviour a : animal){
        IO.println("\n");
        a.eat();
        a.makeSound();
        a.sleep();
    }
}