public void main(){
    Dog dog = new Dog();
    dog.setAge(5);
    IO.println("Current age: "+dog.getAge());
    dog.setAge(-1);
    IO.println("Current age: "+dog.getAge());
}