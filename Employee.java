 class Employee {
    public String name;
    public int emplyId;
    public String position;
    public double salary;
     Employee(String name,int emplyId,String position,double salary){
    this.emplyId=emplyId;
    this.name=name;
    this.position=position;
    this.salary=salary;
    }
    public void changePosition(String position){
        System.out.println(this.position);
    }
    public  double riseSalary(double increament){
        return this.salary+increament;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", emplyId=" + emplyId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
