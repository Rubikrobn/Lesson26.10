public class CEO extends Manager {
    private boolean hasCompanyCar;
    public CEO(){

    }

    public CEO(String fullname, int age, int salary, boolean hasStocks, boolean hasCompanyCar, String cause) {
        super(fullname, age, salary, hasStocks, cause);
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
    public String toString() {
        System.out.println("-----------------------------");
        return "Имя: "+getFullname()+"\n"+
                "Возраст: "+getAge()+"\n"+
                "Зарплата: "+getSalary()+"\n"+
                "Наличие машины: " + hasCompanyCar;
    }
}
