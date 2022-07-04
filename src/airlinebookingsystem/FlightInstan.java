package airlinebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class FlightInstan extends javax.swing.JFrame {
    String url = "jdbc:sqlite:/home/drone/Desktop/AirlineBookingSystem/sqlitestudio/airlinebookingsystem.db";

    public FlightInstan() {
        initComponents();
        setLocationRelativeTo(null);
        fillCombo1 ();
        fillCombo2 ();
        fillCombo3 ();
        fillCombo4 ();
        displayFlightInsta();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        flightsbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightlegtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        ccb1 = new javax.swing.JComboBox<>();
        ctf1 = new javax.swing.JTextField();
        cdate1 = new javax.swing.JTextField();
        ccb2 = new javax.swing.JComboBox<>();
        ccb3 = new javax.swing.JComboBox<>();
        ccb4 = new javax.swing.JComboBox<>();
        ctime1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        savebtn1 = new javax.swing.JButton();
        deletebtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airline Booking System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        flightsbtn.setText("Flights");
        flightsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightsbtnMouseClicked(evt);
            }
        });

        jButton1.setText("Log Out");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(flightsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightsbtn)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Manage Flight Instances");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Flight Code");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Instance ID");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Departure Date ");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Pilot");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Co-Pilot ");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Plane");

        flightlegtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        flightlegtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightlegtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(flightlegtable);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ccb1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(ctf1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(cdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(ctime1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(ccb2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ccb3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ccb4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccb1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctf1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(cdate1)
            .addComponent(ccb2)
            .addComponent(ccb3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ctime1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(ccb4)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        savebtn1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        savebtn1.setText("Save");
        savebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtn1MouseClicked(evt);
            }
        });

        deletebtn1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        deletebtn1.setText("Delete");
        deletebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(savebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 112, 152));
        jLabel4.setText("Take off Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel7)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel10)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1639, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(527, 527, 527))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(610, 610, 610))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_jButton1MouseClicked

   
    
    private void displayFlightInsta(){
            Connection con11 ;
            ResultSet rs11;
            Statement st11 ;
        try {
            
            
            con11 = DriverManager.getConnection(url);
            st11= con11.createStatement();
            rs11 = st11.executeQuery("SELECT * FROM LegInstance ");
            flightlegtable.setModel(DbUtils.resultSetToTableModel(rs11));

      }
       catch (Exception e) {
      }
    }



    private void fillCombo1 (){
        try{
        Connection con ;
        PreparedStatement pst ;
        ResultSet rs  ;
        Statement St ;
    
            
            con = DriverManager.getConnection(url);
            String sql= "select *from Flight";
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
             String  Flight_Code   = rs.getString("Flight_Code");
             ccb1.addItem(Flight_Code);
            }
            con.close();
        }

            catch (Exception e){
                JOptionPane.showMessageDialog(null,e);

        }
    }
    
    
        private void fillCombo2 (){
        try{
        Connection con ;
        PreparedStatement pst =null ;
        ResultSet rs = null ;
        Statement St = null;
    
            
            con = DriverManager.getConnection(url);
            String sql= "select *from Pilot";
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
             String Emp_ID   = rs.getString("Emp_ID");
             ccb2.addItem(Emp_ID);
            }
            con.close();
        }

            catch (Exception e){
                JOptionPane.showMessageDialog(null,e);

        }
    }
    
        
        private void fillCombo3 (){
        try{
        Connection con ;
        PreparedStatement pst =null ;
        ResultSet rs = null ;
        Statement St = null;
    
            
            con = DriverManager.getConnection(url);
            String sql= "select *from Airplane";
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
             String Airplane_ID   = rs.getString("Airplane_ID");
             ccb4.addItem(Airplane_ID);
            }
            con.close();
        }

            catch (Exception e){
                JOptionPane.showMessageDialog(null,e);

        }
    }
    
        
        private void fillCombo4 (){
        try{
        Connection con ;
        PreparedStatement pst ;
        ResultSet rs ;
        Statement St ;
    
            
            con = DriverManager.getConnection(url);
            String sql= "select *from Pilot";
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
             String EMP_ID   = rs.getString("EMP_ID");
             ccb3.addItem(EMP_ID);
            }
            con.close();
        }

            catch (Exception e){
                JOptionPane.showMessageDialog(null,e);

        }
    }
    
    
    
    private void flightsbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightsbtnMouseClicked
        new Flights().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_flightsbtnMouseClicked


    private void savebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtn1MouseClicked
                                               
        if (ctf1.getText().isEmpty()|| cdate1.getText().isEmpty() )
        {
            
	JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else if (ccb2.getSelectedItem().toString().equals(ccb3.getSelectedItem().toString())) {
        JOptionPane.showMessageDialog(this, "same pilot and copilot  ");
        }
        
        
        else {
	try{
            
                Connection con0,con1 ,con2, con4,con3 ;
                PreparedStatement pst1, pst2,pst3, pst4;
                ResultSet rs1,rs2, rs3, rs4;
                Statement st4, st1,st2;
                		
                
                
                con1 = DriverManager.getConnection(url);
                pst1= con1.prepareStatement("select Departure_Airport from Flight where Flight_Code= " + '"'+ ccb1.getSelectedItem().toString() + '"');
                rs1=pst1.executeQuery();
                String comb1 = rs1.getString("Departure_Airport");
                con1.close();
              
                con2 = DriverManager.getConnection(url);
                pst2= con2.prepareStatement("select Destination_Airport from Flight where Flight_Code= " + '"'+ ccb1.getSelectedItem().toString() + '"');
                rs2=pst2.executeQuery();
                String comb2 = rs2.getString("Destination_Airport");
                con2.close();
                
                
                
                
                con3 = DriverManager.getConnection(url);
                pst3= con3.prepareStatement("select FirstName from Pilot where Emp_ID= " + '"'+ ccb2.getSelectedItem().toString() + '"');
                rs3=pst3.executeQuery();
                String comb3 = rs3.getString("FirstName");
                con3.close();
                
                
                con4 = DriverManager.getConnection(url);
                pst4= con4.prepareStatement("select FirstName from Pilot where Emp_ID= " + '"'+ ccb3.getSelectedItem().toString() + '"');
                rs4=pst4.executeQuery();
                String comb4 = rs4.getString("FirstName");
                con4.close();
                
                
        	con0 = DriverManager.getConnection(url);
		PreparedStatement add = con0.prepareStatement("INSERT INTO LegInstance VALUES (?,?,?,?,?,?,?,?,?)") ;
                
		add.setString(1,ctf1.getText()); 
                add.setString(2,ccb1.getSelectedItem().toString());
                add.setString(3,comb1);
		add.setString(4,comb2);
                add.setString(5,cdate1.getText());
                add.setString(6,ctime1.getText());
                add.setString(7,ccb4.getSelectedItem().toString());
                add.setString(8,comb3);
                add.setString(9,comb4);
                
                
                add.executeUpdate();
                con0.close();
                displayFlightInsta();
                JOptionPane.showMessageDialog(this, "Successfully added");
                
                
                
                
	}catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
	}

        }
    
    }//GEN-LAST:event_savebtn1MouseClicked
