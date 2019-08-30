public class TestDepartment {
    public static void main(String[] args) {
        ItDepartment myIt= new ItDepartment("Jay",998,"QA engineer",125000,"Java,SQL,Selenium,ISQTB");
        myIt.addSkills("Ruby on Rail");
        System.out.println(myIt.toString());

        AccountingDepart myAcc= new AccountingDepart("Ospirik",156,"Qa boss",5446324,10);
        myAcc.addExperience(4);
        System.out.println(myAcc.experience);
        System.out.println(myAcc.toString());


    }
}
