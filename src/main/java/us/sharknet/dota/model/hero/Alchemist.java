package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Alchemist extends Hero {

    private static Alchemist instance;

    private final AlchemistAcidSpray ability1;
    private final AlchemistUnstableConcoction ability2;
    private final AlchemistGoblinsGreed ability3;
    private final AlchemistChemicalRage ability4;
    private final AttributeBonus ability5;
    private final AlchemistUnstableConcoctionThrow ability6;
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
    private final int hasAggressiveStance;
    private final int healthBarOffset;
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
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Alchemist() {
        ability1 = AlchemistAcidSpray.instance();
        ability2 = AlchemistUnstableConcoction.instance();
        ability3 = AlchemistGoblinsGreed.instance();
        ability4 = AlchemistChemicalRage.instance();
        ability5 = AttributeBonus.instance();
        ability6 = AlchemistUnstableConcoctionThrow.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 11;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 1.8;
        banSound = "alchemist_alch_anger_05";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 200;
        heroID = 73;
        heroSelectSoundEffect = "Hero_Alchemist.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/alchemist/alchemist_exp_idle_01.vcd";
        key = "npc_dota_hero_alchemist";
        lastHitChallengeRival = "npc_dota_hero_earthshaker";
        loadoutScale = .82;
        model = "models/heroes/alchemist/alchemist.vmdl";
        modelScale = .93;
        movementSpeed = 295;
        movementTurnRate = .6;
        pickSound = "alchemist_alch_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_alchemist";
        role = new String[]{"Carry","Support","Durable","Disabler","Initiator","Nuker"};
        rolelevels = new int[]{2,1,2,1,1,1};
        soundSet = "Hero_Alchemist";
        team = "Good";
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_alchemist.vsndevts";
        active = true;
        localizedName = "Alchemist";
        shortKey = "alchemist";
        url = "Alchemist";
    }

    public static Alchemist instance() {
        if( instance == null ){
            instance = new Alchemist();
        }
        return instance;
    }

    public AlchemistAcidSpray getAbility1() {
        return ability1;
    }

    public AlchemistUnstableConcoction getAbility2() {
        return ability2;
    }

    public AlchemistGoblinsGreed getAbility3() {
        return ability3;
    }

    public AlchemistChemicalRage getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
    }

    public AlchemistUnstableConcoctionThrow getAbility6() {
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Alchemist))
            return false;
        if (object == this)
            return true;
        Alchemist otherObject = (Alchemist) object;
        return otherObject.getKey().equals(getKey());
    }

}
