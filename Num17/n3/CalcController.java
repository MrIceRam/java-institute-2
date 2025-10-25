public class CalcController {
    private CalcModel model;
    private CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
        
        view.addListener(view.getAddBtn(), () -> calculate("+"));
        view.addListener(view.getSubBtn(), () -> calculate("-"));
        view.addListener(view.getYmnBtn(), () -> calculate("*"));
        view.addListener(view.getDelBtn(), () -> calculate("/"));
    }
    
    private void calculate(String operator) {
        int a = view.getNum1();
        int b = view.getNum2();
        int result = model.calculate(a, b, operator);
        view.setResult(result);
    }
}