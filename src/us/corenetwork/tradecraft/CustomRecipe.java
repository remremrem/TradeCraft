package us.corenetwork.tradecraft;

import net.minecraft.server.v1_7_R1.Item;
import net.minecraft.server.v1_7_R1.ItemStack;
import net.minecraft.server.v1_7_R1.MerchantRecipe;
import net.minecraft.server.v1_7_R1.NBTTagCompound;

/**
 * Created by Matej on 5.3.2014.
 */
public class CustomRecipe extends MerchantRecipe {
    private boolean locked = false;
    private int tier = 0;
    private int tradesLeft = 1;

    public CustomRecipe(ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3) {
        super(itemStack, itemStack2, itemStack3);
    }

    public CustomRecipe(ItemStack itemStack, ItemStack itemStack2) {
        super(itemStack, itemStack2);
    }

    public CustomRecipe(ItemStack itemStack, Item item) {
        super(itemStack, item);
    }

    /**
     * Returns if trade is locked (cannot be traded)
     */
    @Override
    public boolean g() {
        return locked || tradesLeft <= 0;
    }

    public void lockManually()
    {
        locked = true;
    }

    public void removeManualLock()
    {
        locked = false;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getTradesLeft() {
        return tradesLeft;
    }

    public void setTradesLeft(int tradesLeft) {
        this.tradesLeft = tradesLeft;
    }

    public CustomRecipe(NBTTagCompound nbtTagCompound) {
        super(nbtTagCompound);
    }
}