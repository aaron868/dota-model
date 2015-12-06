package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class LoneDruid extends Hero {

    private static LoneDruid instance;

    private final int aRDMDisabled;
    private final LoneDruidSpiritBear ability1;
    private final LoneDruidRabid ability2;
    private final LoneDruidSynergy ability3;
    private final LoneDruidTrueFormBattleCry ability4;
    private final LoneDruidTrueForm ability5;
    private final LoneDruidTrueFormDruid ability6;
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
    private final int iD;
    private final String idleExpression;
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

    private LoneDruid() {
        aRDMDisabled = 1;
        ability1 = LoneDruidSpiritBear.instance();
        ability2 = LoneDruidRabid.instance();
        ability3 = LoneDruidSynergy.instance();
        ability4 = LoneDruidTrueFormBattleCry.instance();
        ability5 = LoneDruidTrueForm.instance();
        ability6 = LoneDruidTrueFormDruid.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 26;
        attackDamageMin = 22;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 2.7;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 13;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.1;
        banSound = "lone_druid_lone_druid_anger_10";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 145;
        heroID = 80;
        heroSelectSoundEffect = "Hero_LoneDruid.Pick";
        heroUnlockOrder = 3;
        iD = 80;
        idleExpression = "scenes/lone_druid/lone_druid_exp_idle_01.vcd";
        key = "npc_dota_hero_lone_druid";
        lastHitChallengeRival = "npc_dota_hero_dragon_knight";
        loadoutScale = .87;
        model = "models/heroes/lone_druid/lone_druid.vmdl";
        modelScale = .79;
        movementSpeed = 325;
        movementTurnRate = .4;
        nameAliases = "ld";
        pickSound = "lone_druid_lone_druid_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_lone_druid";
        projectileModel = "particles/units/heroes/hero_lone_druid/lone_druid_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Pusher","Jungler","Durable"};
        rolelevels = new int[]{2,3,1,1};
        soundSet = "Hero_LoneDruid";
        statusHealthRegen = .5;
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_lone_druid.vsndevts";
        active = true;
        localizedName = "Lone Druid";
        shortKey = "lone_druid";
        url = "Lone_Druid";
    }

    public static LoneDruid instance() {
        if( instance == null ){
            instance = new LoneDruid();
        }
        return instance;
    }

    public int getARDMDisabled() {
        return aRDMDisabled;
    }

    public LoneDruidSpiritBear getAbility1() {
        return ability1;
    }

    public LoneDruidRabid getAbility2() {
        return ability2;
    }

    public LoneDruidSynergy getAbility3() {
        return ability3;
    }

    public LoneDruidTrueFormBattleCry getAbility4() {
        return ability4;
    }

    public LoneDruidTrueForm getAbility5() {
        return ability5;
    }

    public LoneDruidTrueFormDruid getAbility6() {
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

    public int getID() {
        return iD;
    }

    public String getIdleExpression() {
        return idleExpression;
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
        if (!(object instanceof LoneDruid))
            return false;
        if (object == this)
            return true;
        LoneDruid otherObject = (LoneDruid) object;
        return otherObject.getKey().equals(getKey());
    }

}
