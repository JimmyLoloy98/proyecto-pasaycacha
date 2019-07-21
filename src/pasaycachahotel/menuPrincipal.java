package pasaycachahotel;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class menuPrincipal extends JFrame implements ActionListener{
    private JPanel panel;
    //
    private JButton ingresar;
    private JButton salir;
    //
    private JComboBox listaVersiones;
    //
    interfasLogin ventanaLogin;
    interfasLoginv2 ventanaLoginv2;
    interfasLoginv3 ventanaLoginv3;
    interfasLoginv4 ventanaLoginv4;
    
    public menuPrincipal(){
        this.setSize(400, 550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("HOTEL PASAYCACHA S.A.C");
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        panel();
        etiquetas();
        botones();
        listasDesplegables();
    }
    private void panel(){
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255));
        this.getContentPane().add(panel);
    }
    private void etiquetas(){
        ImageIcon imagen = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/logo.jpg");
        JLabel tituloImagen = new JLabel(imagen);
        tituloImagen.setBounds(30, 1, 350, 310);
        panel.add(tituloImagen);
        
        JLabel titulo = new JLabel("Bienvenido , Elija una Versión por favor");
        titulo.setFont(new Font("Arial",1,13));
        titulo.setBounds(45, 313, 370, 30);
        panel.add(titulo);
        
        JLabel versiones = new JLabel("Versiones:");
        versiones.setFont(new Font("Arial",1,13));
        versiones.setBounds(15, 353, 70, 30);
        panel.add(versiones);
        
        JLabel copyrihgt = new JLabel("©hotel-pasaycacha S.A.C TM 2019");
        copyrihgt.setFont(new Font("Arial",1,11));
        copyrihgt.setBounds(65, 483, 250, 30);
        panel.add(copyrihgt);
    }
    private void botones(){
        ImageIcon img = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/enter2.png");
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(45, 413, 130, 30);
        ingresar.setFont(new Font("Arial",1,13));
        ingresar.setIcon(new ImageIcon(img.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        ingresar.addActionListener(this);
        panel.add(ingresar);
        
        ImageIcon imgs = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/salida.png");
        salir = new JButton("Salir");
        salir.setBounds(200, 413, 100, 30);
        salir.setFont(new Font("Arial",1,13));
        salir.setIcon(new ImageIcon(imgs.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        salir.addActionListener(this);
        panel.add(salir);
    }
    private void listasDesplegables(){
        String ver[]={"version 1","version 2","version 3","version 4"};
        listaVersiones = new JComboBox(ver);
        listaVersiones.setBounds(95, 353, 100, 30);
        panel.add(listaVersiones);  
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==ingresar){
            int indice = listaVersiones.getSelectedIndex();
            switch(indice){
                case 0:
                    ventanaLogin = new interfasLogin();
                    ventanaLogin.setVisible(true);
                    this.setVisible(false);
                    break;
                case 1:
                    ventanaLoginv2 = new interfasLoginv2();
                    ventanaLoginv2.setVisible(true);
                    this.setVisible(false);
                    break;
                case 2:
                    ventanaLoginv3 = new interfasLoginv3();
                    ventanaLoginv3.setVisible(true);
                    this.setVisible(false);
                    break;
                case 3:
                    ventanaLoginv4 = new interfasLoginv4();
                    ventanaLoginv4.setVisible(true);
                    this.setVisible(false);
                    break;
            }  
        }
        if(ae.getSource()==salir){
            System.exit(0);
        } 
    }  
}
