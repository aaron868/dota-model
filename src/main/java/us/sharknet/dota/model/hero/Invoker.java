package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Invoker extends Hero {

    private static Invoker instance;

    private final InvokerQuas ability1;
    private final InvokerEmp ability10;
    private final InvokerAlacrity ability11;
    private final InvokerChaosMeteor ability12;
    private final InvokerSunStrike ability13;
    private final InvokerForgeSpirit ability14;
    private final InvokerIceWall ability15;
    private final InvokerDeafeningBlast ability16;
    private final InvokerAttributeBonus ability17;
    private final InvokerWex ability2;
    private final InvokerExort ability3;
    private final InvokerEmpty1 ability4;
    private final InvokerEmpty2 ability5;
    private final InvokerInvoke ability6;
    private final InvokerColdSnap ability7;
    private final InvokerGhostWalk ability8;
    private final InvokerTornado ability9;
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
    private final String url;

    private Invoker() {
        ability1 = InvokerQuas.instance();
        ability10 = InvokerEmp.instance();
        ability11 = InvokerAlacrity.instance();
        ability12 = InvokerChaosMeteor.instance();
        ability13 = InvokerSunStrike.instance();
        ability14 = InvokerForgeSpirit.instance();
        ability15 = InvokerIceWall.instance();
        ability16 = InvokerDeafeningBlast.instance();
        ability17 = InvokerAttributeBonus.instance();
        ability2 = InvokerWex.instance();
        ability3 = InvokerExort.instance();
        ability4 = InvokerEmpty1.instance();
        ability5 = InvokerEmpty2.instance();
        ability6 = InvokerInvoke.instance();
        ability7 = InvokerColdSnap.instance();
        ability8 = InvokerGhostWalk.instance();
        ability9 = InvokerTornado.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 19;
        attackDamageMin = 13;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        cMEnabled = 1;
        enabled = 1;
        heroID = 74;
        key = "npc_dota_hero_invoker";
        movementSpeed = 280;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Invoker";
        url = "Invoker";
    }

    public static Invoker instance() {
        if( instance == null ){
            instance = new Invoker();
        }
        return instance;
    }

    public InvokerQuas getAbility1() {
        return ability1;
    }

    public InvokerEmp getAbility10() {
        return ability10;
    }

    public InvokerAlacrity getAbility11() {
        return ability11;
    }

    public InvokerChaosMeteor getAbility12() {
        return ability12;
    }

    public InvokerSunStrike getAbility13() {
        return ability13;
    }

    public InvokerForgeSpirit getAbility14() {
        return ability14;
    }

    public InvokerIceWall getAbility15() {
        return ability15;
    }

    public InvokerDeafeningBlast getAbility16() {
        return ability16;
    }

    public InvokerAttributeBonus getAbility17() {
        return ability17;
    }

    public InvokerWex getAbility2() {
        return ability2;
    }

    public InvokerExort getAbility3() {
        return ability3;
    }

    public InvokerEmpty1 getAbility4() {
        return ability4;
    }

    public InvokerEmpty2 getAbility5() {
        return ability5;
    }

    public InvokerInvoke getAbility6() {
        return ability6;
    }

    public InvokerColdSnap getAbility7() {
        return ability7;
    }

    public InvokerGhostWalk getAbility8() {
        return ability8;
    }

    public InvokerTornado getAbility9() {
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Invoker))
            return false;
        if (object == this)
            return true;
        Invoker otherObject = (Invoker) object;
        return otherObject.getKey().equals(getKey());
    }

}
