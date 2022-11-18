public class Employee {
        private String name;
        private int salary;
        private String positionAtWork;

    public Employee(String name, int salary, String positionAtWork) {
        this.name = name;
        this.salary = salary;
        this.positionAtWork = positionAtWork;
    }
    public Employee(){}

    public void salary(){
        double count = 0;
        count = count + this.salary;
        System.out.println(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public void setPositionAtWork(String positionAtWork) {
        this.positionAtWork = positionAtWork;
    }
}
