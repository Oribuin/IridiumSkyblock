package com.iridium.iridiumskyblock.listeners;

import org.bukkit.event.Listener;

public class BlockFromToListener implements Listener {

//    Prevents liquid from flowing out of islands
//    This causes excessive lag on large servers
//    @EventHandler
//    public void onBlockFromTo(BlockFromToEvent event) {
//        IridiumSkyblock.getInstance().getIslandManager().getIslandViaLocation(event.getBlock().getLocation()).ifPresent(island -> {
//            if (event.getBlock().getType() == Material.WATER || event.getBlock().getType() == Material.LAVA) {
//                if(!island.isInIsland(event.getToBlock().getLocation())){
//                    event.setCancelled(true);
//                }
//
//                IslandSetting liquidFlowSettings = IridiumSkyblock.getInstance().getIslandManager().getIslandSetting(island, SettingType.LIQUID_FLOW);
//                if (!liquidFlowSettings.getBooleanValue()) {
//                    event.setCancelled(true);
//                }
//            }
//        });
//    }

}
