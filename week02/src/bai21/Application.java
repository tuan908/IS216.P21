package bai21;

public class Application {

    public static void main(String[] args) {
        Employee emp = new Employee("Nguyễn Văn A", 30, 10000000);
        emp.show();

        System.out.println("\nTăng lương mặc định 10%:");
        emp.addSalary();
        emp.show();

        System.out.println("\nTăng lương thêm 2 triệu:");
        emp.addSalary(2000000);
        emp.show();
    }
}
