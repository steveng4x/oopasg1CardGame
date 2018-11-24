// Packages to import 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
  
public class player1 { 
    // frame 
    JFrame f; 
    // Table 
    JTable j; 
  
    // Constructor 
    player1()
    { 
        // Frame initiallization 
        f = new JFrame(); 
  
        // Frame Title 
        f.setTitle("JTable Example"); 
  
        // Data to be displayed in the JTable 
        String[][] data = { 
           
        }; 
  
        // Column Names 
        String[] columnNames = { "Number", "HP", "Stage","Energy","Experience","Element","Type","Status","Hit Point" }; 
  
        // Initializing the JTable 
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300); 
  
        // adding it to JScrollPane 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        // Frame Size 
        f.setSize(10000, 10000); 
        // Frame Visible = true 
        f.setVisible(true); 
    } 
  
    // Driver  method 
    public static void main(String[] args) 
    { 
        new player1(); 
    } 
} 