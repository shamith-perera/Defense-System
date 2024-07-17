/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.defence.mainunit;

import com.defence.maincontroller.MainControllerInterface;
import com.defence.utilities.Strength;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

/**
 *
 * @author shami
 */
public abstract class SuperDefence extends javax.swing.JFrame implements com.defence.utilities.DefenceObserver {

    protected String unitName;
    protected boolean isPostioned;
    protected final MainControllerInterface mainControllerInterface;
    protected Strength warStrength;
    protected boolean trackingEnabled;

    /**
     * Creates new form SuperDefnce
     *
     * @param unitName
     * @param mainControllerInterface
     */
    public SuperDefence(String unitName, MainControllerInterface mainControllerInterface) {
        this.unitName = unitName;
        this.mainControllerInterface = mainControllerInterface;
        this.warStrength = Strength.CLOSED;
        this.isPostioned = false;
        this.trackingEnabled = false;
        initComponents();
        ImageIcon windowIcon = new ImageIcon("src/com/defence/icons/defence.png");
        setIconImage(windowIcon.getImage());
        setTitle(unitName);
        unitNameTitle.setText(unitName);
        areaStatusLabel.setText("Not Cleared");
    }
    @Override
    public String toString() {
        return unitName;
    }

    @Override
    public void setAreaStatus(boolean status) {
        this.areaStatusLabel.setText(status ? "Cleared" : "Not Cleared");
    }

    @Override
    public void sendMsg(String msg) {
        recievedMsgDisplay.append(msg + "\n");
    }

    @Override
    public String getName() {
        return this.unitName;
    }

    @Override
    public final void sendStrength(Strength strength) {

        this.warStrength = strength;
        if (isPostioned) {
            unlockOperationsAccordingToStrength();
        }
    }
    
    @Override
    public final void setTracking(boolean value){
         trackingEnabled = value;
         if(trackingEnabled){
              mainControllerInterface.sendStatusReport(generateStatusReport());
         }
     }

    protected abstract void unlockOperationsAccordingToStrength();

    protected abstract void disableAllOperations();
    
    protected abstract String generateStatusReport();
    
    protected final void unitStatusChanged(){
        if(trackingEnabled){
            mainControllerInterface.sendStatusReport(generateStatusReport());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unitNameTitle = new javax.swing.JLabel();
        supplyStatusScrollPane = new javax.swing.JScrollPane();
        supplyStatusPanel = new javax.swing.JPanel();
        areaStatusPanel = new javax.swing.JPanel();
        areaStatusTitle = new javax.swing.JLabel();
        areaStatusLabel = new javax.swing.JLabel();
        sendMessagePanel = new javax.swing.JPanel();
        msgSendScrollPane = new javax.swing.JScrollPane();
        msgToSend = new javax.swing.JTextArea();
        sendMsgBtn = new javax.swing.JButton();
        sendMsgTitle = new javax.swing.JLabel();
        recievedMsgPanel = new javax.swing.JPanel();
        recievedMsgScrollPane = new javax.swing.JScrollPane();
        recievedMsgDisplay = new javax.swing.JTextArea();
        recMsgTitle = new javax.swing.JLabel();
        positionPanel = new javax.swing.JPanel();
        positionCheckBox = new javax.swing.JCheckBox();
        suplyStatusTitle = new javax.swing.JLabel();
        operationsTitle = new javax.swing.JLabel();
        operationsScrollPane = new javax.swing.JScrollPane();
        operationsBtnPanel = new javax.swing.JPanel();
        unitStatusTitle = new javax.swing.JLabel();
        unitStatusScrollPane = new javax.swing.JScrollPane();
        unitStatusPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 0));
        setResizable(false);

        unitNameTitle.setBackground(new java.awt.Color(0, 204, 153));
        unitNameTitle.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        unitNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitNameTitle.setText("Unit Name");
        unitNameTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        unitNameTitle.setFocusable(false);
        unitNameTitle.setOpaque(true);

        supplyStatusScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        supplyStatusScrollPane.setMinimumSize(new java.awt.Dimension(16, 6));

        supplyStatusPanel.setBackground(new java.awt.Color(204, 204, 204));
        supplyStatusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        supplyStatusPanel.setMaximumSize(new java.awt.Dimension(234, 137));
        supplyStatusPanel.setMinimumSize(new java.awt.Dimension(234, 137));
        supplyStatusPanel.setLayout(new java.awt.GridLayout(0, 1));
        supplyStatusScrollPane.setViewportView(supplyStatusPanel);

        areaStatusPanel.setBackground(new java.awt.Color(204, 204, 204));
        areaStatusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        areaStatusPanel.setPreferredSize(new java.awt.Dimension(191, 45));

