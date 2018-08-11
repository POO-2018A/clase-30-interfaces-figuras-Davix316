/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author TOSHIBA
 */
public class Figuras extends javax.swing.JFrame {

    /**
     * Creates new form Figuras
     */
    public Figuras() {
        initComponents();
        
        panelCuadrado.setVisible(false);
        panelRectangulo.setVisible(false);
        panelCirculo.setVisible(false);
        panelTriangulo.setVisible(false);
        txtArea.setEnabled(false);
        txtPerimetro.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblElegir = new javax.swing.JLabel();
        cmbFiguras = new javax.swing.JComboBox<>();
        panelCuadrado = new javax.swing.JPanel();
        lblCuadrado = new javax.swing.JLabel();
        lblLadoCuadrado = new javax.swing.JLabel();
        txtLadoCuadrado = new javax.swing.JTextField();
        panelCirculo = new javax.swing.JPanel();
        lblCirculo = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        txtRadioCirculo = new javax.swing.JTextField();
        panelTriangulo = new javax.swing.JPanel();
        lblTriangulo = new javax.swing.JLabel();
        lblLado1 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        lblLado2 = new javax.swing.JLabel();
        txtLado2 = new javax.swing.JTextField();
        lblLado3 = new javax.swing.JLabel();
        txtLado3 = new javax.swing.JTextField();
        lblBaseTriangulo = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        lblAlturaTriangulo = new javax.swing.JLabel();
        txtAlturaTriangulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        panelRectangulo = new javax.swing.JPanel();
        lblRectangulo = new javax.swing.JLabel();
        lblBaseRectangulo = new javax.swing.JLabel();
        txtBaseRectangulo = new javax.swing.JTextField();
        lblAlturaRectangulo = new javax.swing.JLabel();
        txtAlturaRectangulo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTitulo.setText("FIGURAS");

        lblElegir.setText("Elija una figura: ");

        cmbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuadrado", "Rectangulo", "Circulo", "Triangulo", " " }));
        cmbFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFigurasActionPerformed(evt);
            }
        });

        lblCuadrado.setText("Cuadrado");

        lblLadoCuadrado.setText("Lado:");

        javax.swing.GroupLayout panelCuadradoLayout = new javax.swing.GroupLayout(panelCuadrado);
        panelCuadrado.setLayout(panelCuadradoLayout);
        panelCuadradoLayout.setHorizontalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCuadrado)
                    .addGroup(panelCuadradoLayout.createSequentialGroup()
                        .addComponent(lblLadoCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelCuadradoLayout.setVerticalGroup(
            panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadradoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCuadrado)
                .addGap(18, 18, 18)
                .addGroup(panelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoCuadrado)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lblCirculo.setText("Circulo");

        lblRadio.setText("Radio:");

        javax.swing.GroupLayout panelCirculoLayout = new javax.swing.GroupLayout(panelCirculo);
        panelCirculo.setLayout(panelCirculoLayout);
        panelCirculoLayout.setHorizontalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCirculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(txtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelCirculoLayout.setVerticalGroup(
            panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCirculo)
                .addGap(18, 18, 18)
                .addGroup(panelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRadio)
                    .addComponent(txtRadioCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblTriangulo.setText("Triangulo");

        lblLado1.setText("Lado 1:");

        lblLado2.setText("Lado 2:");

        lblLado3.setText("Lado 3:");

        lblBaseTriangulo.setText("Base:");

        lblAlturaTriangulo.setText("Altura:");

        javax.swing.GroupLayout panelTrianguloLayout = new javax.swing.GroupLayout(panelTriangulo);
        panelTriangulo.setLayout(panelTrianguloLayout);
        panelTrianguloLayout.setHorizontalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelTrianguloLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(lblTriangulo))
                        .addGroup(panelTrianguloLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblLado1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelTrianguloLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblLado2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLado2)))
                    .addGroup(panelTrianguloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTrianguloLayout.createSequentialGroup()
                                .addComponent(lblLado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTrianguloLayout.createSequentialGroup()
                                .addComponent(lblBaseTriangulo)
                                .addGap(18, 18, 18)
                                .addComponent(txtBaseTriangulo))
                            .addGroup(panelTrianguloLayout.createSequentialGroup()
                                .addComponent(lblAlturaTriangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAlturaTriangulo)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelTrianguloLayout.setVerticalGroup(
            panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTriangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado1)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLado2)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado3)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseTriangulo)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaTriangulo)
                    .addComponent(txtAlturaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setText("CALCULAR AREA Y PERIMETRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Area:");

        jLabel13.setText("Perimetro:");

        lblRectangulo.setText("Rectangulo");

        lblBaseRectangulo.setText("Base:");

        lblAlturaRectangulo.setText("Altura:");

        javax.swing.GroupLayout panelRectanguloLayout = new javax.swing.GroupLayout(panelRectangulo);
        panelRectangulo.setLayout(panelRectanguloLayout);
        panelRectanguloLayout.setHorizontalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlturaRectangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAlturaRectangulo))
                    .addGroup(panelRectanguloLayout.createSequentialGroup()
                        .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRectanguloLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblRectangulo))
                            .addGroup(panelRectanguloLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBaseRectangulo)
                                .addGap(18, 18, 18)
                                .addComponent(txtBaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRectanguloLayout.setVerticalGroup(
            panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectanguloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRectangulo)
                .addGap(18, 18, 18)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseRectangulo)
                    .addComponent(txtBaseRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRectanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaRectangulo)
                    .addComponent(txtAlturaRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblElegir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPerimetro)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(panelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElegir)
                    .addComponent(cmbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(panelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(panelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion = cmbFiguras.getSelectedIndex();
        String area;
        String perimetro;
        
        switch(opcion){
            case 0:
                double lado = Double.parseDouble(txtLadoCuadrado.getText());
                Cuadrado cuadrado = new Cuadrado (lado);
                area = Double.toString(cuadrado.calculararea());
                perimetro = Double.toString(cuadrado.calcularperimetro());
                txtArea.setText(area);
                txtPerimetro.setText(perimetro);
                break;
            case 1:
                double base = Double.parseDouble(txtBaseRectangulo.getText());
                double altura = Double.parseDouble(txtAlturaRectangulo.getText());
                Rectangulo rectangulo = new Rectangulo (base,altura);
                area = Double.toString(rectangulo.calculararea());
                perimetro = Double.toString(rectangulo.calcularperimetro());
                txtArea.setText(area);
                txtPerimetro.setText(perimetro);
                break;
            case 2:
                double radio = Double.parseDouble(txtRadioCirculo.getText());
                Circulo circulo = new Circulo (radio);
                area = Double.toString(circulo.calculararea());
                perimetro = Double.toString(circulo.calcularperimetro());
                txtArea.setText(area);
                txtPerimetro.setText(perimetro);
                break;
            case 3:
                double lado1 = Double.parseDouble(txtLado1.getText());
                double lado2 = Double.parseDouble(txtLado2.getText());
                double lado3 = Double.parseDouble(txtLado3.getText());
                double baset = Double.parseDouble(txtBaseTriangulo.getText());
                double alturat = Double.parseDouble(txtAlturaTriangulo.getText());
                Triangulo triangulo = new Triangulo (lado1,lado2,lado3,baset,alturat);
                area = Double.toString(triangulo.calculararea());
                perimetro = Double.toString(triangulo.calcularperimetro());
                txtArea.setText(area);
                txtPerimetro.setText(perimetro);
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFigurasActionPerformed
        
        int opcion = cmbFiguras.getSelectedIndex();
        switch(opcion){
            case 0:
                panelCuadrado.setVisible(true);
                panelRectangulo.setVisible(false);
                panelCirculo.setVisible(false);
                panelTriangulo.setVisible(false);
                break;
            case 1:
                panelRectangulo.setVisible(true);
                panelCuadrado.setVisible(false);
                panelCirculo.setVisible(false);
                panelTriangulo.setVisible(false);
                break;
            case 2:               
                panelCuadrado.setVisible(false);
                panelRectangulo.setVisible(false);
                panelCirculo.setVisible(true);
                panelTriangulo.setVisible(false);
                break;
            case 3:                
                panelCuadrado.setVisible(false);
                panelRectangulo.setVisible(false);
                panelCirculo.setVisible(false);
                panelTriangulo.setVisible(true);
                break;
        }
    }//GEN-LAST:event_cmbFigurasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Figuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbFiguras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlturaRectangulo;
    private javax.swing.JLabel lblAlturaTriangulo;
    private javax.swing.JLabel lblBaseRectangulo;
    private javax.swing.JLabel lblBaseTriangulo;
    private javax.swing.JLabel lblCirculo;
    private javax.swing.JLabel lblCuadrado;
    private javax.swing.JLabel lblElegir;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblLadoCuadrado;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblRectangulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTriangulo;
    private javax.swing.JPanel panelCirculo;
    private javax.swing.JPanel panelCuadrado;
    private javax.swing.JPanel panelRectangulo;
    private javax.swing.JPanel panelTriangulo;
    private javax.swing.JTextField txtAlturaRectangulo;
    private javax.swing.JTextField txtAlturaTriangulo;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBaseRectangulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextField txtLadoCuadrado;
    private javax.swing.JTextField txtPerimetro;
    private javax.swing.JTextField txtRadioCirculo;
    // End of variables declaration//GEN-END:variables
}
