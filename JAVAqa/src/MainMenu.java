import java.util.Scanner;

public class MainMenu {
    public static void main(Holding holding) {
        Scanner in = new Scanner(System.in);
        Employee[] employee = new Employee[10];



        while (true){
            System.out.println("Главне меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников");
            System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");

            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Список компаний: ");
                holding.showCompanies();
                System.out.println();
            } else if (command == 2) {
                System.out.println("Общий бюджет холдинга: ");
                holding.holdingBudget();
                System.out.println();
            } else if (command == 3) {
                holding.getEmployeeList(employee);
                System.out.println();
            } else if (command == 4) {
                System.out.println("Компании добавлены!");
                holding.addCompany(new Company("Amazon",employee,400000,"Azza"));
                holding.addCompany(new Company("KFC",employee, 900000,"Samat"));
                holding.addCompany(new Company("Beko" ,employee, 7000000, "Sam"));
                System.out.println();
            } else if (command == 5) {
                holding.deleteCompany(in.next());
                System.out.println();
            } else if (command == 6) {
                String companyName = in.next();
                Company foundedCompany = holding.getCompanyByName(companyName);
                CompanyMenu.main(foundedCompany);
            } else if (command == 0) {
                break;
            }else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}