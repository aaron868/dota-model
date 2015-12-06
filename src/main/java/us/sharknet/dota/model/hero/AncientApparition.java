package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class AncientApparition extends Hero {

    private static AncientApparition instance;

    private final AncientApparitionColdFeet ability1;
    private final AncientApparitionIceVortex ability2;
    private final AncientApparitionChillingTouch ability3;
    private final AncientApparitionIceBlast ability4;
    private final AncientApparitionIceBlastRelease ability5;
    private final AttributeBonus ability6;
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
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
    private final int noCombine;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private AncientApparition() {
        ability1 = AncientApparitionColdFeet.instance();
        ability2 = AncientApparitionIceVortex.instance();
        ability3 = AncientApparitionChillingTouch.instance();
        ability4 = AncientApparitionIceBlast.instance();
        ability5 = AncientApparitionIceBlastRelease.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .45;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 29;
        attackDamageMin = 19;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 20;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.4;
        banSound = "ancient_apparition_appa_anger_03";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 190;
        heroGlowColor = new int[]{53,74,107};
        heroID = 68;
        heroSelectSoundEffect = "Hero_Ancient_Apparition.Pick";
        heroUnlockOrder = 2;
        iD = 68;
        idleSoundLoop = "Hero_Ancient_Apparition.IdleLoop";
        key = "npc_dota_hero_ancient_apparition";
        lastHitChallengeRival = "npc_dota_hero_lich";
        loadoutScale = .75;
        model = "models/heroes/ancient_apparition/ancient_apparition.vmdl";
        modelScale = .84;
        movementSpeed = 295;
        movementTurnRate = .6;
        nameAliases = "aa";
        noCombine = 1;
        pickSound = "ancient_apparition_appa_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_ancient_apparition";
        projectileModel = "particles/units/heroes/hero_ancient_apparition/ancient_apparition_base_attack.vpcf";
        projectileSpeed = 1250;
        role = new String[]{"Support","Disabler","Nuker"};
        rolelevels = new int[]{2,1,1};
        soundSet = "Hero_ancient_apparition";
        team = "Bad";
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_ancient_apparition.vsndevts";
        active = true;
        localizedName = "Ancient Apparition";
        shortKey = "ancient_apparition";
        url = "Ancient_Apparition";
    }

    public static AncientApparition instance() {
        if( instance == null ){
            instance = new AncientApparition();
        }
        return instance;
    }

    public AncientApparitionColdFeet getAbility1() {
        return ability1;
    }

    public AncientApparitionIceVortex getAbility2() {
        return ability2;
    }

    public AncientApparitionChillingTouch getAbility3() {
        return ability3;
    }

    public AncientApparitionIceBlast getAbility4() {
        return ability4;
    }

    public AncientApparitionIceBlastRelease getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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

    public int getNoCombine() {
        return noCombine;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientApparition))
            return false;
        if (object == this)
            return true;
        AncientApparition otherObject = (AncientApparition) object;
        return otherObject.getKey().equals(getKey());
    }

}
