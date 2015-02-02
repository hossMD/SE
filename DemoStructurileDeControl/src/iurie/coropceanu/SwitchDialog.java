package iurie.coropceanu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author iurasun
 */
public class SwitchDialog extends JFrame{

    boolean isSaved=true;
    
    JTextArea jTextArea =new JTextArea();
    
    
    public SwitchDialog()  {
       
        add(new JScrollPane(jTextArea));
      //  this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent e) {
                
                if(jTextArea.getText().length() > 0 ){
                   isSaved=false;
                }
                
                
                
                if(!isSaved){
                    
                    int alegerea = JOptionPane.showConfirmDialog(rootPane, "NU ai salvat.. vrei acum? ", "TIUtttlu", 
                           JOptionPane.YES_NO_CANCEL_OPTION   );
                    
                    
                    switch(alegerea){
                        case JOptionPane.YES_OPTION:   
                            System.out.println("ca si cun acum salvez .. ./ ");
                            System.exit(0);
                            //break;
                    
                        case JOptionPane.NO_OPTION:   
                            System.out.println("NU salvez .. ./ ");
                            System.exit(0);
                            //break;
                            
//                            
//                            case JOptionPane.CANCEL_OPTION:   
//                            System.out.println("inapoi la lucru de editare ");
//                            break;  
                    }
                    
                } 
                
                 //JOptionPane.showMessageDialog(rootPane, "Si chiar iesi?");
                
            }
        });
        
        
        
        setTitle("Titlul aplicatiei mele");
        setSize( 800, 600);
        setVisible(true);
    
    }

    
    

    public static void main(String[] args) {
      SwitchDialog frame = new SwitchDialog();
    }
    
}
