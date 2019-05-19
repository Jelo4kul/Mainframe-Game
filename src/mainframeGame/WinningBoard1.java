
package mainframeGame;

/**
 *
 * @author Jelo
 */
public class WinningBoard1 extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    private static int finalScore;
    
    public WinningBoard1() {
        initComponents();
        score.setText(EasyLevel.getScore()+"/5");
    }
    
    public void setFinalScore(int score){
        finalScore=score;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quit = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        playAgain = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 652));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });
        getContentPane().add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 70, 40));

        score.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        score.setForeground(new java.awt.Color(136, 168, 230));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("3/5");
        getContentPane().add(score, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 120, 100));

        playAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playAgainMouseClicked(evt);
            }
        });
        getContentPane().add(playAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 100, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainframeGame/wiinn.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 652));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 652));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 652));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 652));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playAgainMouseClicked
       this.setVisible(false);
       new Level().setVisible(true);
    }//GEN-LAST:event_playAgainMouseClicked

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
       System.exit(0);
    }//GEN-LAST:event_quitMouseClicked

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
            java.util.logging.Logger.getLogger(WinningBoard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinningBoard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinningBoard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinningBoard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinningBoard1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel playAgain;
    private javax.swing.JLabel quit;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