String key ;
    private void flightlegtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightlegtableMouseClicked
        DefaultTableModel model = ( DefaultTableModel)flightlegtable.getModel();
        int myIndex = flightlegtable.getSelectedRow();
        key = model.getValueAt(myIndex, 0).toString();
        
        ccb1.setSelectedItem(model.getValueAt(myIndex, 1).toString());
        ctf1.setText(model.getValueAt(myIndex, 0).toString());
        cdate1.setText(model.getValueAt(myIndex, 4).toString());
        ctime1.setText(model.getValueAt(myIndex, 5).toString());
        
        ccb2.setSelectedItem(model.getValueAt(myIndex, 7).toString());
        ccb3.setSelectedItem(model.getValueAt(myIndex, 8).toString());
        ccb4.setSelectedItem(model.getValueAt(myIndex, 6).toString());
    }//GEN-LAST:event_flightlegtableMouseClicked

    private void deletebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtn1MouseClicked
                key = ctf1.getText();
        
        if (key==null) {
            JOptionPane.showMessageDialog(this, "please select a flight");
        }
        else {
             try {
                Connection con6 ;
                con6 = DriverManager.getConnection(url);
                String query = " Delete from LegInstance where LegCode=" + "'" + key +"'";
                Statement del = con6.createStatement();
                del.executeUpdate(query);
                displayFlightInsta();
                JOptionPane.showMessageDialog(this, " Flight Deleted ");
                con6.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
        }
    }//GEN-LAST:event_deletebtn1MouseClicked

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
            java.util.logging.Logger.getLogger(FlightInstan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightInstan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightInstan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightInstan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightInstan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ccb1;
    private javax.swing.JComboBox<String> ccb2;
    private javax.swing.JComboBox<String> ccb3;
    private javax.swing.JComboBox<String> ccb4;
    private javax.swing.JTextField cdate1;
    private javax.swing.JTextField ctf1;
    private javax.swing.JTextField ctime1;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JTable flightlegtable;
    private javax.swing.JButton flightsbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebtn1;
    // End of variables declaration//GEN-END:variables
}
