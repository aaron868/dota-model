package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class WarlockGolem2 extends NpcUnit {

    private static WarlockGolem2 instance;

    private final WarlockGolemFlamingFists ability1;
    private final WarlockGolemPermanentImmolation ability2;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final String baseClass;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int consideredHero;
    private final int hasInventory;
    private final int healthBarOffset;
    private final String idleSoundLoop;
    private final int isAncient;
    private final int isSummoned;
    private final String key;
    private final int magicalResistance;
    private final String model;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final int projectileSpeed;
    private final String soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final int statusMana;
    private final int statusManaRegen;
    private final String teamName;
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final String localizedName;
    private final int wearable;

    private WarlockGolem2() {
        ability1 = WarlockGolemFlamingFists.instance();
        ability2 = WarlockGolemPermanentImmolation.instance();
        armorPhysical = 9;
        attackAcquisitionRange = 5;
        attackAnimationPoint = .26;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 1;
        attackDamageMin = 1;
        attackRange = 225;
        attackRate = 1.2;
        baseClass = "npc_dota_warlock_golem";
        bountyGoldMax = 15;
        bountyGoldMin = 15;
        bountyXP = 98;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_LIGHT";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        consideredHero = 1;
        hasInventory = 0;
        healthBarOffset = 26;
        idleSoundLoop = "Hero_WarlockGolem.Spawn_Loop";
        isAncient = 1;
        isSummoned = 1;
        key = "npc_dota_warlock_golem_2";
        magicalResistance = 33;
        model = "models/heroes/warlock/warlock_demon.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 34;
        projectileSpeed = 0;
        soundSet = "Hero_WarlockGolem";
        statusHealth = 12;
        statusHealthRegen = 5;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "golem";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 18;
        visionNighttimeRange = 18;
        voiceFile = "soundevents/voscripts/game_sounds_vo_warlock_golem.vsndevts";
        localizedName = "Warlock Golem Level 2";
        wearable = 8362;
    }

    public static WarlockGolem2 instance() {
        if( instance == null ){
            instance = new WarlockGolem2();
        }
        return instance;
    }

    public WarlockGolemFlamingFists getAbility1() {
        return ability1;
    }

    public WarlockGolemPermanentImmolation getAbility2() {
        return ability2;
    }

    public int getArmorPhysical() {
        return armorPhysical;
    }

    public int getAttackAcquisitionRange() {
        return attackAcquisitionRange;
    }

    public double getAttackAnimationPoint() {
        return attackAnimationPoint;
    }

    public String getAttackCapabilities() {
        return attackCapabilities;
    }

    public int getAttackDamageMax() {
        return attackDamageMax;
    }

    public int getAttackDamageMin() {
        return attackDamageMin;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public int getBountyGoldMax() {
        return bountyGoldMax;
    }

    public int getBountyGoldMin() {
        return bountyGoldMin;
    }

    public int getBountyXP() {
        return bountyXP;
    }

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
    }

    public int getConsideredHero() {
        return consideredHero;
    }

    public int getHasInventory() {
        return hasInventory;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public String getIdleSoundLoop() {
        return idleSoundLoop;
    }

    public int getIsAncient() {
        return isAncient;
    }

    public int getIsSummoned() {
        return isSummoned;
    }

    public String getKey() {
        return key;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public String getModel() {
        return model;
    }

    public int getModelScale() {
        return modelScale;
    }

    public String getMovementCapabilities() {
        return movementCapabilities;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String getSoundSet() {
        return soundSet;
    }

    public int getStatusHealth() {
        return statusHealth;
    }

    public double getStatusHealthRegen() {
        return statusHealthRegen;
    }

    public int getStatusMana() {
        return statusMana;
    }

    public int getStatusManaRegen() {
        return statusManaRegen;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getUnitLabel() {
        return unitLabel;
    }

    public String getUnitRelationshipClass() {
        return unitRelationshipClass;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
    }

    public String getVoiceFile() {
        return voiceFile;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getWearable() {
        return wearable;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WarlockGolem2))
            return false;
        if (object == this)
            return true;
        WarlockGolem2 otherObject = (WarlockGolem2) object;
        return otherObject.getKey().equals(getKey());
    }

}
