package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Abaddon extends Hero {

    private static Abaddon instance;

    private final AbaddonDeathCoil ability1;
    private final AbaddonAphoticShield ability2;
    private final AbaddonFrostmourne ability3;
    private final AbaddonBorrowedTime ability4;
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
    private final int attributeIntelligenceGain;
    private final String attributePrimary;
    private final double attributeStrengthGain;
    private final String banSound;
    private final int cMEnabled;
    private final int enabled;
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
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
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Abaddon() {
        ability1 = AbaddonDeathCoil.instance();
        ability2 = AbaddonAphoticShield.instance();
        ability3 = AbaddonFrostmourne.instance();
        ability4 = AbaddonBorrowedTime.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .56;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 42;
        attackDamageMin = 32;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.7;
        banSound = "abaddon_abad_anger_07";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 175;
        heroID = 12;
        heroSelectSoundEffect = "Hero_Abaddon.Pick";
        key = "npc_dota_hero_abaddon";
        lastHitChallengeRival = "npc_dota_hero_chaos_knight";
        loadoutScale = .73;
        model = "models/heroes/abaddon/abaddon.vmdl";
        modelScale = .78;
        movementSpeed = 31;
        movementTurnRate = .5;
        nameAliases = "Abaddon";
        noCombine = 1;
        pickSound = "abaddon_abad_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_abaddon";
        role = new String[]{"Support","Carry","Durable"};
        rolelevels = new int[]{2,1,2};
        soundSet = "Hero_Abaddon";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_abaddon.vsndevts";
        active = true;
        localizedName = "Abaddon";
        shortKey = "abaddon";
        url = "Abaddon";
    }

    public static Abaddon instance() {
        if( instance == null ){
            instance = new Abaddon();
        }
        return instance;
    }

    public AbaddonDeathCoil getAbility1() {
        return ability1;
    }

    public AbaddonAphoticShield getAbility2() {
        return ability2;
    }

    public AbaddonFrostmourne getAbility3() {
        return ability3;
    }

    public AbaddonBorrowedTime getAbility4() {
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

    public int getAttributeIntelligenceGain() {
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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
        if (!(object instanceof Abaddon))
            return false;
        if (object == this)
            return true;
        Abaddon otherObject = (Abaddon) object;
        return otherObject.getKey().equals(getKey());
    }

}
