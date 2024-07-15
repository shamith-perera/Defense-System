/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.defence.mainunit;
import com.defence.maincontroller.MainController;

/**
 *
 * @author shami
 */
public abstract class SuperDefence extends javax.swing.JFrame implements com.defence.utilities.DefenceObserver{
    protected String unitName;
    protected MainController mainController; 
    /**
     * Creates new form SuperDef
     * @param unitName
     * @param mainController
     */
    public SuperDefence(String unitName,MainController mainController) {
        this.unitName = unitName;
        this.mainController = mainController;
        setTitle(unitName);
        initComponents();
        unitNameLabel.setText(unitName);
        areaStatusMsg.setText("Not Cleared");
    }
    
     @Override
    public void setAreaStatus(int status){
        if(status==1){
            this.areaStatusMsg.setText("Cleard");
        }else{
            this.areaStatusMsg.setText("Not Cleared");
        }
    }
    
     @Override
    public void getMsg(String msg){
       recievedMsg.setText(recievedMsg.getText() + msg);
    }
    
     @Override
    public String getName(){
       return unitName;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        unitStatusPanel = new javax.swing.JPanel();
        unitStatusTitle = new javax.swing.JLabel();
        unitNameLabel = new javax.swing.JLabel();
        ControllingPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        supplyStatusPanel = new javax.swing.JPanel();
        suplyStatusTitle = new javax.swing.JLabel();
        areaStatusPanel = new javax.swing.JPanel();
        areaStatusTitle = new javax.swing.JLabel();
        areaStatusMsg = new javax.swing.JLabel();
        sendMessagePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgToSend = new javax.swing.JTextArea();
        sendMsg = new javax.swing.JButton();
        sendMsgTitle = new javax.swing.JLabel();
        recMsgPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recievedMsg = new javax.swing.JTextArea();
        recMsgTitle = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 0));
        setResizable(false);

        unitStatusPanel.setBackground(new java.awt.Color(204, 204, 204));
        unitStatusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        unitStatusTitle.setBackground(new java.awt.Color(110, 161, 113));
        unitStatusTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        unitStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitStatusTitle.setText("Unit Status");
        unitStatusTitle.setPreferredSize(new java.awt.Dimension(250, 35));
        unitStatusPanel.add(unitStatusTitle);

        unitNameLabel.setBackground(new java.awt.Color(0, 204, 153));
        unitNameLabel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        unitNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitNameLabel.setText("Unit Name");
        unitNameLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        unitNameLabel.setFocusable(false);
        unitNameLabel.setOpaque(true);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ControllingPanelLayout = new javax.swing.GroupLayout(ControllingPanel);
        ControllingPanel.setLayout(ControllingPanelLayout);
        ControllingPanelLayout.setHorizontalGroup(
            ControllingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControllingPanelLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControllingPanelLayout.setVerticalGroup(
            ControllingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControllingPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        supplyStatusPanel.setBackground(new java.awt.Color(204, 204, 204));
        supplyStatusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        supplyStatusPanel.setMaximumSize(new java.awt.Dimension(234, 137));
        supplyStatusPanel.setMinimumSize(new java.awt.Dimension(234, 137));

        suplyStatusTitle.setBackground(new java.awt.Color(110, 161, 113));
        suplyStatusTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        suplyStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suplyStatusTitle.setText("Supply Status");
        suplyStatusTitle.setPreferredSize(new java.awt.Dimension(250, 35));
        supplyStatusPanel.add(suplyStatusTitle);

        areaStatusPanel.setBackground(new java.awt.Color(204, 204, 204));
        areaStatusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        areaStatusPanel.setPreferredSize(new java.awt.Dimension(191, 45));

        areaStatusTitle.setBackground(new java.awt.Color(110, 161, 113));
        areaStatusTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        areaStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaStatusTitle.setText("Area Status");
        areaStatusTitle.setPreferredSize(new java.awt.Dimension(75, 25));

        areaStatusMsg.setBackground(new java.awt.Color(204, 0, 0));
        areaStatusMsg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        areaStatusMsg.setForeground(new java.awt.Color(255, 255, 255));
        areaStatusMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaStatusMsg.setOpaque(true);

        javax.swing.GroupLayout areaStatusPanelLayout = new javax.swing.GroupLayout(areaStatusPanel);
        areaStatusPanel.setLayout(areaStatusPanelLayout);
        areaStatusPanelLayout.setHorizontalGroup(
            areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaStatusMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        areaStatusPanelLayout.setVerticalGroup(
            areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(areaStatusTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(areaStatusMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap())
        );

        sendMessagePanel.setBackground(new java.awt.Color(204, 204, 204));
        sendMessagePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        msgToSend.setColumns(20);
        msgToSend.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        msgToSend.setLineWrap(true);
        msgToSend.setRows(5);
        jScrollPane3.setViewportView(msgToSend);

        sendMsg.setBackground(new java.awt.Color(0, 204, 204));
        sendMsg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sendMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/defence/icons/icons8-send-24.png"))); // NOI18N
        sendMsg.setText("Send");
        sendMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMsgActionPerformed(evt);
            }
        });

        sendMsgTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        sendMsgTitle.setText("Send to Main Controller");

        javax.swing.GroupLayout sendMessagePanelLayout = new javax.swing.GroupLayout(sendMessagePanel);
        sendMessagePanel.setLayout(sendMessagePanelLayout);
        sendMessagePanelLayout.setHorizontalGroup(
            sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMessagePanelLayout.createSequentialGroup()
                .addGroup(sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendMessagePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(sendMessagePanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(sendMsgTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendMessagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        sendMessagePanelLayout.setVerticalGroup(
            sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMessagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendMsgTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        recMsgPanel.setBackground(new java.awt.Color(204, 204, 204));
        recMsgPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        recievedMsg.setEditable(false);
        recievedMsg.setBackground(new java.awt.Color(255, 255, 255));
        recievedMsg.setColumns(20);
        recievedMsg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        recievedMsg.setLineWrap(true);
        recievedMsg.setRows(5);
        jScrollPane1.setViewportView(recievedMsg);

        recMsgTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        recMsgTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recMsgTitle.setText("Main Controller Messages");

        javax.swing.GroupLayout recMsgPanelLayout = new javax.swing.GroupLayout(recMsgPanel);
        recMsgPanel.setLayout(recMsgPanelLayout);
        recMsgPanelLayout.setHorizontalGroup(
            recMsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recMsgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recMsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recMsgTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        recMsgPanelLayout.setVerticalGroup(
            recMsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recMsgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recMsgTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ControllingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recMsgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unitNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sendMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(supplyStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(areaStatusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unitStatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ControllingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplyStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(recMsgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMsgActionPerformed
        // TODO add your handling code here:
        if(!msgToSend.getText().equals("")){
            mainController.getMsg(unitName+ " : " +msgToSend.getText());
        }
        msgToSend.setText("");
    }//GEN-LAST:event_sendMsgActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControllingPanel;
    private javax.swing.JLabel areaStatusMsg;
    private javax.swing.JPanel areaStatusPanel;
    private javax.swing.JLabel areaStatusTitle;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea msgToSend;
    private javax.swing.JPanel recMsgPanel;
    private javax.swing.JLabel recMsgTitle;
    private javax.swing.JTextArea recievedMsg;
    private javax.swing.JPanel sendMessagePanel;
    private javax.swing.JButton sendMsg;
    private javax.swing.JLabel sendMsgTitle;
    private javax.swing.JLabel suplyStatusTitle;
    protected javax.swing.JPanel supplyStatusPanel;
    private javax.swing.JLabel unitNameLabel;
    private javax.swing.JPanel unitStatusPanel;
    private javax.swing.JLabel unitStatusTitle;
    // End of variables declaration//GEN-END:variables
}
