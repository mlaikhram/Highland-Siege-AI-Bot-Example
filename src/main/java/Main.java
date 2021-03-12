import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import config.BotConfig;
import listener.MyGameBotListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("bot.yml");    // TODO: Be sure to create this file, and have one entry for the bot token (token: <your secret bot token>)
        BotConfig config = new ObjectMapper(new YAMLFactory()).readValue(file, BotConfig.class);
        JDA jda = JDABuilder.createDefault(config.getToken())
                .addEventListeners(new MyGameBotListener())
                .setActivity(Activity.playing("Highland Siege"))
                .build();
        jda.awaitReady();
    }
}
