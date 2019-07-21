package pasaycachahotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class interfasLogin extends JFrame implements ActionListener{
    
    private JPanel panel;
    //
    private JButton ingresar;
    private JButton salir;
    //
    private JTextField cajaUsuario;
    private JPasswordField cajaPassword;
    //
    interfasPrincipal2 ventanaPrincipal;
    
    public interfasLogin(){
        this.setSize(400, 700);
        this.setTitle("HOTEL PASAYCACHA v-1.0");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        panel();
        etiquetas();
        cajas();
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
        ImageIcon img = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/logo.jpg");
        JLabel imagen = new JLabel(img);
        imagen.setBounds(30, 2, 350, 400);
        panel.add(imagen);
        
        JLabel usuario = new JLabel("Usuario:");
        usuario.setFont(new Font("Arial",1,13));
        usuario.setBounds(45, 390, 70, 30);
        panel.add(usuario);
        
        JLabel pasword = new JLabel("Contraseña:");
        pasword.setFont(new Font("Arial",1,13));
        pasword.setBounds(45, 450, 90, 30);
        panel.add(pasword);
        
        JLabel copyrihgt = new JLabel("©hotel-pasaycacha S.A.C TM 2019");
        copyrihgt.setFont(new Font("Arial",1,11));
        copyrihgt.setBounds(65, 593, 250, 30);
        panel.add(copyrihgt);
    }
    
    private void cajas(){
       cajaUsuario = new JTextField();
       cajaUsuario.setFont(new Font("Arial",1,13));
       cajaUsuario.setBackground(Color.lightGray);
       cajaUsuario.setBounds(45, 420, 200, 30);
       
       panel.add(cajaUsuario);
       //validarSoloLetras();
       
       cajaPassword = new JPasswordField();
       cajaPassword.setFont(new Font("Arial",1,13));
       cajaPassword.setBackground(Color.lightGray);
       cajaPassword.setBounds(45, 480, 200, 30);
       cajaPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e){
                char c =e.getKeyChar();
                if(c==KeyEvent.VK_ENTER){
                   ingresar.doClick();
                }
            }
});
       panel.add(cajaPassword);
    }
    
    private void botones(){
        ImageIcon img = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/enter2.png");
        ingresar = new JButton("INGRESAR");
        ingresar.setBounds(45, 520, 130, 30);
        ingresar.setIcon(new ImageIcon(img.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        ingresar.addActionListener(this);
        panel.add(ingresar);
        
        
        ImageIcon imga = new ImageIcon("D:\\2018 -- U\\2019 -- I\\Estructuras de Datos y Algoritmos\\PasaycachaHotel\\imagenes/regresar.png");
        salir = new JButton("ATRAS");
        salir.setBounds(195, 520, 100, 30);
        salir.setIcon(new ImageIcon(imga.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        salir.addActionListener(this);
        panel.add(salir);
    }
    private void menu(){
        /*menuPrincipal = new JMenuBar();
        setJMenuBar(menuPrincipal);
        
        versiones = new JMenu("versiones");
        menuPrincipal.add(versiones);
        
        version1 = new JMenuItem("version 1");
        version1.addActionListener(this);
        versiones.add(version1);
        
        */
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==ingresar){
                    String usu="user";
                    String contrasena="12";
                    String usuario=cajaUsuario.getText();
                    String pasword=cajaPassword.getText();
                    boolean band= true;
                    if(usuario.equals(usu)&&pasword.equals(contrasena)){
                        band=false;
                        ventanaPrincipal = new interfasPrincipal2();
                        ventanaPrincipal.setVisible(true);
                        this.setVisible(false);
                    }
                    if(band){
                        JOptionPane.showMessageDialog(null, "el usuario o la contraseña son incorrectos");
                    }
        }
        
        if(ae.getSource()==salir){
            menuPrincipal atras = new menuPrincipal();
            atras.setVisible(true);
            dispose();
//System.exit(0);
        }
    }
    
}
