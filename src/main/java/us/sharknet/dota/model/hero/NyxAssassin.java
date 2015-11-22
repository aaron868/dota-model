package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class NyxAssassin extends Hero {

    private static NyxAssassin instance;

    private final NyxAssassinImpale ability1;
    private final NyxAssassinManaBurn ability2;
    private final NyxAssassinSpikedCarapace ability3;
    private final NyxAssassinBurrow ability4;
    private final NyxAssassinUnburrow ability5;
    private final NyxAssassinVendetta ability6;
    private final AttributeBonus ability7;
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
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
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
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private NyxAssassin() {
        ability1 = NyxAssassinImpale.instance();
        ability2 = NyxAssassinManaBurn.instance();
        ability3 = NyxAssassinSpikedCarapace.instance();
        ability4 = NyxAssassinBurrow.instance();
        ability5 = NyxAssassinUnburrow.instance();
        ability6 = NyxAssassinVendetta.instance();
        ability7 = AttributeBonus.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 30;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 19;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2.1;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        banSound = "nyx_assassin_nyx_anger_07";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 200;
        heroID = 88;
        heroSelectSoundEffect = "Hero_Nyx.Pick";
        idleExpression = "scenes/nyx_assassin/nyx_assassin_exp_idle_01.vcd";
        key = "npc_dota_hero_nyx_assassin";
        lastHitChallengeRival = "npc_dota_hero_bounty_hunter";
        model = "models/heroes/nerubian_assassin/nerubian_assassin.vmdl";
        modelScale = .98;
        movementSpeed = 300;
        movementTurnRate = .5;
        nameAliases = new String[]{"nerubian","na"};
        pickSound = "nyx_assassin_nyx_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_nerubian_assassin";
        role = new String[]{"Disabler","Nuker","Initiator","Escape"};
        rolelevels = new int[]{2,2,2,1};
        soundSet = "Hero_NyxAssassin";
        statusHealthRegen = 2.5;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_nyx_assassin.vsndevts";
        active = true;
        localizedName = "Nyx Assassin";
        shortKey = "nyx_assassin";
        url = "Nyx_Assassin";
    }

    public static NyxAssassin instance() {
        if( instance == null ){
            instance = new NyxAssassin();
        }
        return instance;
    }

    public NyxAssassinImpale getAbility1() {
        return ability1;
    }

    public NyxAssassinManaBurn getAbility2() {
        return ability2;
    }

    public NyxAssassinSpikedCarapace getAbility3() {
        return ability3;
    }

    public NyxAssassinBurrow getAbility4() {
        return ability4;
    }

    public NyxAssassinUnburrow getAbility5() {
        return ability5;
    }

    public NyxAssassinVendetta getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
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
        if (!(object instanceof NyxAssassin))
            return false;
        if (object == this)
            return true;
        NyxAssassin otherObject = (NyxAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
