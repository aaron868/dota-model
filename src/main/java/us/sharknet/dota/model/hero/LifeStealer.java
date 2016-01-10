package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class LifeStealer extends Hero {

    private static LifeStealer instance;

    private final LifeStealerRage ability1;
    private final LifeStealerFeast ability2;
    private final LifeStealerOpenWounds ability3;
    private final LifeStealerAssimilate ability4;
    private final LifeStealerAssimilateEject ability5;
    private final LifeStealerInfest ability6;
    private final LifeStealerControl ability7;
    private final LifeStealerConsume ability8;
    private final AttributeBonus ability9;
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
    private final String url;

    private LifeStealer() {
        ability1 = LifeStealerRage.instance();
        ability2 = LifeStealerFeast.instance();
        ability3 = LifeStealerOpenWounds.instance();
        ability4 = LifeStealerAssimilate.instance();
        ability5 = LifeStealerAssimilateEject.instance();
        ability6 = LifeStealerInfest.instance();
        ability7 = LifeStealerControl.instance();
        ability8 = LifeStealerConsume.instance();
        ability9 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .39;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 42;
        attackDamageMin = 32;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.75;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.4;
        cMEnabled = 1;
        enabled = 1;
        heroID = 54;
        key = "npc_dota_hero_life_stealer";
        movementSpeed = 315;
        movementTurnRate = 1;
        team = "Bad";
        active = true;
        localizedName = "Lifestealer";
        url = "Lifestealer";
    }

    public static LifeStealer instance() {
        if( instance == null ){
            instance = new LifeStealer();
        }
        return instance;
    }

    public LifeStealerRage getAbility1() {
        return ability1;
    }

    public LifeStealerFeast getAbility2() {
        return ability2;
    }

    public LifeStealerOpenWounds getAbility3() {
        return ability3;
    }

    public LifeStealerAssimilate getAbility4() {
        return ability4;
    }

    public LifeStealerAssimilateEject getAbility5() {
        return ability5;
    }

    public LifeStealerInfest getAbility6() {
        return ability6;
    }

    public LifeStealerControl getAbility7() {
        return ability7;
    }

    public LifeStealerConsume getAbility8() {
        return ability8;
    }

    public AttributeBonus getAbility9() {
        return ability9;
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealer))
            return false;
        if (object == this)
            return true;
        LifeStealer otherObject = (LifeStealer) object;
        return otherObject.getKey().equals(getKey());
    }

}
