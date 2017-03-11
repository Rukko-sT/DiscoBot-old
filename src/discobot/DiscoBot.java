/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discobot;

import discobot.Model.AdminManageEvent;
import discobot.Model.ManageEvent;
import discobot.View.ChatLog;
import discobot.Model.coreJDA;
import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 *
 * @author detof
 */
public class DiscoBot extends ListenerAdapter{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Mini cahier des charges :
         *  - utilisable seulement sur le chan selectionner
         * 
         *  - Systeme de credit
         *      - Gain lors de connextion dans un chan vocal ( x/min )
         *      - Possibilité de dépenser les credits gagnés :
         *          - Kick/Ban(?)/Mute(durée)
         *          - Choisir une musique en priorité ou la skipper
         */
        
        DiscoBot discoBot = new DiscoBot();
        discoBot.lancement();
    }
    
    /**
     * execution du code main
     * si erreur autre que 0 a la fin de l'execution
     * code info :
     *      0   :   aucun probleme
     * @return 
     */
    public int lancement() {
        int validitee = 0;
        
        // Initialisation du JDA
        coreJDA coreJda = new coreJDA();
        
        JDA jda = coreJda.getJda();
        if (jda != null) {
            ChatLog.jda = jda;
            
            ChatLog.Write("Ajout du listener");
            ManageEvent mEvent = new ManageEvent(jda);
            AdminManageEvent adminEvent = new AdminManageEvent(jda);
            jda.addEventListener(mEvent);
            jda.addEventListener(adminEvent);
            
            ChatLog.Write("Initialisation termineée");
            
            
        }
        return validitee;
    }
    
    // Information sur les events :
    ///////////////////////////////
    /**
     * 
     */
    
    
}
