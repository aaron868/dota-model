package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Terrorblade extends Hero {

    private static Terrorblade instance;

    private final TerrorbladeReflection ability1;
    private final TerrorbladeConjureImage ability2;
    private final TerrorbladeMetamorphosis ability3;
    private final TerrorbladeSunder ability4;
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
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String key;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
    private final int projectileSpeed;
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

    private Terrorblade() {
        ability1 = TerrorbladeReflection.instance();
        ability2 = TerrorbladeConjureImage.instance();
        ability3 = TerrorbladeMetamorphosis.instance();
        ability4 = TerrorbladeSunder.instance();
        armorPhysical = 4;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.5;
        attributeAgilityGain = 3.2;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 1.75;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.4;
        banSound = "terrorblade_terr_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 0;
        enabled = 1;
        healthBarOffset = 280;
        heroID = 109;
        heroSelectSoundEffect = "Hero_Terrorblade.Pick";
        heroUnlockOrder = 1;
        key = "npc_dota_hero_terrorblade";
        loadoutScale = .9;
        model = "models/heroes/terrorblade/terrorblade.vmdl";
        modelScale = 1.1;
        movementSpeed = 315;
        movementTurnRate = .5;
        nameAliases = "tb";
        pickSound = "terrorblade_terr_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_terrorblade";
        projectileSpeed = 900;
        role = new String[]{"Carry","Pusher","Nuker"};
        rolelevels = new int[]{3,2,1};
        soundSet = "Hero_Terrorblade";
        statusHealthRegen = 2;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_terrorblade.vsndevts";
        active = true;
        localizedName = "Terrorblade";
        shortKey = "terrorblade";
        url = "Terrorblade";
    }

    public static Terrorblade instance() {
        if( instance == null ){
            instance = new Terrorblade();
        }
        return instance;
    }

    public TerrorbladeReflection getAbility1() {
        return ability1;
    }

    public TerrorbladeConjureImage getAbility2() {
        return ability2;
    }

    public TerrorbladeMetamorphosis getAbility3() {
        return ability3;
    }

    public TerrorbladeSunder getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Terrorblade))
            return false;
        if (object == this)
            return true;
        Terrorblade otherObject = (Terrorblade) object;
        return otherObject.getKey().equals(getKey());
    }

}
