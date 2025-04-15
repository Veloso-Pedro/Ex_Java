import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Simplificada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());

        JTextField campo1 = new JTextField(10);
        JTextField campo2 = new JTextField(10);
        JLabel resultado = new JLabel("Resultado: ");

        JButton somaBtn = new JButton("Soma");
        JButton subBtn = new JButton("Subtração");
        JButton multBtn = new JButton("Multiplicação");
        JButton divBtn = new JButton("Divisão");

        // Soma
        somaBtn.addActionListener(e -> {
            int a = Integer.parseInt(campo1.getText());
            int b = Integer.parseInt(campo2.getText());
            resultado.setText("Resultado: " + (a + b));
        });

        // Subtração
        subBtn.addActionListener(e -> {
            int a = Integer.parseInt(campo1.getText());
            int b = Integer.parseInt(campo2.getText());
            resultado.setText("Resultado: " + (a - b));
        });

        // Multiplicação
        multBtn.addActionListener(e -> {
            int a = Integer.parseInt(campo1.getText());
            int b = Integer.parseInt(campo2.getText());
            resultado.setText("Resultado: " + (a * b));
        });

        // Divisão com tratamento de erro
        divBtn.addActionListener(e -> {
            try {
                int a = Integer.parseInt(campo1.getText());
                int b = Integer.parseInt(campo2.getText());
                if (b == 0) {
                    resultado.setText("Erro: Divisão por zero");
                } else {
                    resultado.setText("Resultado: " + (a / b));
                }
            } catch (NumberFormatException ex) {
                resultado.setText("Erro: Entrada inválida");
            }
        });

        frame.add(new JLabel("Número 1:"));
        frame.add(campo1);
        frame.add(new JLabel("Número 2:"));
        frame.add(campo2);
        frame.add(somaBtn);
        frame.add(subBtn);
        frame.add(multBtn);
        frame.add(divBtn);
        frame.add(resultado);

        frame.setVisible(true);
    }
}