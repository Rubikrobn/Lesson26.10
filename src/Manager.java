public class Manager extends Employee{
    private boolean hasStocks;
public Manager(){

}
    public Manager(String fullname, int age, int salary, boolean hasStocks, String cause) {
        super(fullname, age, salary, cause);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }




    public void writeProcedures(){
        System.out.println("Менеджеры разрабатывают процедуры");
    }
    public void goToDayOff() {
        System.out.println(this.getCause());
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------");
        return "Имя: "+ getFullname()+"\n" +
                "Возраст: "+getAge()+"\n"+
                "Зарплата: "+"\n"+
                "Наличие акций: " + hasStocks;
    }
}
