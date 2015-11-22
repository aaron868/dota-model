package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Razor extends Hero {

    private static Razor instance;

    private final RazorPlasmaField ability1;
    private final RazorStaticLink ability2;
    private final RazorUnstableCurrent ability3;
    private final RazorEyeOfTheStorm ability4;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final int attributeAgilityGain;
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
    private final String shortKey;
    private final String url;

    private Razor() {
        ability1 = RazorPlasmaField.instance();
        ability2 = RazorStaticLink.instance();
        ability3 = RazorUnstableCurrent.instance();
        ability4 = RazorEyeOfTheStorm.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 475;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.3;
        banSound = "razor_raz_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 230;
        heroGlowColor = new int[]{182,242,255};
        heroID = 15;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Razor.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/razor/razor_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Razor.IdleLoop";
        key = "npc_dota_hero_razor";
        lastHitChallengeRival = "npc_dota_hero_zuus";
        model = "models/heroes/razor/razor.vmdl";
        modelScale = .86;
        movementSpeed = 295;
        movementTurnRate = .4;
        pickSound = "razor_raz_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_razor";
        projectileModel = "particles/units/heroes/hero_razor/razor_base_attack.vpcf";
        projectileSpeed = 2000;
        role = new String[]{"Carry","Durable","Nuker","Pusher"};
        rolelevels = new int[]{2,2,1,1};
        soundSet = "Hero_Razor";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_razor.vsndevts";
        active = true;
        localizedName = "Razor";
        shortKey = "razor";
        url = "Razor";
    }

    public static Razor instance() {
        if( instance == null ){
            instance = new Razor();
        }
        return instance;
    }

    public RazorPlasmaField getAbility1() {
        return ability1;
    }

    public RazorStaticLink getAbility2() {
        return ability2;
    }

    public RazorUnstableCurrent getAbility3() {
        return ability3;
    }

    public RazorEyeOfTheStorm getAbility4() {
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

    public int getAttributeAgilityGain() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Razor))
            return false;
        if (object == this)
            return true;
        Razor otherObject = (Razor) object;
        return otherObject.getKey().equals(getKey());
    }

}
