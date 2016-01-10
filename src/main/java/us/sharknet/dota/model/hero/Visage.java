package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Visage extends Hero {

    private static Visage instance;

    private final VisageGraveChill ability1;
    private final VisageSoulAssumption ability2;
    private final VisageGravekeepersCloak ability3;
    private final VisageSummonFamiliars ability4;
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
    private final int cMEnabled;
    private final int enabled;
    private final int heroID;
    private final String key;
    private final int magicalResistance;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Visage() {
        ability1 = VisageGraveChill.instance();
        ability2 = VisageSoulAssumption.instance();
        ability3 = VisageGravekeepersCloak.instance();
        ability4 = VisageSummonFamiliars.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 11;
        attributeBaseIntelligence = 24;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.4;
        cMEnabled = 1;
        enabled = 1;
        heroID = 92;
        key = "npc_dota_hero_visage";
        magicalResistance = 10;
        movementSpeed = 285;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Visage";
        url = "Visage";
    }

    public static Visage instance() {
        if( instance == null ){
            instance = new Visage();
        }
        return instance;
    }

    public VisageGraveChill getAbility1() {
        return ability1;
    }

    public VisageSoulAssumption getAbility2() {
        return ability2;
    }

    public VisageGravekeepersCloak getAbility3() {
        return ability3;
    }

    public VisageSummonFamiliars getAbility4() {
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
        if (!(object instanceof Visage))
            return false;
        if (object == this)
            return true;
        Visage otherObject = (Visage) object;
        return otherObject.getKey().equals(getKey());
    }

}
