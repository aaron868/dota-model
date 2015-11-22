package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Ursa extends Hero {

    private static Ursa instance;

    private final UrsaEarthshock ability1;
    private final UrsaOverpower ability2;
    private final UrsaFurySwipes ability3;
    private final AttributeBonus ability5;
    private final UrsaEnrage ability6;
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
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
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

    private Ursa() {
        ability1 = UrsaEarthshock.instance();
        ability2 = UrsaOverpower.instance();
        ability3 = UrsaFurySwipes.instance();
        ability5 = AttributeBonus.instance();
        ability6 = UrsaEnrage.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 27;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.1;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.7;
        banSound = "ursa_ursa_anger_04";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 150;
        heroGlowColor = new int[]{107,74,53};
        heroID = 70;
        heroSelectSoundEffect = "Hero_Ursa.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/ursa/ursa_exp_idle_01.vcd";
        key = "npc_dota_hero_ursa";
        lastHitChallengeRival = "npc_dota_hero_tiny";
        loadoutScale = .85;
        model = "models/heroes/ursa/ursa.vmdl";
        modelScale = .74;
        movementSpeed = 310;
        movementTurnRate = .5;
        pickSound = "ursa_ursa_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_ursa";
        role = new String[]{"Carry","Jungler","Durable","Disabler"};
        rolelevels = new int[]{2,1,1,1};
        soundSet = "Hero_Ursa";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_ursa.vsndevts";
        active = true;
        localizedName = "Ursa";
        shortKey = "ursa";
        url = "Ursa";
    }

    public static Ursa instance() {
        if( instance == null ){
            instance = new Ursa();
        }
        return instance;
    }

    public UrsaEarthshock getAbility1() {
        return ability1;
    }

    public UrsaOverpower getAbility2() {
        return ability2;
    }

    public UrsaFurySwipes getAbility3() {
        return ability3;
    }

    public AttributeBonus getAbility5() {
        return ability5;
    }

    public UrsaEnrage getAbility6() {
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
        if (!(object instanceof Ursa))
            return false;
        if (object == this)
            return true;
        Ursa otherObject = (Ursa) object;
        return otherObject.getKey().equals(getKey());
    }

}
