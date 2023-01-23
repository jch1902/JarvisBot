package com.sheepynova.JarvisBot;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;





public class Command extends ListenerAdapter
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws Exception
    {
    	
		JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
    	jda.addEventListener(new Command());
    }
	@Override
    public void onMessageReceived(MessageReceivedEvent evt) {
    	//Objects
    	User objUser = evt.getAuthor();
    	MessageChannel objMsgCh= evt.getChannel();
    	Message objMsg = evt.getMessage();
 
    	//commands
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"ping")) {
    		objMsgCh.sendMessage(objUser.getAsMention()+ " Pong!").queue();
    	}
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "is ")) {
    		objMsgCh.sendMessage(objUser.getAsMention() + " Of course he is!").queue();
    	}
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "clear")){
    		 objMsgCh.sendMessage("Sorry, this command is not working at the moment.").queue();
    	}
    	if(objMsg.getContentRaw().equalsIgnoreCase(Ref.prefix + "tts")) {
    		objMsgCh.sendMessage("/tts Hello there, my name is Jarvis.").queue();
    	}
    }

}
