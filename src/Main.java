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
        Specialist specialist2=new Specialist();
        specialist2.setFullname("Пашок");
        specialist2.setAge(25);
        specialist2.setSalary(28000);
        System.out.println(specialist2);
        specialist2.setCause("Прошу отгул, по причине того что устал");
        specialist2.goToDayOff();
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
        CEO ceo=new CEO();
        ceo.setFullname("Рёйса");
        ceo.setAge(45);
        ceo.setSalary(65000);
        ceo.setHasCompanyCar(true);
        ceo.setHasStocks(true);
        System.out.println(ceo);
        manager.setCause("Прошу отгул по причине плохого самочувствия!");
        manager.goToDayOff();
    }
}
