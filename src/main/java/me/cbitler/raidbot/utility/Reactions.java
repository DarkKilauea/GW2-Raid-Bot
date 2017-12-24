package me.cbitler.raidbot.utility;

import me.cbitler.raidbot.RaidBot;
import net.dv8tion.jda.core.entities.Emote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reactions {
    /**
     * List of reactions representing classes
     */
    static String[] specs = {
            "DKTank", //387295988282556417
            "WardenTank", //387296167958151169
            "TemplarTank", //387296053659172869
            "NBTank", //387296192381321226
            "SorcTank", //387296013947502592
            "WardenHealer", //387296212421836800
            "TemplarHealer", //387296081823662081
            "OtherHealer", //387296176770121738
            "StamDK", // 387296044716916738
            "MagDK", //387296205488521216
            "StamWarden", //387296029533274113
            "MagWarden", //387296159716081664
            "StamSorc", //387296219988361218
            "MagSorc", //387296089340117002
            "Stamplar", //387296021710897152
            "Magplar", //387296184114610185
            "Stamblade", //387296061997318146
            "Magblade" //387296198928891905
    };

    /**
     * Get an emoji from it's emote name via JDA
     * @param name The name of the emoji
     * @return The emote object representing that emoji
     */
    private static Emote getEmoji(String name) {
        return RaidBot.getInstance().getJda().getEmotesByName(name, true).get(0);
    }

    /**
     * Get the list of reaction names as a list
     * @return The list of reactions as a list
     */
    public static List<String> getSpecs() {
        return new ArrayList<>(Arrays.asList(specs));
    }

    /**
     * Get the list of emote objects
     * @return The emotes
     */
    public static List<Emote> getEmotes() {
        return Arrays
                .stream(specs)
                .map(Reactions::getEmoji)
                .collect(Collectors.toList());
    }


}
