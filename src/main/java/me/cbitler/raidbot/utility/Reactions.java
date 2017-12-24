package me.cbitler.raidbot.utility;

import me.cbitler.raidbot.RaidBot;
import net.dv8tion.jda.core.entities.Emote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reactions {
    /**
     * List of reactions representing classes
     */
    static String[] specs = {
            "DK Tank", //387295988282556417
            "Warden Tank", //387296167958151169
            "Templar Tank", //387296053659172869
            "NB Tank", //387296192381321226
            "Sorc Tank", //387296013947502592
            "Warden Healer", //387296212421836800
            "Templar Healer", //387296081823662081
            "Other Healer", //387296176770121738
            "StamDK", // 387296044716916738
            "MagDK", //387296205488521216
            "Stam Warden", //387296029533274113
            "Mag Warden", //387296159716081664
            "StamSorc", //387296219988361218
            "MagSorc", //387296089340117002
            "Stamplar", //387296021710897152
            "Magplar", //387296184114610185
            "Stamblade", //387296061997318146
            "Magblade" //387296198928891905
    };

    static Emote[] reactions = {
            getEmoji("387295988282556417"), // Dragonhunter
            getEmoji("387296167958151169"), // Firebrand
            getEmoji("387296053659172869"), // Herald
            getEmoji("387296192381321226"), // Renegade
            getEmoji("387296013947502592"), // Berserker
            getEmoji("387296212421836800"), // Spellbreaker
            getEmoji("387296081823662081"), // Scrapper
            getEmoji("387296176770121738"), // Holosmith
            getEmoji("387296044716916738"), // Druid
            getEmoji("387296205488521216"), // Soulbeast
            getEmoji("387296029533274113"), // Daredevil
            getEmoji("387296159716081664"), // Deadeye
            getEmoji("387296219988361218"), // Weaver
            getEmoji("387296089340117002"), // Tempest
            getEmoji("387296021710897152"), // Chronomancer
            getEmoji("387296184114610185"), // Mirage
            getEmoji("387296061997318146"), // Reaper
            getEmoji("387296198928891905"), // Scourge
            getEmoji("387346852867211274") // X_
    };

    /**
     * Get an emoji from it's emote ID via JDA
     * @param id The ID of the emoji
     * @return The emote object representing that emoji
     */
    private static Emote getEmoji(String id) {
        return RaidBot.getInstance().getJda().getEmoteById(id);
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
        return new ArrayList<>(Arrays.asList(reactions));
    }


}
