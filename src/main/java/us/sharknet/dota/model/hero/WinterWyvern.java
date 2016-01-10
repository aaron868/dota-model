package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class WinterWyvern extends Hero {

    private static WinterWyvern instance;

    private final WinterWyvernArcticBurn ability1;
    private final WinterWyvernSplinterBlast ability2;
    private final WinterWyvernColdEmbrace ability3;
    private final WinterWyvernWintersCurse ability4;
    private final AttributeBonus ability5;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
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
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int enabled;
    private final int heroID;
    private final String key;
    private final int magicalResistance;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final String team;
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private WinterWyvern() {
        ability1 = WinterWyvernArcticBurn.instance();
        ability2 = WinterWyvernSplinterBlast.instance();
        ability3 = WinterWyvernColdEmbrace.instance();
        ability4 = WinterWyvernWintersCurse.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .25;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 20;
        attackDamageMin = 13;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 425;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 24;
        attributeIntelligenceGain = 3.1;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.1;
        cMEnabled = 1;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        enabled = 1;
        heroID = 112;
        key = "npc_dota_hero_winter_wyvern";
        magicalResistance = 25;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 285;
        movementTurnRate = .4;
        projectileSpeed = 700;
        team = "Bad";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Winter Wyvern";
        url = "Winter_Wyvern";
    }

    public static WinterWyvern instance() {
        if( instance == null ){
            instance = new WinterWyvern();
        }
        return instance;
    }

    public WinterWyvernArcticBurn getAbility1() {
        return ability1;
    }

    public WinterWyvernSplinterBlast getAbility2() {
        return ability2;
    }

    public WinterWyvernColdEmbrace getAbility3() {
        return ability3;
    }

    public WinterWyvernWintersCurse getAbility4() {
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

    public String getAttackDamageType() {
        return attackDamageType;
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

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
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

    public String getMovementCapabilities() {
        return movementCapabilities;
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
        if (!(object instanceof WinterWyvern))
            return false;
        if (object == this)
            return true;
        WinterWyvern otherObject = (WinterWyvern) object;
        return otherObject.getKey().equals(getKey());
    }

}
