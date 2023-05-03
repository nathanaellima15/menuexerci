import java.awt.*;
import javax.swing.*;

public class Par {
    public static void main(String[] args) {

        JFrame frame = new JFrame("verificar numero par ou impar");// cria uma janela
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));// cria um painel para os componentes
        JLabel label1 = new JLabel("Digite o numero ");// cria uma labels para o numero
        JTextField field1 = new JTextField(5);// cria um campo de texto para o numero
        JButton button = new JButton("Verificar");// cria um botão para verificar se é par
        JLabel labelPar = new JLabel("");// cria um label para exibir o resultado

        // adiciona os componentes ao painel
        panel.add(label1);
        panel.add(field1);
        panel.add(button);
        panel.add(labelPar);
        panel.setPreferredSize(new Dimension(300, 150)); // configura o tamanho do painel

        // configura a ação do botão
        button.addActionListener(e -> {
            // converte o valor de texto para número
            double num1 = Double.parseDouble(field1.getText());

            // calcula e mostra se é par ou impar
            if (num1 % 2 == 0) {
                labelPar.setText("valor é Par");
            } else {
                labelPar.setText("valor é Impar");
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