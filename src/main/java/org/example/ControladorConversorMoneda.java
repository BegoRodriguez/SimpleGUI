package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorConversorMoneda {
    private JFrame vista;
    private ConversorMoneda modelo;

    public ControladorConversorMoneda(JFrame vista,ConversorMoneda modelo){
        this.vista = vista;
        this.modelo = modelo;
        JButton convertirApesetas = new JButton("Convertir a pesetas");
        JButton convertirAeuros = new JButton("Convertir a euros");

        convertirApesetas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cantidadEuros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad en euros:"));
                double cantidadPesetas = modelo.eurosAPesetas(cantidadEuros);
                JOptionPane.showMessageDialog(null, "Serían: " + cantidadPesetas + " pesetas");
            }
        });

        JPanel panel = new JPanel();
        panel.add(convertirApesetas);  // Añadimos nuestros botones al panel
        panel.add(convertirAeuros);

        vista.add(panel, BorderLayout.SOUTH); // Añadimos nuestro panel a la ventana

    }

    public static void main(String[] args) {
        JFrame vista = new JFrame("Conversor de Moneda");
        ConversorMoneda modelo = new ConversorMoneda();

        new ControladorConversorMoneda(vista,modelo);

        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.pack(); // Establece el tamaño de la ventana en función de los contenidos
        vista.setVisible(true);
        vista.setLocationRelativeTo(null); // La coloca en el centro de la pantalla
    }
}
