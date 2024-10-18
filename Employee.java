public class Employee {
    private int baseHours = 40;
    private double baseSalary = 40000.0;
    private int baseVacationDays = 10;
    private String baseVacationForm = "yellow";

    public void setBaseHours(int hours) {
        baseHours = hours;
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public void setBaseVacationDays(int days) {
        baseVacationDays = days;
    }
    public void setBaseVacationForm(String form) {
        baseVacationForm = form;
    }
    public int getHours() {
        return baseHours;                // 40 hours/week
    }

    public double getSalary() {
        return baseSalary;               // $40,000.00
    }

    public int getVacationDays() {
        return baseVacationDays;         // 10 days
    }

    public String getVacationForm() {
        return baseVacationForm;         // yellow
    }
}
