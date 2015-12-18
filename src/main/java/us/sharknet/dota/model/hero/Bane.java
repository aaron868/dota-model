package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Bane extends Hero {

    private static Bane instance;

    private final BaneEnfeeble ability1;
    private final BaneBrainSap ability2;
    private final BaneNightmare ability3;
    private final BaneFiendsGrip ability4;
    private final AttributeBonus ability5;
    private final BaneNightmareEnd ability6;
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
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int noCombine;
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
    private final String shortKey;
    private final String url;

    private Bane() {
        ability1 = BaneEnfeeble.instance();
        ability2 = BaneBrainSap.instance();
        ability3 = BaneNightmare.instance();
        ability4 = BaneFiendsGrip.instance();
        ability5 = AttributeBonus.instance();
        ability6 = BaneNightmareEnd.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 39;
        attackDamageMin = 33;
        attackRange = 400;
        attackRate = 1.7;
        attributeAgilityGain = 2.1;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.1;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.1;
        banSound = "bane_bane_anger_10";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 235;
        heroGlowColor = new int[]{207,106,125};
        heroID = 3;
        heroSelectSoundEffect = "Hero_Bane.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/bane/bane_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Bane.IdleLoop";
        key = "npc_dota_hero_bane";
        lastHitChallengeRival = "npc_dota_hero_lion";
        loadoutScale = .83;
        model = "models/heroes/bane/bane.vmdl";
        modelScale = .93;
        movementSpeed = 310;
        movementTurnRate = .6;
        noCombine = 1;
        pickSound = "bane_bane_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_bane";
        projectileModel = "particles/units/heroes/hero_bane/bane_projectile.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Disabler","Nuker","Durable"};
        rolelevels = new int[]{2,3,1,1};
        soundSet = "Hero_Bane";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_bane.vsndevts";
        active = true;
        localizedName = "Bane";
        shortKey = "bane";
        url = "Bane";
    }

    public static Bane instance() {
        if( instance == null ){
            instance = new Bane();
        }
        return instance;
    }

    public BaneEnfeeble getAbility1() {
        return ability1;
    }

    public BaneBrainSap getAbility2() {
        return ability2;
    }

    public BaneNightmare getAbility3() {
        return ability3;
    }

    public BaneFiendsGrip getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
    }

    public BaneNightmareEnd getAbility6() {
        return ability6;
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

    public int getNoCombine() {
        return noCombine;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bane))
            return false;
        if (object == this)
            return true;
        Bane otherObject = (Bane) object;
        return otherObject.getKey().equals(getKey());
    }

}
