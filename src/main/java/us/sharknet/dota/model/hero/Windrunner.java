package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Windrunner extends Hero {

    private static Windrunner instance;

    private final WindrunnerShackleshot ability1;
    private final WindrunnerPowershot ability2;
    private final WindrunnerWindrun ability3;
    private final WindrunnerFocusfire ability4;
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

    private Windrunner() {
        ability1 = WindrunnerShackleshot.instance();
        ability2 = WindrunnerPowershot.instance();
        ability3 = WindrunnerWindrun.instance();
        ability4 = WindrunnerFocusfire.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 22;
        attackRange = 600;
        attackRate = 1.5;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.5;
        cMEnabled = 1;
        enabled = 1;
        heroID = 21;
        key = "npc_dota_hero_windrunner";
        movementSpeed = 295;
        movementTurnRate = .6;
        projectileSpeed = 1250;
        team = "Good";
        active = true;
        localizedName = "Windranger";
        url = "Windranger";
    }

    public static Windrunner instance() {
        if( instance == null ){
            instance = new Windrunner();
        }
        return instance;
    }

    public WindrunnerShackleshot getAbility1() {
        return ability1;
    }

    public WindrunnerPowershot getAbility2() {
        return ability2;
    }

    public WindrunnerWindrun getAbility3() {
        return ability3;
    }

    public WindrunnerFocusfire getAbility4() {
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
        if (!(object instanceof Windrunner))
            return false;
        if (object == this)
            return true;
        Windrunner otherObject = (Windrunner) object;
        return otherObject.getKey().equals(getKey());
    }

}
