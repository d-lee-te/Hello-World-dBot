package me.dBot;

import commands.BotCommands;
import commands.BotListeners;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;

import javax.security.auth.login.LoginException;

public class dBot {


    public static void main(String[] args) throws LoginException, InterruptedException {

        JDA jda = JDABuilder.createDefault("OTc3NzY5NTQzNzkzNTI0Nzg4.Ggayql.xmDH0rhl_14Ddyt3dA-FZbLnKDL1Ji96_fdnr4")
                .setActivity(Activity.listening("the screams of the dead"))
                .addEventListeners(new BotCommands(), new BotListeners())
                .build().awaitReady();

        //Global Commands
        //the upsertCommand just isn't working for me? Not sure why...
        CommandListUpdateAction gCommands = jda.updateCommands();
        gCommands.addCommands(Commands.slash("sayhi", "say hi to the puff"));
        gCommands.queue();

        //Guild Commands
        Guild clueless = jda.getGuildById("920012207553642587");
        Guild skylight = jda.getGuildById("749425177028460574");
        Guild me = jda.getGuildById("852197730239643719");

        //The different Guild's and their individual commands?

        //Clueless Commands
        if (clueless != null) {
            /*guild.upsertCommand("scream", "J, what are you smoking!?!")
                    .queue();*/
            CommandListUpdateAction clueCommands = clueless.updateCommands();
            clueCommands.addCommands(Commands.slash("smoke", "you're empowering it"));
            clueCommands.queue();
            //Haven't made this one yet
            clueCommands.addCommands(Commands.slash("screech", "how are you making that noise?"));
            clueCommands.queue();
        }
        //Skylight Commands
        if (skylight != null) {
            CommandListUpdateAction skyCommands = skylight.updateCommands();
            skyCommands.addCommands(Commands.slash("smoke", "you're empowering it"));
            skyCommands.queue();
        }
        //My Server's commands
        if (me != null) {
            CommandListUpdateAction meCommands = me.updateCommands();
            meCommands.addCommands(Commands.slash("smoke", "you're empowering it"));
            meCommands.queue();
        }

    }



}
