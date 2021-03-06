/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import javax.swing.JOptionPane;

/**
 *
 * @author 20171INF_I0130
 */
public class AcademiaJframe extends javax.swing.JFrame {

    String Nome = "", Peso = "";
    int semanaconverter = 0, valoraltura = 0;

    public AcademiaJframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        feminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        semana = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        turno = new javax.swing.JList<>();
        altura = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        numaltura = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("PESO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 50, 20);

        jLabel2.setText("NOME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 50, 20);

        peso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        peso.setText("0");
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });
        getContentPane().add(peso);
        peso.setBounds(70, 70, 150, 30);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(70, 30, 250, 30);

        jLabel3.setText("Kg");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 70, 40, 20);

        jLabel4.setText("IDADE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 30, 50, 30);

        idade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - 11 Anos", "7 - 12 Anos", "13 - 18 Anos", "19 - 32 Anos", "33 ou mais" }));
        idade.setSelectedIndex(2);
        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });
        getContentPane().add(idade);
        idade.setBounds(350, 70, 120, 30);

        jLabel5.setText("SEXO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 110, 50, 30);

        buttonGroup1.add(masculino);
        masculino.setText("MASCULINO");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });
        getContentPane().add(masculino);
        masculino.setBounds(70, 110, 110, 23);

        buttonGroup1.add(feminino);
        feminino.setSelected(true);
        feminino.setText("FEMININO");
        getContentPane().add(feminino);
        feminino.setBounds(70, 140, 100, 23);

        jLabel6.setText("DIAS NA SEMANA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 120, 110, 30);

        semana.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));
        semana.setToolTipText("");
        getContentPane().add(semana);
        semana.setBounds(380, 120, 90, 30);

        jLabel7.setText("TURNO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 170, 60, 30);

        turno.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "MANH??", "TARDE", "NOITE" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        turno.setSelectedIndex(2);
        jScrollPane1.setViewportView(turno);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 170, 80);

        altura.setMaximum(300);
        altura.setOrientation(javax.swing.JSlider.VERTICAL);
        altura.setPaintTicks(true);
        altura.setValue(0);
        altura.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                alturaMouseDragged(evt);
            }
        });
        getContentPane().add(altura);
        altura.setBounds(280, 190, 30, 90);

        jLabel8.setText("ALTURA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 180, 60, 20);

        numaltura.setText("0");
        getContentPane().add(numaltura);
        numaltura.setBounds(310, 260, 30, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CENTIMETROS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 260, 100, 30);

        calcular.setText("CALCULAR");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular);
        calcular.setBounds(280, 290, 140, 30);

        limpar.setText("LIMPAR");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        getContentPane().add(limpar);
        limpar.setBounds(20, 290, 140, 30);

        jLabel9.setText("RESULTADO:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 320, 80, 30);

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane2.setViewportView(resultado);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 350, 450, 130);

        setSize(new java.awt.Dimension(516, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masculinoActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        resultado.setText("");
        semanaconverter = (int) semana.getValue();
        if (Nome.equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO, Preencher Nome");
        } else if (Peso == "" || Peso == "0") {
            JOptionPane.showMessageDialog(null, "ERRO, Preencher Peso");
        } else if (semanaconverter < 1 || semanaconverter > 7) {
            JOptionPane.showMessageDialog(null, "ERRO, Dia de semana inv??lido");
        } else if (valoraltura == 0) {
            JOptionPane.showMessageDialog(null, "ERRO, Altura inv??lida");
        } else {
            resultado.append(" NOME: " + nome.getText());
            resultado.append("\n PESO: " + peso.getText());

            if (idade.getSelectedIndex() == 0) {
                resultado.append("\n IDADE: 0 - 11");
            } else if (idade.getSelectedIndex() == 1) {
                resultado.append("\n IDADE: 7 - 12");
            } else if (idade.getSelectedIndex() == 2) {
                resultado.append("\n IDADE: 13 - 18");
            } else if (idade.getSelectedIndex() == 3) {
                resultado.append("\n IDADE: 19 - 32");
            } else {
                resultado.append("\n IDADE: 32 ou mais");
            }

            if (masculino.isSelected()) {
                resultado.append("\n SEXO: Masculino");
            } else {
                resultado.append("\n SEXO: Feminino");
            }

            resultado.append("\n ALTURA: " + valoraltura);
            resultado.append("\n DIA DA SEMANA: " + semanaconverter);

            resultado.append("\n TURNO: " + turno.getSelectedValue());

        }


    }//GEN-LAST:event_calcularActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        Nome = nome.getText();
    }//GEN-LAST:event_nomeActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        Peso = peso.getText();
    }//GEN-LAST:event_pesoActionPerformed

    private void alturaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alturaMouseDragged
        valoraltura = altura.getValue();
        numaltura.setText(String.valueOf(valoraltura));
    }//GEN-LAST:event_alturaMouseDragged

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        resultado.setText("");
        Nome = "";
        nome.setText("");
        Peso = "";
        peso.setText("0");
        idade.setSelectedIndex(2);
        feminino.setSelected(true);
        turno.setSelectedIndex(2);
        altura.setValue(0);
        valoraltura = 0;
        numaltura.setText("0");
        semana.setValue(0);
        semanaconverter = 0;

    }//GEN-LAST:event_limparActionPerformed

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
            java.util.logging.Logger.getLogger(AcademiaJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcademiaJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcademiaJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcademiaJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcademiaJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider altura;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JComboBox<String> idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpar;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel numaltura;
    private javax.swing.JTextField peso;
    private javax.swing.JTextArea resultado;
    private javax.swing.JSpinner semana;
    private javax.swing.JList<String> turno;
    // End of variables declaration//GEN-END:variables
}
