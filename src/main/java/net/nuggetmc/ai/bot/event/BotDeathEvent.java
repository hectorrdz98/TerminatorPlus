package net.nuggetmc.ai.bot.event;

import net.nuggetmc.ai.bot.Bot;
import org.bukkit.event.entity.PlayerDeathEvent;

public class BotDeathEvent extends PlayerDeathEvent {

    private final Bot bot;

    public BotDeathEvent(PlayerDeathEvent event, Bot bot) {
        super(event.getEntity(), event.getDrops(), event.getDroppedExp(), event.getDeathMessage());
        this.bot = bot;
    }

    public Bot getBot() {
        return bot;
    }
}
