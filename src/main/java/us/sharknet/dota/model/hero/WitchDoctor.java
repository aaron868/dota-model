package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class WitchDoctor extends Hero {

    private static WitchDoctor instance;

    private final WitchDoctorParalyzingCask ability1;
    private final WitchDoctorVoodooRestoration ability2;
    private final WitchDoctorMaledict ability3;
    private final WitchDoctorDeathWard ability4;
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

    private WitchDoctor() {
        ability1 = WitchDoctorParalyzingCask.instance();
        ability2 = WitchDoctorVoodooRestoration.instance();
        ability3 = WitchDoctorMaledict.instance();
        ability4 = WitchDoctorDeathWard.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 37;
        attackDamageMin = 27;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 24;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 30;
        key = "npc_dota_hero_witch_doctor";
        movementSpeed = 305;
        movementTurnRate = .4;
        projectileSpeed = 1200;
        team = "Bad";
        active = true;
        localizedName = "Witch Doctor";
        url = "Witch_Doctor";
    }

    public static WitchDoctor instance() {
        if( instance == null ){
            instance = new WitchDoctor();
        }
        return instance;
    }

    public WitchDoctorParalyzingCask getAbility1() {
        return ability1;
    }

    public WitchDoctorVoodooRestoration getAbility2() {
        return ability2;
    }

    public WitchDoctorMaledict getAbility3() {
        return ability3;
    }

    public WitchDoctorDeathWard getAbility4() {
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
        if (!(object instanceof WitchDoctor))
            return false;
        if (object == this)
            return true;
        WitchDoctor otherObject = (WitchDoctor) object;
        return otherObject.getKey().equals(getKey());
    }

}
