package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ObsidianDestroyer extends Hero {

    private static ObsidianDestroyer instance;

    private final ObsidianDestroyerArcaneOrb ability1;
    private final ObsidianDestroyerAstralImprisonment ability2;
    private final ObsidianDestroyerEssenceAura ability3;
    private final ObsidianDestroyerSanityEclipse ability4;
    private final AttributeBonus ability5;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final int attributeAgilityGain;
    private final int attributeBaseAgility;
    private final int attributeBaseIntelligence;
    private final int attributeBaseStrength;
    private final double attributeIntelligenceGain;
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
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private ObsidianDestroyer() {
        ability1 = ObsidianDestroyerArcaneOrb.instance();
        ability2 = ObsidianDestroyerAstralImprisonment.instance();
        ability3 = ObsidianDestroyerEssenceAura.instance();
        ability4 = ObsidianDestroyerSanityEclipse.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 20;
        attackRange = 450;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 26;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 3.3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        banSound = "outworld_destroyer_odest_anger_02";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 350;
        heroID = 76;
        heroSelectSoundEffect = "Hero_OD.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/outworld_destroyer/outworld_destroyer_exp_idle_01.vcd";
        idleSoundLoop = "Hero_ObsidianDestroyer.IdleLoop";
        key = "npc_dota_hero_obsidian_destroyer";
        lastHitChallengeRival = "npc_dota_hero_death_prophet";
        model = "models/heroes/obsidian_destroyer/obsidian_destroyer.vmdl";
        modelScale = .7;
        movementSpeed = 315;
        movementTurnRate = .5;
        nameAliases = "od";
        pickSound = "outworld_destroyer_odest_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_obsidian_destroyer";
        projectileModel = "particles/units/heroes/hero_obsidian_destroyer/obsidian_destroyer_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Nuker","Disabler"};
        rolelevels = new int[]{2,2,1};
        soundSet = "Hero_ObsidianDestroyer";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_outworld_destroyer.vsndevts";
        active = true;
        localizedName = "Outworld Devourer";
        shortKey = "obsidian_destroyer";
        url = "Outworld_Devourer";
    }

    public static ObsidianDestroyer instance() {
        if( instance == null ){
            instance = new ObsidianDestroyer();
        }
        return instance;
    }

    public ObsidianDestroyerArcaneOrb getAbility1() {
        return ability1;
    }

    public ObsidianDestroyerAstralImprisonment getAbility2() {
        return ability2;
    }

    public ObsidianDestroyerEssenceAura getAbility3() {
        return ability3;
    }

    public ObsidianDestroyerSanityEclipse getAbility4() {
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

    public int getAttackRange() {
        return attackRange;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public int getAttributeAgilityGain() {
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
        if (!(object instanceof ObsidianDestroyer))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyer otherObject = (ObsidianDestroyer) object;
        return otherObject.getKey().equals(getKey());
    }

}
