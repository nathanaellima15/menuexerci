import java.awt.*;
import javax.swing.*;

public class principal {
   public static void main(String[] args) {

      JFrame frame = new JFrame("MENU"); // cria uma janela
      JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10)); // cria um painel para os componentes

      // cria butões de escolha
      JLabel label1 = new JLabel("Escolha qual rodar");
      JButton button1 = new JButton("Exercicio 1: A divisivel B");
      JButton button2 = new JButton("Exercicio 2: Maior e Menor");
      JButton button3 = new JButton("Exercicio 3: Media");
      JButton button4 = new JButton("Exercicio 4: Par ou Impar");

      // adiciona os componentes ao painel
      panel.add(label1);
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);

      // configura o tamanho do painel
      panel.setPreferredSize(new Dimension(300, 150));

      // configura a ação dos botões
      button1.addActionListener(e -> {
         AeB ex1 = new AeB();
         ex1.main(args);
      });
      button2.addActionListener(a -> {
         maiormenor ex2 = new maiormenor();
         ex2.main(args);
      });
      button3.addActionListener(b -> {
         media ex3 = new media();
         ex3.main(args);

      });
      button4.addActionListener(c -> {
         Par ex4 = new Par();
         ex4.main(args);
      });

      // adiciona o painel à janela
      frame.getContentPane().add(panel);

      // configura o fechamento da janela
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // exibe a janela
      frame.pack();
      frame.setVisible(true);
   }
}
