package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Jakiro extends Hero {

    private static Jakiro instance;

    private final JakiroDualBreath ability1;
    private final JakiroIcePath ability2;
    private final JakiroLiquidFire ability3;
    private final JakiroMacropyre ability4;
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
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int newHero;
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

    private Jakiro() {
        ability1 = JakiroDualBreath.instance();
        ability2 = JakiroIcePath.instance();
        ability3 = JakiroLiquidFire.instance();
        ability4 = JakiroMacropyre.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 26;
        attackDamageMin = 18;
        attackRange = 4;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 1;
        attributeBaseIntelligence = 28;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        banSound = "jakiro_jak_anger_04";
        botImplemented = 1;
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 28;
        heroGlowColor = new int[]{107,74,53};
        heroID = 64;
        heroSelectSoundEffect = "Hero_Jakiro.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/jakiro/jakiro_exp_idle_01.vcd";
        key = "npc_dota_hero_jakiro";
        lastHitChallengeRival = "npc_dota_hero_crystal_maiden";
        model = "models/heroes/twin_headed_dragon/twin_headed_dragon.vmdl";
        modelScale = .97;
        movementSpeed = 29;
        movementTurnRate = .5;
        newHero = 1;
        noCombine = 1;
        pickSound = "jakiro_jak_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_jakiro";
        projectileModel = "particles/units/heroes/hero_jakiro/jakiro_base_attack.vpcf";
        projectileSpeed = 11;
        role = new String[]{"Support","Nuker","Pusher","Disabler"};
        rolelevels = new int[]{1,2,2,1};
        soundSet = "Hero_Jakiro";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_jakiro.vsndevts";
        active = true;
        localizedName = "Jakiro";
        shortKey = "jakiro";
        url = "Jakiro";
    }

    public static Jakiro instance() {
        if( instance == null ){
            instance = new Jakiro();
        }
        return instance;
    }

    public JakiroDualBreath getAbility1() {
        return ability1;
    }

    public JakiroIcePath getAbility2() {
        return ability2;
    }

    public JakiroLiquidFire getAbility3() {
        return ability3;
    }

    public JakiroMacropyre getAbility4() {
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

    public int getNewHero() {
        return newHero;
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
        if (!(object instanceof Jakiro))
            return false;
        if (object == this)
            return true;
        Jakiro otherObject = (Jakiro) object;
        return otherObject.getKey().equals(getKey());
    }

}
