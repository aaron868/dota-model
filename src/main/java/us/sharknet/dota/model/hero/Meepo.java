package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Meepo extends Hero {

    private static Meepo instance;

    private final MeepoEarthbind ability1;
    private final MeepoPoof ability2;
    private final MeepoGeostrike ability3;
    private final MeepoDividedWeStand ability4;
    private final AttributeBonus ability5;
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
    private final int magicalResistance;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String team;
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Meepo() {
        ability1 = MeepoEarthbind.instance();
        ability2 = MeepoPoof.instance();
        ability3 = MeepoGeostrike.instance();
        ability4 = MeepoDividedWeStand.instance();
        ability5 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .38;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 22;
        attackDamageMin = 16;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        cMEnabled = 1;
        enabled = 1;
        heroID = 82;
        key = "npc_dota_hero_meepo";
        magicalResistance = 35;
        movementSpeed = 315;
        movementTurnRate = .65;
        team = "Bad";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Meepo";
        url = "Meepo";
    }

    public static Meepo instance() {
        if( instance == null ){
            instance = new Meepo();
        }
        return instance;
    }

    public MeepoEarthbind getAbility1() {
        return ability1;
    }

    public MeepoPoof getAbility2() {
        return ability2;
    }

    public MeepoGeostrike getAbility3() {
        return ability3;
    }

    public MeepoDividedWeStand getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public String getTeam() {
        return team;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
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
        if (!(object instanceof Meepo))
            return false;
        if (object == this)
            return true;
        Meepo otherObject = (Meepo) object;
        return otherObject.getKey().equals(getKey());
    }

}
