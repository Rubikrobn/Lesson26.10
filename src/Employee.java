public abstract class Employee implements EmployeeServise {
    private String fullname;
    private int age;
    private int salary;
    private String cause;
    private String Vacation;
    public Employee(){

    }

    public Employee(String fullname, int age, int salary, String cause,String Vacation) {
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getVacation() {
        return Vacation;
    }

    public void setVacation(String vacation) {
        Vacation = vacation;
    }


    public void goToDatOff(){}

    @Override
    public void goToVacation() {
        EmployeeServise.super.goToVacation();
    }
}
