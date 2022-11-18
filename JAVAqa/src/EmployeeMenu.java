import java.util.Scanner;

public class EmployeeMenu {
    public static void main(Employee employee) {
        Scanner in = new Scanner(System.in);
        Employee employeeAmz = new Employee("Mike", 20000,"packer");
        Employee employeeKFC = new Employee("Bekzat", 27000,"loader");
        Employee employeeBeko = new Employee("Mars", 35000, "supervisor");
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {//Реализуйте вывод информации о сотруднике} else if (command == 0) {break;
            System.out.println("Coрудник компании Amazon - " + employeeAmz.getName() + "  | " + employeeAmz.getSalary() + " | " + employeeAmz.getPositionAtWork());
            System.out.println("Сотрудник компании KFC - " + employee.getName() + "  | " + employeeKFC.getSalary() + " | " + employeeKFC.getPositionAtWork());
            System.out.println("Сотрудник компании Beko - " + employeeBeko.getName() + "  | " + employeeBeko.getSalary() + " | " + employeeBeko.getPositionAtWork());}
            else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
