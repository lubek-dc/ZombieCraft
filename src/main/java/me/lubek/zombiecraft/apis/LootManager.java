package me.lubek.zombiecraft.apis;

import dev.lone.itemsadder.api.ItemsAdder;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Random;


public class LootManager {
    public static List<ItemStack> GetLoot(int HowMany) {
        Random random = new Random();
        List<ItemStack> Loot = null;
        int max = 3;
        while (HowMany!=0) {
            HowMany--;
            int randomint = random.nextInt(max+1);
            if (randomint==1) {Loot.add(ItemsAdder.getCustomItem("medkit"));} // Med kit
            if (randomint==2) {Loot.add(ItemsAdder.getCustomItem("rock"));} // Rock
            if (randomint==3) {Loot.add(ItemsAdder.getCustomItem("stone_knife"));} // Stone Knife
        }
        return Loot;
    }
}
