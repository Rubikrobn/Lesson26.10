public class Specialist extends Employee implements EmployeeServise{
    private int levels;


    public Specialist(){

    }

    public Specialist(String fullname, int age, int salary, int levels, String cause, String Vacation ) {
        super(fullname, age, salary, cause,Vacation);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }
    public void workWithClients(){
        System.out.println("Работаю с клиентами");
    }

    public void goToDayOff(){
        System.out.println(this.getCause());

    }


    @Override
    public void goToVacation() {
        super.goToVacation();
    }

    @Override
    public void goToVacation1() {
        System.out.println(getVacation());

    }

    @Override
    public String toString() {
        System.out.println("-----------------------------");
        return  "Имя: "+getFullname()+"\n"+
                "Возраст: "+getAge()+"\n"+
                "Зарплата: "+getSalary()+"\n"+
                "Уровень: " + levels;
    }
}
