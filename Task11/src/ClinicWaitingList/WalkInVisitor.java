package ClinicWaitingList;

public class WalkInVisitor implements ATTENDABLE{
    private String name = "";
    private Integer age = 0;
    private Integer arrivalOrder=1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            IO.println("Name is required");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age >= 0 && age<=120){
            this.age = age;
        }else{
            IO.println("Invalid age");
        }
    }

    public Integer getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(Integer arrivalOrder) {
        if(arrivalOrder >= 0){
            this.arrivalOrder = arrivalOrder;
        }else{
            this.arrivalOrder = 1;
        }
    }

    @Override
    public void printAllInfo() {
        IO.println("WalkInVisitor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", arrivalOrder=" + arrivalOrder +
                '}');
    }

    @Override
    public String getPriority() {
        return "Walk-in";
    }

    @Override
    public int getWaitMinutes() {
        return arrivalOrder * 15;
    }
}
