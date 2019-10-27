
package mFinanceUI;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mFinanceFrame extends JFrame implements ActionListener {
   LoginUI loginUI;
   AutoLoanCategories autoLoanUI;
   MortgageLoanCategories mortgageLoanUi;
    
    public mFinanceFrame(){
        super("mFinance");
        
        loginUI = new LoginUI();
        getContentPane().add(loginUI,"Center");
        setSize (1000, 800);
        setVisible(true);
        setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
	
