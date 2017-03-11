/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discobot.Model;

import discobot.PrivateInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

/**
 *
 * @author detof
 */
public class coreJDA {
    
    // Private
    //////////
    
    static String      ClientID        =   PrivateInfo.ClientID;
    static String      Token           =   PrivateInfo.Token;
    static String      ClientSecret    =   PrivateInfo.ClientSecret;
    
    // JDA
    //////
    
    JDA         jda     =   null;
    JDABuilder  builder =   null;
    
    /**
     * Fonction principal permetant
     * d'instancier le JDA
     */
    public coreJDA() {
        
        boolean initBuilder = this.initBuilder();
        
        if (initBuilder) {
            // Execution du reste du code
            /////////////////////////////
            try {
                jda = builder.buildBlocking();
            } catch (LoginException | IllegalArgumentException |
                    InterruptedException | RateLimitedException ex) {
                Logger.getLogger(coreJDA.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else {
            // Erreur
        }
    }
    
    /**
     * Initialisation du JDABuilder
     * @return indiquateur d validité
     */
    private boolean initBuilder() {
        boolean validitee = false;
        
        try {
            builder = new JDABuilder(AccountType.BOT);
            builder.setToken(Token);
            
            validitee = true;
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(coreJDA.class.getName()).log(Level.SEVERE, null, ex);
            validitee = false;
        }
        
        return validitee;
    }

    /**
     * getter du JDA
     * @return 
     */
    public JDA getJda() {
        return jda;
    }
}
