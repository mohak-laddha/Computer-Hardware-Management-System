/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jdesktopPane.java
 *
 * Created on Apr 29, 2016, 10:09:59 AM
 */

package connector;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Guest
 */
public class Open extends javax.swing.JFrame {
Connection c=null;
Statement s=null;
    /** Creates new form jdesktopPane */
    public Open() {
        initComponents();
        try
{
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ggwpc","root","toor");

}
catch (Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        m2 = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dp1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("LOGIN FORM");
        jLabel1.setBounds(340, 30, 360, 90);
        dp1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel1.getAccessibleContext().setAccessibleName("            Welcome to\n Payroll Management System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("Password");
        jLabel2.setBounds(260, 180, 110, 30);
        dp1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setText("Username");
        jLabel4.setBounds(260, 150, 90, 30);
        dp1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        m1.setBounds(410, 150, 210, 30);
        dp1.add(m1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(420, 260, 190, 50);
        dp1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(440, 400, 150, 30);
        dp1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        m2.setBounds(410, 180, 210, 30);
        dp1.add(m2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String u,p,l;
u=m1.getText();
p=m2.getText();
if(u.equals("root") || u.equals("admin"))
{
     if(p.equals("toor") || p.equals("password"))
     {
        JOptionPane.showMessageDialog(rootPane,"Log In");
     Home h1=new Home();  
     h1.setVisible(true);     
     }
     else   
         JOptionPane.showMessageDialog(rootPane,"Wrong userid or password"); 
}
else
{
    JOptionPane.showMessageDialog(rootPane,"Wrong userid or password");
      m1.setText("");
     m2.setText("");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Open().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField m1;
    private javax.swing.JPasswordField m2;
    // End of variables declaration//GEN-END:variables

}
