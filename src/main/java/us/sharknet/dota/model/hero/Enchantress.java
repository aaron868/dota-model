package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Enchantress extends Hero {

    private static Enchantress instance;

    private final EnchantressUntouchable ability1;
    private final EnchantressEnchant ability2;
    private final EnchantressNaturesAttendants ability3;
    private final EnchantressImpetus ability4;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
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

    private Enchantress() {
        ability1 = EnchantressUntouchable.instance();
        ability2 = EnchantressEnchant.instance();
        ability3 = EnchantressNaturesAttendants.instance();
        ability4 = EnchantressImpetus.instance();
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 31;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 1.8;
        attributeBaseAgility = 19;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1;
        banSound = "enchantress_ench_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{216,114,11};
        heroID = 58;
        heroSelectSoundEffect = "Hero_Enchantress.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/enchantress/enchantress_exp_idle_01.vcd";
        key = "npc_dota_hero_enchantress";
        lastHitChallengeRival = "npc_dota_hero_drow_ranger";
        loadoutScale = .78;
        model = "models/heroes/enchantress/enchantress.vmdl";
        modelScale = .74;
        movementSpeed = 335;
        movementTurnRate = .4;
        pickSound = "enchantress_ench_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_enchantress";
        projectileModel = "particles/units/heroes/hero_enchantress/enchantress_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Jungler","Pusher","Durable","Disabler"};
        rolelevels = new int[]{2,3,2,1,1};
        soundSet = "Hero_Enchantress";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_enchantress.vsndevts";
        active = true;
        localizedName = "Enchantress";
        shortKey = "enchantress";
        url = "Enchantress";
    }

    public static Enchantress instance() {
        if( instance == null ){
            instance = new Enchantress();
        }
        return instance;
    }

    public EnchantressUntouchable getAbility1() {
        return ability1;
    }

    public EnchantressEnchant getAbility2() {
        return ability2;
    }

    public EnchantressNaturesAttendants getAbility3() {
        return ability3;
    }

    public EnchantressImpetus getAbility4() {
        return ability4;
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

    public int getAttributeStrengthGain() {
        return attributeStrengthGain;
    }

    public String getBanSound() {
        return banSound;
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
        if (!(object instanceof Enchantress))
            return false;
        if (object == this)
            return true;
        Enchantress otherObject = (Enchantress) object;
        return otherObject.getKey().equals(getKey());
    }

}
