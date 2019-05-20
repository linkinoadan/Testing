package demotread4;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DemoTread4 extends JFrame {

    int tiempoPro;
    int tiempoCon;
    char c = 'M';
    int cantidadVal;
    int tiempoPro1, tiempoPro2, cantidadVal1;
    Monitor mon = new Monitor(90);
    public String historial;

    
    JComboBox cmbtiempoPro, cmbtiempoCon, cmbcarcacterIni, cmbproducciónMax;
    JLabel lbtiempoPro, lbtiempoCon, lbcarcacterIni, lbproducciónMax, lbHistorial, lbEstadoActual, lbEstadoActualEti;
    JTextField txtHistorial;
    JButton btncomenzar;
    
    //Arreglos
    Object tiempo [] = {1, 2, 3, 4, 5, 6};
    Object caracteres [] = {'A', '@', '1', '©'};
    Object cantidad [] = {5, 10, 15, 20, 25, 30, 35, 40, 50};
    
    
    public DemoTread4 () {
        
        super("Productor y Consumidor");
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints restricción = new GridBagConstraints();
        Eventos objEventos = new Eventos();
        
       tiempoPro = 1;
       tiempoCon = 1;
       c = '@';
      cantidadVal = 10;
        tiempoPro1 = 1000;
        tiempoPro2 = 1000;
        cantidadVal1 = 5;
        cmbtiempoPro = new JComboBox(tiempo); 
        cmbtiempoPro.addActionListener(objEventos);
        cmbtiempoCon = new JComboBox (tiempo);
        cmbtiempoCon.addActionListener(objEventos);
        cmbcarcacterIni = new JComboBox (caracteres);
        cmbcarcacterIni.addActionListener(objEventos);
        cmbproducciónMax = new JComboBox (cantidad);
        cmbproducciónMax.addActionListener(objEventos);
        
        btncomenzar = new JButton("¡Comenzar!");
        btncomenzar.addActionListener(objEventos);
        
        
        lbtiempoPro = new JLabel("Tiempo Máximo de Espera para Producir (seg)");
        lbtiempoCon = new JLabel("Tiempo Máximo de Espera para Consumir (seg)");
        lbcarcacterIni = new JLabel("Producir desde... (escoja un caracter)");
        lbproducciónMax = new JLabel("¿Cuántos valores se desean Producir y Consumir?");
        lbHistorial = new JLabel ("HISTORIAL DE SUCESOS");
        lbHistorial.setFont(new Font("Mi letra", Font.ITALIC, 18));
        lbHistorial.setForeground(Color.darkGray);
        lbHistorial.setAutoscrolls(rootPaneCheckingEnabled);
        lbEstadoActual = new JLabel("El Búffer se encuentra vacío");
        lbEstadoActualEti = new JLabel("Estado Actual del Buffer");
        txtHistorial = new JTextField("Méndez Medrano Víctor Adán");
        txtHistorial.setFont(new Font("Mi letra", Font.ROMAN_BASELINE, 24));
        
        restricción.gridx = 1;
        restricción.gridy = 1;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.weightx = 1.0;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;
        add(lbtiempoPro, restricción);
        restricción.weightx = 0.0;
        restricción.weighty = 0.0;
        
        restricción.gridx = 1;
        restricción.gridy = 3;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.weightx = 1.0;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;
        add(lbtiempoCon, restricción);
        restricción.weightx = 0.0;
        restricción.weighty = 0.0;
        
        restricción.gridx = 2;
        restricción.gridy = 1;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.weightx = 1.0;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;
        add(lbcarcacterIni, restricción);
        restricción.weightx = 0.0;
        restricción.weighty = 0.0;
        
        restricción.gridx = 2;
        restricción.gridy = 3;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.weightx = 1.0;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;
        add(lbproducciónMax, restricción);
        restricción.weightx = 0.0;
        restricción.weighty = 0.0;
        
        restricción.gridx = 1;
        restricción.gridy = 2;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.fill = GridBagConstraints.CENTER;
        add(cmbtiempoPro, restricción);
        
        restricción.gridx = 1;
        restricción.gridy = 4;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.fill = GridBagConstraints.CENTER;
        add(cmbtiempoCon, restricción);
        
        restricción.gridx = 2;
        restricción.gridy = 2;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.fill = GridBagConstraints.CENTER;
        add(cmbcarcacterIni, restricción);
        
         restricción.gridx = 2;
        restricción.gridy = 4;
        restricción.gridheight = 1;
        restricción.gridwidth = 1;
        restricción.fill = GridBagConstraints.CENTER;
        add(cmbproducciónMax, restricción);
        
          restricción.gridx = 1;
        restricción.gridy = 5;
        restricción.gridheight = 1;
        restricción.gridwidth = 2;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;
        add(btncomenzar, restricción);
          restricción.weighty = 0.0;
        
         restricción.gridx = 1;
        restricción.gridy = 6;
        restricción.gridheight = 1;
        restricción.gridwidth = 2;
        restricción.fill = GridBagConstraints.CENTER;
        add(lbEstadoActualEti, restricción);
        
        restricción.gridx = 1;
        restricción.gridy = 7;
        restricción.gridheight = 1;
        restricción.gridwidth = 2;
        restricción.weightx = 1.0;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;

        add(lbEstadoActual, restricción);
        restricción.weightx = 0.0;
        restricción.weighty = 0.0;
        
       restricción.gridx = 1;
        restricción.gridy = 8;
        restricción.gridheight = 1;
        restricción.gridwidth = 2;
        restricción.fill = GridBagConstraints.CENTER;
        add(lbHistorial, restricción);
        
        restricción.gridx = 1;
        restricción.gridy = 9;
        restricción.gridheight = 1;
        restricción.gridwidth = 2;
        restricción.weightx = 1.0;
        restricción.weighty = 1.0;
        restricción.fill = GridBagConstraints.CENTER;
        restricción.fill = GridBagConstraints.BOTH;
        add(txtHistorial, restricción);
        restricción.weightx = 0.0;
        restricción.weighty = 0.0;
        
    }
    
  
    
    private class Eventos implements ActionListener{
//

        @Override
        public void actionPerformed(ActionEvent e) {
              if (e.getSource() == btncomenzar){
                  
                     if(cmbtiempoPro.getSelectedIndex()==0) {tiempoPro1=1000;}
                     if(cmbtiempoPro.getSelectedIndex()==1) {tiempoPro1=2000;}
                     if(cmbtiempoPro.getSelectedIndex()==2) {tiempoPro1=3000;}
                     if(cmbtiempoPro.getSelectedIndex()==3) {tiempoPro1=4000;}
                     if(cmbtiempoPro.getSelectedIndex()==4) {tiempoPro1=5000;}
                     if(cmbtiempoPro.getSelectedIndex()==5) {tiempoPro1=6000;}
                      if(cmbtiempoCon.getSelectedIndex()==0) {tiempoPro2=1000;}
                     if(cmbtiempoCon.getSelectedIndex()==1) {tiempoPro2=2000;}
                     if(cmbtiempoCon.getSelectedIndex()==2) {tiempoPro2=3000;}
                     if(cmbtiempoCon.getSelectedIndex()==3) {tiempoPro2=4000;}
                     if(cmbtiempoCon.getSelectedIndex()==4) {tiempoPro2=5000;}
                     if(cmbtiempoCon.getSelectedIndex()==5) {tiempoPro2=6000;}
                    
                     
                    if(cmbcarcacterIni.getSelectedIndex() == 0){c = 'A';}
                    if (cmbcarcacterIni.getSelectedIndex() == 1){c = '@' ;}
                    if (cmbcarcacterIni.getSelectedIndex() == 2){c = '1'; }
                    if (cmbcarcacterIni.getSelectedIndex() == 3){c= '©'; }
                   
                    if (cmbproducciónMax.getSelectedIndex() == 0){cantidadVal1 = 5;}
                    if (cmbproducciónMax.getSelectedIndex() == 1){cantidadVal1 = 10;}
                    if (cmbproducciónMax.getSelectedIndex() == 2){cantidadVal1 = 15;}
                    if (cmbproducciónMax.getSelectedIndex() == 3){cantidadVal1 = 20;}
                    if (cmbproducciónMax.getSelectedIndex() == 4){cantidadVal1 = 25;}
                if (cmbproducciónMax.getSelectedIndex() == 5){cantidadVal1 = 30;}
                    if (cmbproducciónMax.getSelectedIndex() == 6){cantidadVal1 = 35;}
                    if (cmbproducciónMax.getSelectedIndex() == 7){cantidadVal1 = 40;}
                    if (cmbproducciónMax.getSelectedIndex() == 8){cantidadVal1 = 45;}
                     if (cmbproducciónMax.getSelectedIndex() == 9){cantidadVal1 = 50;}
                      
//                      DemoTread4 obj = new DemoTread4(tiempoPro1, tiempoPro2, c, cantidadVal1);
             
                      Productor pro = new Productor(mon, cantidadVal1, tiempoPro1, c);
                      Consumidor con = new Consumidor(mon, cantidadVal1, tiempoPro2);
                      con.start();  
                      pro.star();
                        
        
         
              }
            }
    
    }
    
     public void actualizar () {
           txtHistorial.setText("Hola");
           this.repaint();
           System.out.println(txtHistorial.getText() + "Prueba desde el txt");
           
    }
     
     
     
     public static void main(String[] args) {
        DemoTread4 objThread = new DemoTread4();
        objThread.setVisible(true);
        objThread.setSize(600, 300);
        objThread.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
