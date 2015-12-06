package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Rattletrap extends Hero {

    private static Rattletrap instance;

    private final RattletrapBatteryAssault ability1;
    private final RattletrapPowerCogs ability2;
    private final RattletrapRocketFlare ability3;
    private final RattletrapHookshot ability4;
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

    private Rattletrap() {
        ability1 = RattletrapBatteryAssault.instance();
        ability2 = RattletrapPowerCogs.instance();
        ability3 = RattletrapRocketFlare.instance();
        ability4 = RattletrapHookshot.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.3;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 24;
        attributeIntelligenceGain = 1.3;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.7;
        banSound = "rattletrap_ratt_anger_06";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{252,220,64};
        heroID = 51;
        heroSelectSoundEffect = "Hero_Rattletrap.Pick";
        heroUnlockOrder = 3;
        key = "npc_dota_hero_rattletrap";
        lastHitChallengeRival = "npc_dota_hero_sand_king";
        loadoutScale = 1.1;
        model = "models/heroes/rattletrap/rattletrap.vmdl";
        modelScale = .88;
        movementSpeed = 315;
        movementTurnRate = .6;
        pickSound = "rattletrap_ratt_spawn_05";
        portrait = "vgui/hud/heroportraits/portrait_rattletrap";
        role = new String[]{"Initiator","Disabler","Durable","Nuker"};
        rolelevels = new int[]{3,2,1,1};
        soundSet = "Hero_Rattletrap";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_rattletrap.vsndevts";
        active = true;
        localizedName = "Clockwerk";
        shortKey = "rattletrap";
        url = "Clockwerk";
    }

    public static Rattletrap instance() {
        if( instance == null ){
            instance = new Rattletrap();
        }
        return instance;
    }

    public RattletrapBatteryAssault getAbility1() {
        return ability1;
    }

    public RattletrapPowerCogs getAbility2() {
        return ability2;
    }

    public RattletrapRocketFlare getAbility3() {
        return ability3;
    }

    public RattletrapHookshot getAbility4() {
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
        if (!(object instanceof Rattletrap))
            return false;
        if (object == this)
            return true;
        Rattletrap otherObject = (Rattletrap) object;
        return otherObject.getKey().equals(getKey());
    }

}
