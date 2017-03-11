/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discobot.View;

import java.time.LocalTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

/**
 *
 * @author detof
 */
public class ChatLog {
    
    public static JDA jda           = null;
    public static String GuildLog   = "DiscoBot Test";
    public static String TextLog    = "d_log";
    
    public static void Write(String text) {
        LocalTime now = LocalTime.now();
        String finalText = "[" + now.getHour() + ":" + now.getMinute() + ":" + now.getSecond() + "] [Other] [TxT] :  " + text;
        System.out.println(finalText);
        
        if (jda != null) {
            List<Guild> guildsByName = jda.getGuildsByName(GuildLog, true);
            if (guildsByName.size() == 1) {
                Guild DiscoBotTest = guildsByName.get(0);
                
                List<TextChannel> textChannelsByName = DiscoBotTest.getTextChannelsByName(TextLog, true);
                
                if (textChannelsByName.size() == 1) {
                    TextChannel D_log = textChannelsByName.get(0);
                    
                    try {
                        D_log.sendMessage(finalText).block();
                    } catch (RateLimitedException ex) {
                        Logger.getLogger(ChatLog.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
    }
}
