package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Meepo extends Hero {

    private static Meepo instance;

    private final int aRDMDisabled;
    private final MeepoEarthbind ability1;
    private final MeepoPoof ability2;
    private final MeepoGeostrike ability3;
    private final MeepoDividedWeStand ability4;
    private final AttributeBonus ability5;
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
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final int magicalResistance;
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
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Meepo() {
        aRDMDisabled = 1;
        ability1 = MeepoEarthbind.instance();
        ability2 = MeepoPoof.instance();
        ability3 = MeepoGeostrike.instance();
        ability4 = MeepoDividedWeStand.instance();
        ability5 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 1;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .38;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 22;
        attackDamageMin = 16;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 2;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        banSound = "meepo_meepo_anger_12";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 125;
        heroID = 82;
        heroSelectSoundEffect = "Hero_Meepo.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/meepo/meepo_exp_idle_01.vcd";
        key = "npc_dota_hero_meepo";
        lastHitChallengeRival = "npc_dota_hero_sand_king";
        magicalResistance = 35;
        model = "models/heroes/meepo/meepo.vmdl";
        modelScale = .93;
        movementSpeed = 315;
        movementTurnRate = .65;
        nameAliases = new String[]{"geomancer","meepwn"};
        pickSound = "meepo_meepo_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_chaos_knight";
        role = new String[]{"Carry","Escape","Nuker","Disabler","Initiator","Pusher"};
        rolelevels = new int[]{2,2,2,1,1,1};
        soundSet = "Hero_Meepo";
        team = "Bad";
        visionDaytimeRange = 18;
        visionNighttimeRange = 8;
        voiceFile = "soundevents/voscripts/game_sounds_vo_meepo.vsndevts";
        active = true;
        localizedName = "Meepo";
        shortKey = "meepo";
        url = "Meepo";
    }

    public static Meepo instance() {
        if( instance == null ){
            instance = new Meepo();
        }
        return instance;
    }

    public int getARDMDisabled() {
        return aRDMDisabled;
    }

    public MeepoEarthbind getAbility1() {
        return ability1;
    }

    public MeepoPoof getAbility2() {
        return ability2;
    }

    public MeepoGeostrike getAbility3() {
        return ability3;
    }

    public MeepoDividedWeStand getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
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
        if (!(object instanceof Meepo))
            return false;
        if (object == this)
            return true;
        Meepo otherObject = (Meepo) object;
        return otherObject.getKey().equals(getKey());
    }

}
