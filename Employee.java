package V1;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jun
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    
    Connect con;
    ResultSet rsl;
    ResultSetMetaData rslm;
    
    String text = "";
    void Enabling(){
        ID.setEnabled(true);
        Name.setEnabled(true);
        Pass.setEnabled(true);
        male.setEnabled(true);
        female.setEnabled(true);
        Address.setEnabled(true);
        Phone.setEnabled(true);
        Email.setEnabled(true);
        apply.setEnabled(true);
        cancel.setEnabled(true);
        insert.setEnabled(false);
        update.setEnabled(false);
        delete.setEnabled(false);
        jTable1.setEnabled(false);
        search.setEnabled(false);
        combo.setEnabled(false);
    }
    void Disabling(){
        ID.setEnabled(false);
        Name.setEnabled(false);
        Pass.setEnabled(false);
        male.setEnabled(false);
        female.setEnabled(false);
        Address.setEnabled(false);
        Phone.setEnabled(false);
        Email.setEnabled(false);
        apply.setEnabled(false);
        cancel.setEnabled(false);
        insert.setEnabled(true);
        update.setEnabled(true);
        delete.setEnabled(true);
        jTable1.setEnabled(true);
        search.setEnabled(true);
        combo.setEnabled(true);
    }
    public Employee() {
        initComponents();
        con = new Connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        insert = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        apply = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Pass = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Form");
        jPanel1.add(jLabel1);

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Search:");
        jPanel1.add(jLabel2);

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EmployeeID", "Name", "Gender", "Address", "Phone", "Email" }));
        jPanel1.add(combo);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2), "Employee List", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel5.setLayout(new java.awt.GridLayout(1, 4));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("<<");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("<");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText(">");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText(">>");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jPanel3.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Password", "Name", "Gender", "Address", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2), "Operation", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(4, 0));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        insert.setBackground(new java.awt.Color(255, 255, 255));
        insert.setForeground(new java.awt.Color(0, 153, 255));
        insert.setText("  Insert  ");
        insert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel16.add(insert);

        jPanel7.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setForeground(new java.awt.Color(0, 153, 255));
        update.setText(" Update ");
        update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel17.add(update);

        jPanel7.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setForeground(new java.awt.Color(0, 153, 255));
        delete.setText(" Delete ");
        delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel18.add(delete);

        jPanel7.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        apply.setBackground(new java.awt.Color(255, 255, 255));
        apply.setForeground(new java.awt.Color(0, 153, 255));
        apply.setText("Apply");
        apply.setEnabled(false);
        apply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });
        jPanel19.add(apply);

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setForeground(new java.awt.Color(0, 153, 255));
        cancel.setText("Cancel");
        cancel.setEnabled(false);
        cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel19.add(cancel);

        jPanel7.add(jPanel19);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2), "Employee Data", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel8.setLayout(new java.awt.GridLayout(7, 0));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("EmployeeID");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel9.add(jLabel3);

        ID.setEnabled(false);
        jPanel9.add(ID);

        jPanel8.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Name");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel10.add(jLabel4);

        Name.setEnabled(false);
        jPanel10.add(Name);

        jPanel8.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Password");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel11.add(jLabel5);

        Pass.setEnabled(false);
        jPanel11.add(Pass);

        jPanel8.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Gender");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel12.add(jLabel6);

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setText("Male");
        male.setEnabled(false);
        jPanel12.add(male);

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setText("Female");
        female.setEnabled(false);
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel12.add(female);

        jPanel8.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Address");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel13.add(jLabel7);

        Address.setEnabled(false);
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        jPanel13.add(Address);

        jPanel8.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Phone");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel14.add(jLabel8);

        Phone.setEnabled(false);
        jPanel14.add(Phone);

        jPanel8.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Email");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel15.add(jLabel9);

        Email.setEnabled(false);
        jPanel15.add(Email);

        jPanel8.add(jPanel15);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTable1.changeSelection(jTable1.getRowCount()-1, jTable1.getColumnCount()-1, false, false);
    }                                        

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Select your choice first!");
        }
        int temp = JOptionPane.showConfirmDialog(rootPane,"Are You Sure ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(temp == JOptionPane.YES_OPTION){
            ((DefaultTableModel)jTable1.getModel()).removeRow(jTable1.getSelectedRow());
        }
    }                                      

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTable1.changeSelection(0, 0, false, false);
    }                                        

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Enabling();
        ID.setText("");
        Name.setText("");
        Pass.setText("");
        Address.setText("");
        Phone.setText("");
        Email.setText("");
        if(male.isSelected() || female.isSelected()){
            buttonGroup1.clearSelection();
        }
        
    }                                      

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        Disabling();
        if(ID.getText().equals("") || Name.getText().equals("") || Pass.getText().equals("") || Address.getText().equals("") || Phone.getText().equals("") || Email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "fill all field first!");
        }else if(Name.getText().length() < 3 || Pass.getText().length() < 3){
            JOptionPane.showMessageDialog(null, "Name and Password must at least 3 character!");
        }else if(!Address.getText().startsWith("Jl.")){
            JOptionPane.showMessageDialog(null, "Address must start with Jl. !");
        }else if(!Phone.getText().matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")){
            JOptionPane.showMessageDialog(null, "Phone must number!");
        }else if(!Email.getText().contains("@") || !Email.getText().contains(".")){
            JOptionPane.showMessageDialog(null, "Write your email correctly!");
        }else if(!male.isSelected() && !female.isSelected()){
            JOptionPane.showMessageDialog(null, "Select Gender!");
        }else{
            
            if(male.isSelected()){
                text = male.getText();
            }else if(female.isSelected()){
                text = female.getText();
            }
            DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
            dtm.addRow(new Object[] { ID.getText(), Name.getText(), Pass.getText(), text, Address.getText(), Phone.getText(), Email.getText()});
            
            con.executeUpdate("INSERT INTO UsernameTable VALUES()");
        
        }
    }                                     

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        Disabling();

    }                                      
//coba lewat properties ah
   /* void RefreshTable(){
    Vector v;
    Vector column = new Vector();
    
    column.add("EmployeeID");
    column.add("Password");
    
    
    
    v = con.getData();
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
    dtm.setDataVector(v, column);
    
}*/
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:

        if(jTable1.getSelectedColumn() < 0){
            JOptionPane.showMessageDialog(null, "Select your choice first!");
        }else{
            Enabling();

            ID.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            Pass.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            Name.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            Address.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            Phone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
            Email.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
            ((DefaultTableModel)jTable1.getModel()).removeRow(jTable1.getSelectedRow());

            if(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString().equalsIgnoreCase("female")){
                female.setSelected(true);
            }else{
                male.setSelected(true);
            }
        }
    }                                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTable1.changeSelection(jTable1.getSelectedRow() - 1, jTable1.getSelectedColumn(), false, false); 
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTable1.changeSelection(jTable1.getSelectedRow() + 1, jTable1.getSelectedColumn(), false, false);        
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Employee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton apply;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox combo;
    private javax.swing.JButton delete;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration                   
}
