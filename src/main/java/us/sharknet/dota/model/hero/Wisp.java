package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Wisp extends Hero {

    private static Wisp instance;

    private final WispTether ability1;
    private final WispSpiritsOut ability10;
    private final WispTetherBreak ability2;
    private final WispSpirits ability3;
    private final WispOvercharge ability4;
    private final WispEmpty1 ability5;
    private final WispEmpty2 ability6;
    private final WispRelocate ability7;
    private final AttributeBonus ability8;
    private final WispSpiritsIn ability9;
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
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Wisp() {
        ability1 = WispTether.instance();
        ability10 = WispSpiritsOut.instance();
        ability2 = WispTetherBreak.instance();
        ability3 = WispSpirits.instance();
        ability4 = WispOvercharge.instance();
        ability5 = WispEmpty1.instance();
        ability6 = WispEmpty2.instance();
        ability7 = WispRelocate.instance();
        ability8 = AttributeBonus.instance();
        ability9 = WispSpiritsIn.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .15;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 26;
        attackRange = 575;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 23;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 1.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 91;
        key = "npc_dota_hero_wisp";
        movementSpeed = 295;
        movementTurnRate = .7;
        projectileSpeed = 1200;
        team = "Good";
        active = true;
        localizedName = "Io";
        shortKey = "wisp";
        url = "Io";
    }

    public static Wisp instance() {
        if( instance == null ){
            instance = new Wisp();
        }
        return instance;
    }

    public WispTether getAbility1() {
        return ability1;
    }

    public WispSpiritsOut getAbility10() {
        return ability10;
    }

    public WispTetherBreak getAbility2() {
        return ability2;
    }

    public WispSpirits getAbility3() {
        return ability3;
    }

    public WispOvercharge getAbility4() {
        return ability4;
    }

    public WispEmpty1 getAbility5() {
        return ability5;
    }

    public WispEmpty2 getAbility6() {
        return ability6;
    }

    public WispRelocate getAbility7() {
        return ability7;
    }

    public AttributeBonus getAbility8() {
        return ability8;
    }

    public WispSpiritsIn getAbility9() {
        return ability9;
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
        if (!(object instanceof Wisp))
            return false;
        if (object == this)
            return true;
        Wisp otherObject = (Wisp) object;
        return otherObject.getKey().equals(getKey());
    }

}
