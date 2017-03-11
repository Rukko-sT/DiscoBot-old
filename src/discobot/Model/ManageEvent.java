/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discobot.Model;

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
public class ManageEvent extends ListenerAdapter{
    
    private JDA jda = null;
    
    /**
     * Constructor
     * @param jda 
     */
    public ManageEvent(JDA jda) {
        if (jda != null) {
            this.jda = jda;
        }
    }
    
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.println("Message GET :");
        Guild guild = event.getGuild();
        
        User author = event.getAuthor();
        Member member = event.getMember();
        
        MessageChannel channel = event.getChannel();
        ChannelType channelType = event.getChannelType();
        
        Group group = event.getGroup();
        
        TextChannel textChannel = event.getTextChannel();
        Message message = event.getMessage();
        
        //System.out.println("Guild : "          + guild);        // le nom dela guilde d'ou proviens le message
        //System.out.println("User : "           + author);       // le nom d'utilisateur de l'envoyeur
        //System.out.println("Member : "         + member);       // le nom du membre sur le serveur ?
        //System.out.println("MessageChannel : " + channel);      // le nom du chan ou est envoyé le message
        //System.out.println("ChannelType : "    + channelType);  // le type du channel (VOICE/TEXT) ?
        //System.out.println("Group : "          + group);        // ??
        //System.out.println("TextChannel : "    + textChannel);  // le nom du chan ou est envoyé le messge
        //System.out.println("Message : "        + message);      // le message
        //System.out.println("---------------------------");
        
        // Liste des systemes pour recuperer le nom + nickname (String)
        //////////////////////////////////////////////////////
        //System.out.println( "Author getName : " + author.getName());          // non
        //System.out.println( "Member toString: " + member.toString());         // recuperer psuedo
        //System.out.println( "Member nickname: " + member.getNickname());      // Meilleur pour recuperer pseudo 
        //System.out.println( "Member Eff Name: " + member.getEffectiveName()); // Meilleur pour recuperer nickname
        //////////////////////////////////////////////////////
        
        
    }
}
