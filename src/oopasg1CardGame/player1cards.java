package oopasg1CardGame;

import java.util.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JFrame;

public class player1cards extends JFrame {
	public String columnheader;
	public String player_1cards;
	JTable Player1;
	
	String[] column_header= {"No.","Type","Stage","Experience","Hit Point","Energy","Energy Colour","Attack Point","Resistance Point","Status"};
	String[][] player1cards= {{"1","Defending","0","0","55","30","Red","-","3","Active"}};
	
	public player1cards()
	{ 
		Player1=new JTable(player1cards, column_header);
		Player1.setBounds(50,50,200,230);
		JScrollPane js=new JScrollPane(Player1);
		this.add(Player1);
		this.setSize(300,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new player1cards();
	}

}
