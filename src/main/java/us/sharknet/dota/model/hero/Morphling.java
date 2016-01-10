package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Morphling extends Hero {

    private static Morphling instance;

    private final MorphlingWaveform ability1;
    private final MorphlingAdaptiveStrike ability2;
    private final MorphlingMorphAgi ability3;
    private final MorphlingMorphStr ability4;
    private final MorphlingHybrid ability5;
    private final MorphlingReplicate ability6;
    private final MorphlingMorph ability7;
    private final MorphlingMorphReplicate ability8;
    private final AttributeBonus ability9;
    private final int abilityDraftDisabled;
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
    private final int cMEnabled;
    private final int enabled;
    private final int heroID;
    private final String key;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Morphling() {
        ability1 = MorphlingWaveform.instance();
        ability2 = MorphlingAdaptiveStrike.instance();
        ability3 = MorphlingMorphAgi.instance();
        ability4 = MorphlingMorphStr.instance();
        ability5 = MorphlingHybrid.instance();
        ability6 = MorphlingReplicate.instance();
        ability7 = MorphlingMorph.instance();
        ability8 = MorphlingMorphReplicate.instance();
        ability9 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 22;
        attackDamageMin = 13;
        attackRange = 350;
        attackRate = 1.6;
        attributeAgilityGain = 3.4;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 10;
        key = "npc_dota_hero_morphling";
        movementSpeed = 285;
        movementTurnRate = .6;
        projectileSpeed = 1300;
        team = "Good";
        active = true;
        localizedName = "Morphling";
        url = "Morphling";
    }

    public static Morphling instance() {
        if( instance == null ){
            instance = new Morphling();
        }
        return instance;
    }

    public MorphlingWaveform getAbility1() {
        return ability1;
    }

    public MorphlingAdaptiveStrike getAbility2() {
        return ability2;
    }

    public MorphlingMorphAgi getAbility3() {
        return ability3;
    }

    public MorphlingMorphStr getAbility4() {
        return ability4;
    }

    public MorphlingHybrid getAbility5() {
        return ability5;
    }

    public MorphlingReplicate getAbility6() {
        return ability6;
    }

    public MorphlingMorph getAbility7() {
        return ability7;
    }

    public MorphlingMorphReplicate getAbility8() {
        return ability8;
    }

    public AttributeBonus getAbility9() {
        return ability9;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
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

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getKey() {
        return key;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String getTeam() {
        return team;
    }

    public boolean isActive() {
        return active;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Morphling))
            return false;
        if (object == this)
            return true;
        Morphling otherObject = (Morphling) object;
        return otherObject.getKey().equals(getKey());
    }

}
