import java.util.Scanner;
public class CompanyMenu {
    public static void main(Company company) {
        Scanner scan = new Scanner(System.in);
            Company amz = new Company();
            Company kfc = new Company();
            Company beko = new Company();

            while(true){
                System.out.println("Выберите компанию с которой вы хотите работать: ");
                System.out.println("1 - Amazon");
                System.out.println("2 - KFC");
                System.out.println("3 - Beko");
                System.out.println();
                int command = scan.nextInt();
                if(command == 1){
                    AmazonMenu.amazonMenu(amz);
                }else if(command == 2){
                    KFCMenu.kfcMenu(kfc);
                }else if(command == 3){
                    BekoMenu.bekoMenu(beko);
                }else{
                    break;
                }
            }
        }
    }

