package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Visage extends Hero {

    private static Visage instance;

    private final VisageGraveChill ability1;
    private final VisageSoulAssumption ability2;
    private final VisageGravekeepersCloak ability3;
    private final VisageSummonFamiliars ability4;
    private final AttributeBonus ability5;
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
    private final int iD;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final int magicalResistance;
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
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Visage() {
        ability1 = VisageGraveChill.instance();
        ability2 = VisageSoulAssumption.instance();
        ability3 = VisageGravekeepersCloak.instance();
        ability4 = VisageSummonFamiliars.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 11;
        attributeBaseIntelligence = 24;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.4;
        banSound = "visage_visa_anger_10";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroID = 92;
        heroSelectSoundEffect = "Hero_Visage.Pick";
        iD = 92;
        idleExpression = "scenes/visage/visage_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Visage.IdleLoop";
        key = "npc_dota_hero_visage";
        lastHitChallengeRival = "npc_dota_hero_lion";
        loadoutScale = .75;
        magicalResistance = 10;
        model = "models/heroes/visage/visage.vmdl";
        modelScale = .67;
        movementSpeed = 285;
        movementTurnRate = .5;
        nameAliases = "visage";
        noCombine = 1;
        pickSound = "visage_visa_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_visage";
        projectileModel = "particles/units/heroes/hero_visage/visage_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Nuker","Durable","Disabler","Pusher"};
        rolelevels = new int[]{1,2,1,1,1};
        soundSet = "Hero_Visage";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_visage.vsndevts";
        active = true;
        localizedName = "Visage";
        shortKey = "visage";
        url = "Visage";
    }

    public static Visage instance() {
        if( instance == null ){
            instance = new Visage();
        }
        return instance;
    }

    public VisageGraveChill getAbility1() {
        return ability1;
    }

    public VisageSoulAssumption getAbility2() {
        return ability2;
    }

    public VisageGravekeepersCloak getAbility3() {
        return ability3;
    }

    public VisageSummonFamiliars getAbility4() {
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

    public int getID() {
        return iD;
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

    public int getMagicalResistance() {
        return magicalResistance;
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
        if (!(object instanceof Visage))
            return false;
        if (object == this)
            return true;
        Visage otherObject = (Visage) object;
        return otherObject.getKey().equals(getKey());
    }

}
