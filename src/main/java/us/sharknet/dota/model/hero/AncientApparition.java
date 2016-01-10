package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class AncientApparition extends Hero {

    private static AncientApparition instance;

    private final AncientApparitionColdFeet ability1;
    private final AncientApparitionIceVortex ability2;
    private final AncientApparitionChillingTouch ability3;
    private final AncientApparitionIceBlast ability4;
    private final AncientApparitionIceBlastRelease ability5;
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
    private final int projectileSpeed;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private AncientApparition() {
        ability1 = AncientApparitionColdFeet.instance();
        ability2 = AncientApparitionIceVortex.instance();
        ability3 = AncientApparitionChillingTouch.instance();
        ability4 = AncientApparitionIceBlast.instance();
        ability5 = AncientApparitionIceBlastRelease.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .45;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 29;
        attackDamageMin = 19;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 20;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.4;
        cMEnabled = 1;
        enabled = 1;
        heroID = 68;
        key = "npc_dota_hero_ancient_apparition";
        movementSpeed = 295;
        movementTurnRate = .6;
        projectileSpeed = 1250;
        team = "Bad";
        active = true;
        localizedName = "Ancient Apparition";
        url = "Ancient_Apparition";
    }

    public static AncientApparition instance() {
        if( instance == null ){
            instance = new AncientApparition();
        }
        return instance;
    }

    public AncientApparitionColdFeet getAbility1() {
        return ability1;
    }

    public AncientApparitionIceVortex getAbility2() {
        return ability2;
    }

    public AncientApparitionChillingTouch getAbility3() {
        return ability3;
    }

    public AncientApparitionIceBlast getAbility4() {
        return ability4;
    }

    public AncientApparitionIceBlastRelease getAbility5() {
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
        if (!(object instanceof AncientApparition))
            return false;
        if (object == this)
            return true;
        AncientApparition otherObject = (AncientApparition) object;
        return otherObject.getKey().equals(getKey());
    }

}
