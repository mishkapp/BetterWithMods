package betterwithmods.common.blocks.tile;

import betterwithmods.common.registry.bulk.manager.CrucibleManager;
import betterwithmods.common.registry.bulk.manager.StokedCrucibleManager;

public class TileEntityCrucible extends TileEntityCookingPot {
    public TileEntityCrucible() {
        super(CrucibleManager.getInstance(), StokedCrucibleManager.getInstance());
    }

    @Override
    public boolean validateStoked() {
        if (containsExplosives())
            return false;
        return StokedCrucibleManager.getInstance().getCraftingResult(inventory) != null;
    }

    @Override
    public boolean validateUnstoked() {
        return CrucibleManager.getInstance().getCraftingResult(inventory) != null;
    }

    @Override
    public String getName() {
        return "inv.crucible.name";
    }

}
