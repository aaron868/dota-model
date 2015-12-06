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
    private final String banSound;
    private final String baseClass;
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int cMTournamentIgnore;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int enabled;
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int heroID;
    private final int heroPool1;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final int loadoutScale;
    private final int magicalResistance;
    private final String model;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int newHero;
    private final int noCombine;
    private final String pickSound;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
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
        banSound = "winter_wyvern_winwyv_anger_07";
        baseClass = "npc_dota_hero_winter_wyvern";
        botImplemented = 0;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        cMTournamentIgnore = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        enabled = 1;
        hasAggressiveStance = 0;
        healthBarOffset = 200;
        heroID = 112;
        heroPool1 = 0;
        heroSelectSoundEffect = "Hero_Winter_Wyvern.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/winter_wyvern/winter_wyvern_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Winter_Wyvern.IdleLoop";
        key = "npc_dota_hero_winter_wyvern";
        loadoutScale = 1;
        magicalResistance = 25;
        model = "models/heroes/winterwyvern/winterwyvern.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 285;
        movementTurnRate = .4;
        newHero = 0;
        noCombine = 0;
        pickSound = "winter_wyvern_winwyv_spawn_01";
        projectileModel = "particles/units/heroes/hero_winter_wyvern/winter_wyvern_base_attack.vpcf";
        projectileSpeed = 700;
        role = new String[]{"Support","Disabler","Nuker"};
        rolelevels = new int[]{3,2,1};
        soundSet = "Hero_Winter_Wyvern";
        team = "Bad";
        teamName = "DOTA_TEAM_BADGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_HERO";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_winter_wyvern.vsndevts";
        active = true;
        localizedName = "Winter Wyvern";
        new_player_enable = 0;
        shortKey = "winter_wyvern";
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

    public String getBanSound() {
        return banSound;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public int getBotImplemented() {
        return botImplemented;
    }

    public String getBoundsHullName() {
        return boundsHullName;
    }

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getCMTournamentIgnore() {
        return cMTournamentIgnore;
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int getHeroID() {
        return heroID;
    }

    public int getHeroPool1() {
        return heroPool1;
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

    public int getLoadoutScale() {
        return loadoutScale;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public String getModel() {
        return model;
    }

    public int getModelScale() {
        return modelScale;
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

    public int getNewHero() {
        return newHero;
    }

    public int getNoCombine() {
        return noCombine;
    }

    public String getPickSound() {
        return pickSound;
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

    public String getTeamName() {
        return teamName;
    }

    public String getUnitRelationshipClass() {
        return unitRelationshipClass;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
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

    public int getNewPlayerEnable() {
        return new_player_enable;
    }

    public String getShortKey() {
        return shortKey;
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
