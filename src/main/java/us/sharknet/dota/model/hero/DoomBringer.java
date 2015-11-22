package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DoomBringer extends Hero {

    private static DoomBringer instance;

    private final DoomBringerDevour ability1;
    private final DoomBringerScorchedEarth ability2;
    private final DoomBringerLvlDeath ability3;
    private final DoomBringerEmpty1 ability4;
    private final DoomBringerEmpty2 ability5;
    private final DoomBringerDoom ability6;
    private final AttributeBonus ability7;
    private final int abilityDraftDisabled;
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
    private final double attributeStrengthGain;
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
    private final String nameAliases;
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

    private DoomBringer() {
        ability1 = DoomBringerDevour.instance();
        ability2 = DoomBringerScorchedEarth.instance();
        ability3 = DoomBringerLvlDeath.instance();
        ability4 = DoomBringerEmpty1.instance();
        ability5 = DoomBringerEmpty2.instance();
        ability6 = DoomBringerDoom.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 6;
        armorPhysical = -1;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 27;
        attackRange = 15;
        attackRate = 1.7;
        attributeAgilityGain = .9;
        attributeBaseAgility = 11;
        attributeBaseIntelligence = 13;
        attributeBaseStrength = 26;
        attributeIntelligenceGain = 2.1;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3.2;
        banSound = "doom_bringer_doom_anger_02";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 24;
        heroGlowColor = new int[]{107,74,53};
        heroID = 69;
        heroSelectSoundEffect = "Hero_DoomBringer.Pick";
        heroUnlockOrder = 2;
        idleSoundLoop = "Hero_DoomBringer.IdleLoop";
        key = "npc_dota_hero_doom_bringer";
        lastHitChallengeRival = "npc_dota_hero_lich";
        loadoutScale = .7;
        model = "models/heroes/doom/doom.vmdl";
        modelScale = .86;
        movementSpeed = 29;
        movementTurnRate = .5;
        nameAliases = "db";
        pickSound = "doom_bringer_doom_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_doom_bringer";
        role = new String[]{"Carry","Disabler","Initiator","Durable","Nuker"};
        rolelevels = new int[]{1,2,2,2,1};
        soundSet = "Hero_DoomBringer";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_doom_bringer.vsndevts";
        active = true;
        localizedName = "Doom";
        shortKey = "doom_bringer";
        url = "Doom";
    }

    public static DoomBringer instance() {
        if( instance == null ){
            instance = new DoomBringer();
        }
        return instance;
    }

    public DoomBringerDevour getAbility1() {
        return ability1;
    }

    public DoomBringerScorchedEarth getAbility2() {
        return ability2;
    }

    public DoomBringerLvlDeath getAbility3() {
        return ability3;
    }

    public DoomBringerEmpty1 getAbility4() {
        return ability4;
    }

    public DoomBringerEmpty2 getAbility5() {
        return ability5;
    }

    public DoomBringerDoom getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
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
        if (!(object instanceof DoomBringer))
            return false;
        if (object == this)
            return true;
        DoomBringer otherObject = (DoomBringer) object;
        return otherObject.getKey().equals(getKey());
    }

}
