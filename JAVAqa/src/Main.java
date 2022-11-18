import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Holding holding = new Holding();
        Company company = new Company();
        Employee employee = new Employee();



        while(true){
            System.out.println("1 - Меню для работы с холдингом");
            System.out.println("2 - Меню для работы с компанией");
            System.out.println("3 - Меня для работы с работником");
            int command = scan.nextInt();
            if(command == 1){
                MainMenu.main(holding);
            }else if(command == 2){
                CompanyMenu.main(company);
            }else if(command == 3){
                    EmployeeMenu.main(employee);
            }else{
                break;
            }
        }
    }
}
