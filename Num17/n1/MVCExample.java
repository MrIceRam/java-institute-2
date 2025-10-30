class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Студент: ");
        System.out.println("Имя: " + studentName);
        System.out.println("номер: " + studentRollNo);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name) {
        model.setName(name);
    }
    public String getStudentName() {
        return model.getName();
    }
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}

public class MVCExample {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase(); // Получаем данные из базы данных
        StudentView view = new StudentView(); // Создаем представление
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Влад");// Изменяем данные модели
        System.out.println("\nПосле обновления данные:");
        controller.updateView();
    }
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Вася");
        student.setRollNo("10");
        return student;
    }
}