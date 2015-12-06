package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DarkSeer extends Hero {

    private static DarkSeer instance;

    private final DarkSeerVacuum ability1;
    private final DarkSeerIonShell ability2;
    private final DarkSeerSurge ability3;
    private final DarkSeerWallOfReplica ability4;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final double attributeAgilityGain;
    private final int attributeBaseAgility;
    private final int attributeBaseIntelligence;
    private final int attributeBaseStrength;
    private final double attributeIntelligenceGain;
    private final String attributePrimary;
    private final double attributeStrengthGain;
    private final String banSound;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private DarkSeer() {
        ability1 = DarkSeerVacuum.instance();
        ability2 = DarkSeerIonShell.instance();
        ability3 = DarkSeerSurge.instance();
        ability4 = DarkSeerWallOfReplica.instance();
        armorPhysical = 5;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .59;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 37;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 12;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        banSound = "dark_seer_dkseer_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{203,86,255};
        heroID = 55;
        heroSelectSoundEffect = "Hero_DarkSeer.Pick";
        heroUnlockOrder = 3;
        iD = 55;
        idleExpression = "scenes/dark_seer/dark_seer_exp_idle_01.vcd";
        key = "npc_dota_hero_dark_seer";
        lastHitChallengeRival = "npc_dota_hero_earthshaker";
        loadoutScale = .85;
        model = "models/heroes/dark_seer/dark_seer.vmdl";
        modelScale = .74;
        movementSpeed = 300;
        movementTurnRate = .6;
        nameAliases = "ds";
        pickSound = "dark_seer_dkseer_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_dark_seer";
        role = new String[]{"Initiator","Jungler","Escape","Disabler"};
        rolelevels = new int[]{1,1,1,1};
        soundSet = "Hero_DarkSeer";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_dark_seer.vsndevts";
        active = true;
        localizedName = "Dark Seer";
        shortKey = "dark_seer";
        url = "Dark_Seer";
    }

    public static DarkSeer instance() {
        if( instance == null ){
            instance = new DarkSeer();
        }
        return instance;
    }

    public DarkSeerVacuum getAbility1() {
        return ability1;
    }

    public DarkSeerIonShell getAbility2() {
        return ability2;
    }

    public DarkSeerSurge getAbility3() {
        return ability3;
    }

    public DarkSeerWallOfReplica getAbility4() {
        return ability4;
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

    public double getAttributeAgilityGain() {
        return attributeAgilityGain;
    }

    public int getAttributeBaseAgility() {
        return attributeBaseAgility;
    }

    public int getAttributeBaseIntelligence() {
        return attributeBaseIntelligence;
    }

    public int getAttributeBaseStrength() {
        return attributeBaseStrength;
    }

    public double getAttributeIntelligenceGain() {
        return attributeIntelligenceGain;
    }

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public double getAttributeStrengthGain() {
        return attributeStrengthGain;
    }

    public String getBanSound() {
        return banSound;
    }

    public String getBoundsHullName() {
        return boundsHullName;
    }

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int[] getHeroGlowColor() {
        return heroGlowColor;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public int getID() {
        return iD;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
    }

    public double getLoadoutScale() {
        return loadoutScale;
    }

    public String getModel() {
        return model;
    }

    public double getModelScale() {
        return modelScale;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public String getNameAliases() {
        return nameAliases;
    }

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public String[] getRole() {
        return role;
    }

    public int[] getRolelevels() {
        return rolelevels;
    }

    public String getSoundSet() {
        return soundSet;
    }

    public String getTeam() {
        return team;
    }

    public String getVoiceFile() {
        return voiceFile;
    }

    public boolean isActive() {
        return active;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DarkSeer))
            return false;
        if (object == this)
            return true;
        DarkSeer otherObject = (DarkSeer) object;
        return otherObject.getKey().equals(getKey());
    }

}
