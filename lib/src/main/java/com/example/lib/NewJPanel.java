package com.example.lib;

public class NewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    NewJFrame n2=null;
    public NewJPanel(NewJFrame n2) {
        initComponents();
        this.n2=n2;//通過建構函式接收之前傳過來的面板
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();//新增按鈕
        jButton1.setText("測試1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                NewJPanel2 p1=new NewJPanel2(n2);//新建面板NewJPanel2，並將視窗n2傳入
                setVisible(false);//隱藏當前面板
                n2.add(p1);//在視窗中新增面板p1
                n2.setVisible(true);//顯示面板
            }
        });
        //https://blog.xuite.net/reshenchen/computer/30596064-java+GroupLayout+%E6%95%99%E5%AD%B8
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160)
                                .addComponent(jButton1)
                                .addContainerGap(400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160)
                                .addComponent(jButton1)
                                .addContainerGap(400, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    // End of variables declaration
}
