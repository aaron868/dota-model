package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DrowRanger extends Hero {

    private static DrowRanger instance;

    private final DrowRangerFrostArrows ability1;
    private final DrowRangerWaveOfSilence ability2;
    private final DrowRangerTrueshot ability3;
    private final DrowRangerMarksmanship ability4;
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
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final int heroPool2;
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
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private DrowRanger() {
        ability1 = DrowRangerFrostArrows.instance();
        ability2 = DrowRangerWaveOfSilence.instance();
        ability3 = DrowRangerTrueshot.instance();
        ability4 = DrowRangerMarksmanship.instance();
        armorPhysical = -3;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .7;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 29;
        attackDamageMin = 18;
        attackRange = 625;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 26;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.9;
        banSound = "drowranger_dro_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 0;
        healthBarOffset = 130;
        heroGlowColor = new int[]{1,60,246};
        heroID = 6;
        heroPool1 = 1;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_DrowRanger.Pick";
        heroUnlockOrder = 0;
        iD = 6;
        idleExpression = "scenes/drowranger/drowranger_exp_idle_01.vcd";
        key = "npc_dota_hero_drow_ranger";
        lastHitChallengeRival = "npc_dota_hero_windrunner";
        loadoutScale = 1.1;
        model = "models/heroes/drow/drow.vmdl";
        modelScale = .97;
        movementSpeed = 300;
        movementTurnRate = .6;
        pickSound = "drowranger_dro_spawn_03";
        portrait = "vgui/hud/heroportraits/portrait_drowranger";
        projectileModel = "particles/units/heroes/hero_drow/drow_base_attack.vpcf";
        projectileSpeed = 1250;
        role = new String[]{"Carry","Disabler","Pusher"};
        rolelevels = new int[]{2,1,1};
        soundSet = "Hero_DrowRanger";
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_drowranger.vsndevts";
        active = true;
        localizedName = "Drow Ranger";
        new_player_enable = 1;
        shortKey = "drow_ranger";
        url = "Drow_Ranger";
    }

    public static DrowRanger instance() {
        if( instance == null ){
            instance = new DrowRanger();
        }
        return instance;
    }

    public DrowRangerFrostArrows getAbility1() {
        return ability1;
    }

    public DrowRangerWaveOfSilence getAbility2() {
        return ability2;
    }

    public DrowRangerTrueshot getAbility3() {
        return ability3;
    }

    public DrowRangerMarksmanship getAbility4() {
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public String getProjectileModel() {
        return projectileModel;
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

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
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
        if (!(object instanceof DrowRanger))
            return false;
        if (object == this)
            return true;
        DrowRanger otherObject = (DrowRanger) object;
        return otherObject.getKey().equals(getKey());
    }

}
