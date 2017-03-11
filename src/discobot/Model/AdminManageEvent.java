/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discobot.Model;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.hooks.EventListener;

/**
 *
 * @author detof
 */
public class AdminManageEvent implements EventListener{

    private JDA jda = null;
    
    /**
     * Constructor
     * @param jda 
     */
    public AdminManageEvent(JDA jda) {
        this.jda = jda;
    }
    
    @Override
    public void onEvent(Event event) {
        
    }
    
}
