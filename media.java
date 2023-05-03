import java.awt.*;
import javax.swing.*;

public class media {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de média de notas");// cria uma janela
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10)); // cria um painel para os componentes

        // cria três labels para as notas
        JLabel label1 = new JLabel("Nota 1:");
        JLabel label2 = new JLabel("Nota 2:");
        JLabel label3 = new JLabel("Nota 3:");

        // cria três campos de texto para as notas
        JTextField field1 = new JTextField(5);
        JTextField field2 = new JTextField(5);
        JTextField field3 = new JTextField(5);

        JButton button = new JButton("Calcular média");// cria um botão para calcular a média
        JLabel labelMedia = new JLabel("");// cria um label para exibir a média

        // adiciona os componentes ao painel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(button);
        panel.add(labelMedia);

        panel.setPreferredSize(new Dimension(300, 150)); // configura o tamanho do painel

        // configura a ação do botão
        button.addActionListener(e -> {
            // converte as notas de texto para número
            double nota1 = Double.parseDouble(field1.getText());
            double nota2 = Double.parseDouble(field2.getText());
            double nota3 = Double.parseDouble(field3.getText());

            // calcula a média
            double media = (nota1 + nota2 + nota3) / 3;

            // exibe a média no label
            labelMedia.setText("Média: " + media);
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
