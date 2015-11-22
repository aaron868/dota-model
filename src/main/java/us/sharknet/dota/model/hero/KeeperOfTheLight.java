package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class KeeperOfTheLight extends Hero {

    private static KeeperOfTheLight instance;

    private final KeeperOfTheLightIlluminate ability1;
    private final AttributeBonus ability10;
    private final KeeperOfTheLightManaLeak ability2;
    private final KeeperOfTheLightChakraMagic ability3;
    private final KeeperOfTheLightRecall ability4;
    private final KeeperOfTheLightBlindingLight ability5;
    private final KeeperOfTheLightSpiritForm ability6;
    private final KeeperOfTheLightIlluminateEnd ability7;
    private final KeeperOfTheLightSpiritFormIlluminate ability8;
    private final KeeperOfTheLightSpiritFormIlluminateEnd ability9;
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
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String[] nameAliases;
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

    private KeeperOfTheLight() {
        ability1 = KeeperOfTheLightIlluminate.instance();
        ability10 = AttributeBonus.instance();
        ability2 = KeeperOfTheLightManaLeak.instance();
        ability3 = KeeperOfTheLightChakraMagic.instance();
        ability4 = KeeperOfTheLightRecall.instance();
        ability5 = KeeperOfTheLightBlindingLight.instance();
        ability6 = KeeperOfTheLightSpiritForm.instance();
        ability7 = KeeperOfTheLightIlluminateEnd.instance();
        ability8 = KeeperOfTheLightSpiritFormIlluminate.instance();
        ability9 = KeeperOfTheLightSpiritFormIlluminateEnd.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 6;
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 18;
        attackRange = 6;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 14;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        banSound = "keeper_of_the_light_keep_anger_05";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 23;
        heroID = 9;
        heroSelectSoundEffect = "Hero_KeeperOfTheLight.Pick";
        idleExpression = "scenes/keeper_of_the_light/keeper_of_the_light_exp_idle_01.vcd";
        key = "npc_dota_hero_keeper_of_the_light";
        lastHitChallengeRival = "npc_dota_hero_chaos_knight";
        loadoutScale = .75;
        model = "models/heroes/keeper_of_the_light/keeper_of_the_light.vmdl";
        modelScale = .8;
        movementSpeed = 315;
        movementTurnRate = .5;
        nameAliases = new String[]{"keeper","ezalor"};
        pickSound = "keeper_of_the_light_keep_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_keeper_of_the_light";
        projectileModel = "particles/units/heroes/hero_keeper_of_the_light/keeper_of_the_light_base_attack.vpcf";
        projectileSpeed = 9;
        role = new String[]{"Support","Nuker","Disabler","Jungler"};
        rolelevels = new int[]{3,2,1,1};
        soundSet = "Hero_KeeperOfTheLight";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_keeper_of_the_light.vsndevts";
        active = true;
        localizedName = "Keeper of the Light";
        shortKey = "keeper_of_the_light";
        url = "Keeper_of_the_Light";
    }

    public static KeeperOfTheLight instance() {
        if( instance == null ){
            instance = new KeeperOfTheLight();
        }
        return instance;
    }

    public KeeperOfTheLightIlluminate getAbility1() {
        return ability1;
    }

    public AttributeBonus getAbility10() {
        return ability10;
    }

    public KeeperOfTheLightManaLeak getAbility2() {
        return ability2;
    }

    public KeeperOfTheLightChakraMagic getAbility3() {
        return ability3;
    }

    public KeeperOfTheLightRecall getAbility4() {
        return ability4;
    }

    public KeeperOfTheLightBlindingLight getAbility5() {
        return ability5;
    }

    public KeeperOfTheLightSpiritForm getAbility6() {
        return ability6;
    }

    public KeeperOfTheLightIlluminateEnd getAbility7() {
        return ability7;
    }

    public KeeperOfTheLightSpiritFormIlluminate getAbility8() {
        return ability8;
    }

    public KeeperOfTheLightSpiritFormIlluminateEnd getAbility9() {
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

    public String[] getNameAliases() {
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
        if (!(object instanceof KeeperOfTheLight))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLight otherObject = (KeeperOfTheLight) object;
        return otherObject.getKey().equals(getKey());
    }

}
