/*
 * Tugas Besar - Pemrograman Berorientasi Objek
 * Muhammad Maulud H. R. | 1301154166
 * M. Widadio Ilham	  | 1301154360
 * Afra W. D.	  | 1301150432
 */
package viewOld;

/**
 *
 * @author Muhammad Maulud H R
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUSername = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminCreate = new javax.swing.JMenu();
        adminCreateDosen = new javax.swing.JMenuItem();
        adminCreateMataKuliah = new javax.swing.JMenuItem();
        adminSearch = new javax.swing.JMenu();
        adminSearchMahasiswa = new javax.swing.JMenuItem();
        adminSearchDosen = new javax.swing.JMenuItem();
        adminSearchMataKuliah = new javax.swing.JMenuItem();
        adminDelete = new javax.swing.JMenu();
        adminDeleteMahasiswa = new javax.swing.JMenuItem();
        adminDeleteDosen = new javax.swing.JMenuItem();
        adminDeleteMataKuliah = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 68)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome, ");

        lblUSername.setFont(new java.awt.Font("Myriad Pro", 0, 68)); // NOI18N
        lblUSername.setForeground(new java.awt.Color(255, 255, 255));
        lblUSername.setText("username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblUSername))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUSername)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(1, 1, 1, 1));

        adminCreate.setText("Create");
        adminCreate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        adminCreateDosen.setText("Dosen");
        adminCreateDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCreateDosenActionPerformed(evt);
            }
        });
        adminCreate.add(adminCreateDosen);

        adminCreateMataKuliah.setText("Mata Kuliah");
        adminCreate.add(adminCreateMataKuliah);

        jMenuBar1.add(adminCreate);

        adminSearch.setText("Search");
        adminSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        adminSearchMahasiswa.setText("Mahasiswa");
        adminSearch.add(adminSearchMahasiswa);

        adminSearchDosen.setText("Dosen");
        adminSearch.add(adminSearchDosen);

        adminSearchMataKuliah.setText("Mata Kuliah");
        adminSearchMataKuliah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSearchMataKuliahActionPerformed(evt);
            }
        });
        adminSearch.add(adminSearchMataKuliah);

        jMenuBar1.add(adminSearch);

        adminDelete.setText("Delete");
        adminDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        adminDeleteMahasiswa.setText("Mahasiswa");
        adminDelete.add(adminDeleteMahasiswa);

        adminDeleteDosen.setText("Dosen");
        adminDeleteDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteDosenActionPerformed(evt);
            }
        });
        adminDelete.add(adminDeleteDosen);

        adminDeleteMataKuliah.setText("Mata Kuliah");
        adminDelete.add(adminDeleteMataKuliah);

        jMenuBar1.add(adminDelete);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminCreateDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCreateDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminCreateDosenActionPerformed

    private void adminSearchMataKuliahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSearchMataKuliahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSearchMataKuliahActionPerformed

    private void adminDeleteDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminDeleteDosenActionPerformed

    public void setUsername(String s) {
        lblUSername.setText(s);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminCreate;
    private javax.swing.JMenuItem adminCreateDosen;
    private javax.swing.JMenuItem adminCreateMataKuliah;
    private javax.swing.JMenu adminDelete;
    private javax.swing.JMenuItem adminDeleteDosen;
    private javax.swing.JMenuItem adminDeleteMahasiswa;
    private javax.swing.JMenuItem adminDeleteMataKuliah;
    private javax.swing.JMenu adminSearch;
    private javax.swing.JMenuItem adminSearchDosen;
    private javax.swing.JMenuItem adminSearchMahasiswa;
    private javax.swing.JMenuItem adminSearchMataKuliah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUSername;
    // End of variables declaration//GEN-END:variables
}