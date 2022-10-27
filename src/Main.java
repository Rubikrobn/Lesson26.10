public class Main {
    public static void main(String[] args) {

        Specialist specialist1 = new Specialist();
        specialist1.setFullname("Игорь");
        specialist1.setAge(30);
        specialist1.setSalary(30000);
        specialist1.setLevels(4);
        System.out.println(specialist1);
        specialist1.workWithClients();
        specialist1.setCause("Прошу отгул, по причине эмоциональной нестабильности");
        specialist1.goToDayOff();
        specialist1.setVacation("Уехать на свадьбу, в другую страну");
        specialist1.goToVacation1();
        Specialist specialist2=new Specialist();
        specialist2.setFullname("Пашок");
        specialist2.setAge(25);
        specialist2.setSalary(28000);
        System.out.println(specialist2);
        specialist2.setCause("Прошу отгул, по причине того что устал");
        specialist2.goToDayOff();
        specialist2.goToVacation();
        Developer developer=new Developer();
        developer.setFullname("Рид");
        developer.setAge(45);
        developer.setSalary(45000);
        developer.setGrades("middle");
        System.out.println(developer);
        Manager manager=new Manager();
        manager.setFullname("Алина");
        manager.setAge(36);
        manager.setSalary(35000);
        manager.setHasStocks(true);
        System.out.println(manager);
        manager.goToDayOff();
        manager.goToVacation();
        manager.setCause("Прошу отгул по причине плохого самочувствия!");
        manager.goToDayOff();
        Manager manager1=new Manager();
        manager1.setFullname("Елена");
        manager1.setAge(30);
        manager1.setSalary(30000);
        manager1.setHasStocks(true);
        manager1.setVacation("Для отдыха в горах");
        manager1.goToVacation1();
        CEO ceo=new CEO();
        ceo.setFullname("Рёйса");
        ceo.setAge(45);
        ceo.setSalary(65000);
        ceo.setHasCompanyCar(true);
        ceo.setHasStocks(true);
        ceo.goToVacation();
        System.out.println(ceo);


    }
}
