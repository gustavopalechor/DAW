package n1;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.event.*;
  
   class Foo {}

   public class Saludo extends JFrame implements ActionListener {
      private JTextField t1;
      private JLabel mensaje;
      
      public void actionPerformed(ActionEvent e) {
         mensaje.setText("Hola "+t1.getText());
      }
      public Saludo() {
         setTitle("Ejemplo de saludo personalizado");
         setSize(400,200);
         setLocation(100,100);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(3,1));
         
         JPanel p1=new JPanel(new GridLayout(1,2));add(p1);
         p1.add(new JLabel("Introduce tu nombre: "));
         t1=new JTextField(30);t1.addActionListener(this);
         p1.add(t1);
         
         JButton b=new JButton("Saludar");add(b);b.addActionListener(this);

         mensaje=new JLabel();add(mensaje);

         setVisible(true);
      }
      public static void main(String[] args) {
         new Saludo();
      }
  
   }

