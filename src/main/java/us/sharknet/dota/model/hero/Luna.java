package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Luna extends Hero {

    private static Luna instance;

    private final LunaLucentBeam ability1;
    private final LunaMoonGlaive ability2;
    private final LunaLunarBlessing ability3;
    private final LunaEclipse ability4;
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

    private Luna() {
        ability1 = LunaLucentBeam.instance();
        ability2 = LunaMoonGlaive.instance();
        ability3 = LunaLunarBlessing.instance();
        ability4 = LunaEclipse.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 26;
        attackRange = 330;
        attackRate = 1.7;
        attributeAgilityGain = 2.8;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 1.85;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 48;
        key = "npc_dota_hero_luna";
        movementSpeed = 330;
        movementTurnRate = .6;
        projectileSpeed = 900;
        team = "Good";
        active = true;
        localizedName = "Luna";
        url = "Luna";
    }

    public static Luna instance() {
        if( instance == null ){
            instance = new Luna();
        }
        return instance;
    }

    public LunaLucentBeam getAbility1() {
        return ability1;
    }

    public LunaMoonGlaive getAbility2() {
        return ability2;
    }

    public LunaLunarBlessing getAbility3() {
        return ability3;
    }

    public LunaEclipse getAbility4() {
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
        if (!(object instanceof Luna))
            return false;
        if (object == this)
            return true;
        Luna otherObject = (Luna) object;
        return otherObject.getKey().equals(getKey());
    }

}
