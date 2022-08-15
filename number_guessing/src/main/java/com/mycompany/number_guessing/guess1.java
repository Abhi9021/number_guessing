/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number_guessing;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class guess1 {
      public  void _centerframe(JFrame frame){
        Rectangle rec=frame.getBounds();
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width-rec.width)/2,(dim.height - rec.height)/2);
        
    }
    public void setIconFrame(JFrame frame){
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/guess.png")));
    }
    public static void _integeronly(KeyEvent evt){
        char _character;
        _character = evt.getKeyChar();
        if(Character.isDigit(_character)
                || _character==KeyEvent.VK_SPACE
                || _character==KeyEvent.VK_DELETE
                || _character==KeyEvent.VK_SLASH
                ){
        }else
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }
    public static void _message(String message,int errorTye){
        switch(errorTye)
        {
            case 0:
                JOptionPane.showMessageDialog(null, message,"ERROR",JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                 JOptionPane.showMessageDialog(null, message,"SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                 JOptionPane.showMessageDialog(null, message,"WARNING",JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
            
        }
    }
    
}
