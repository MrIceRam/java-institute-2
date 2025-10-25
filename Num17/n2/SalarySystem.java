class Employee {
    private String name;
    private String id;
    private double hoursWorked;
    private double hourlyRate;
    private double bonus;
    private double deduction;

    // Геттеры и сеттеры
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double getDeduction() { return deduction; }
    public void setDeduction(double deduction) { this.deduction = deduction; }
}

// Класс EmployeeView (Представление) - отображает информацию
class EmployeeView {
    public void printEmployeeDetails(String name, String id, double salary) {
        System.out.println("\n=== Информация о сотруднике ===");
        System.out.println("ФИО: " + name);
        System.out.println("ID: " + id);
        System.out.println("Заработная плата: " + String.format("%.2f", salary) + " руб.");
        System.out.println("================================");
    }
    
    public void printSalaryDetails(double baseSalary, double bonus, double deduction, double totalSalary) {
        System.out.println("\n--- Детали расчета зарплаты ---");
        System.out.println("Базовая зарплата: " + String.format("%.2f", baseSalary) + " руб.");
        System.out.println("Премия: " + String.format("%.2f", bonus) + " руб.");
        System.out.println("Удержания: " + String.format("%.2f", deduction) + " руб.");
        System.out.println("Итого к выплате: " + String.format("%.2f", totalSalary) + " руб.");
        System.out.println("--------------------------------");
    }
}

// Класс EmployeeController (Контроллер) - управляет логикой
class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    // Методы для работы с данными
    public void setEmployeeName(String name) { model.setName(name); }
    public String getEmployeeName() { return model.getName(); }

    public void setEmployeeId(String id) { model.setId(id); }
    public String getEmployeeId() { return model.getId(); }

    public void setHoursWorked(double hoursWorked) { model.setHoursWorked(hoursWorked); }
    public double getHoursWorked() { return model.getHoursWorked(); }

    public void setHourlyRate(double hourlyRate) { model.setHourlyRate(hourlyRate); }
    public double getHourlyRate() { return model.getHourlyRate(); }

    public void setBonus(double bonus) { model.setBonus(bonus); }
    public double getBonus() { return model.getBonus(); }

    public void setDeduction(double deduction) { model.setDeduction(deduction); }
    public double getDeduction() { return model.getDeduction(); }

    // Расчет зарплаты
    public double calculateSalary() {
        double baseSalary = model.getHoursWorked() * model.getHourlyRate();
        double totalSalary = baseSalary + model.getBonus() - model.getDeduction();
        return Math.max(totalSalary, 0); // Зарплата не может быть отрицательной
    }

    // Обновление представления
    public void updateView() {
        double salary = calculateSalary();
        view.printEmployeeDetails(model.getName(), model.getId(), salary);
    }

    // Показать детали расчета
    public void showSalaryDetails() {
        double baseSalary = model.getHoursWorked() * model.getHourlyRate();
        double totalSalary = calculateSalary();
        view.printSalaryDetails(baseSalary, model.getBonus(), model.getDeduction(), totalSalary);
    }
}

// Главный класс с методом main
public class SalarySystem {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА РАСЧЕТА ЗАРПЛАТЫ СОТРУДНИКОВ\n");
        
        // Создаем первого сотрудника
        System.out.println("СОТРУДНИК 1");
        Employee employee1 = createFirstEmployee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller1 = new EmployeeController(employee1, view);

        // Показываем исходные данные
        System.out.println("Исходные данные:");
        controller1.updateView();
        controller1.showSalaryDetails();

        // Изменяем данные и показываем результат
        System.out.println("\nПосле изменения (увеличили часы, добавили премию):");
        controller1.setHoursWorked(180);
        controller1.setBonus(5000);
        controller1.setDeduction(2000);
        controller1.updateView();
        controller1.showSalaryDetails();

        // Создаем второго сотрудника
        System.out.println("\nСОТРУДНИК 2");
        Employee employee2 = createSecondEmployee();
        EmployeeController controller2 = new EmployeeController(employee2, view);
        
        controller2.updateView();
        controller2.showSalaryDetails();

        // Демонстрация изменения данных второго сотрудника
        System.out.println("\nПосле повышения ставки:");
        controller2.setHourlyRate(650);
        controller2.updateView();
        controller2.showSalaryDetails();
    }

    // Метод для создания первого сотрудника
    private static Employee createFirstEmployee() {
        Employee employee = new Employee();
        employee.setName("Оськин Влад 1");
        employee.setId("EMP001");
        employee.setHoursWorked(160);
        employee.setHourlyRate(500);
        employee.setBonus(3000);
        employee.setDeduction(1500);
        return employee;
    }

    // Метод для создания второго сотрудника
    private static Employee createSecondEmployee() {
        Employee employee = new Employee();
        employee.setName("Оськин Влад 2");
        employee.setId("EMP002");
        employee.setHoursWorked(140);
        employee.setHourlyRate(600);
        employee.setBonus(2000);
        employee.setDeduction(800);
        return employee;
    }
}