package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class LegionCommander extends Hero {

    private static LegionCommander instance;

    private final LegionCommanderOverwhelmingOdds ability1;
    private final LegionCommanderPressTheAttack ability2;
    private final LegionCommanderMomentOfCourage ability3;
    private final LegionCommanderDuel ability4;
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
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String[] nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private LegionCommander() {
        ability1 = LegionCommanderOverwhelmingOdds.instance();
        ability2 = LegionCommanderPressTheAttack.instance();
        ability3 = LegionCommanderMomentOfCourage.instance();
        ability4 = LegionCommanderDuel.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 39;
        attackDamageMin = 35;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 26;
        attributeIntelligenceGain = 2.2;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.6;
        banSound = "legion_commander_legcom_anger_07";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 200;
        heroID = 104;
        heroSelectSoundEffect = "Hero_LegionCommander.Pick";
        iD = 104;
        idleExpression = "scenes/legion_commander/legion_commander_exp_idle_01.vcd";
        key = "npc_dota_hero_legion_commander";
        lastHitChallengeRival = "npc_dota_hero_kunkka";
        model = "models/heroes/legion_commander/legion_commander.vmdl";
        modelScale = 1.25;
        movementSpeed = 320;
        movementTurnRate = .5;
        nameAliases = new String[]{"Tresdin","Legion"};
        pickSound = "legion_commander_legcom_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_legion_commander";
        role = new String[]{"Carry","Disabler","Initiator","Durable","Nuker"};
        rolelevels = new int[]{1,2,1,1,1};
        soundSet = "Hero_LegionCommander";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_legion_commander.vsndevts";
        active = true;
        localizedName = "Legion Commander";
        shortKey = "legion_commander";
        url = "Legion_Commander";
    }

    public static LegionCommander instance() {
        if( instance == null ){
            instance = new LegionCommander();
        }
        return instance;
    }

    public LegionCommanderOverwhelmingOdds getAbility1() {
        return ability1;
    }

    public LegionCommanderPressTheAttack getAbility2() {
        return ability2;
    }

    public LegionCommanderMomentOfCourage getAbility3() {
        return ability3;
    }

    public LegionCommanderDuel getAbility4() {
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

    public String[] getNameAliases() {
        return nameAliases;
    }

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
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
        if (!(object instanceof LegionCommander))
            return false;
        if (object == this)
            return true;
        LegionCommander otherObject = (LegionCommander) object;
        return otherObject.getKey().equals(getKey());
    }

}
