package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DragonKnight extends Hero {

    private static DragonKnight instance;

    private final DragonKnightBreatheFire ability1;
    private final DragonKnightDragonTail ability2;
    private final DragonKnightDragonBlood ability3;
    private final DragonKnightElderDragonForm ability4;
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
    private final int heroPool2;
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
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private DragonKnight() {
        ability1 = DragonKnightBreatheFire.instance();
        ability2 = DragonKnightDragonTail.instance();
        ability3 = DragonKnightDragonBlood.instance();
        ability4 = DragonKnightElderDragonForm.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 27;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 19;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.8;
        banSound = "dragon_knight_drag_anger_06";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 17;
        heroGlowColor = new int[]{209,143,71};
        heroID = 49;
        heroPool1 = 1;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_DragonKnight.Pick";
        heroUnlockOrder = 0;
        key = "npc_dota_hero_dragon_knight";
        lastHitChallengeRival = "npc_dota_hero_sven";
        model = "models/heroes/dragon_knight/dragon_knight.vmdl";
        modelScale = .84;
        movementSpeed = 29;
        movementTurnRate = .6;
        nameAliases = "dk";
        pickSound = "dragon_knight_drag_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_dragon_knight";
        projectileSpeed = 9;
        role = new String[]{"Carry","Pusher","Durable","Disabler","Initiator","Nuker"};
        rolelevels = new int[]{2,3,2,2,1,1};
        soundSet = "Hero_DragonKnight";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_dragon_knight.vsndevts";
        active = true;
        localizedName = "Dragon Knight";
        new_player_enable = 1;
        shortKey = "dragon_knight";
        url = "Dragon_Knight";
    }

    public static DragonKnight instance() {
        if( instance == null ){
            instance = new DragonKnight();
        }
        return instance;
    }

    public DragonKnightBreatheFire getAbility1() {
        return ability1;
    }

    public DragonKnightDragonTail getAbility2() {
        return ability2;
    }

    public DragonKnightDragonBlood getAbility3() {
        return ability3;
    }

    public DragonKnightElderDragonForm getAbility4() {
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

    public int getHeroPool2() {
        return heroPool2;
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

    public int getProjectileSpeed() {
        return projectileSpeed;
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

    public int getNewPlayerEnable() {
        return new_player_enable;
    }

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonKnight))
            return false;
        if (object == this)
            return true;
        DragonKnight otherObject = (DragonKnight) object;
        return otherObject.getKey().equals(getKey());
    }

}
