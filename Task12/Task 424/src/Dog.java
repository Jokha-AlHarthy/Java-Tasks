public class Dog{
    //Make age private
    private Integer age = 0;

    //Add getters and setters
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        // Put the check (if age > 0) inside the setter — that is where validation lives.
        if(age>0){
            this.age = age;
            IO.println("Saving the age of the dog "+age);
        }else{
            IO.println("Keeping running the programme");
        }

    }
}
