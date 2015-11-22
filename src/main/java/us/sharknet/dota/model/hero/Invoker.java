package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Invoker extends Hero {

    private static Invoker instance;

    private final int aRDMDisabled;
    private final InvokerQuas ability1;
    private final InvokerEmp ability10;
    private final InvokerAlacrity ability11;
    private final InvokerChaosMeteor ability12;
    private final InvokerSunStrike ability13;
    private final InvokerForgeSpirit ability14;
    private final InvokerIceWall ability15;
    private final InvokerDeafeningBlast ability16;
    private final InvokerWex ability2;
    private final InvokerExort ability3;
    private final InvokerEmpty1 ability4;
    private final InvokerEmpty2 ability5;
    private final InvokerInvoke ability6;
    private final InvokerColdSnap ability7;
    private final InvokerGhostWalk ability8;
    private final InvokerTornado ability9;
    private final int abilityDraftDisabled;
    private final int abilityLayout;
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
    private final int attributeIntelligenceGain;
    private final String attributePrimary;
    private final double attributeStrengthGain;
    private final String banSound;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Invoker() {
        aRDMDisabled = 1;
        ability1 = InvokerQuas.instance();
        ability10 = InvokerEmp.instance();
        ability11 = InvokerAlacrity.instance();
        ability12 = InvokerChaosMeteor.instance();
        ability13 = InvokerSunStrike.instance();
        ability14 = InvokerForgeSpirit.instance();
        ability15 = InvokerIceWall.instance();
        ability16 = InvokerDeafeningBlast.instance();
        ability2 = InvokerWex.instance();
        ability3 = InvokerExort.instance();
        ability4 = InvokerEmpty1.instance();
        ability5 = InvokerEmpty2.instance();
        ability6 = InvokerInvoke.instance();
        ability7 = InvokerColdSnap.instance();
        ability8 = InvokerGhostWalk.instance();
        ability9 = InvokerTornado.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 6;
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 19;
        attackDamageMin = 13;
        attackRange = 6;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 2;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        banSound = "invoker_invo_anger_04";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 17;
        heroID = 74;
        heroSelectSoundEffect = "Hero_Invoker.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/invoker/invoker_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Invoker.IdleLoop";
        key = "npc_dota_hero_invoker";
        lastHitChallengeRival = "npc_dota_hero_lina";
        loadoutScale = .8;
        model = "models/heroes/invoker/invoker.vmdl";
        modelScale = .74;
        movementSpeed = 28;
        movementTurnRate = .5;
        pickSound = "invoker_invo_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_furion";
        projectileModel = "particles/units/heroes/hero_invoker/invoker_base_attack.vpcf";
        projectileSpeed = 9;
        role = new String[]{"Carry","Nuker","Disabler","Escape","Pusher"};
        rolelevels = new int[]{1,3,2,1,1};
        soundSet = "Hero_Invoker";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_invoker.vsndevts";
        active = true;
        localizedName = "Invoker";
        shortKey = "invoker";
        url = "Invoker";
    }

    public static Invoker instance() {
        if( instance == null ){
            instance = new Invoker();
        }
        return instance;
    }

    public int getARDMDisabled() {
        return aRDMDisabled;
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

    public int getAbilityLayout() {
        return abilityLayout;
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

    public int getAttributeIntelligenceGain() {
        return attributeIntelligenceGain;
    }

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public double getAttributeStrengthGain() {
        return attributeStrengthGain;
    }

    public String getBanSound() {
        return banSound;
    }

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getIdleSoundLoop() {
        return idleSoundLoop;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
    }

    public double getLoadoutScale() {
        return loadoutScale;
    }

    public String getModel() {
        return model;
    }

    public double getModelScale() {
        return modelScale;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String[] getRole() {
        return role;
    }

    public int[] getRolelevels() {
        return rolelevels;
    }

    public String getSoundSet() {
        return soundSet;
    }

    public String getTeam() {
        return team;
    }

    public String getVoiceFile() {
        return voiceFile;
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
        if (!(object instanceof Invoker))
            return false;
        if (object == this)
            return true;
        Invoker otherObject = (Invoker) object;
        return otherObject.getKey().equals(getKey());
    }

}
