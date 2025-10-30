class Employee {
    private String name;
    private String id;
    private double hours;
    private double rate;
    private double bonus;
    private double deduction;

    // Конструктор для удобства
    public Employee(String name, String id, double hours, double rate, double bonus, double deduction) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.rate = rate;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    // Геттеры
    public String getName() { return name; }
    public String getId() { return id; }
    public double getHours() { return hours; }
    public double getRate() { return rate; }
    public double getBonus() { return bonus; }
    public double getDeduction() { return deduction; }
    
    // Сеттеры для изменения данных
    public void setHours(double hours) { this.hours = hours; }
    public void setRate(double rate) { this.rate = rate; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public void setDeduction(double deduction) { this.deduction = deduction; }
}

class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double baseSalary = employee.getHours() * employee.getRate();
        double total = baseSalary + employee.getBonus() - employee.getDeduction();
        return Math.max(total, 0); // Не меньше 0
    }
    
    public void showEmployeeInfo(Employee employee) {
        double salary = calculateSalary(employee);
        
        System.out.println("\n=== Информация о сотруднике ===");
        System.out.println("ФИО: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Зарплата: " + String.format("%.2f", salary) + " руб.");
        
        System.out.println("\n--- Детали расчета ---");
        System.out.println("Отработано часов: " + employee.getHours());
        System.out.println("Ставка: " + employee.getRate() + " руб/час");
        System.out.println("Базовая зарплата: " + String.format("%.2f", employee.getHours() * employee.getRate()) + " руб.");
        System.out.println("Премия: " + String.format("%.2f", employee.getBonus()) + " руб.");
        System.out.println("Удержания: " + String.format("%.2f", employee.getDeduction()) + " руб.");
        System.out.println("Итого: " + String.format("%.2f", salary) + " руб.");
        System.out.println("================================");
    }
}
public class SimpleSalarySystem {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА РАСЧЕТА ЗАРПЛАТЫ\n");
        SalaryCalculator calculator = new SalaryCalculator();
        
        // Создаем сотрудников
        Employee employee1 = new Employee("Иван Петров", "EMP001", 160, 500, 3000, 1500);
        Employee employee2 = new Employee("Мария Сидорова", "EMP002", 140, 600, 2000, 800);
        
        System.out.println("СОТРУДНИК 1:");
        calculator.showEmployeeInfo(employee1);
        System.out.println("СОТРУДНИК 2:");
        calculator.showEmployeeInfo(employee2);

        System.out.println("\n*** После изменений ***");// Изменяем данные и показываем обновленные результаты

        employee1.setHours(180);
        employee1.setBonus(5000);
        employee1.setDeduction(2000);
        
        System.out.println("СОТРУДНИК 1 (после изменений):");
        calculator.showEmployeeInfo(employee1);
        
        employee2.setRate(650);// Повышаем ставку второму сотруднику
        
        System.out.println("СОТРУДНИК 2 (после повышения ставки):");
        calculator.showEmployeeInfo(employee2);
    }
}