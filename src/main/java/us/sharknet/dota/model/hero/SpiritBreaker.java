package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class SpiritBreaker extends Hero {

    private static SpiritBreaker instance;

    private final SpiritBreakerChargeOfDarkness ability1;
    private final SpiritBreakerEmpoweringHaste ability2;
    private final SpiritBreakerGreaterBash ability3;
    private final SpiritBreakerNetherStrike ability4;
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
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private SpiritBreaker() {
        ability1 = SpiritBreakerChargeOfDarkness.instance();
        ability2 = SpiritBreakerEmpoweringHaste.instance();
        ability3 = SpiritBreakerGreaterBash.instance();
        ability4 = SpiritBreakerNetherStrike.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .6;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.9;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 29;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.4;
        banSound = "spirit_breaker_spir_anger_05";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 160;
        heroGlowColor = new int[]{53,74,107};
        heroID = 71;
        heroSelectSoundEffect = "Hero_SpiritBreaker.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/spirit_breaker/spirit_breaker_exp_idle_01.vcd";
        key = "npc_dota_hero_spirit_breaker";
        lastHitChallengeRival = "npc_dota_hero_earthshaker";
        model = "models/heroes/spirit_breaker/spirit_breaker.vmdl";
        modelScale = .74;
        movementSpeed = 290;
        movementTurnRate = .4;
        nameAliases = "sb";
        pickSound = "spirit_breaker_spir_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_spirit_breaker";
        role = new String[]{"Carry","Initiator","Disabler","Durable","Escape"};
        rolelevels = new int[]{1,2,2,2,1};
        soundSet = "Hero_spirit_breaker";
        statusHealthRegen = .75;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_spirit_breaker.vsndevts";
        active = true;
        localizedName = "Spirit Breaker";
        shortKey = "spirit_breaker";
        url = "Spirit_Breaker";
    }

    public static SpiritBreaker instance() {
        if( instance == null ){
            instance = new SpiritBreaker();
        }
        return instance;
    }

    public SpiritBreakerChargeOfDarkness getAbility1() {
        return ability1;
    }

    public SpiritBreakerEmpoweringHaste getAbility2() {
        return ability2;
    }

    public SpiritBreakerGreaterBash getAbility3() {
        return ability3;
    }

    public SpiritBreakerNetherStrike getAbility4() {
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

    public String getNameAliases() {
        return nameAliases;
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof SpiritBreaker))
            return false;
        if (object == this)
            return true;
        SpiritBreaker otherObject = (SpiritBreaker) object;
        return otherObject.getKey().equals(getKey());
    }

}
