// Packages to import 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.util.*;

public class Player extends Board{ 
	
	private static int frameLocation;
	private ArrayList<Pokemon> pokeList;
    private JFrame frame = new JFrame();
    private JTable table = new JTable(
    		new DefaultTableModel(
    		new Object[][] {},
    		new Object[] {"Name", "HP", "Stage", "Energy", "Experience", "Element","Type", "Status", "ATK", "DEF"}));
    private  JScrollPane sp = new JScrollPane(table);
    private DefaultTableModel model = (DefaultTableModel)table.getModel();
   
    // Constructor 
    public Player(Board player, ArrayList<Pokemon> poke) {
    	
    	setPokeList(poke);
    	
    	frame.setTitle(player.getPlayername());
        frame.add(sp); 
        tableSetting();
        
    }
    
    //Setters//Getters
    public void setPokeList(ArrayList<Pokemon> poke) {
    	this.pokeList = poke;
    	model.setRowCount(0);
    	for (Pokemon a: pokeList) {
        	model.addRow(a.toObjectArray());
        }
    	refreshTable();
    }
	public int getFrameLocation() {
		return frameLocation;
	}

	public void setFrameLocation(int x) {
		Player.frameLocation = x;
	}
	
	//otherMethod
	public void refreshTable() {
		model.fireTableDataChanged();
	}
	
	public void tableSetting() {
        frame.setSize(1200, 400);
        table.setBounds(30, 40, 200, 300);
        frame.setVisible(true);
        table.setRowHeight(30);
        table.setFont(new Font("Serif", Font.PLAIN, 20));
        locate();
	}
	
	public void locate() {
		if (Player.frameLocation == 0) {
	        frame.setLocation(80, 100);
	        setFrameLocation(1);
		}else {
	        frame.setLocation(80, 500);
		}
	}
  
    // testError
//    public static void main(String[] args) 
//    {
//    	Board player1 = new Board("God");
//    	Board player2 = new Board("Jesus");
//		ArrayList<Pokemon>p1Poke = new ArrayList<Pokemon>();
//    	Pokemon poke1 = new Pokemon("Charmander",50	, 1, 24, 0, "red", "Attacking", "Flamethrower", "Active", 3);
//        p1Poke.add(poke1);
//    	Player n1 = new Player(player1, p1Poke);
//    	Player n2 = new Player(player2, p1Poke);
//    	
//    	p1Poke.get(0).decreaseHp(5);
//    	System.out.println(p1Poke);
//    	n1.setPokeList(p1Poke);
//    	
//    }
} 