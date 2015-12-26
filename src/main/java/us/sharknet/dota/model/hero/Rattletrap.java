package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Rattletrap extends Hero {

    private static Rattletrap instance;

    private final RattletrapBatteryAssault ability1;
    private final RattletrapPowerCogs ability2;
    private final RattletrapRocketFlare ability3;
    private final RattletrapHookshot ability4;
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

    private Rattletrap() {
        ability1 = RattletrapBatteryAssault.instance();
        ability2 = RattletrapPowerCogs.instance();
        ability3 = RattletrapRocketFlare.instance();
        ability4 = RattletrapHookshot.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.3;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 24;
        attributeIntelligenceGain = 1.3;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 51;
        key = "npc_dota_hero_rattletrap";
        movementSpeed = 315;
        movementTurnRate = .6;
        team = "Good";
        active = true;
        localizedName = "Clockwerk";
        shortKey = "rattletrap";
        url = "Clockwerk";
    }

    public static Rattletrap instance() {
        if( instance == null ){
            instance = new Rattletrap();
        }
        return instance;
    }

    public RattletrapBatteryAssault getAbility1() {
        return ability1;
    }

    public RattletrapPowerCogs getAbility2() {
        return ability2;
    }

    public RattletrapRocketFlare getAbility3() {
        return ability3;
    }

    public RattletrapHookshot getAbility4() {
        return ability4;
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
        if (!(object instanceof Rattletrap))
            return false;
        if (object == this)
            return true;
        Rattletrap otherObject = (Rattletrap) object;
        return otherObject.getKey().equals(getKey());
    }

}
