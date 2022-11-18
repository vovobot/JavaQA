import java.util.Scanner;

public class BekoMenu {
            public static void bekoMenu(Company beko) {
                Scanner in = new Scanner(System.in);
                Holding holding = new Holding();
                Employee[] employees = new Employee[0];

            Company companyBeko = new Company("beko" ,employees, 7000000, "Sam");
            Employee employeeBeko = new Employee("Damir", 15000,"Collector");

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
                        System.out.println(companyBeko.getName() + " | " + companyBeko.getDirectorName() + " | " + companyBeko.getCompanyBudget());
                        System.out.println("---------------------------------");
                    } else if (command == 2) {
                        //Реализуйте вывод списка сотрудников этой компании
                        System.out.println("---------------------------------");
                        System.out.println(employeeBeko.getName()+ " | " + employeeBeko.getSalary()+ " | " + employeeBeko.getPositionAtWork() );
                        System.out.println("---------------------------------");
                    } else if (command == 3) {
                        //Реализуйте подсчет всех зароботных плат сотрудников
                        System.out.println("---------------------------------");
                        System.out.println(employeeBeko.getSalary());
                        System.out.println("---------------------------------");
                    } else if (command == 4) {
                        //Реализуйте добавление компании в холдинг
                        System.out.println("---------------------------------");
                        System.out.println("Cотрудник добавлен!");
                        companyBeko.addEmployees(new Employee("Amir",12000,"Loader"));

                        System.out.println("---------------------------------");
                    } else if (command == 5) {
                        //Реализуйте удаление компании из холдинга
                        System.out.println("---------------------------------");
                        holding.deleteCompany(companyBeko.getName());
                        System.out.println("Компания удалена! ");
                        System.out.println("---------------------------------");
                    } else if (command == 6) {
                        //Реализуйте смену руководителя компании
                        Employee employeeBeko1 = new Employee("Damir", 15000,"Collector");


                    } else if (command == 7) {
                        String employeeName = in.next();

                        //Реализуйте поиск сотрудника по имени
                        //P.S. метод getEmployeeByName() пустой нужно его заполнить
                        Employee foundedEmployee = beko.getEmployeeByName(employeeName);
                        EmployeeMenu.main(foundedEmployee);
                    } else if (command == 0) {
                        break;
                    } else {
                        System.out.println("Ошибка! Введите пункт из меню");
                    }
                }
            }
        }