package me.cbitler.raidbot.commands;

import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;

public class InfoCommand implements Command {
    private final String information = "Stonehenge Trial Bot Information:\n" +
            "Originally by: VoidWhisperer#5905\n" +
            "Modified by: Acheron#3134\n" +
            "Contact me with any questions.";

    @Override
    public void handleCommand(String command, String[] args, TextChannel channel, User author) {
        channel.sendMessage(information).queue();
    }
}
