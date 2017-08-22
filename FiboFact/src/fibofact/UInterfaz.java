/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibofact;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Diego Herrera y Ángel Hernández Velazquez
 * @version: 2.0
 */
public class UInterfaz extends JFrame implements ActionListener, KeyListener {
    //Inicialización de variables
    private JTextField numero, resultado;
    private JButton fibo, fact, regresar;
    private Container contenedor;
    private JFrame ventana;
    //Método constructor
    public UInterfaz() {
        crearVentana();
        CrearComponentes();
        this.ventana.setVisible(true);
    }
    //Método para crear la interfaz
    public void crearVentana() {
        ventana = new JFrame();
        ventana.setSize(500, 500);
        ventana.setTitle("FiboFact");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        //Crear contenedor
        contenedor = ventana.getContentPane();
        contenedor.setBackground(Color.BLACK);
    }
    //Método para crear los component5es de la ventana
    public void CrearComponentes() {
        //Crear botones
        fibo = new JButton("FIBONACCI");
        fibo.setBounds(300, 250, 150, 50);
        fibo.setBackground(Color.red);
        fibo.setForeground(Color.yellow);
        fibo.setFont(new Font("Tahoma", 1, 20));
        contenedor.add(fibo);
        fibo.addActionListener(this);
        fibo.setVisible(true);

        fact = new JButton("FACTORIAL");
        fact.setBounds(50, 250, 150, 50);
        fact.setBackground(Color.red);
        fact.setForeground(Color.yellow);
        fact.setFont(new Font("Tahoma", 1, 20));
        contenedor.add(fact);
        fact.addActionListener(this);
        fact.setVisible(true);

        regresar = new JButton("REGRESAR");
        regresar.setBounds(200, 350, 100, 50);
        regresar.setBackground(Color.red);
        regresar.setForeground(Color.yellow);
        regresar.setFont(new Font("Tahoma", 1, 20));
        contenedor.add(regresar);
        regresar.addActionListener(this);
        regresar.setVisible(true);
        //Crear JTEXTFIELD
        numero = new JTextField();
        numero.setBounds(50, 150, 400, 20);
        numero.addKeyListener(this);
        contenedor.add(numero);
        numero.setVisible(true);

        resultado = new JTextField();
        resultado.setBounds(50, 200, 400, 20);
        resultado.setEditable(false);
        contenedor.add(resultado);
        resultado.setVisible(true);
    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
        try {//Calcular el factorial
            if (e.getSource() == fact) {
                cFact o = new cFact();
                
                if (numero.getText() == "") {
                    resultado.setText("Ingresa un numero en la barra superior");
                } else {
                    resultado.setText(o.Fact(Integer.parseInt(numero.getText())));
                }

            } else {
                //Calcular el número de fibonacci
                if (e.getSource() == fibo) {
                    cFibo o = new cFibo();
                    if (numero.getText() == "") {
                        resultado.setText("Ingresa un numero en la barra superior");
                    } else {
                        resultado.setText(o.Conv(Integer.parseInt(numero.getText())));
                    }

                } else {
                    if (e.getSource() == regresar) {
                        numero.setText("");
                        resultado.setText("");
                    }
                }
            }
        } catch (Exception ex) {
            //Validamos que se introduzcan números enteros
            JOptionPane.showMessageDialog(this,"Introduce un número válido");
        }

    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //Validamos que no puedan utilizarse letras 
        char caracter = ke.getKeyChar();
        if (((caracter >= 32) && (caracter <= 47)) || (caracter >= 58)) {
            ke.consume();
            JOptionPane.showMessageDialog(null, "Sólo puedes introducir números enteros");
        }
        if (numero.getText().length() == 2) {
            ke.consume();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
