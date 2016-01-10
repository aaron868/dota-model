package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class NagaSiren extends Hero {

    private static NagaSiren instance;

    private final NagaSirenMirrorImage ability1;
    private final NagaSirenEnsnare ability2;
    private final NagaSirenRipTide ability3;
    private final NagaSirenSongOfTheSiren ability4;
    private final NagaSirenSongOfTheSirenCancel ability5;
    private final AttributeBonus ability6;
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
    private final double statusHealthRegen;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private NagaSiren() {
        ability1 = NagaSirenMirrorImage.instance();
        ability2 = NagaSirenEnsnare.instance();
        ability3 = NagaSirenRipTide.instance();
        ability4 = NagaSirenSongOfTheSiren.instance();
        ability5 = NagaSirenSongOfTheSirenCancel.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.75;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 89;
        key = "npc_dota_hero_naga_siren";
        movementSpeed = 320;
        movementTurnRate = .5;
        statusHealthRegen = .75;
        team = "good";
        active = true;
        localizedName = "Naga Siren";
        url = "Naga_Siren";
    }

    public static NagaSiren instance() {
        if( instance == null ){
            instance = new NagaSiren();
        }
        return instance;
    }

    public NagaSirenMirrorImage getAbility1() {
        return ability1;
    }

    public NagaSirenEnsnare getAbility2() {
        return ability2;
    }

    public NagaSirenRipTide getAbility3() {
        return ability3;
    }

    public NagaSirenSongOfTheSiren getAbility4() {
        return ability4;
    }

    public NagaSirenSongOfTheSirenCancel getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof NagaSiren))
            return false;
        if (object == this)
            return true;
        NagaSiren otherObject = (NagaSiren) object;
        return otherObject.getKey().equals(getKey());
    }

}
