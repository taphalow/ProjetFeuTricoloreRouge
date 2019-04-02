/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfeutricolorerouge;

/**
 *
 * @author teufr
 */
public abstract class AbstractFeu {
    private ContextFeu context;
    public AbstractFeu(ContextFeu context){
        this.context = context;
    }
    
    public ContextFeu getContext() {
        return this.context;
    }
	
    protected abstract void handler();
    protected abstract void changerState();
}
