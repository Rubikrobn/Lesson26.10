public class Specialist extends Employee{
    private int levels;

    public Specialist(){

    }

    public Specialist(String fullname, int age, int salary, int levels, String cause ) {
        super(fullname, age, salary, cause);
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
    public String toString() {
        System.out.println("-----------------------------");
        return  "Имя: "+getFullname()+"\n"+
                "Возраст: "+getAge()+"\n"+
                "Зарплата: "+getSalary()+"\n"+
                "Уровень: " + levels;
    }
}
