import java.util.Arrays;

public class Company {
        private String name;
        private Employee[] employees;

        private int companyBudget;
        private String directorName;


        public Company(String name, Employee[] employees, int holdingBudget, String directorName) {
            this.name = name;
            this.employees = employees;
            this.companyBudget = holdingBudget;
            this.directorName = directorName;
        }

         public Company(){}
        public int getCompanyBudget() {
            return companyBudget;
        }

        public void setCompanyBudget(int holdingBudget) {
            this.companyBudget = holdingBudget;
        }

        public String getDirectorName() {
            return directorName;
        }

        public void setDirectorName(String directorName) {
            this.directorName = directorName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employee[] getEmployees() {
            return employees;
        }

        public void setEmployees(Employee[] employees) {
            this.employees = employees;
        }

    public void addEmployees(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i] = employee;
                return;
            }
        }
    }

    public void deleteEmployees(String employee) {
        for (int i = 0; i < employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getName().equals(employee)) {
                System.out.println(this.employees[i].getName() + "был уволен");
                this.employees[i] = null;
            }
        }
    }

    public void changeDirector(Employee newDirector){
         for (int i = 0; i < employees.length; i++) {
             if(employees[i].equals(newDirector)){
                 employees[i] = newDirector;
             }
         }
     }

        public void SearhEmployee(Employee company){
        Employee[] employees = this.employees;
            for (int i = 0; i < employees.length; i++) {
                if (company.getName().equals(directorName)) {
                    System.out.println(company.getName() + company.getSalary());
                }
            }
        }


        public Employee getEmployeeByName(String name) {
            Employee[] employees = this.employees;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getName().equals(name)) {
                    System.out.println("Kомпания :" + employees[i].toString());
                    return employees[i];
                }
            }
            return null;
        }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", companyBudget=" + companyBudget +
                ",directorName='" + directorName + '\'' +
                '}';
    }
}