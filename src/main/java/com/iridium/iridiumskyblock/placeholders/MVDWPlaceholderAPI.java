package com.iridium.iridiumskyblock.placeholders;

import be.maximvdw.placeholderapi.PlaceholderAPI;
import com.iridium.iridiumskyblock.IridiumSkyblock;

import java.util.Map;

public class MVDWPlaceholderAPI {

    public MVDWPlaceholderAPI() {
        for (Map.Entry<String, Placeholders.Placeholder> placeholder : Placeholders.placeholders.entrySet()) {
            PlaceholderAPI.registerPlaceholder(IridiumSkyblock.getInstance(), "iridiumskyblock_" + placeholder.getKey(), event -> {
                if (event.getPlayer() == null) {
                    return IridiumSkyblock.getInstance().getPlaceholders().unknownPlayer;
                }

                return placeholder.getValue().placeholderProcess(event.getPlayer());
            });
        }
        for (Map.Entry<String, Placeholders.Placeholder> placeholder : Placeholders.placeholders_np.entrySet()) {
            PlaceholderAPI.registerPlaceholder(IridiumSkyblock.getInstance(), "iridiumskyblock_" + placeholder.getKey(), event -> {
                return placeholder.getValue().placeholderProcess(event.getPlayer());
            });
        }
    }

}
