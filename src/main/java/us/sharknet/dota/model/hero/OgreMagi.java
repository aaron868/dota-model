package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class OgreMagi extends Hero {

    private static OgreMagi instance;

    private final OgreMagiFireblast ability1;
    private final OgreMagiIgnite ability2;
    private final OgreMagiBloodlust ability3;
    private final OgreMagiUnrefinedFireblast ability4;
    private final OgreMagiMulticast ability5;
    private final AttributeBonus ability6;
    private final int abilityDraftDisabled;
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
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
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

    private OgreMagi() {
        ability1 = OgreMagiFireblast.instance();
        ability2 = OgreMagiIgnite.instance();
        ability3 = OgreMagiBloodlust.instance();
        ability4 = OgreMagiUnrefinedFireblast.instance();
        ability5 = OgreMagiMulticast.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 6;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 47;
        attackDamageMin = 41;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.55;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 2.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 3.2;
        banSound = "ogre_magi_ogmag_anger_04";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 18;
        heroID = 84;
        heroSelectSoundEffect = "Hero_OgreMagi.Pick";
        idleExpression = "scenes/ogre_magi/ogre_magi_exp_idle_01.vcd";
        key = "npc_dota_hero_ogre_magi";
        lastHitChallengeRival = "npc_dota_hero_dragon_knight";
        loadoutScale = .87;
        model = "models/heroes/ogre_magi/ogre_magi.vmdl";
        modelScale = .93;
        movementSpeed = 295;
        movementTurnRate = .6;
        nameAliases = "om";
        pickSound = "ogre_magi_ogmag_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_chaos_knight";
        role = new String[]{"Support","Nuker","Disabler","Durable","Initiator"};
        rolelevels = new int[]{2,2,2,1,1};
        soundSet = "Hero_OgreMagi";
        statusHealthRegen = 2.5;
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_ogre_magi.vsndevts";
        active = true;
        localizedName = "Ogre Magi";
        shortKey = "ogre_magi";
        url = "Ogre_Magi";
    }

    public static OgreMagi instance() {
        if( instance == null ){
            instance = new OgreMagi();
        }
        return instance;
    }

    public OgreMagiFireblast getAbility1() {
        return ability1;
    }

    public OgreMagiIgnite getAbility2() {
        return ability2;
    }

    public OgreMagiBloodlust getAbility3() {
        return ability3;
    }

    public OgreMagiUnrefinedFireblast getAbility4() {
        return ability4;
    }

    public OgreMagiMulticast getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
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

    public String getNameAliases() {
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
        if (!(object instanceof OgreMagi))
            return false;
        if (object == this)
            return true;
        OgreMagi otherObject = (OgreMagi) object;
        return otherObject.getKey().equals(getKey());
    }

}
