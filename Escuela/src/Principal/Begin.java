package Principal;
public class Begin extends javax.swing.JFrame {
    public Begin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbEstudiante = new javax.swing.JButton();
        jbProfesor = new javax.swing.JButton();
        jbVisitante = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Adobe Kaiti Std R", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Escolar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jbEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        jbEstudiante.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jbEstudiante.setText("Estudiante");
        jbEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(jbEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jbProfesor.setBackground(new java.awt.Color(255, 255, 255));
        jbProfesor.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jbProfesor.setText("Profesor");
        jbProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(jbProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jbVisitante.setBackground(new java.awt.Color(255, 255, 255));
        jbVisitante.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jbVisitante.setText("Visitante");
        getContentPane().add(jbVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 50, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/man.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 60, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/persona.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pizarra.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEstudianteActionPerformed

    private void jbProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProfesorActionPerformed
    setVisible(false);
    FirstSection a = new FirstSection();
    a.setVisible(true);
    }//GEN-LAST:event_jbProfesorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbEstudiante;
    private javax.swing.JButton jbProfesor;
    private javax.swing.JButton jbVisitante;
    // End of variables declaration//GEN-END:variables
}
