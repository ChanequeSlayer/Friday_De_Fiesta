package Principal;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class FirstSection extends javax.swing.JFrame {
    Profesor abc;
    
    public FirstSection() {
        initComponents();
        abc = new Profesor("Mario",25,"20550354AB","Programacion","A3");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbAnadir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtMostar = new javax.swing.JTextArea();
        jbMostrar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Profesor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/man.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -10, 60, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Añadir Estudiante");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Añadir Calificaciones");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jTextField1.setText("Nombre");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 180, 30));

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jbAnadir.setBackground(new java.awt.Color(255, 255, 255));
        jbAnadir.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jbAnadir.setText("Añadir");
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });
        getContentPane().add(jbAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informacion del profesor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jtxtMostar.setColumns(20);
        jtxtMostar.setRows(5);
        jScrollPane1.setViewportView(jtxtMostar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 200, 140));

        jbMostrar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jbMostrar.setText("Mostrar");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jTextField2.setText("ID");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 180, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizarra.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
    jtxtMostar.setText(abc.showInfo());
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jbAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnadirActionPerformed
   // int []calificaciones = new int[9];
  //  String result="";
   // int arrPos = 0;
/*
    do{
        if(jtxtLlenado.equals("")){
            jtxtLlenado.setText("Ingrese un numero");  
        }else {
            calificaciones[arrPos]=parseInt(jtxtLlenado.getText());
            jtxtLlenado.setText("");  
            arrPos++;
        }
    }while(arrPos<9);
    //calificaciones[0]=parseInt(jtxtLlenado.getText());
    //jtxtLlenado.setText("");
    //if(arrPos<5){
    //calificaciones[arrPos]=parseInt(jtxtLlenado.getText());
    //jtxtLlenado.setText("");
    //arrPos++;
  //} 
       /* for(int i=0;i<calificaciones.length;i++){
            int c = parseInt(jtxtLlenado.getText());
            calificaciones[i] = c;
           //jtxtLlenado.setText("");
        }*/

       // for(int i=0;i<calificaciones.length;i++){
          //  result+=calificaciones[i]+"\n";
       // }
      //  abc.addCalis(calificaciones);
      String result =abc.addCalis();
      jtxtMostar.setText(result);
      //Aqui añadiriamos para cada que se pique al boton, se cambie el nombre y id.
      Estudiante z = new Estudiante("Monico",18,"2030550462","A3",result);
      abc.addInfo(z);
      JOptionPane.showMessageDialog(null,abc.toString());
    }//GEN-LAST:event_jbAnadirActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JTextArea jtxtMostar;
    // End of variables declaration//GEN-END:variables
}
