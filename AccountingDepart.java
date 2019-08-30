public class AccountingDepart extends Employee{
    int experience;
    AccountingDepart(String name,int emplyId,String position,double salary,int experience){
        super(name,emplyId,position,salary);
        this.experience=experience;
    }



    public void addExperience(int newExperience){
        this.experience=this.experience+newExperience;
    }

    public String toString() {
        return "AccountingDepart{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                ", emplyId=" + emplyId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
