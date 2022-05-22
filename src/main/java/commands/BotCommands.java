package commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        //Gets me thinking...maybe converting each command into a value and then creating a switch
        //for the values to recognize commands might be more efficient than having the bot
        //actually go through each if command check
        if (event.getName().equals("sayhi"))   {
            event.reply("**hello world nerd**").queue();
        }   else if (event.getName().equals("smoke"))    {
            //Aparently, you can also defer replies, and I assume that's the same as telling discord a wait command
            event.reply("**puff**").queue();
        }
    }
}
