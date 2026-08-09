package ClinicWaitingList;

public class BookedPatient implements ATTENDABLE{
    private String name;
    private Integer age;
    private final String slotTime;

    public BookedPatient(String slotTime){
        this.slotTime = slotTime;
    }

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

    public String getSlotTime() {
        return slotTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age>=0 && age<=120){
            this.age = age;
        }else{
            IO.println("Invalid age");
        }
    }


    @Override
    public void printAllInfo() {
        IO.println("BookedPatient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", slotTime='" + slotTime + '\'' +
                '}');
    }

    @Override
    public String getPriority() {
        return "Booked";
    }

    @Override
    public int getWaitMinutes() {
        return 10;
    }

}
