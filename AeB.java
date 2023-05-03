import java.awt.*;
import javax.swing.*;

public class AeB {
    public static void main(String[] args) {
        JFrame frame = new JFrame("A é divisivel por B?");// cria uma janela
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));// cria um painel para os componentes

        // cria três labels para as notas
        JLabel label1 = new JLabel("A:");
        JLabel label2 = new JLabel("B");

        // cria três campos de texto para as notas
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);

        // cria um botão para calcular
        JButton button = new JButton("verificar");

        // cria um label para exibir o resultado
        JLabel labelResult = new JLabel("");

        // adiciona os componentes ao painel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(button);
        panel.add(labelResult);

        // configura o tamanho do painel
        panel.setPreferredSize(new Dimension(300, 150));

        // configura a ação do botão
        button.addActionListener(e -> {
            // converte as notas de texto para número
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());

            // calcula a média
            if (num1 % num2 == 0) {
                labelResult.setText("É divisivel");
            } else {
                labelResult.setText("Não é divisivel");
            }
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