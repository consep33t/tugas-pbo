package SekolahCRUD;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormUtama extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private Connection connection;
    
    public FormUtama() {
        initComponents();
        initTable();
        loadData();
    }

    
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                textNoInduk = new javax.swing.JTextField();
                textNama = new javax.swing.JTextField();
                textWali = new javax.swing.JTextField();
                textTelepon = new javax.swing.JTextField();
                textTanggal = new javax.swing.JFormattedTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                textAlamat = new javax.swing.JTextArea();
                textCari = new javax.swing.JTextField();
                jScrollPane3 = new javax.swing.JScrollPane();
                tabelSiswa = new javax.swing.JTable();
                btnRefresh = new javax.swing.JButton();
                btnSimpan = new javax.swing.JButton();
                btnUbah = new javax.swing.JButton();
                btnHapus = new javax.swing.JButton();
                btnBatal = new javax.swing.JButton();

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Aplikasi Sekolah");

                jLabel1.setText("No. Induk");

                jLabel2.setText("Nama Siswa");

                jLabel3.setText("Nama Wali");

                jLabel4.setText("Tanggal Lahir");

                jLabel5.setText("No. Telepon");

                jLabel6.setText("Alamat");

                textTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
                textTanggal.setValue(new java.util.Date());

                textAlamat.setColumns(20);
                textAlamat.setRows(5);
                jScrollPane1.setViewportView(textAlamat);

                textCari.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                textCari.setText("Cari Nama Siswa");
                textCari.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                textCariActionPerformed(evt);
                        }
                });
                textCari.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                textCariKeyReleased(evt);
                        }
                });

                tabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                tabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tabelSiswaMouseClicked(evt);
                        }
                });
                jScrollPane3.setViewportView(tabelSiswa);

                btnRefresh.setBackground(new java.awt.Color(51, 51, 255));
                btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
                btnRefresh.setText("Refresh");
                btnRefresh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRefreshActionPerformed(evt);
                        }
                });

                btnSimpan.setBackground(new java.awt.Color(51, 51, 255));
                btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
                btnSimpan.setText("Simpan");
                btnSimpan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSimpanActionPerformed(evt);
                        }
                });

                btnUbah.setBackground(new java.awt.Color(51, 51, 255));
                btnUbah.setForeground(new java.awt.Color(255, 255, 255));
                btnUbah.setText("Ubah");
                btnUbah.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnUbahActionPerformed(evt);
                        }
                });

                btnHapus.setBackground(new java.awt.Color(51, 51, 255));
                btnHapus.setForeground(new java.awt.Color(255, 255, 255));
                btnHapus.setText("Hapus");
                btnHapus.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnHapusActionPerformed(evt);
                        }
                });

                btnBatal.setBackground(new java.awt.Color(51, 51, 255));
                btnBatal.setForeground(new java.awt.Color(255, 255, 255));
                btnBatal.setText("Batal");
                btnBatal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBatalActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textNoInduk, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textNama, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                                        .addComponent(textWali)
                                                        .addComponent(textTelepon)
                                                        .addComponent(textTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                                                .addComponent(btnHapus)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnUbah)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSimpan)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRefresh)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnBatal)))
                                .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBatal, btnHapus, btnRefresh, btnSimpan, btnUbah});

                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(textNoInduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBatal)
                                        .addComponent(btnRefresh)
                                        .addComponent(btnSimpan)
                                        .addComponent(btnUbah)
                                        .addComponent(btnHapus))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(textWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(textTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(textTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        String noInduk = textNoInduk.getText();
        String nama = textNama.getText();
        String namaWali = textWali.getText();
        Date tanggalLahir = (Date) textTanggal.getValue();
        String telepon = textTelepon.getText();
        String alamat = textAlamat.getText();

        connection = SekolahDatabase.getConnection();
        String query = "INSERT INTO siswa"
                + "(no_induk, nama, nama_wali, tanggal_lahir, telepon, alamat)"
                + "VALUES (?,?,?,?,?,?)";
        try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
          statement.setString(1, noInduk);
          statement.setString(2, nama);
          statement.setString(3, namaWali);
          statement.setDate(4, new java.sql.Date(tanggalLahir.getTime()));
          statement.setString(5, telepon);
          statement.setString(6, alamat);
          
          statement.executeUpdate();
        } catch (SQLException ex){
          JOptionPane.showMessageDialog(this, "Terjadi error pada saat input data");
          
        } finally {
          loadData();
          reset();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
       
        int row = tabelSiswa.getSelectedRow();
        if (row==-1){
            return;
        }
        
        String noInduk = (String) tableModel.getValueAt(row, 0);
        String nama = textNama.getText();
        String namaWali = textWali.getText();
        Date tanggalLahir = (Date) textTanggal.getValue();
        String telepon = textTelepon.getText();
        String alamat = textAlamat.getText();

        connection = SekolahDatabase.getConnection();
        String query = "UPDATE siswa SET "
            + "nama=?,nama_wali=?,tanggal_lahir=?,telepon=?,alamat=? "
            + "WHERE no_induk=?";
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, nama);
            statement.setString(2, namaWali);
            statement.setDate(3, new java.sql.Date(tanggalLahir.getTime()));
            statement.setString(4, telepon);
            statement.setString(5, alamat);
            statement.setString(6, noInduk);
            statement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat update data");
        } finally {
            loadData();
            reset();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
        int row = tabelSiswa.getSelectedRow();
        if (row==-1){
            return;
        }
        
        String noInduk = (String) tableModel.getValueAt(row, 0);
        
        connection = SekolahDatabase.getConnection();
        String query = "DELETE FROM siswa WHERE no_induk=?";
        
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, noInduk);
            statement.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat delete data");
        } finally {
          loadData();  
          reset();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void textCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCariKeyReleased
        
        tableModel.getDataVector().removeAllElements();
        
        tableModel.fireTableDataChanged();
        
        try {
          String cari = textCari.getText();
          
          connection = SekolahDatabase.getConnection();
          String query = "SELECT * FROM siswa WHERE nama LIKE '%"+cari+"%'";
          
          Statement statement = (Statement) connection.createStatement();
          ResultSet resultSet = statement.executeQuery(query);
          
          while (resultSet.next()){
              Object[] siswa = new Object[6];
              siswa[0] = resultSet.getString("no_induk");
              siswa[1] = resultSet.getString("nama");
              siswa[2] = resultSet.getString("nama_wali");
              siswa[3] = resultSet.getString("tanggal_lahir");
              siswa[4] = resultSet.getString("telepon");
              siswa[5] = resultSet.getString("alamat");
              tableModel.addRow(siswa);
          }
          
          resultSet.close(); 
          statement.close(); 
          
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());  
        }
    }//GEN-LAST:event_textCariKeyReleased

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        loadData();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        reset();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSiswaMouseClicked
        try {
            int row=tabelSiswa.getSelectedRow();
            if (row==-1) {
                return;
            }
        
            String noInduk = (String) tableModel.getValueAt(row, 0);
            String nama = (String) tableModel.getValueAt(row, 1);
            String namaWali = (String) tableModel.getValueAt(row, 2);
            String tanggal= (String) tableModel.getValueAt(row, 3);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf.parse(tanggal);
            String telepon = (String) tableModel.getValueAt(row, 4);
            String alamat = (String) tableModel.getValueAt(row, 5);

            textNoInduk.setText(noInduk);
            textNama.setText(nama);
            textWali.setText(namaWali);
            textTanggal.setValue(date);
            textTelepon.setText(telepon);
            textAlamat.setText(alamat);
        } catch (ParseException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabelSiswaMouseClicked

        private void textCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCariActionPerformed
        }//GEN-LAST:event_textCariActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBatal;
        private javax.swing.JButton btnHapus;
        private javax.swing.JButton btnRefresh;
        private javax.swing.JButton btnSimpan;
        private javax.swing.JButton btnUbah;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable tabelSiswa;
        private javax.swing.JTextArea textAlamat;
        private javax.swing.JTextField textCari;
        private javax.swing.JTextField textNama;
        private javax.swing.JTextField textNoInduk;
        private javax.swing.JFormattedTextField textTanggal;
        private javax.swing.JTextField textTelepon;
        private javax.swing.JTextField textWali;
        // End of variables declaration//GEN-END:variables

    private void initTable(){
        tableModel = new DefaultTableModel();
        tabelSiswa.setModel(tableModel);
        tableModel.addColumn("No. Induk");
        tableModel.addColumn("Nama Siswa");
        tableModel.addColumn("Nama Wali");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("No. Telepon");
        tableModel.addColumn("Alamat");
    }
    
    private void loadData(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        
        try{
            connection = SekolahDatabase.getConnection();
            String query = "SELECT * FROM siswa";
            
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){
                Object[] siswa = new Object[6];
                siswa[0] = resultSet.getString("no_induk");
                siswa[1] = resultSet.getString("nama");
                siswa[2] = resultSet.getString("nama_wali");
                siswa[3] = resultSet.getString("tanggal_lahir");
                siswa[4] = resultSet.getString("telepon");
                siswa[5] = resultSet.getString("alamat");
                tableModel.addRow(siswa);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void reset(){
        textNoInduk.setText("");
        textCari.setText("");
        textNama.setText("");
        textTanggal.setValue(new java.util.Date());
        textTelepon.setText("");
        textWali.setText("");
        textAlamat.setText("");
    }
}
