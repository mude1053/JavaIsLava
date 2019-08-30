public class ItDepartment extends Employee {
 public String skillSet;
    ItDepartment(String name, int emplyId, String position, double salary,String skillSet) {
        super(name, emplyId, position, salary);
        this.skillSet=skillSet;
    }
    public void addSkills(String newSkills){
        this.skillSet=this.skillSet+","+newSkills;

    }


    public String toString() {
        return "ItDepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", name='" + name + '\'' +
                ", emplyId=" + emplyId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
