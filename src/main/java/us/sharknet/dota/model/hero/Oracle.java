package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Oracle extends Hero {

    private static Oracle instance;

    private final OracleFortunesEnd ability1;
    private final OracleFatesEdict ability2;
    private final OraclePurifyingFlames ability3;
    private final OracleFalsePromise ability4;
    private final AttributeBonus ability5;
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
    private final String baseClass;
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final int loadoutScale;
    private final String model;
    private final int modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
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

    private Oracle() {
        ability1 = OracleFortunesEnd.instance();
        ability2 = OracleFatesEdict.instance();
        ability3 = OraclePurifyingFlames.instance();
        ability4 = OracleFalsePromise.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 22;
        attackRange = 620;
        attackRate = 1.4;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 23;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.9;
        banSound = "oracle_orac_anger_08";
        baseClass = "npc_dota_hero_oracle";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 0;
        enabled = 1;
        healthBarOffset = 240;
        heroID = 111;
        heroSelectSoundEffect = "Hero_Oracle.Pick";
        heroUnlockOrder = 1;
        iD = 111;
        idleExpression = "scenes/oracle/oracle_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Oracle.IdleLoop";
        key = "npc_dota_hero_oracle";
        loadoutScale = 1;
        model = "models/heroes/oracle/oracle.vmdl";
        modelScale = 1;
        movementSpeed = 305;
        movementTurnRate = .4;
        nameAliases = "ora";
        noCombine = 0;
        pickSound = "oracle_orac_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_oracle";
        projectileModel = "particles/units/heroes/hero_oracle/oracle_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Nuker","Disabler","Escape"};
        rolelevels = new int[]{3,3,2,1};
        soundSet = "Hero_Oracle";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_oracle.vsndevts";
        active = true;
        localizedName = "Oracle";
        shortKey = "oracle";
        url = "Oracle";
    }

    public static Oracle instance() {
        if( instance == null ){
            instance = new Oracle();
        }
        return instance;
    }

    public OracleFortunesEnd getAbility1() {
        return ability1;
    }

    public OracleFatesEdict getAbility2() {
        return ability2;
    }

    public OraclePurifyingFlames getAbility3() {
        return ability3;
    }

    public OracleFalsePromise getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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

    public String getBaseClass() {
        return baseClass;
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

    public String getIdleSoundLoop() {
        return idleSoundLoop;
    }

    public String getKey() {
        return key;
    }

    public int getLoadoutScale() {
        return loadoutScale;
    }

    public String getModel() {
        return model;
    }

    public int getModelScale() {
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
        if (!(object instanceof Oracle))
            return false;
        if (object == this)
            return true;
        Oracle otherObject = (Oracle) object;
        return otherObject.getKey().equals(getKey());
    }

}
