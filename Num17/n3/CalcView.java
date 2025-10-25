import javax.swing.*;

public class CalcView {
    private JTextField num1 = new JTextField(5);
    private JTextField num2 = new JTextField(5);
    private JTextField result = new JTextField(10);
    private JButton addBtn = new JButton("+");
    private JButton subBtn = new JButton("-");
    private JButton ymnBtn = new JButton("*");
    private JButton delBtn = new JButton("/");  

    public CalcView() {
        result.setEditable(false);
        
        JPanel panel = new JPanel();
        panel.add(num1);
        panel.add(new JLabel("?"));
        panel.add(num2);
        panel.add(new JLabel("="));
        panel.add(result);
        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(ymnBtn);
        panel.add(delBtn);
        JFrame frame = new JFrame("Mini Calc MVC");
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public int getNum1() { return Integer.parseInt(num1.getText()); }
    public int getNum2() { return Integer.parseInt(num2.getText()); }
    public void setResult(int value) { result.setText(String.valueOf(value)); }
    public void addListener(JButton button, Runnable action) {
        button.addActionListener(e -> action.run());
    }
    public JButton getAddBtn() { return addBtn; }
    public JButton getSubBtn() { return subBtn; }
    public JButton getYmnBtn() { return ymnBtn; }
    public JButton getDelBtn() { return delBtn; }
}