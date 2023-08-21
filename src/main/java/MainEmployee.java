public class MainEmployee {
    public static void main(String[] args) {

        Employee[] e = new Employee[10];
        e[0] = new SalaryEmployee(123, "John", 30, 5000);
        e[1] = new SalaryEmployee(234, "Jane", 28, 4500);
        e[2] = new WageEmployee(345, "Mike", 22, 15, 160);
        e[3] = new WageEmployee(456, "Emily", 25, 18, 140);
        e[4] = new Manager(567, "David", 40, 8000, 0.2);
        e[5] = new Manager(678, "Sarah", 35, 7000, 0.15);

        print(e);
        printAdv(e);
        printSuperAdv(e);

    }
    public static void print(Employee[] employees) {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.toString() + " " + e.calcSalary());
            }
        }
    }
    public static void printAdv(Employee[] employees){
        double sum = 0;
        for (Employee e : employees) {
            if (e != null) {

                System.out.println(e.toString() + " " + e.calcSalary());
                sum += e.calcSalary();
            }

        }
        System.out.println("-----------------");
        System.out.println("total salary: " + sum);
    }

    public static void printSuperAdv(Employee[] employees){
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {

                System.out.println(e.toString() + " " + e.calcSalary());
                sum = sum + e.calcSalary();
                count ++;
            }

        }
        System.out.println("-----------------");
        System.out.println("total salary: " + sum);
        System.out.println("average salary: " + sum/count);
    }
}