        areaStatusTitle.setBackground(new java.awt.Color(110, 161, 113));
        areaStatusTitle.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        areaStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaStatusTitle.setText("Area Status");
        areaStatusTitle.setPreferredSize(new java.awt.Dimension(75, 25));

        areaStatusLabel.setBackground(new java.awt.Color(204, 0, 0));
        areaStatusLabel.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        areaStatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        areaStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        areaStatusLabel.setOpaque(true);

        javax.swing.GroupLayout areaStatusPanelLayout = new javax.swing.GroupLayout(areaStatusPanel);
        areaStatusPanel.setLayout(areaStatusPanelLayout);
        areaStatusPanelLayout.setHorizontalGroup(
            areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaStatusPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(areaStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        areaStatusPanelLayout.setVerticalGroup(
            areaStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(areaStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaStatusPanelLayout.createSequentialGroup()
                .addComponent(areaStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sendMessagePanel.setBackground(new java.awt.Color(204, 204, 204));
        sendMessagePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        msgToSend.setColumns(20);
        msgToSend.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        msgToSend.setLineWrap(true);
        msgToSend.setRows(5);
        msgSendScrollPane.setViewportView(msgToSend);

        sendMsgBtn.setBackground(new java.awt.Color(255, 255, 204));
        sendMsgBtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        sendMsgBtn.setText("Send");
        sendMsgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMsgBtnActionPerformed(evt);
            }
        });

        sendMsgTitle.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        sendMsgTitle.setText("Send to Main Controller");

        javax.swing.GroupLayout sendMessagePanelLayout = new javax.swing.GroupLayout(sendMessagePanel);
        sendMessagePanel.setLayout(sendMessagePanelLayout);
        sendMessagePanelLayout.setHorizontalGroup(
            sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgSendScrollPane)
                    .addGroup(sendMessagePanelLayout.createSequentialGroup()
                        .addComponent(sendMsgTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendMsgBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sendMessagePanelLayout.setVerticalGroup(
            sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sendMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendMsgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sendMessagePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sendMsgTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msgSendScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        recievedMsgPanel.setBackground(new java.awt.Color(204, 204, 204));
        recievedMsgPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        recievedMsgDisplay.setEditable(false);
        recievedMsgDisplay.setBackground(new java.awt.Color(204, 255, 255));
        recievedMsgDisplay.setColumns(20);
        recievedMsgDisplay.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        recievedMsgDisplay.setLineWrap(true);
        recievedMsgDisplay.setRows(5);
        recievedMsgScrollPane.setViewportView(recievedMsgDisplay);

        recMsgTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        recMsgTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recMsgTitle.setText("Main Controller Messages");

        javax.swing.GroupLayout recievedMsgPanelLayout = new javax.swing.GroupLayout(recievedMsgPanel);
        recievedMsgPanel.setLayout(recievedMsgPanelLayout);
        recievedMsgPanelLayout.setHorizontalGroup(
            recievedMsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievedMsgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recievedMsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recMsgTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recievedMsgScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        recievedMsgPanelLayout.setVerticalGroup(
            recievedMsgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recievedMsgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recMsgTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recievedMsgScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        positionPanel.setBackground(new java.awt.Color(204, 204, 204));
        positionPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        positionCheckBox.setBackground(new java.awt.Color(204, 204, 204));
        positionCheckBox.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        positionCheckBox.setText("Postion");
        positionCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout positionPanelLayout = new javax.swing.GroupLayout(positionPanel);
        positionPanel.setLayout(positionPanelLayout);
        positionPanelLayout.setHorizontalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, positionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(positionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        positionPanelLayout.setVerticalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, positionPanelLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(positionCheckBox))
        );

        suplyStatusTitle.setBackground(new java.awt.Color(110, 161, 113));
        suplyStatusTitle.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        suplyStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suplyStatusTitle.setText("Supply Status");
        suplyStatusTitle.setPreferredSize(new java.awt.Dimension(102, 25));

        operationsTitle.setBackground(new java.awt.Color(110, 161, 113));
        operationsTitle.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        operationsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operationsTitle.setText("Operations");
        operationsTitle.setPreferredSize(new java.awt.Dimension(102, 25));

        operationsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        operationsScrollPane.setMinimumSize(new java.awt.Dimension(16, 6));

        operationsBtnPanel.setBackground(new java.awt.Color(204, 204, 204));
        operationsBtnPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        operationsBtnPanel.setMaximumSize(new java.awt.Dimension(234, 137));
        operationsBtnPanel.setMinimumSize(new java.awt.Dimension(234, 137));
        operationsBtnPanel.setLayout(new java.awt.GridLayout(0, 1));
        operationsScrollPane.setViewportView(operationsBtnPanel);

        unitStatusTitle.setBackground(new java.awt.Color(110, 161, 113));
        unitStatusTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        unitStatusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitStatusTitle.setText("Unit Status");
        unitStatusTitle.setPreferredSize(new java.awt.Dimension(250, 35));

        unitStatusScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        unitStatusPanel.setBackground(new java.awt.Color(204, 204, 204));
        unitStatusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        unitStatusScrollPane.setViewportView(unitStatusPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(positionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(unitNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recievedMsgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(suplyStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(operationsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addComponent(operationsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sendMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supplyStatusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitStatusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suplyStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitStatusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(supplyStatusScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operationsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operationsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(unitStatusScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(unitNameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(recievedMsgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendMsgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMsgBtnActionPerformed
        // TODO add your handling code here:
        if (!msgToSend.getText().equals("")) {
            mainControllerInterface.sendMsg(unitName + " : " + msgToSend.getText());
            msgToSend.setText("");
        }else{
             JOptionPane.showMessageDialog(this, "Can not Send Empty Message", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sendMsgBtnActionPerformed

    private void positionCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionCheckBoxActionPerformed
        // TODO add your handling code here:
        isPostioned = positionCheckBox.isSelected();
        mainControllerInterface.sendMsg(unitName + " : " + (isPostioned ? "Positioned" : "Left Position"));
        if (isPostioned) {
            unlockOperationsAccordingToStrength();
        } else {
            disableAllOperations();
        }
    }//GEN-LAST:event_positionCheckBoxActionPerformed

    public final void addSpinnerToSupplyStatusPanel(JSpinner spinner, String Label, int max, int min, int defaultVal) {
        spinner.setFont(new java.awt.Font("Calibri", 1, 12));
        spinner.setModel(new javax.swing.SpinnerNumberModel(defaultVal, min, max, 1));
        spinner.setPreferredSize(new java.awt.Dimension(40, 22));
        ((JSpinner.DefaultEditor) spinner.getEditor()).getTextField().setEditable(false);

        JLabel spinnerLabel = new JLabel();
        spinnerLabel.setFont(new java.awt.Font("Calibri", 1, 12));
        spinnerLabel.setText(Label);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(spinner);
        panel.add(spinnerLabel);
        supplyStatusPanel.add(panel);
    }

    public final void addButtonToOperationsPanel(JButton button) {
        button.setFont(new java.awt.Font("Calibri", 1, 12));
        button.setPreferredSize(new java.awt.Dimension(175, 25));
        button.setBackground(new java.awt.Color(0, 204, 204));
        button.setEnabled(false);
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(button);
        operationsBtnPanel.add(panel);
    }

    public final void addSliderToUnistStatusPanel(JSlider slider, String label, int min, int max, int defVal) {
        slider.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(2);
        slider.setOrientation(javax.swing.JSlider.VERTICAL);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setFocusable(false);
        slider.setOpaque(false);
        slider.setPreferredSize(new java.awt.Dimension(46, 280));
        slider.setValue(defVal);
        slider.setMaximum(max);
        slider.setMinimum(min);
        JLabel sliderLabel = new JLabel(label);
        sliderLabel.setFont(new java.awt.Font("Calibri", 1, 12));
        sliderLabel.setOpaque(false);
        sliderLabel.setHorizontalAlignment(JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add("North", slider);
        panel.add("South", sliderLabel);
        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setPreferredSize(new java.awt.Dimension(76, 300));
        unitStatusPanel.add(panel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaStatusLabel;
    private javax.swing.JPanel areaStatusPanel;
    private javax.swing.JLabel areaStatusTitle;
    private javax.swing.JScrollPane msgSendScrollPane;
    private javax.swing.JTextArea msgToSend;
    private javax.swing.JPanel operationsBtnPanel;
    private javax.swing.JScrollPane operationsScrollPane;
    private javax.swing.JLabel operationsTitle;
    private javax.swing.JCheckBox positionCheckBox;
    private javax.swing.JPanel positionPanel;
    private javax.swing.JLabel recMsgTitle;
    private javax.swing.JTextArea recievedMsgDisplay;
    private javax.swing.JPanel recievedMsgPanel;
    private javax.swing.JScrollPane recievedMsgScrollPane;
    private javax.swing.JPanel sendMessagePanel;
    private javax.swing.JButton sendMsgBtn;
    private javax.swing.JLabel sendMsgTitle;
    private javax.swing.JLabel suplyStatusTitle;
    private javax.swing.JPanel supplyStatusPanel;
    private javax.swing.JScrollPane supplyStatusScrollPane;
    protected javax.swing.JLabel unitNameTitle;
    private javax.swing.JPanel unitStatusPanel;
    private javax.swing.JScrollPane unitStatusScrollPane;
    private javax.swing.JLabel unitStatusTitle;
    // End of variables declaration//GEN-END:variables

}
