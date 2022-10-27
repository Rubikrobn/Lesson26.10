public class Developer extends Employee implements EmployeeServise{
    private String grades;


    public Developer(){
    }

    public Developer(String fullname, int age, int salary, String grades, String cause, String Vacation) {
        super(fullname, age, salary, cause, Vacation);
        this.grades = grades;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
    public void writeCode(){
        System.out.println("Специалисты пишут код");
    }
    public void goToDayOff() {
        System.out.println(this.getCause());
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------");
        return "Имя: "+getFullname()+"\n"+
                "Возраст: "+getAge()+"\n"+
        "Зарплата: "+getSalary()+"\n"+
                "Уровень: "+getGrades();
    }

    @Override
    public void goToVacation1() {
        System.out.println(getVacation());

    }

    @Override
    public void goToVacation() {
        super.goToVacation();

    }
}
