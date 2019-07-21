package pasaycachahotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class interfasLoginv3 extends JFrame implements ActionListener{
    
    private JPanel panel;
    //
    private JButton ingresar;
    private JButton salir;
    //
    private JTextField cajaUsuario;
    private JPasswordField cajaPassword;
    //interfasPrincipal ventanaPrincipal;
    
    public interfasLoginv3(){
        this.setSize(400, 700);
        this.setTitle("HOTEL PASAYCACHA v-3.0");
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
    }
    
    private void cajas(){
       cajaUsuario = new JTextField();
       cajaUsuario.setFont(new Font("Arial",1,13));
       cajaUsuario.setBackground(Color.lightGray);
       cajaUsuario.setBounds(45, 420, 200, 30);
       panel.add(cajaUsuario);
       
       cajaPassword = new JPasswordField();
       cajaPassword.setFont(new Font("Arial",1,13));
       cajaPassword.setBackground(Color.lightGray);
       cajaPassword.setBounds(45, 480, 200, 30);
       panel.add(cajaPassword);
    }
    private void botones(){
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(45, 520, 100, 30);
        ingresar.addActionListener(this);
        panel.add(ingresar);
        
        salir = new JButton("Salir");
        salir.setBounds(155, 520, 100, 30);
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
                    String usu="grupo1";
                    String contrasena="12345";
                    String usuario=cajaUsuario.getText();
                    String pasword=cajaPassword.getText();
                    boolean band= true;
                    if(usuario.equals(usu)&&pasword.equals(contrasena)){
                        band=false;
                            
                    }
                    if(band){
                        JOptionPane.showMessageDialog(null, "el usuario o la contraseña son incorrectos");
                    }
            
        }
        
        if(ae.getSource()==salir){
            System.exit(0);
        }
    }
    
}
