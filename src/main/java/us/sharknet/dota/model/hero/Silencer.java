package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Silencer extends Hero {

    private static Silencer instance;

    private final SilencerCurseOfTheSilent ability1;
    private final SilencerGlaivesOfWisdom ability2;
    private final SilencerLastWord ability3;
    private final SilencerGlobalSilence ability4;
    private final AttributeBonus ability5;
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
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final int magicalResistance;
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

    private Silencer() {
        ability1 = SilencerCurseOfTheSilent.instance();
        ability2 = SilencerGlaivesOfWisdom.instance();
        ability3 = SilencerLastWord.instance();
        ability4 = SilencerGlobalSilence.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 30;
        attackDamageMin = 16;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 3;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.2;
        banSound = "silencer_silen_anger_07";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroID = 75;
        heroSelectSoundEffect = "Hero_Silencer.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/silencer/silencer_exp_idle_01.vcd";
        key = "npc_dota_hero_silencer";
        lastHitChallengeRival = "npc_dota_hero_zuus";
        loadoutScale = .8;
        magicalResistance = 25;
        model = "models/heroes/silencer/silencer.vmdl";
        modelScale = .74;
        movementSpeed = 295;
        movementTurnRate = .6;
        pickSound = "silencer_silen_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_silencer";
        projectileModel = "particles/units/heroes/hero_silencer/silencer_base_attack.vpcf";
        projectileSpeed = 1000;
        role = new String[]{"Carry","Support","Disabler","Initiator","Nuker"};
        rolelevels = new int[]{1,1,2,2,1};
        soundSet = "Hero_Silencer";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_silencer.vsndevts";
        active = true;
        localizedName = "Silencer";
        shortKey = "silencer";
        url = "Silencer";
    }

    public static Silencer instance() {
        if( instance == null ){
            instance = new Silencer();
        }
        return instance;
    }

    public SilencerCurseOfTheSilent getAbility1() {
        return ability1;
    }

    public SilencerGlaivesOfWisdom getAbility2() {
        return ability2;
    }

    public SilencerLastWord getAbility3() {
        return ability3;
    }

    public SilencerGlobalSilence getAbility4() {
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

    public int getMagicalResistance() {
        return magicalResistance;
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
        if (!(object instanceof Silencer))
            return false;
        if (object == this)
            return true;
        Silencer otherObject = (Silencer) object;
        return otherObject.getKey().equals(getKey());
    }

}
