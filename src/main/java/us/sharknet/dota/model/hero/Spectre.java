package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Spectre extends Hero {

    private static Spectre instance;

    private final SpectreSpectralDagger ability1;
    private final SpectreDesolate ability2;
    private final SpectreDispersion ability3;
    private final SpectreReality ability4;
    private final SpectreHaunt ability5;
    private final AttributeBonus ability6;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
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

    private Spectre() {
        ability1 = SpectreSpectralDagger.instance();
        ability2 = SpectreDesolate.instance();
        ability3 = SpectreDispersion.instance();
        ability4 = SpectreReality.instance();
        ability5 = SpectreHaunt.instance();
        ability6 = AttributeBonus.instance();
        abilityLayout = 5;
        armorPhysical = 0;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 27;
        attackDamageMin = 23;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 1.9;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        banSound = "spectre_spec_anger_02";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 18;
        heroGlowColor = new int[]{107,74,53};
        heroID = 67;
        heroSelectSoundEffect = "Hero_Spectre.Pick";
        heroUnlockOrder = 2;
        idleSoundLoop = "Hero_Spectre.IdleLoop";
        key = "npc_dota_hero_spectre";
        lastHitChallengeRival = "npc_dota_hero_bounty_hunter";
        loadoutScale = .75;
        model = "models/heroes/spectre/spectre.vmdl";
        modelScale = .67;
        movementSpeed = 29;
        movementTurnRate = .4;
        pickSound = "spectre_spec_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_spectre";
        role = new String[]{"Carry","Durable","Escape"};
        rolelevels = new int[]{3,1,1};
        soundSet = "Hero_Spectre";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_spectre.vsndevts";
        active = true;
        localizedName = "Spectre";
        shortKey = "spectre";
        url = "Spectre";
    }

    public static Spectre instance() {
        if( instance == null ){
            instance = new Spectre();
        }
        return instance;
    }

    public SpectreSpectralDagger getAbility1() {
        return ability1;
    }

    public SpectreDesolate getAbility2() {
        return ability2;
    }

    public SpectreDispersion getAbility3() {
        return ability3;
    }

    public SpectreReality getAbility4() {
        return ability4;
    }

    public SpectreHaunt getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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
        if (!(object instanceof Spectre))
            return false;
        if (object == this)
            return true;
        Spectre otherObject = (Spectre) object;
        return otherObject.getKey().equals(getKey());
    }

}
