package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Bristleback extends Hero {

    private static Bristleback instance;

    private final BristlebackViscousNasalGoo ability1;
    private final BristlebackQuillSpray ability2;
    private final BristlebackBristleback ability3;
    private final BristlebackWarpath ability4;
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
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Bristleback() {
        ability1 = BristlebackViscousNasalGoo.instance();
        ability2 = BristlebackQuillSpray.instance();
        ability3 = BristlebackBristleback.instance();
        ability4 = BristlebackWarpath.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.8;
        attributeAgilityGain = 1.8;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 99;
        key = "npc_dota_hero_bristleback";
        movementSpeed = 290;
        movementTurnRate = 1;
        team = "Good";
        active = true;
        localizedName = "Bristleback";
        shortKey = "bristleback";
        url = "Bristleback";
    }

    public static Bristleback instance() {
        if( instance == null ){
            instance = new Bristleback();
        }
        return instance;
    }

    public BristlebackViscousNasalGoo getAbility1() {
        return ability1;
    }

    public BristlebackQuillSpray getAbility2() {
        return ability2;
    }

    public BristlebackBristleback getAbility3() {
        return ability3;
    }

    public BristlebackWarpath getAbility4() {
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

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bristleback))
            return false;
        if (object == this)
            return true;
        Bristleback otherObject = (Bristleback) object;
        return otherObject.getKey().equals(getKey());
    }

}
