public abstract class Employee {
    private String fullname;
    private int age;
    private int salary;
    private String cause;
    public Employee(){

    }

    public Employee(String fullname, int age, int salary, String cause) {
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
    public void goToDatOff(){}

}
