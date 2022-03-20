package D3r3_k;

import Extras.Cronometro;
import Extras.Ordenar;
import Extras.db_datos;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        initComponents2();
    }

    private void initComponents2() {
        this.setLocationRelativeTo(null);
        btn_newReport.setVisible(false);
        desactivarOrden();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        GenerarGraficaTXT = new javax.swing.JLabel();
        input_ruta = new javax.swing.JTextField();
        input_tituloGrafica = new javax.swing.JTextField();
        panel_grafica = new javax.swing.JPanel();
        panel_ordenar = new javax.swing.JPanel();
        OrdenarPorTXT = new javax.swing.JLabel();
        rbtn_asendente = new javax.swing.JRadioButton();
        rbtn_desendente = new javax.swing.JRadioButton();
        panel_metodo = new javax.swing.JPanel();
        MetodoTXT = new javax.swing.JLabel();
        rbtn_shellSort = new javax.swing.JRadioButton();
        rbtn_burbuja = new javax.swing.JRadioButton();
        btn_ordenar = new javax.swing.JButton();
        panel_cronometro = new javax.swing.JPanel();
        CronometroTXT = new javax.swing.JLabel();
        txt_cronometraje = new javax.swing.JLabel();
        panel_pasos = new javax.swing.JPanel();
        PasosTXT = new javax.swing.JLabel();
        txt_pasos = new javax.swing.JLabel();
        btn_examinar = new javax.swing.JButton();
        btn_graficar = new javax.swing.JButton();
        btn_newReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 2");
        setResizable(false);

        Background.setPreferredSize(new java.awt.Dimension(600, 700));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenerarGraficaTXT.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GenerarGraficaTXT.setForeground(java.awt.Color.white);
        GenerarGraficaTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GenerarGraficaTXT.setText("Generar Grafica");
        Background.add(GenerarGraficaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 700, -1));

        input_ruta.setForeground(java.awt.Color.gray);
        input_ruta.setText("Ruta del Archivo...");
        input_ruta.setPreferredSize(new java.awt.Dimension(530, 30));
        input_ruta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_rutaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_rutaFocusLost(evt);
            }
        });
        input_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_rutaActionPerformed(evt);
            }
        });
        Background.add(input_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        input_tituloGrafica.setForeground(java.awt.Color.gray);
        input_tituloGrafica.setText("Titulo de la Grafica...");
        input_tituloGrafica.setToolTipText("");
        input_tituloGrafica.setPreferredSize(new java.awt.Dimension(530, 30));
        input_tituloGrafica.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                input_tituloGraficaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                input_tituloGraficaFocusLost(evt);
            }
        });
        input_tituloGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tituloGraficaActionPerformed(evt);
            }
        });
        Background.add(input_tituloGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        panel_grafica.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        panel_grafica.setPreferredSize(new java.awt.Dimension(530, 500));

        javax.swing.GroupLayout panel_graficaLayout = new javax.swing.GroupLayout(panel_grafica);
        panel_grafica.setLayout(panel_graficaLayout);
        panel_graficaLayout.setHorizontalGroup(
            panel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        panel_graficaLayout.setVerticalGroup(
            panel_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        Background.add(panel_grafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        panel_ordenar.setPreferredSize(new java.awt.Dimension(160, 105));
        panel_ordenar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OrdenarPorTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OrdenarPorTXT.setForeground(java.awt.Color.white);
        OrdenarPorTXT.setText("Ordenar por:");
        OrdenarPorTXT.setPreferredSize(new java.awt.Dimension(120, 30));
        panel_ordenar.add(OrdenarPorTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, -1));

        rbtn_asendente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_asendente.setForeground(java.awt.Color.white);
        rbtn_asendente.setText("Ascendente");
        rbtn_asendente.setPreferredSize(new java.awt.Dimension(100, 30));
        rbtn_asendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_asendenteActionPerformed(evt);
            }
        });
        panel_ordenar.add(rbtn_asendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        rbtn_desendente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_desendente.setForeground(java.awt.Color.white);
        rbtn_desendente.setText("Descendente");
        rbtn_desendente.setPreferredSize(new java.awt.Dimension(110, 30));
        rbtn_desendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_desendenteActionPerformed(evt);
            }
        });
        panel_ordenar.add(rbtn_desendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Background.add(panel_ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        panel_metodo.setPreferredSize(new java.awt.Dimension(160, 105));
        panel_metodo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MetodoTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MetodoTXT.setForeground(java.awt.Color.white);
        MetodoTXT.setText("Metodo:");
        MetodoTXT.setPreferredSize(new java.awt.Dimension(130, 30));
        panel_metodo.add(MetodoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        rbtn_shellSort.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_shellSort.setForeground(java.awt.Color.white);
        rbtn_shellSort.setText("ShellSort");
        rbtn_shellSort.setPreferredSize(new java.awt.Dimension(100, 30));
        rbtn_shellSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_shellSortActionPerformed(evt);
            }
        });
        panel_metodo.add(rbtn_shellSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        rbtn_burbuja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtn_burbuja.setForeground(java.awt.Color.white);
        rbtn_burbuja.setText("BubbleSort");
        rbtn_burbuja.setPreferredSize(new java.awt.Dimension(100, 30));
        rbtn_burbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_burbujaActionPerformed(evt);
            }
        });
        panel_metodo.add(rbtn_burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        Background.add(panel_metodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 295, -1, -1));

        btn_ordenar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ordenar.setForeground(java.awt.Color.white);
        btn_ordenar.setText("Ordenar");
        btn_ordenar.setFocusable(false);
        btn_ordenar.setPreferredSize(new java.awt.Dimension(130, 30));
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });
        Background.add(btn_ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 400, -1, -1));

        panel_cronometro.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        panel_cronometro.setPreferredSize(new java.awt.Dimension(100, 60));
        panel_cronometro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CronometroTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CronometroTXT.setForeground(java.awt.Color.white);
        CronometroTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CronometroTXT.setText("Cronometro");
        CronometroTXT.setPreferredSize(new java.awt.Dimension(100, 20));
        panel_cronometro.add(CronometroTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_cronometraje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_cronometraje.setForeground(java.awt.Color.white);
        txt_cronometraje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cronometraje.setText("00:00");
        txt_cronometraje.setPreferredSize(new java.awt.Dimension(100, 30));
        panel_cronometro.add(txt_cronometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        Background.add(panel_cronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, -1));

        panel_pasos.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        panel_pasos.setPreferredSize(new java.awt.Dimension(100, 60));
        panel_pasos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PasosTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PasosTXT.setForeground(java.awt.Color.white);
        PasosTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasosTXT.setText("Pasos");
        PasosTXT.setPreferredSize(new java.awt.Dimension(100, 20));
        panel_pasos.add(PasosTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_pasos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_pasos.setForeground(java.awt.Color.white);
        txt_pasos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pasos.setText("0");
        txt_pasos.setPreferredSize(new java.awt.Dimension(100, 30));
        panel_pasos.add(txt_pasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        Background.add(panel_pasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, -1, -1));

        btn_examinar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_examinar.setForeground(java.awt.Color.white);
        btn_examinar.setText("Examinar");
        btn_examinar.setFocusable(false);
        btn_examinar.setPreferredSize(new java.awt.Dimension(130, 30));
        btn_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examinarActionPerformed(evt);
            }
        });
        Background.add(btn_examinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        btn_graficar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_graficar.setForeground(java.awt.Color.white);
        btn_graficar.setText("Graficar");
        btn_graficar.setFocusable(false);
        btn_graficar.setPreferredSize(new java.awt.Dimension(130, 30));
        btn_graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_graficarActionPerformed(evt);
            }
        });
        Background.add(btn_graficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        btn_newReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_newReport.setForeground(java.awt.Color.white);
        btn_newReport.setText("Generar Reporte");
        btn_newReport.setEnabled(false);
        btn_newReport.setFocusable(false);
        btn_newReport.setPreferredSize(new java.awt.Dimension(150, 30));
        btn_newReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newReportActionPerformed(evt);
            }
        });
        Background.add(btn_newReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_rutaActionPerformed
        if (input_ruta.getText().equals("Ruta del Archivo...")) {
            input_ruta.setText("");
            input_ruta.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_rutaActionPerformed

    private void input_rutaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_rutaFocusGained
        if (input_ruta.getText().equals("Ruta del Archivo...")) {
            input_ruta.setText("");
            input_ruta.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_rutaFocusGained

    private void input_rutaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_rutaFocusLost
        if (input_ruta.getText().equals("") || input_ruta.getText().isBlank()) {
            input_ruta.setText("Ruta del Archivo...");
            input_ruta.setForeground(Color.gray);
        }
    }//GEN-LAST:event_input_rutaFocusLost

    private void input_tituloGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tituloGraficaActionPerformed
        if (input_tituloGrafica.getText().equals("Titulo de la Grafica...")) {
            input_tituloGrafica.setText("");
            input_tituloGrafica.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_tituloGraficaActionPerformed

    private void input_tituloGraficaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_tituloGraficaFocusGained
        if (input_tituloGrafica.getText().equals("Titulo de la Grafica...")) {
            input_tituloGrafica.setText("");
            input_tituloGrafica.setForeground(Color.white);
        }
    }//GEN-LAST:event_input_tituloGraficaFocusGained

    private void input_tituloGraficaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_input_tituloGraficaFocusLost
        if (input_tituloGrafica.getText().equals("") || input_ruta.getText().isBlank()) {
            input_tituloGrafica.setText("Titulo de la Grafica...");
            input_tituloGrafica.setForeground(Color.gray);
        }
    }//GEN-LAST:event_input_tituloGraficaFocusLost

    private void rbtn_asendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_asendenteActionPerformed
        if (rbtn_asendente.isSelected()) {
            rbtn_desendente.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_asendenteActionPerformed

    private void rbtn_desendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_desendenteActionPerformed
        if (rbtn_desendente.isSelected()) {
            rbtn_asendente.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_desendenteActionPerformed

    private void rbtn_shellSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_shellSortActionPerformed
        if (rbtn_shellSort.isSelected()) {
            rbtn_burbuja.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_shellSortActionPerformed

    private void rbtn_burbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_burbujaActionPerformed
        if (rbtn_burbuja.isSelected()) {
            rbtn_shellSort.setSelected(false);
        }
    }//GEN-LAST:event_rbtn_burbujaActionPerformed

    private void btn_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examinarActionPerformed
        limpiar();

        JFileChooser fc = new JFileChooser();
        // Filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.csv", "csv");
        fc.setFileFilter(filtro);

        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            // OBTENGO LA RUTA
            File fichero = fc.getSelectedFile();

            input_ruta.setText(fichero.getAbsolutePath());
            input_ruta.setForeground(Color.white);

            input_tituloGrafica.setText("Titulo de la Grafica...");
            input_tituloGrafica.setForeground(Color.gray);

        } else if (seleccion == JFileChooser.CANCEL_OPTION) {
            input_ruta.setText("Ruta del Archivo...");
            input_ruta.setForeground(Color.gray);

            input_tituloGrafica.setText("Titulo de la Grafica...");
            input_tituloGrafica.setForeground(Color.gray);

            limpiar();

        }

    }//GEN-LAST:event_btn_examinarActionPerformed

    private void btn_graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_graficarActionPerformed
        Ordenar o = new Ordenar();
        if (input_ruta.getText().isBlank() || input_tituloGrafica.getText().isBlank() || input_ruta.getText().equals("Ruta del Archivo...") || input_tituloGrafica.getText().equals("Titulo de la Grafica...")) {
            JOptionPane.showMessageDialog(null, "No puede dejar ningun campo vacio.", "Graficar", JOptionPane.WARNING_MESSAGE);
        } else {
            limpiar();
            almacenar();
            Graficar(o.datos);
            activarOrden();
        }
    }//GEN-LAST:event_btn_graficarActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
        if (input_ruta.getText().isBlank() || input_tituloGrafica.getText().isBlank() || input_ruta.getText().equals("Ruta del Archivo...") || input_tituloGrafica.getText().equals("Titulo de la Grafica...")) {
            JOptionPane.showMessageDialog(null, "Debe graficar primero para ordenar.", "Ordenar", JOptionPane.WARNING_MESSAGE);
        } else {
            if ((rbtn_asendente.isSelected() || rbtn_desendente.isSelected()) && (rbtn_shellSort.isSelected() || rbtn_burbuja.isSelected())) {
                int orden = -1;
                int metodo = -1;

                if (rbtn_asendente.isSelected()) {
                    orden = 0;
                } else if (rbtn_desendente.isSelected()) {
                    orden = 1;
                }
                if (rbtn_shellSort.isSelected()) {
                    metodo = 0;
                } else if (rbtn_burbuja.isSelected()) {
                    metodo = 1;
                }

                desactivar();

                Ordenar ordenar = new Ordenar();
                ordenar.Ordenar(metodo, orden, ordenar.datos);

                Cronometro cron = new Cronometro(0, 0);

                cron.start();
                ordenar.start();

            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un orden y un metodo.", "Ordenar", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ordenarActionPerformed

    private void btn_newReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newReportActionPerformed
        Ordenar o = new Ordenar();
        String titulo = input_tituloGrafica.getText();
        String tiempo = txt_cronometraje.getText();
        String pasos = txt_pasos.getText();
        String algoritmo = "";

        if (rbtn_burbuja.isSelected()) {
            algoritmo = rbtn_burbuja.getText();
        } else if (rbtn_shellSort.isSelected()) {
            algoritmo = rbtn_shellSort.getText();
        }
        String _cadena = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />"
                + "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />"
                + "    <title>Reporte de Graficas</title>\n"
                + "    <style>\n "
                + "        * {\n"
                + "            font-family: sans-serif;\n"
                + "        }\n"
                + "        table {\n"
                + "            width: 95%;\n"
                + "            border-collapse: collapse;\n"
                + "        }\n"
                + "        th,\n"
                + "        td {\n"
                + "            padding: 8px;\n"
                + "            text-align: left;\n"
                + "            border: 1px solid #dee2e6;\n"
                + "            background-color: white;\n"
                + "            text-align: center;\n"
                + "        }\n"
                + "        th {\n"
                + "            height: 40px;\n"
                + "            text-align: center;\n"
                + "            background-color: mediumslateblue;\n"
                + "            color: white;\n"
                + "        }\n"
                + "        #contenedor1 {\n"
                + "            float: left;\n"
                + "        }\n"
                + "        #contenedor2{\n"
                + "            float: right;\n"
                + "        }\n"
                + "        div {\n"
                + "            width: 50%;\n"
                + "        }"
                + "    </style>\n"
                + "</head>\n"
                // AQUI EMPIEZA EL CUERPO DEL HTML
                + "<body>\n"
                + "    <center><h1>" + titulo + "</h1></center>\n"
                + "<table>\n"
                + "        <tr>\n"
                + "            <th>Nombre</th>\n"
                + "            <th>Carnet</th>\n"
                + "            <th>Algoritmo</th>\n"
                + "            <th>Tiempo</th>\n"
                + "            <th>Pasos</th>\n"
                + "        </tr>\n"
                + "        <tr>\n"
                + "            <td>Derek Francisco Orellana Ib&aacute;&ntilde;ez</td>\n"
                + "            <td>202001151</td>\n"
                + "            <td>" + algoritmo + "</td>\n"
                + "            <td>" + tiempo + "</td>\n"
                + "            <td>" + pasos + "</td>\n"
                + "        </tr>\n"
                + " </table>\n"
                + "<div id=\"contenedor1\">"
                + "   <center><h3> Datos Originales </h3></center>"
                + "    <table>\n"
                + "        <tr>\n"
                + "            <th>Posicion</th>\n"
                + "            <th>Pais</th>\n"
                + "            <th>Valor</th>\n"
                + "        </tr>\n";
        for (int i = 0; i < o.original.length; i++) {
            if (o.original[i] != null) {
                _cadena += "        <tr>\n"
                        + "            <td>" + i + "</td>\n"
                        + "            <td>" + o.original[i].getPais() + "</td>\n"
                        + "            <td>" + o.original[i].getValor() + "</td>\n"
                        + "        </tr>\n";
            }
        }
        _cadena += " </table>\n"
                + "</div>"
                + "<div id=\"contenedor2\">"
                + "   <center><h3> Datos Ordenados </h3></center>"
                + "    <table>\n"
                + "        <tr>\n"
                + "            <th>Posicion</th>\n"
                + "            <th>Pais</th>\n"
                + "            <th>Valor</th>\n"
                + "        </tr>\n";
        for (int i = 0; i < o.datos.length; i++) {
            if (o.datos[i] != null) {
                _cadena += "        <tr>\n"
                        + "            <td>" + i + "</td>\n"
                        + "            <td>" + o.datos[i].getPais() + "</td>\n"
                        + "            <td>" + o.datos[i].getValor() + "</td>\n"
                        + "        </tr>\n";
            }
        }
        _cadena += " </table>\n"
                + "</div>";

        _cadena += "</body>\n"
                + "</html>";

        byte[] cadenaBytes = _cadena.getBytes();
        String cadena = new String(cadenaBytes, StandardCharsets.UTF_8);

        File reporte = new File(titulo + ".html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reporte));
            bw.write(cadena);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte creado", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_newReportActionPerformed

    public void Graficar(db_datos[] arr) {
        panel_grafica.removeAll();
        panel_grafica.repaint();
        panel_grafica.validate();

        String titulo = input_tituloGrafica.getText();

        DefaultCategoryDataset gValores = new DefaultCategoryDataset();

        for (db_datos arr1 : arr) {
            if (arr1 != null) {
                gValores.setValue(arr1.getValor(), arr1.getPais(), "");
            }
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart3D(titulo, "Paises", "valores", gValores, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(530, 500));

        panel_grafica.setLayout(new BorderLayout());
        panel_grafica.add(panel, BorderLayout.NORTH);
        panel_grafica.repaint();
        panel_grafica.validate();
    }

    public void limpiar() {
        // LIMPIO EL PANEL 
        Ordenar o = new Ordenar();
        for (int i = 0; i < o.datos.length; i++) {
            if (o.datos != null) {
                o.datos[i] = null;
            }
        }

        rbtn_asendente.setSelected(false);
        rbtn_desendente.setSelected(false);
        rbtn_shellSort.setSelected(false);
        rbtn_burbuja.setSelected(false);

        desactivarOrden();

        btn_newReport.setVisible(false);

        txt_cronometraje.setText("00:00");
        txt_pasos.setText("0");
        panel_grafica.removeAll();
        panel_grafica.repaint();
        panel_grafica.validate();
    }

    private void almacenar() {
        String ruta = input_ruta.getText();
        String line = "";
        Ordenar o = new Ordenar();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));

            boolean encabezado = true;
            int i = 0;
            int x = 0;
            while ((line = bf.readLine()) != null) {
                String[] values = line.split(",");
                if (encabezado) {
                    encabezado = false;
                    continue;
                }
                String pais = values[0];
                int valor = Integer.parseInt(values[1]);

                boolean repetido = false;

                // SE VERIFICA SI EL PAIS ESTA REPETIDO
                for (db_datos dato : o.datos) {
                    if (dato != null) {
                        if (dato.getPais().equals(pais)) {
                            repetido = true;
                            x++;
                            break;
                        } else {
                            x = 0;
                        }
                    }
                }

                // SI EL PAIS ESTA REPETIDO SE AGREGA UN NUMERO A LA PAR DEL NOMBRE DEL PAIS
                // SI NO ESTA REPETIDO, SE AGREGA NORMALMENTE
                if (repetido) {
                    String paisRepetido = pais.replace(pais, pais + x);
                    o.datos[i] = new db_datos(paisRepetido, valor);
                } else {
                    o.datos[i] = new db_datos(pais, valor);
                }

                if (o.capacidadOrdenados(o.datos)) {
                    o.datos = o.redimOrdenados(o.datos);
                }

                i++;
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void desactivar() {
        input_ruta.setEnabled(false);
        input_tituloGrafica.setEnabled(false);

        btn_examinar.setEnabled(false);
        btn_graficar.setEnabled(false);
        btn_ordenar.setEnabled(false);

        rbtn_asendente.setEnabled(false);
        rbtn_desendente.setEnabled(false);
        rbtn_shellSort.setEnabled(false);
        rbtn_burbuja.setEnabled(false);

        btn_newReport.setEnabled(false);
        btn_newReport.setVisible(false);
    }

    public static void desactivarOrden() {
        btn_ordenar.setEnabled(false);
        rbtn_asendente.setEnabled(false);
        rbtn_desendente.setEnabled(false);
        rbtn_shellSort.setEnabled(false);
        rbtn_burbuja.setEnabled(false);
    }

    public static void activar() {
        input_ruta.setEnabled(true);
        input_tituloGrafica.setEnabled(true);

        btn_examinar.setEnabled(true);
        btn_graficar.setEnabled(true);
        btn_ordenar.setEnabled(true);

        rbtn_asendente.setEnabled(true);
        rbtn_desendente.setEnabled(true);
        rbtn_shellSort.setEnabled(true);
        rbtn_burbuja.setEnabled(true);

        btn_newReport.setEnabled(true);
        btn_newReport.setVisible(true);
    }

    public static void activarOrden() {
        btn_ordenar.setEnabled(true);
        rbtn_asendente.setEnabled(true);
        rbtn_desendente.setEnabled(true);
        rbtn_shellSort.setEnabled(true);
        rbtn_burbuja.setEnabled(true);
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel CronometroTXT;
    private javax.swing.JLabel GenerarGraficaTXT;
    private javax.swing.JLabel MetodoTXT;
    private javax.swing.JLabel OrdenarPorTXT;
    private javax.swing.JLabel PasosTXT;
    private static javax.swing.JButton btn_examinar;
    private static javax.swing.JButton btn_graficar;
    public static javax.swing.JButton btn_newReport;
    public static javax.swing.JButton btn_ordenar;
    private static javax.swing.JTextField input_ruta;
    public static javax.swing.JTextField input_tituloGrafica;
    private javax.swing.JPanel panel_cronometro;
    public static javax.swing.JPanel panel_grafica;
    private javax.swing.JPanel panel_metodo;
    private javax.swing.JPanel panel_ordenar;
    private javax.swing.JPanel panel_pasos;
    public static javax.swing.JRadioButton rbtn_asendente;
    public static javax.swing.JRadioButton rbtn_burbuja;
    public static javax.swing.JRadioButton rbtn_desendente;
    public static javax.swing.JRadioButton rbtn_shellSort;
    public static javax.swing.JLabel txt_cronometraje;
    public static javax.swing.JLabel txt_pasos;
    // End of variables declaration//GEN-END:variables

}
