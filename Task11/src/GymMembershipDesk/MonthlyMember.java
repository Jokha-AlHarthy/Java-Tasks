package GymMembershipDesk;

public class MonthlyMember implements Payable {
    private String memberName;
    private Integer monthlyFee=0;
    private Integer age = 14;
    private final Integer memberId;

    public MonthlyMember(Integer memberId) {
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

    public Integer getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Integer monthlyFee) {
        if(monthlyFee > 0 && monthlyFee <= 500){
            this.monthlyFee = monthlyFee;
        }else{
            IO.println("The monthly fee exceeded the range");
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

    public Integer getMemberId() {
        return memberId;
    }

    @Override
    public void printAllInfo() {
        IO.println("MonthlyMember{" +
                "memberName='" + memberName + '\'' +
                ", monthlyFee=" + monthlyFee +
                ", age=" + age +
                ", memberId=" + memberId +
                '}');
    }

    @Override
    public double monthlyTotal() {
        return monthlyFee;
    }

    @Override
    public String getName() {
        return memberName;
    }

}
