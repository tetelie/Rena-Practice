package fr.tetelie.practice.setting.settings;

import fr.tetelie.practice.setting.Setting;
import org.bukkit.entity.Player;

public class KillEffect extends Setting {

    @Override
    public int slot() {
        return 23;
    }

    @Override
    public String[] values() {
        return new String[]{"none", "smoke"};
    }

    @Override
    public void change(Player player, int value) {

    }

}
