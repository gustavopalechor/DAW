package n1.s1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Ventana extends JFrame {
   private int x=100;
   private int y=100;
   private void esperar() {
      for (int i=1;i<1000;i++) {
         for (int j=1;j<1000;j++) {
         }
      }
   }

   private void mover() {
      while (true) {
         for (int i=0;i<300;i++) {
            setLocation(x+i,y);
            esperar();
         }
         for (int i=300;i>0;i--) {
            setLocation(x+i,y);
            esperar();
         }
      }
   }
   public Ventana() {
      setTitle("Ventana en movimiento");
      setSize(200,200);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(2,1));
      add(new JLabel("Pulsa X para cerrar la ventana"));
      add(new JLabel("...si puedes"));
      setVisible(true);
      mover();
   }
   public static void main(String[] args) {
      new Ventana();
   }

}
