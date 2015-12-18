package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class SandKing extends Hero {

    private static SandKing instance;

    private final SandkingBurrowstrike ability1;
    private final SandkingSandStorm ability2;
    private final SandkingCausticFinale ability3;
    private final SandkingEpicenter ability4;
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
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String key;
    private final String lastHitChallengeRival;
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

    private SandKing() {
        ability1 = SandkingBurrowstrike.instance();
        ability2 = SandkingSandStorm.instance();
        ability3 = SandkingCausticFinale.instance();
        ability4 = SandkingEpicenter.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .53;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 25;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.1;
        attributeBaseAgility = 19;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.6;
        banSound = "sandking_skg_anger_06";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{216,174,46};
        heroID = 16;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Sandking.Pick";
        heroUnlockOrder = 1;
        key = "npc_dota_hero_sand_king";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        model = "models/heroes/sand_king/sand_king.vmdl";
        modelScale = .84;
        movementSpeed = 300;
        movementTurnRate = .5;
        nameAliases = "sk";
        pickSound = "sandking_skg_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_sandking";
        role = new String[]{"Initiator","Disabler","Nuker","Escape","Jungler"};
        rolelevels = new int[]{3,2,2,2,1};
        soundSet = "Hero_SandKing";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_sandking.vsndevts";
        active = true;
        localizedName = "Sand King";
        shortKey = "sand_king";
        url = "Sand_King";
    }

    public static SandKing instance() {
        if( instance == null ){
            instance = new SandKing();
        }
        return instance;
    }

    public SandkingBurrowstrike getAbility1() {
        return ability1;
    }

    public SandkingSandStorm getAbility2() {
        return ability2;
    }

    public SandkingCausticFinale getAbility3() {
        return ability3;
    }

    public SandkingEpicenter getAbility4() {
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

    public int getBotImplemented() {
        return botImplemented;
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

    public int getHeroPool1() {
        return heroPool1;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
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
        if (!(object instanceof SandKing))
            return false;
        if (object == this)
            return true;
        SandKing otherObject = (SandKing) object;
        return otherObject.getKey().equals(getKey());
    }

}
