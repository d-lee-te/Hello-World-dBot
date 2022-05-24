package commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class BotCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        //Gets me thinking...maybe converting each command into a value and then creating a switch
        //for the values to recognize commands might be more efficient than having the bot
        //actually go through each if command check

        //I don't think I can do this, and if I can, it's probably not as good as just using a switch statement
        //Maybe we don't have to .equals because we're dealing with exact cases?
        //This probably isn't very safe to say the least, but I like looking at switch vs nested if else's
        switch (event.getName())    {
            case "sayhi":
                event.reply("**hello world nerd**").queue();
                break;
            case "smoke":
                event.reply("**puff**").queue();
                break;
            case "screech":
                //How do I add a message to go along with the file?
                event.replyFile(new File("C:\\Users\\flaru\\Desktop\\dBot\\asd.jpg")).queue();
                //event.reply("aaaaaaaaaa").queue();
                break;
            default:
        }
    }
}
