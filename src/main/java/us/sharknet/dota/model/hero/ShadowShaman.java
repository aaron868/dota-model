package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ShadowShaman extends Hero {

    private static ShadowShaman instance;

    private final ShadowShamanEtherShock ability1;
    private final ShadowShamanVoodoo ability2;
    private final ShadowShamanShackles ability3;
    private final ShadowShamanMassSerpentWard ability4;
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
    private final String shortKey;
    private final String url;

    private ShadowShaman() {
        ability1 = ShadowShamanEtherShock.instance();
        ability2 = ShadowShamanVoodoo.instance();
        ability3 = ShadowShamanShackles.instance();
        ability4 = ShadowShamanMassSerpentWard.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 26;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 27;
        key = "npc_dota_hero_shadow_shaman";
        movementSpeed = 285;
        movementTurnRate = .4;
        projectileSpeed = 900;
        team = "Good";
        active = true;
        localizedName = "Shadow Shaman";
        shortKey = "shadow_shaman";
        url = "Shadow_Shaman";
    }

    public static ShadowShaman instance() {
        if( instance == null ){
            instance = new ShadowShaman();
        }
        return instance;
    }

    public ShadowShamanEtherShock getAbility1() {
        return ability1;
    }

    public ShadowShamanVoodoo getAbility2() {
        return ability2;
    }

    public ShadowShamanShackles getAbility3() {
        return ability3;
    }

    public ShadowShamanMassSerpentWard getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowShaman))
            return false;
        if (object == this)
            return true;
        ShadowShaman otherObject = (ShadowShaman) object;
        return otherObject.getKey().equals(getKey());
    }

}
