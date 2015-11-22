package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Furion extends Hero {

    private static Furion instance;

    private final FurionSprout ability1;
    private final FurionTeleportation ability2;
    private final FurionForceOfNature ability3;
    private final FurionWrathOfNature ability4;
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

    private Furion() {
        ability1 = FurionSprout.instance();
        ability2 = FurionTeleportation.instance();
        ability3 = FurionForceOfNature.instance();
        ability4 = FurionWrathOfNature.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 38;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        banSound = "furion_furi_anger_02";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{216,255,100};
        heroID = 53;
        heroSelectSoundEffect = "Hero_Furion.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/furion/furion_exp_idle_01.vcd";
        key = "npc_dota_hero_furion";
        lastHitChallengeRival = "npc_dota_hero_earthshaker";
        loadoutScale = .75;
        model = "models/heroes/furion/furion.vmdl";
        modelScale = .79;
        movementSpeed = 295;
        movementTurnRate = .6;
        nameAliases = "np";
        pickSound = "furion_furi_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_furion";
        projectileModel = "particles/units/heroes/hero_furion/furion_base_attack.vpcf";
        projectileSpeed = 1125;
        role = new String[]{"Carry","Jungler","Pusher","Escape","Nuker"};
        rolelevels = new int[]{1,3,3,1,1};
        soundSet = "Hero_Furion";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_furion.vsndevts";
        active = true;
        localizedName = "Nature's Prophet";
        shortKey = "furion";
        url = "Natures_Prophet";
    }

    public static Furion instance() {
        if( instance == null ){
            instance = new Furion();
        }
        return instance;
    }

    public FurionSprout getAbility1() {
        return ability1;
    }

    public FurionTeleportation getAbility2() {
        return ability2;
    }

    public FurionForceOfNature getAbility3() {
        return ability3;
    }

    public FurionWrathOfNature getAbility4() {
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

    public double getAttributeStrengthGain() {
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
        if (!(object instanceof Furion))
            return false;
        if (object == this)
            return true;
        Furion otherObject = (Furion) object;
        return otherObject.getKey().equals(getKey());
    }

}
