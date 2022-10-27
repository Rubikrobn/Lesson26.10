public class CEO extends Manager implements EmployeeServise{
    private boolean hasCompanyCar;
    public CEO(){

    }

    public CEO(String fullname, int age, int salary, boolean hasStocks, boolean hasCompanyCar, String cause, String Vacation) {
        super(fullname, age, salary, hasStocks, cause, Vacation);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public void goPublic(){
        System.out.println("CEO работает над IPO");
    }
    public void goToDayOff() {
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
        return "Имя: "+getFullname()+"\n"+
                "Возраст: "+getAge()+"\n"+
                "Зарплата: "+getSalary()+"\n"+
                "Наличие машины: " + hasCompanyCar;
    }
}
