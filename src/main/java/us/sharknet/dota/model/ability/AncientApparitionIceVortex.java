package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AncientApparitionIceVortex extends Ability {

    private static AncientApparitionIceVortex instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCooldown;
    private final int abilityDuration;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int[] movement_speed_pct;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] spell_resist_pct;
    private final int[] vision_aoe;

    private AncientApparitionIceVortex() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.01,0.01,0.01,0.01};
        abilityCastRange = new int[]{1500,1500,1500,1500};
        abilityCooldown = 4;
        abilityDuration = 16;
        abilityManaCost = new int[]{80,90,100,110};
        iD = 5346;
        key = "ancient_apparition_ice_vortex";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Ice Vortex";
        movement_speed_pct = new int[]{-15,-20,-25,-30};
        owningHeroShortKey = "ancient_apparition";
        radius = new int[]{275,275,275,275};
        spell_resist_pct = new int[]{-15,-20,-25,-30};
        vision_aoe = new int[]{200,200,200,200};
    }

    public static AncientApparitionIceVortex instance() {
        if( instance == null ){
            instance = new AncientApparitionIceVortex();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovementSpeedPct() {
        return movement_speed_pct;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int[] getSpellResistPct() {
        return spell_resist_pct;
    }

    public int[] getVisionAoe() {
        return vision_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientApparitionIceVortex))
            return false;
        if (object == this)
            return true;
        AncientApparitionIceVortex otherObject = (AncientApparitionIceVortex) object;
        return otherObject.getKey().equals(getKey());
    }

}
