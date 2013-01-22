
package V1;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MainForm extends javax.swing.JFrame {

    public void MenuVisible()
    {
        Mastermenu.setVisible(true);
        Transactionmenu.setVisible(true);
    }
    public void MenuInvisible(){
        Mastermenu.setVisible(false);
        Transactionmenu.setVisible(false);
                
    }
    
    Connect con = new Connect();
    ResultSet rsl;
    ResultSetMetaData rslm;
    int x = 1;
    boolean flag = false;
    Calendar calendar = Calendar.getInstance();
    Date DTL = calendar.getTime();
    SimpleDateFormat DateModel = (SimpleDateFormat)DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);    
    Vector temp1 = new Vector();
    Vector temp2 = new Vector();
    Vector temp3 = new Vector();
    String nama = "";
    
    public MainForm() throws SQLException {
        initComponents();
        MenuInvisible();
        DateModel.applyPattern("E, dd/mm/yy");
        String tempdate = DateModel.format(DTL);
        jLabel1.setText(tempdate);

       rsl = con.executeQuery("SELECT EmployeeID FROM MsEmployee");
       rslm = rsl.getMetaData();
       x = rslm.getColumnCount();
        try {
            while(rsl.next()){
                 try {
                     temp1.add(rsl.getString(x));
                 } catch (SQLException ex) {
                     Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rsl = con.executeQuery("SELECT Password FROM MsEmployee");
        rslm = rsl.getMetaData();
        x = rslm.getColumnCount();
        try {
            while(rsl.next()){
                 try {
                     temp2.add(rsl.getString(x));
                 } catch (SQLException ex) {
                     Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IDfield = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PASSfield = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        Accountmenu = new javax.swing.JMenu();
        LoginMenu = new javax.swing.JMenuItem();
        LogoutMenu = new javax.swing.JMenuItem();
        Mastermenu = new javax.swing.JMenu();
        Customermenu = new javax.swing.JMenuItem();
        EmployeeMenu = new javax.swing.JMenuItem();
        Gaemmenu = new javax.swing.JMenuItem();
        Transactionmenu = new javax.swing.JMenu();
        newTmenu = new javax.swing.JMenuItem();
        Historymenu = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blue Game Shop");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setTitle("Login Form");
        jInternalFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrame1.setVisible(false);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 30);
        flowLayout1.setAlignOnBaseline(true);
        jPanel6.setLayout(flowLayout1);

        jLabel3.setText("EmployeeID");
        jPanel6.add(jLabel3);

        IDfield.setMinimumSize(new java.awt.Dimension(100, 20));
        IDfield.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel6.add(IDfield);
        IDfield.getAccessibleContext().setAccessibleName("");

        jPanel3.add(jPanel6);

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5);
        flowLayout2.setAlignOnBaseline(true);
        jPanel7.setLayout(flowLayout2);

        jLabel4.setText("Password");
        jPanel7.add(jLabel4);

        PASSfield.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel7.add(PASSfield);

        jPanel3.add(jPanel7);

        jInternalFrame1.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Blue Game Shop");
        jPanel4.add(jLabel2);

        jInternalFrame1.getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel5.add(LoginButton);

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ResetButton);

        jInternalFrame1.getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jInternalFrame1, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        MenuBar.setBackground(new java.awt.Color(51, 153, 255));
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Accountmenu.setText("Account");

        LoginMenu.setText("Login");
        LoginMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginMenuActionPerformed(evt);
            }
        });
        Accountmenu.add(LoginMenu);

        LogoutMenu.setText("Logout");
        LogoutMenu.setEnabled(false);
        LogoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutMenuActionPerformed(evt);
            }
        });
        Accountmenu.add(LogoutMenu);

        MenuBar.add(Accountmenu);

        Mastermenu.setText("Master");

        Customermenu.setText("Customer");
        Mastermenu.add(Customermenu);

        EmployeeMenu.setText("Employee");
        Mastermenu.add(EmployeeMenu);

        Gaemmenu.setText("Game");
        Mastermenu.add(Gaemmenu);

        MenuBar.add(Mastermenu);

        Transactionmenu.setText("Transaction");

        newTmenu.setText("New Transaction");
        Transactionmenu.add(newTmenu);

        Historymenu.setText("View History");
        Transactionmenu.add(Historymenu);

        MenuBar.add(Transactionmenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>                        

    private void LoginMenuActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
        jInternalFrame1.setVisible(true);
        LoginMenu.setEnabled(false);

        
    }                                         

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            

        IDfield.setText("");
        PASSfield.setText("");
        
    }                                           

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
        flag = false;
        if(IDfield.getText().isEmpty() || PASSfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "EmployeeID and Password must be filled");
            Vector d = con.getData();
            for(int i = 0; i < d.size(); i++){
                if(IDfield.getText().equals(((Vector)d.get(i)).get(0).toString()))
                {
                    if(PASSfield.getText().equals(((Vector)d.get(i)).get(1).toString())){
                        flag = true;
                    }
                }
        }
        }else if(flag = false){
            JOptionPane.showMessageDialog(rootPane, "Invalid ID/Password");
        }else if(flag = true){
            rsl = con.executeQuery("SELECT EmployeeID FROM MsEmployee WHERE EmployeeID = " + IDfield);
            try {
                nama = rsl.getString(1);
            } catch (SQLException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Login Success,\nWelcome " + nama);
            MenuVisible();
            jInternalFrame1.setVisible(false);
            Accountmenu.setText(nama);
        }

        
        
    }                                           

    private void LogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        MenuInvisible();
        Accountmenu.setText("Account");
        LogoutMenu.setEnabled(false);
        LoginMenu.setEnabled(true);
    }                                          


    public static void main(String args[]) throws Exception {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new MainForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JMenu Accountmenu;
    private javax.swing.JMenuItem Customermenu;
    private javax.swing.JMenuItem EmployeeMenu;
    private javax.swing.JMenuItem Gaemmenu;
    private javax.swing.JMenuItem Historymenu;
    private javax.swing.JTextField IDfield;
    private javax.swing.JButton LoginButton;
    private javax.swing.JMenuItem LoginMenu;
    private javax.swing.JMenuItem LogoutMenu;
    private javax.swing.JMenu Mastermenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField PASSfield;
    private javax.swing.JButton ResetButton;
    private javax.swing.JMenu Transactionmenu;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JMenuItem newTmenu;
    // End of variables declaration                   
}
