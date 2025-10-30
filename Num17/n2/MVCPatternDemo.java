class Student {
    private String rollNo;
    private String name;
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }
}

class StudentView {
    public void printStudentDetails(String name, String rollNo) {
        System.out.println("Студент: ");
        System.out.println("Имя: " + name);
        System.out.println("Номер: " + rollNo);
    }
}

class StudentController {
    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name) { model.setName(name); }
    public String getStudentName() { return model.getName(); }
    public void setStudentRollNo(String rollNo) { model.setRollNo(rollNo); }
    public String getStudentRollNo() { return model.getRollNo(); }
    public void updateView() { 
        view.printStudentDetails(model.getName(), model.getRollNo()); 
    }
}

public class MVCPatternDemo {
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Влад");
        student.setRollNo("18");
        return student;
    }
    
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        controller.setStudentName("Вася");
        controller.updateView();
    }
}