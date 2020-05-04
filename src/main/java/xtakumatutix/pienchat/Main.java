package xtakumatutix.pienchat;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;

public class Main extends PluginBase implements Listener{

    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onChat(PlayerChatEvent event){
        String chat = event.getMessage();
        String Message = chat + "ぴえん";
        event.setMessage(Message);
    }
}
