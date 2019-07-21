package pasaycachahotel;

//import java.awt.HeadlessException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class interfasPrincipal2 extends JFrame implements ActionListener{
    
    
    private JPanel panel;
    private JButton agregarClientes;
    private JButton registarHabitacion;
    private JButton facturar;
    private JButton salir;
    private JMenuBar menuPrincipal;
    private JMenu opciones;
    private JMenu ayuda;
    private JMenu personalizarInterfaz;
    private JMenuItem acercaDe;
    private JMenuItem amarillo;
    private JMenuItem verde;
    private JMenuItem rojo;
    private JMenuItem blanco;
    private JMenuItem verVersiones;
    //
    Persona ventanaPersona = new Persona();
    previoComprobante emitirComprobante;
    Registro registrar;

    public interfasPrincipal2(){
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("MENU PRINCIPAL");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        this.setResizable(false);
    
    }
    
    private void iniciarComponentes(){
        panel();
        etiquetas();
        botones();
        menu();
    }
    
    private void panel(){
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255,255,255));
        this.getContentPane().add(panel);
    }
    private void etiquetas(){
        JLabel registroPersona = new JLabel("Agregar Cliente");
        registroPersona.setBounds(80, 180, 150, 30);
        registroPersona.setFont(new Font("Andale Mono",3,19));
        panel.add(registroPersona);
        
        JLabel facturar = new JLabel("Facturar");
        facturar.setBounds(380, 180, 150, 30);
        facturar.setFont(new Font("Andale Mono",3,19));
        panel.add(facturar);
        
        JLabel registro = new JLabel("Registrar");
        registro.setBounds(90, 390, 150, 30);
        registro.setFont(new Font("Andale Mono",3,19));
        panel.add(registro);
        
        JLabel salir = new JLabel("Salir");
        salir.setBounds(400, 390, 150, 30);
        salir.setFont(new Font("Andale Mono",3,19));
        panel.add(salir);
    }
    private void botones(){
        ImageIcon img = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/icono1.png");
        agregarClientes = new JButton();
        agregarClientes.setBounds(80, 20, 150, 150);
        agregarClientes.setBackground(Color.LIGHT_GRAY);
        agregarClientes.addActionListener(this);
        agregarClientes.setMnemonic('a');
        agregarClientes.setIcon(new ImageIcon(img.getImage().getScaledInstance(agregarClientes.getWidth(), agregarClientes.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(agregarClientes);
        
        ImageIcon image = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/icono2.png");
        facturar = new JButton();
        facturar.setBounds(350, 20, 150, 150);
        facturar.setBackground(Color.LIGHT_GRAY);
        facturar.addActionListener(this);
        facturar.setMnemonic('f');
        facturar.setIcon(new ImageIcon(image.getImage().getScaledInstance(facturar.getWidth(), facturar.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(facturar);
        
        
        ImageIcon images = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/icono3.png");
        registarHabitacion = new JButton();
        registarHabitacion.setBounds(80, 230, 150, 150);
        registarHabitacion.setBackground(Color.LIGHT_GRAY);
        registarHabitacion.addActionListener(this);
        registarHabitacion.setMnemonic('r');
        registarHabitacion.setIcon(new ImageIcon(images.getImage().getScaledInstance(registarHabitacion.getWidth(), registarHabitacion.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(registarHabitacion);
        
        
        ImageIcon imagenes = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/icono4.png");
        salir = new JButton();
        salir.setBounds(350, 230, 150, 150);
        salir.setBackground(Color.LIGHT_GRAY);
        salir.addActionListener(this);
        salir.setMnemonic('s');
        salir.setIcon(new ImageIcon(imagenes.getImage().getScaledInstance(salir.getWidth(), salir.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(salir);
        
    }
    private void menu(){
        menuPrincipal = new JMenuBar();
        setJMenuBar(menuPrincipal);
        
        ImageIcon imges = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/ajustes.png");
        opciones = new JMenu("Opciones");
        opciones.setIcon(new ImageIcon(imges.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        menuPrincipal.add(opciones);
        
        ayuda= new JMenu("Ayuda");
        menuPrincipal.add(ayuda);
        
        ImageIcon image = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/pantone.png");
        personalizarInterfaz = new JMenu("Cambiar color de la interfaz");
        personalizarInterfaz.setIcon(new ImageIcon(image.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        //personalizarInterfaz.addActionListener(this);
        opciones.add(personalizarInterfaz);
        
        rojo = new JMenuItem("Rojo");
        rojo.addActionListener(this);
        personalizarInterfaz.add(rojo);
        
        verde = new JMenuItem("Verde");
        verde.addActionListener(this);
        personalizarInterfaz.add(verde);
        
        amarillo = new JMenuItem("Amarillo");
        amarillo.addActionListener(this);
        personalizarInterfaz.add(amarillo);
        
        blanco = new JMenuItem("Blanco");
        blanco.addActionListener(this);
        personalizarInterfaz.add(blanco);
        
        ImageIcon imgs = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/regresar.png");
        verVersiones = new JMenuItem("Ver versiones");
        verVersiones.setIcon(new ImageIcon(imgs.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        verVersiones.addActionListener(this);
        opciones.add(verVersiones);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == agregarClientes){
            
            ventanaPersona.setVisible(true);
            this.setVisible(false);
        }
        
        if(ae.getSource() == facturar){
            emitirComprobante = new previoComprobante();
            emitirComprobante.setVisible(true);
            dispose();
        }
        
        if(ae.getSource() == registarHabitacion){
            registrar = new Registro();
            registrar.setVisible(true);
            dispose();
        }
        //CAMBIAR COLOR A TRAVEZ DEL MENU********
        if(ae.getSource()==verde){
            panel.setBackground(Color.green);
        }
        
        if(ae.getSource()==rojo){
            panel.setBackground(Color.red);
        }
        if(ae.getSource()==amarillo){
            panel.setBackground(Color.YELLOW);
        }
        
        if(ae.getSource()==blanco){
            panel.setBackground(new Color(255,255,255));
        }
        
        if(ae.getSource() == verVersiones){
            menuPrincipal ver = new menuPrincipal();
            ver.setVisible(true);
            dispose();
        }
        
        if(ae.getSource()==salir){
            System.exit(0);
        }
    }
}
