package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary -= tax;
    }

    public void increaseSalary(double percentage){
        double increase = ((this.grossSalary + tax) * (percentage / 100)) + tax;
        this.grossSalary += increase;
    }

    @Override
    public String toString() {
        return "Employee: "
                + name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
