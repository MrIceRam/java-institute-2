public class MiniCalc {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        new CalcController(model, view);
    }
}