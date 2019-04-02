/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfeutricolorerouge;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teufr
 */
public class RedState extends AbstractFeu {

    public RedState(ContextFeu context) {
        super(context);
    }

    @Override
    protected void handler() {
        this.getContext().getLabelImage().setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetfeutricolorerouge/images/rouge.jpg")));
        this.changerState();
    }

    @Override
    protected void changerState() {
        try {
            Thread.sleep(10000);
            this.getContext().setState(new GreenState(this.getContext()));
        } catch (InterruptedException ex) {
            Logger.getLogger(GreenState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
