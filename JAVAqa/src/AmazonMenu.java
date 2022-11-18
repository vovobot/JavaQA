import java.util.Scanner;

public class AmazonMenu {

    public static void amazonMenu(Company amazon) {
            Scanner in = new Scanner(System.in);
            Holding holding = new Holding();
            Employee[] employees = new Employee[10];
            Company company = new Company();

            Company companyAmz = new Company("Amazon",employees,400000,"Aza");
            Employee employeeAmz = new Employee("Mike", 20000,"packer");
         Employee employeeAmz1 = new Employee("lina", 40000,"product manager");




        while (true) {
                System.out.println("Меню для работы с компанией: ");
                System.out.println("1) Вывод информацию о компании");
                System.out.println("2) Вывод списока сотрудников компании");
                System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
                System.out.println("4) Добавление сотрудника в компанию");
                System.out.println("5) Удаление сотрудника из компании");
                System.out.println("6) Поменять руководителя компании");
                System.out.println("7) Меню для работы с сотрудниками");
                System.out.println("0) Выход из главного меню");



                int command = in.nextInt();
                if (command == 1) {
                    System.out.println("---------------------------------");
                    System.out.println(companyAmz.getName() + " | " + companyAmz.getDirectorName() + " | " + companyAmz.getCompanyBudget());
                    System.out.println("---------------------------------");
                } else if (command == 2) {
                    //Реализуйте вывод списка сотрудников этой компании
                    System.out.println("---------------------------------");
                    System.out.println(employeeAmz.getName()+ " | " + employeeAmz.getSalary()+ " | " + employeeAmz.getPositionAtWork() );
                    System.out.println("---------------------------------");
                } else if (command == 3) {
                    //Реализуйте подсчет всех зароботных плат сотрудников
                    System.out.println("---------------------------------");
                    System.out.println(employeeAmz.getSalary());
                    System.out.println("---------------------------------");
                } else if (command == 4) {
                    //Реализуйте добавление компании в холдинг
                    System.out.println("---------------------------------");
                    System.out.println("Cотрудник добавлен!");
                    company.addEmployees(new Employee("Amir",12000,"Loader"));
                    System.out.println("---------------------------------");
                } else if (command == 5) {
                    //Реализуйте удаление компании из холдинга
                    System.out.println("---------------------------------");
                    holding.deleteCompany(companyAmz.getName());
                    System.out.println("Компания удалена! ");
                    System.out.println("---------------------------------");
                } else if (command == 6) {
                    //Реализуйте смену руководителя компании
                        Employee emplyee1 = new Employee("Amir",12000,"Loader");

                } else if (command == 7) {
                    String employeeName = in.next();

                    //Реализуйте поиск сотрудника по имени
                    //P.S. метод getEmployeeByName() пустой нужно его заполнить
                    Employee foundedEmployee = amazon.getEmployeeByName(employeeName);
                    EmployeeMenu.main(foundedEmployee);
                } else if (command == 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите пункт из меню");
                }
            }
        }
    }