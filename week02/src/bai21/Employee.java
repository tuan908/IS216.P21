package bai21;

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Ghi đè phương thức show()
    @Override
    public void show() {
        System.out.println("Tên: " + getName() + ", Tuổi: " + getAge() + ", Lương: " + salary);
    }

    // Phương thức tăng lương theo tỉ lệ mặc định 10%
    public void addSalary() {
        this.salary *= 1.1;
    }

    // Phương thức tăng lương theo giá trị cụ thể
    public void addSalary(float amount) {
        this.salary += amount;
    }
}