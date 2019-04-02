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
public class OrangeState extends AbstractFeu {

    public OrangeState(ContextFeu context) {
        super(context);
    }

    @Override
    protected void handler() {
        this.getContext().getLabelImage().setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetfeutricolorerouge/images/jaune.jpg")));
        this.changerState();
    }

    @Override
    protected void changerState() {
        try {
            Thread.sleep(3000);
            this.getContext().setState(new RedState(this.getContext()));
        } catch (InterruptedException ex) {
            Logger.getLogger(GreenState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
