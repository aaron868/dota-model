package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Nevermore extends Hero {

    private static Nevermore instance;

    private final NevermoreShadowraze1 ability1;
    private final NevermoreShadowraze2 ability2;
    private final NevermoreShadowraze3 ability3;
    private final NevermoreNecromastery ability4;
    private final NevermoreDarkLord ability5;
    private final NevermoreRequiem ability6;
    private final AttributeBonus ability7;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
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
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Nevermore() {
        ability1 = NevermoreShadowraze1.instance();
        ability2 = NevermoreShadowraze2.instance();
        ability3 = NevermoreShadowraze3.instance();
        ability4 = NevermoreNecromastery.instance();
        ability5 = NevermoreDarkLord.instance();
        ability6 = NevermoreRequiem.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 6;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 15;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 2.9;
        attributeBaseAgility = 20;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        banSound = "nevermore_nev_anger_03";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 250;
        heroGlowColor = new int[]{240,34,18};
        heroID = 11;
        heroSelectSoundEffect = "Hero_Nevermore.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/nevermore/nevermore_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Nevermore.IdleLoop";
        key = "npc_dota_hero_nevermore";
        lastHitChallengeRival = "npc_dota_hero_lion";
        loadoutScale = .82;
        model = "models/heroes/shadow_fiend/shadow_fiend.vmdl";
        modelScale = .98;
        movementSpeed = 305;
        movementTurnRate = 1;
        nameAliases = "sf";
        pickSound = "nevermore_nev_spawn_11";
        portrait = "vgui/hud/heroportraits/portrait_nevermore";
        projectileModel = "particles/units/heroes/hero_nevermore/nevermore_base_attack.vpcf";
        projectileSpeed = 1200;
        role = new String[]{"Carry","Nuker"};
        rolelevels = new int[]{2,3};
        soundSet = "Hero_Nevermore";
        statusHealthRegen = .5;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_nevermore.vsndevts";
        active = true;
        localizedName = "Shadow Fiend";
        shortKey = "nevermore";
        url = "Shadow_Fiend";
    }

    public static Nevermore instance() {
        if( instance == null ){
            instance = new Nevermore();
        }
        return instance;
    }

    public NevermoreShadowraze1 getAbility1() {
        return ability1;
    }

    public NevermoreShadowraze2 getAbility2() {
        return ability2;
    }

    public NevermoreShadowraze3 getAbility3() {
        return ability3;
    }

    public NevermoreNecromastery getAbility4() {
        return ability4;
    }

    public NevermoreDarkLord getAbility5() {
        return ability5;
    }

    public NevermoreRequiem getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
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

    public int getAttributeStrengthGain() {
        return attributeStrengthGain;
    }

    public String getBanSound() {
        return banSound;
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

    public int getEnabled() {
        return enabled;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int[] getHeroGlowColor() {
        return heroGlowColor;
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

    public String getNameAliases() {
        return nameAliases;
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof Nevermore))
            return false;
        if (object == this)
            return true;
        Nevermore otherObject = (Nevermore) object;
        return otherObject.getKey().equals(getKey());
    }

}
