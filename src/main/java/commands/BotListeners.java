package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class BotListeners extends ListenerAdapter {
    //Event Handler Message Received
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        //Can I just make it easier and make all of this stuff into like a nice comparable format before the equals?
        String rString = event.getMessage().getContentStripped();

        //I wanted to get rid of the mention part of the string, but I don't know how to do it tbh
        /*System.out.println(event.getMessage().getMentions();
        if (event.getMessage().getMentions() != null)   {
            rString.replace(event.getMessage().getMentions().toString(), "");
        }*/

        //All messages should probably check to see if the author is a bot.
        //Also want to make it so it only replies if it's on a certain server if possible?
        //Curious if I could make that happen
        /*System.out.println(event.getGuild());
        if (event.isFromGuild())    {
            System.out.println("Success");
        }*/
        if ((!event.getAuthor().isBot()))   {

            //Moonstone reaction
            if ((!event.getAuthor().isBot()) && event.getMessage().getContentStripped().equals("moonstone")) {
                event.getTextChannel().sendMessage("ill commit a hatecrime").addFile(new File("C:\\Users\\flaru\\Desktop\\dBot\\asd.jpg")).queue();
                //event.getTextChannel().sendMessage(event.getMessage().getContentDisplay()).queue();
            }

            //Twitch Reaction
            //What is locale.root?
            if (rString.contains("twitch") || rString.contains("rat") || rString.contains("cheese") || rString.contains("hard carry") || rString.contains("based")) {
                //Makes it so you'll never have the same picture back to back
                int lastInt = 0;
                int rngmoment = (int)(Math.random()*(11-1+1)+1);
                while (lastInt == rngmoment) {
                    rngmoment = (int)(Math.random()*(11-1+1)+1);
                }
                lastInt = rngmoment;
                File twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch4.png");
                switch(rngmoment)   {
                    case 1:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch1.png");
                        break;
                    case 2:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch2.png");
                        break;
                    case 3:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch3.png");
                        break;
                    case 4:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch4.png");
                        break;
                    case 5:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch5.png");
                        break;
                    case 6:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch6.png");
                        break;
                    case 7:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch7.png");
                        break;
                    case 8:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch8.png");
                        break;
                    case 9:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch9.png");
                        break;
                    case 10:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch10.png");
                        break;
                    case 11:
                        twitchBoi = new File("C:\\Users\\flaru\\Desktop\\dBot\\twitch\\twitch11.png");
                }
                event.getTextChannel().sendMessage(":zany_face:  **I WAS HIDING**  :rat:" + "\n\"" + event.getMessage().getContentDisplay() + "\"").addFile(twitchBoi).queue();
            }

            //Who asked Reaction
            if (rString.contains("who asked")) {
                event.getTextChannel().sendMessage("__Fear not my son__").addFile(new File("C:\\Users\\flaru\\Desktop\\dBot\\hayzeus.jpg")).queue();
            }
        }

    }
}
