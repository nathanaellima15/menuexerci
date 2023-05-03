import java.awt.*;
import javax.swing.*;

public class maiormenor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("maior numero");// cria uma janela
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));// cria um painel para os componentes

        // cria três labels para as notas
        JLabel label1 = new JLabel("Numero 1");
        JLabel label2 = new JLabel("Numero 2");
        JLabel label3 = new JLabel("Numero 3");

        // cria três campos de texto para os numeros
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JTextField field3 = new JTextField(5);

        JButton button = new JButton("Calcular");// cria um botão para exibir o maior
        JLabel labelMaior = new JLabel("");// cria um label para exibir o maior
        JLabel labelMenor = new JLabel("");// cria um label para exibir o menor

        // adiciona os componentes ao painel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(button);
        panel.add(labelMaior);
        panel.add(labelMenor);

        panel.setPreferredSize(new Dimension(300, 150));// configura o tamanho do painel

        // configura a ação do botão
        button.addActionListener(e -> {
            // converte os valores de texto para número
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            double num3 = Double.parseDouble(field3.getText());

            // calcular maior e menor e exibir
            double m = num1;
            double n = num1;
            if (m < num2) {
                m = num2;
            } else {
                n = num2;
            }
            if (m < num3) {
                m = num3;
            } else {
                n = num3;
            }

            labelMaior.setText("o maior é " + m);
            labelMenor.setText("o menor é: " + n);
        });

        // adiciona o painel à janela
        frame.getContentPane().add(panel);

        // configura o fechamento da janela
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // fecha apenas a janela secundária

        // exibe a janela
        frame.pack();
        frame.setVisible(true);

    }
}