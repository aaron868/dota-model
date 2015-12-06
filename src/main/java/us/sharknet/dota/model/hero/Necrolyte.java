package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Necrolyte extends Hero {

    private static Necrolyte instance;

    private final NecrolyteDeathPulse ability1;
    private final NecrolyteHeartstopperAura ability2;
    private final NecrolyteSadist ability3;
    private final NecrolyteReapersScythe ability4;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
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
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Necrolyte() {
        ability1 = NecrolyteDeathPulse.instance();
        ability2 = NecrolyteHeartstopperAura.instance();
        ability3 = NecrolyteSadist.instance();
        ability4 = NecrolyteReapersScythe.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .53;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 26;
        attackDamageMin = 22;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2;
        banSound = "necrolyte_necr_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 160;
        heroGlowColor = new int[]{146,255,145};
        heroID = 36;
        heroSelectSoundEffect = "Hero_Necrolyte.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/necrolyte/necrolyte_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Necrolyte.IdleLoop";
        key = "npc_dota_hero_necrolyte";
        lastHitChallengeRival = "npc_dota_hero_lich";
        model = "models/heroes/necrolyte/necrolyte.vmdl";
        modelScale = .79;
        movementSpeed = 290;
        movementTurnRate = .5;
        pickSound = "necrolyte_necr_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_necrolyte";
        projectileModel = "particles/units/heroes/hero_necrolyte/necrolyte_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Nuker","Durable","Disabler"};
        rolelevels = new int[]{1,2,1,1};
        soundSet = "Hero_Necrolyte";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_necrolyte.vsndevts";
        active = true;
        localizedName = "Necrophos";
        new_player_enable = 1;
        shortKey = "necrolyte";
        url = "Necrophos";
    }

    public static Necrolyte instance() {
        if( instance == null ){
            instance = new Necrolyte();
        }
        return instance;
    }

    public NecrolyteDeathPulse getAbility1() {
        return ability1;
    }

    public NecrolyteHeartstopperAura getAbility2() {
        return ability2;
    }

    public NecrolyteSadist getAbility3() {
        return ability3;
    }

    public NecrolyteReapersScythe getAbility4() {
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

    public int getAttributeStrengthGain() {
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

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getIdleSoundLoop() {
        return idleSoundLoop;
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
        if (!(object instanceof Necrolyte))
            return false;
        if (object == this)
            return true;
        Necrolyte otherObject = (Necrolyte) object;
        return otherObject.getKey().equals(getKey());
    }

}
