/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

public class MainMenuPanel extends javax.swing.JPanel {
	private static final long serialVersionUID = -3250605153152509088L;
	private static final String[] difficulties = {"Easy", "Normal", "Hard", "Brutal"};
	private int diff;
	GUI gui;
	private boolean isEnabled;
	private static final int MAX_CHARACTERS_IN_NAME = 11;
	
	public MainMenuPanel(GUI gui) {
		initComponents();
		setSize(1280,800);
		this.gui = gui;
		isEnabled = false;
		setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        title = new javax.swing.JLabel();
        tfplayer1 = new javax.swing.JTextField();
        tfplayer2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butPlay = new javax.swing.JButton();
        jtComputerToggle = new javax.swing.JToggleButton();
        compDifficulty = new JComboBox<String>(difficulties);
        
        compDifficulty.setSelectedIndex(1);	// sets "Normal" as default choice
        compDifficulty.setVisible(false);

        setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Connect Four");

        tfplayer1.setText("Player 1");
        tfplayer1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (tfplayer1.getText().length() >= MAX_CHARACTERS_IN_NAME ) {	// limit textfield input
                    e.consume(); 												// ignores any additional inputs
                	tfplayer1.setText(tfplayer1.getText().substring(0, MAX_CHARACTERS_IN_NAME));	// sets name to substring
                }
            }  
        });

        tfplayer2.setText("Player 2");
        tfplayer2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (tfplayer2.getText().length() >= MAX_CHARACTERS_IN_NAME ) {	// limit textfield input
                    e.consume(); 												// ignores any additional inputs
                	tfplayer2.setText(tfplayer2.getText().substring(0, MAX_CHARACTERS_IN_NAME));	// sets name to substring
                }
            }  
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player 1:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 2:");

        butPlay.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        butPlay.setText("PLAY");
        butPlay.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        butPlayActionPerformed(evt);
                }
        });

        jtComputerToggle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jtComputerToggle.setText("Play Against Computer");
        jtComputerToggle.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jtComputerToggleActionPerformed(evt);
                }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(title)
                        .addGap(471, 471, 471))
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(378, 378, 378)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(tfplayer1))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(compDifficulty)
                                                        .addComponent(tfplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(524, 524, 524)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(butPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                .addComponent(jtComputerToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addContainerGap(379, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(title)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(compDifficulty)
                                .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtComputerToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(butPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(352, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void butPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayActionPerformed
        if (tfplayer1.getText().length() >= MAX_CHARACTERS_IN_NAME )	// if more than max character input
        	tfplayer1.setText(tfplayer1.getText().substring(0, MAX_CHARACTERS_IN_NAME));	// sets name to substring
        if (tfplayer2.getText().length() >= MAX_CHARACTERS_IN_NAME )	// if more than max character input
        	tfplayer2.setText(tfplayer2.getText().substring(0, MAX_CHARACTERS_IN_NAME));	// sets name to substring
        if(tfplayer1.getText().equals(tfplayer2.getText()) && tfplayer1.getText().length() > 0) { // if names are same and not empty
        	String tempName = tfplayer1.getText();
            if (tempName.length() >= MAX_CHARACTERS_IN_NAME-2)	// if more than max character input - 2
            	tempName = tempName.substring(0, MAX_CHARACTERS_IN_NAME-2);	// sets name to substring
        	tfplayer1.setText(tempName + "(1)");
        	tfplayer2.setText(tempName + "(2)");
        }
        // player names actually set below
		gui.setPlayer1Name(tfplayer1.getText().length()>0? tfplayer1.getText() : "Player 1");	// if player 1 has empty name, set name to "Player 1"
		gui.setPlayer2Name(tfplayer2.getText().length()>0? tfplayer2.getText() : "Player 2");	// if player 2 has empty name, set name to "Player 2"
		// wanted to use a switch statement below, but forgot how and don't have internet
		if(compDifficulty.getSelectedIndex() == 0)
			diff = 2;
		else if(compDifficulty.getSelectedIndex() == 2)
			diff = 6;
		else if(compDifficulty.getSelectedIndex() == 3)
			diff = 8;
		else
			diff = 4;
		gui.remove(this);
		gui.addGamePanel();
		gui.updateDisplay();
    }//GEN-LAST:event_butPlayActionPerformed

    private void jtComputerToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtComputerToggleActionPerformed
        if(!isEnabled){
			tfplayer2.setText("Computer");
			tfplayer2.setEditable(false);
			tfplayer2.setBackground(new java.awt.Color(50, 50, 50));	// grey out player 2 name box
	        compDifficulty.setVisible(true);
			isEnabled = true;
		}
		else{
			tfplayer2.setText("Player 2");
			tfplayer2.setEditable(true);
			tfplayer2.setBackground(new java.awt.Color(255, 255, 255));	// reset background of player 2 name box
	        compDifficulty.setVisible(false);
			isEnabled = false;
		}
    }//GEN-LAST:event_jtComputerToggleActionPerformed

	public boolean getIsEnabled() {
		return isEnabled;
	}
	public int getDiff() {
		return diff;
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> compDifficulty;
    private javax.swing.JToggleButton jtComputerToggle;
    private javax.swing.JTextField tfplayer1;
    private javax.swing.JTextField tfplayer2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
