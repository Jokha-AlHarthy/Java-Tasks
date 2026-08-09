package LibraryCatalogue;

public class Magazine implements LIBRARYITEM{
    private String name;
    private Integer issueNumber;
    private Integer month;

    @Override
    public void printAllInfo() {
        IO.println("Magazine{" +
                "name='" + name + '\'' +
                ", issueNumber=" + issueNumber +
                ", month=" + month +
                '}');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            System.out.println("Name cannot be empty ");
        }
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        if(issueNumber >= 1 && issueNumber <= 500){
            this.issueNumber = issueNumber;
        }else{
            System.out.println("Invalid issue number");
        }
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public String getShelfCode() {
        return "";
    }

}
