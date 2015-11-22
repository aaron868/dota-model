package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Techies extends Hero {

    private static Techies instance;

    private final TechiesLandMines ability1;
    private final TechiesStasisTrap ability2;
    private final TechiesSuicide ability3;
    private final TechiesFocusedDetonate ability4;
    private final TechiesMinefieldSign ability5;
    private final TechiesRemoteMines ability6;
    private final AttributeBonus ability7;
    private final int abilityLayout;
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
    private final int attributeStrengthGain;
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
    private final double loadoutScale;
    private final int magicalResistance;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int newHero;
    private final String pickSound;
    private final String projectileModel;
    private final int projectileSpeed;
    private final int ringRadius;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusManaRegen;
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

    private Techies() {
        ability1 = TechiesLandMines.instance();
        ability2 = TechiesStasisTrap.instance();
        ability3 = TechiesSuicide.instance();
        ability4 = TechiesFocusedDetonate.instance();
        ability5 = TechiesMinefieldSign.instance();
        ability6 = TechiesRemoteMines.instance();
        ability7 = AttributeBonus.instance();
        abilityLayout = 6;
        armorPhysical = 5;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 9;
        attackDamageMin = 7;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 7;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2;
        banSound = "techies_tech_anger_23";
        baseClass = "npc_dota_hero_techies";
        botImplemented = 0;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        cMTournamentIgnore = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        enabled = 1;
        hasAggressiveStance = 0;
        healthBarOffset = 15;
        heroID = 15;
        heroPool1 = 0;
        heroSelectSoundEffect = "Hero_Techies.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/techies/techies_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Techies.IdleLoop";
        key = "npc_dota_hero_techies";
        loadoutScale = .6;
        magicalResistance = 25;
        model = "models/heroes/techies/techies.vmdl";
        modelScale = .6;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 27;
        movementTurnRate = .5;
        newHero = 0;
        pickSound = "techies_tech_spawn_01";
        projectileModel = "particles/units/heroes/hero_techies/techies_base_attack.vpcf";
        projectileSpeed = 9;
        ringRadius = 7;
        role = new String[]{"Nuker","Disabler"};
        rolelevels = new int[]{3,1};
        soundSet = "Hero_Techies";
        statusManaRegen = .2;
        team = "Good";
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_HERO";
        visionDaytimeRange = 18;
        visionNighttimeRange = 8;
        voiceFile = "soundevents/voscripts/game_sounds_vo_techies.vsndevts";
        active = true;
        localizedName = "Techies";
        new_player_enable = 0;
        shortKey = "techies";
        url = "Techies";
    }

    public static Techies instance() {
        if( instance == null ){
            instance = new Techies();
        }
        return instance;
    }

    public TechiesLandMines getAbility1() {
        return ability1;
    }

    public TechiesStasisTrap getAbility2() {
        return ability2;
    }

    public TechiesSuicide getAbility3() {
        return ability3;
    }

    public TechiesFocusedDetonate getAbility4() {
        return ability4;
    }

    public TechiesMinefieldSign getAbility5() {
        return ability5;
    }

    public TechiesRemoteMines getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
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

    public int getAttributeStrengthGain() {
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

    public double getLoadoutScale() {
        return loadoutScale;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public String getModel() {
        return model;
    }

    public double getModelScale() {
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

    public String getPickSound() {
        return pickSound;
    }

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public int getRingRadius() {
        return ringRadius;
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

    public double getStatusManaRegen() {
        return statusManaRegen;
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
        if (!(object instanceof Techies))
            return false;
        if (object == this)
            return true;
        Techies otherObject = (Techies) object;
        return otherObject.getKey().equals(getKey());
    }

}
