package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Juggernaut extends Hero {

    private static Juggernaut instance;

    private final JuggernautBladeFury ability1;
    private final JuggernautHealingWard ability2;
    private final JuggernautBladeDance ability3;
    private final JuggernautOmniSlash ability4;
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
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
    private final String key;
    private final String lastHitChallengeRival;
    private final int loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final int press;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Juggernaut() {
        ability1 = JuggernautBladeFury.instance();
        ability2 = JuggernautHealingWard.instance();
        ability3 = JuggernautBladeDance.instance();
        ability4 = JuggernautOmniSlash.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.4;
        attributeAgilityGain = 2.4;
        attributeBaseAgility = 26;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.9;
        banSound = "juggernaut_jug_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 170;
        heroGlowColor = new int[]{222,120,36};
        heroID = 8;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Juggernaut.Pick";
        heroUnlockOrder = 3;
        iD = 8;
        key = "npc_dota_hero_juggernaut";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        loadoutScale = 1;
        model = "models/heroes/juggernaut/juggernaut.vmdl";
        modelScale = .85;
        movementSpeed = 305;
        movementTurnRate = .6;
        pickSound = "juggernaut_jug_spawn_03";
        portrait = "vgui/hud/heroportraits/portrait_juggernaut";
        press = 1;
        projectileSpeed = 0;
        role = new String[]{"Carry","Pusher","Escape"};
        rolelevels = new int[]{2,1,1};
        soundSet = "Hero_Juggernaut";
        statusHealthRegen = .75;
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_juggernaut.vsndevts";
        active = true;
        localizedName = "Juggernaut";
        new_player_enable = 1;
        shortKey = "juggernaut";
        url = "Juggernaut";
    }

    public static Juggernaut instance() {
        if( instance == null ){
            instance = new Juggernaut();
        }
        return instance;
    }

    public JuggernautBladeFury getAbility1() {
        return ability1;
    }

    public JuggernautHealingWard getAbility2() {
        return ability2;
    }

    public JuggernautBladeDance getAbility3() {
        return ability3;
    }

    public JuggernautOmniSlash getAbility4() {
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

    public int getBotImplemented() {
        return botImplemented;
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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

    public int getHeroPool1() {
        return heroPool1;
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

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
    }

    public int getLoadoutScale() {
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

    public int getPress() {
        return press;
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

    public int getNewPlayerEnable() {
        return new_player_enable;
    }

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Juggernaut))
            return false;
        if (object == this)
            return true;
        Juggernaut otherObject = (Juggernaut) object;
        return otherObject.getKey().equals(getKey());
    }

}
