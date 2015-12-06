package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Chen extends Hero {

    private static Chen instance;

    private final ChenPenitence ability1;
    private final ChenTestOfFaith ability2;
    private final ChenTestOfFaithTeleport ability3;
    private final ChenHolyPersuasion ability4;
    private final ChenHandOfGod ability5;
    private final AttributeBonus ability6;
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
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
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

    private Chen() {
        ability1 = ChenPenitence.instance();
        ability2 = ChenTestOfFaith.instance();
        ability3 = ChenTestOfFaithTeleport.instance();
        ability4 = ChenHolyPersuasion.instance();
        ability5 = ChenHandOfGod.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 22;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 2.1;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        banSound = "chen_chen_anger_04";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 190;
        heroGlowColor = new int[]{107,74,53};
        heroID = 66;
        heroSelectSoundEffect = "Hero_Chen.Pick";
        heroUnlockOrder = 3;
        iD = 66;
        key = "npc_dota_hero_chen";
        lastHitChallengeRival = "npc_dota_hero_sven";
        loadoutScale = .82;
        model = "models/heroes/chen/chen.vmdl";
        modelScale = .93;
        movementSpeed = 300;
        movementTurnRate = .6;
        pickSound = "chen_chen_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_chen";
        projectileModel = "particles/units/heroes/hero_chen/chen_base_attack.vpcf";
        projectileSpeed = 1100;
        role = new String[]{"Support","Jungler","Pusher"};
        rolelevels = new int[]{2,3,2};
        soundSet = "Hero_Chen";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_chen.vsndevts";
        active = true;
        localizedName = "Chen";
        shortKey = "chen";
        url = "Chen";
    }

    public static Chen instance() {
        if( instance == null ){
            instance = new Chen();
        }
        return instance;
    }

    public ChenPenitence getAbility1() {
        return ability1;
    }

    public ChenTestOfFaith getAbility2() {
        return ability2;
    }

    public ChenTestOfFaithTeleport getAbility3() {
        return ability3;
    }

    public ChenHolyPersuasion getAbility4() {
        return ability4;
    }

    public ChenHandOfGod getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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

    public int getID() {
        return iD;
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
        if (!(object instanceof Chen))
            return false;
        if (object == this)
            return true;
        Chen otherObject = (Chen) object;
        return otherObject.getKey().equals(getKey());
    }

}
