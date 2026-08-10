package GymMembershipDesk;

public class DayPassVisitor implements Payable{
    private String memberName;
    private Integer age = 14;
    private Integer numberOfVisit = 1;
    private final Integer memberId;
    private double visitPrice = 0.0;

    public DayPassVisitor(Integer memberId) {
        this.memberId = memberId;
    }


    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        if(memberName != null && !memberName.trim().isEmpty() && memberName.length()>2){
            this.memberName = memberName;
        }else{
            IO.println("The name is required..");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age>= 14 && age <=90){
            this.age = age;
        }else{
            IO.println("Too young to register");
        }
    }

    public Integer getNumberOfVisit() {
        return numberOfVisit;
    }

    public void setNumberOfVisit(Integer numberOfVisit) {
        if(numberOfVisit>=1 && numberOfVisit<= 31){
            this.numberOfVisit = numberOfVisit;
        }else{
            IO.println("You're out of your limit visit");
        }
    }

    public Integer getMemberId() {
        return memberId;
    }

    @Override
    public void printAllInfo() {
        IO.println("DayPassVisitor{" +
                "memberName='" + memberName + '\'' +
                ", age=" + age +
                ", numberOfVisit=" + numberOfVisit +
                ", memberId=" + memberId +
                '}');
    }

    @Override
    public double monthlyTotal() {
        return visitPrice * numberOfVisit;
    }

    @Override
    public String getName() {
        return memberName;
    }
}
