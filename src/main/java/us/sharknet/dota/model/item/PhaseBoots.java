package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class PhaseBoots extends Item {

    private static PhaseBoots instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String itemDeclarations;
    private final String itemQuality;
    private final String[] itemShopTags;
    private final String key;
    private final int bonus_attack_speed;
    private final int bonus_damage;
    private final int bonus_movement_speed;
    private final String localizedName;
    private final double phase_duration;
    private final int phase_movement_speed;
    private final int phase_movement_speed_range;

    private PhaseBoots() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = 8;
        iD = 5;
        itemAliases = "phase boots";
        itemCost = 129;
        itemDeclarations = "DECLARE_PURCHASES_TO_SPECTATORS";
        itemQuality = "common";
        itemShopTags = new String[]{"damage","move_speed","hard_to_tag"};
        key = "item_phase_boots";
        bonus_attack_speed = 0;
        bonus_damage = 24;
        bonus_movement_speed = 5;
        localizedName = "Phase Boots";
        phase_duration = 2.5;
        phase_movement_speed = 24;
        phase_movement_speed_range = 2;
    }

    public static PhaseBoots instance() {
        if( instance == null ){
            instance = new PhaseBoots();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String[] getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double getPhaseDuration() {
        return phase_duration;
    }

    public int getPhaseMovementSpeed() {
        return phase_movement_speed;
    }

    public int getPhaseMovementSpeedRange() {
        return phase_movement_speed_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhaseBoots))
            return false;
        if (object == this)
            return true;
        PhaseBoots otherObject = (PhaseBoots) object;
        return otherObject.getKey().equals(getKey());
    }

}
