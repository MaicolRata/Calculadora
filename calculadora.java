
package calculadora;

import java.awt.Frame;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
public class calculadora extends javax.swing.JFrame {
        
    ScriptEngineManager sem= new ScriptEngineManager(); 
    ScriptEngine se= sem.getEngineByName("JavaScript");
    
    

    public calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_sum = new javax.swing.JButton();
        btn_po = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_res = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_p = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_ig = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setText("C");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        textField1.setText("textField1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        txtOperacion.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(0, 153, 153));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 153, 153));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("•");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("•");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 130));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sum.setBackground(new java.awt.Color(204, 255, 255));
        btn_sum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_sum.setForeground(new java.awt.Color(0, 153, 153));
        btn_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_sum.setText("+");
        btn_sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_sum.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 215, 50, 50));

        btn_po.setBackground(new java.awt.Color(0, 153, 153));
        btn_po.setFont(new java.awt.Font("Tahoma", 1, 7)); // NOI18N
        btn_po.setForeground(new java.awt.Color(0, 153, 153));
        btn_po.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_po.setText("MOD");
        btn_po.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_po.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_po.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_poActionPerformed(evt);
            }
        });
        jPanel2.add(btn_po, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 11, 50, 50));

        btn_div.setBackground(new java.awt.Color(204, 255, 255));
        btn_div.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_div.setForeground(new java.awt.Color(0, 153, 153));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_div.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 11, 50, 50));

        btn_exp.setBackground(new java.awt.Color(204, 255, 255));
        btn_exp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(0, 153, 153));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_exp.setText("CE");
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_exp.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 11, 50, 50));

        btn_mul.setBackground(new java.awt.Color(204, 255, 255));
        btn_mul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(0, 153, 153));
        btn_mul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_mul.setText("x");
        btn_mul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_mul.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 79, 50, 50));

        btn_res.setBackground(new java.awt.Color(204, 255, 255));
        btn_res.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_res.setForeground(new java.awt.Color(0, 153, 153));
        btn_res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_res.setText("-");
        btn_res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_res.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_res.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resActionPerformed(evt);
            }
        });
        jPanel2.add(btn_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 147, 50, 50));

        btn_7.setBackground(new java.awt.Color(204, 255, 255));
        btn_7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 79, 50, 50));

        btn_8.setBackground(new java.awt.Color(204, 255, 255));
        btn_8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 79, 50, 50));

        btn_9.setBackground(new java.awt.Color(204, 255, 255));
        btn_9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 79, 50, 50));

        btn_c.setBackground(new java.awt.Color(0, 204, 204));
        btn_c.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_c.setForeground(new java.awt.Color(0, 153, 153));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_c.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 11, 50, 50));

        btn_4.setBackground(new java.awt.Color(204, 255, 255));
        btn_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 147, 50, 50));

        btn_6.setBackground(new java.awt.Color(204, 255, 255));
        btn_6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 147, 50, 50));

        btn_1.setBackground(new java.awt.Color(255, 0, 51));
        btn_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 215, 50, 50));

        btn_2.setBackground(new java.awt.Color(204, 255, 255));
        btn_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 215, 50, 50));

        btn_p.setBackground(new java.awt.Color(255, 255, 255));
        btn_p.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_p.setForeground(new java.awt.Color(255, 255, 255));
        btn_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_p.setText(".");
        btn_p.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_p.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_p.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pActionPerformed(evt);
            }
        });
        jPanel2.add(btn_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 283, 50, 50));

        btn_5.setBackground(new java.awt.Color(204, 255, 255));
        btn_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 147, 50, 50));

        btn_0.setBackground(new java.awt.Color(204, 255, 255));
        btn_0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aaaa.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trr.png"))); // NOI18N
        btn_0.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aaaa.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 283, 119, 50));

        btn_ig.setBackground(new java.awt.Color(51, 51, 255));
        btn_ig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_ig.setForeground(new java.awt.Color(0, 153, 153));
        btn_ig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_ig.setText("=");
        btn_ig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ig.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N
        btn_ig.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/b.png"))); // NOI18N
        btn_ig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ig, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 283, 50, 50));

        btn_3.setBackground(new java.awt.Color(204, 255, 255));
        btn_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uy.png"))); // NOI18N
        btn_3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yu.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 215, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 280, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_sumActionPerformed

    private void btn_poActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_poActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_poActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String texto=txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        btn_ig.doClick();
    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resActionPerformed
        addNumber("-");
 
    }//GEN-LAST:event_btn_resActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pActionPerformed
        addNumber(".");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_pActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_ig.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_igActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igActionPerformed
        try{
            String resultado= se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch(Exception e){
            btn_c.doClick();
            
        }
    }//GEN-LAST:event_btn_igActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_ig;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_p;
    private javax.swing.JButton btn_po;
    private javax.swing.JButton btn_res;
    private javax.swing.JButton btn_sum;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private java.awt.TextField textField1;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
