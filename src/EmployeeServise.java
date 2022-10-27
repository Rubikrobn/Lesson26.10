public interface EmployeeServise {
    default void goToVacation(){
        System.out.println("Хочет в отпуск");
    }
    void goToVacation1();

}
