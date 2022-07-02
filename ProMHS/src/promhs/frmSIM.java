package promhs;

/**
 *
 * @author Ruben Maaf 20101249
 */
public class frmSIM extends javax.swing.JFrame {
    frmhs fh;
    frdsn fd;
    frmt ft;
    public frmSIM() {
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

        label = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MNFile = new javax.swing.JMenu();
        MNFileExit = new javax.swing.JMenuItem();
        mndosen = new javax.swing.JMenu();
        MNmhs = new javax.swing.JMenu();
        mtkul = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout labelLayout = new javax.swing.GroupLayout(label);
        label.setLayout(labelLayout);
        labelLayout.setHorizontalGroup(
            labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        labelLayout.setVerticalGroup(
            labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        MNFile.setText("File");

        MNFileExit.setText("Exit");
        MNFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNFileExitActionPerformed(evt);
            }
        });
        MNFile.add(MNFileExit);

        jMenuBar1.add(MNFile);

        mndosen.setText("Data Dosen");
        mndosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mndosenMouseClicked(evt);
            }
        });
        mndosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mndosenActionPerformed(evt);
            }
        });
        jMenuBar1.add(mndosen);

        MNmhs.setText("Data Mahasiswa");
        MNmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MNmhsMouseClicked(evt);
            }
        });
        jMenuBar1.add(MNmhs);

        mtkul.setText("Data MataKuliah");
        mtkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtkulMouseClicked(evt);
            }
        });
        jMenuBar1.add(mtkul);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MNFileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNFileExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MNFileExitActionPerformed

    private void mndosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mndosenMouseClicked
        if(fd == null || fd.isClosed()){
            fd = new frdsn();
            label.add(fd);
            fd.setLocation(this.getWidth()/2 - fd.getWidth()/2, this.getHeight()/2-fd.getHeight()/2);
            fd.setVisible(true);
        }else{
            fd.setVisible(true);
        }

    }//GEN-LAST:event_mndosenMouseClicked

    private void mndosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mndosenActionPerformed

    }//GEN-LAST:event_mndosenActionPerformed

    private void MNmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MNmhsMouseClicked
        if(fh == null || fh.isClosed()){
            fh =new frmhs();
            label.add(fh);
            fh.setLocation(this.getWidth()/2 - fh.getWidth()/2, this.getHeight()/2-fh.getHeight()/2);
            fh.setVisible(true);
        }else{
            fh.setVisible(true);
        }
    }//GEN-LAST:event_MNmhsMouseClicked

    private void mtkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtkulMouseClicked
        if(ft == null || ft.isClosed()){
            ft = new frmt();
            label.add(ft);
            ft.setLocation(this.getWidth()/3 - ft.getWidth()/3, this.getHeight()/2-ft.getHeight()/3);
            ft.setVisible(true);
        }
    }//GEN-LAST:event_mtkulMouseClicked

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
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSIM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSIM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MNFile;
    private javax.swing.JMenuItem MNFileExit;
    private javax.swing.JMenu MNmhs;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane label;
    private javax.swing.JMenu mndosen;
    private javax.swing.JMenu mtkul;
    // End of variables declaration//GEN-END:variables
}
