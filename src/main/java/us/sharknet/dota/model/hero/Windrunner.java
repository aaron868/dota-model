package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Windrunner extends Hero {

    private static Windrunner instance;

    private final WindrunnerShackleshot ability1;
    private final WindrunnerPowershot ability2;
    private final WindrunnerWindrun ability3;
    private final WindrunnerFocusfire ability4;
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

    private Windrunner() {
        ability1 = WindrunnerShackleshot.instance();
        ability2 = WindrunnerPowershot.instance();
        ability3 = WindrunnerWindrun.instance();
        ability4 = WindrunnerFocusfire.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 22;
        attackRange = 600;
        attackRate = 1.5;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.5;
        banSound = "windrunner_wind_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 160;
        heroGlowColor = new int[]{185,220,20};
        heroID = 21;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Windrunner.Pick";
        heroUnlockOrder = 2;
        iD = 21;
        idleExpression = "scenes/windrunner/windrunner_exp_idle_01.vcd";
        key = "npc_dota_hero_windrunner";
        lastHitChallengeRival = "npc_dota_hero_drow_ranger";
        loadoutScale = 1.1;
        model = "models/heroes/windrunner/windrunner.vmdl";
        modelScale = .98;
        movementSpeed = 295;
        movementTurnRate = .6;
        nameAliases = "wr";
        pickSound = "windrunner_wind_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_windrunner";
        projectileModel = "particles/units/heroes/hero_windrunner/windrunner_base_attack.vpcf";
        projectileSpeed = 1250;
        role = new String[]{"Carry","Support","Disabler","Escape","Nuker"};
        rolelevels = new int[]{1,1,1,1,1};
        soundSet = "Hero_Windrunner";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_windrunner.vsndevts";
        active = true;
        localizedName = "Windranger";
        shortKey = "windrunner";
        url = "Windranger";
    }

    public static Windrunner instance() {
        if( instance == null ){
            instance = new Windrunner();
        }
        return instance;
    }

    public WindrunnerShackleshot getAbility1() {
        return ability1;
    }

    public WindrunnerPowershot getAbility2() {
        return ability2;
    }

    public WindrunnerWindrun getAbility3() {
        return ability3;
    }

    public WindrunnerFocusfire getAbility4() {
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
        if (!(object instanceof Windrunner))
            return false;
        if (object == this)
            return true;
        Windrunner otherObject = (Windrunner) object;
        return otherObject.getKey().equals(getKey());
    }

}
