package us.sharknet.dota.model;

import org.junit.BeforeClass;
import org.junit.Test;
import us.sharknet.dota.model.item.*;

import java.util.HashMap;
import java.util.HashSet;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.*;

/**
 * Test Item attributes.
 */
public class ItemTest {

    private static Library library;

    @BeforeClass
    public static void setUpBeforeClass() {
        library = new Library();
    }

    @Test
    public void testCost() {
        assertEquals(2250, BlinkDagger.instance().getCost());
        assertEquals(275, WardSlot.instance().getCost());
        assertEquals(550, AetherLensRecipe.instance().getCost());
        assertEquals(1950, GlimmerCape.instance().getCost());

        assertEquals(1250, Dagon1Recipe.instance().getCost());
        assertEquals(1250, Dagon2Recipe.instance().getCost());
        assertEquals(1250, Dagon3Recipe.instance().getCost());
        assertEquals(1250, Dagon4Recipe.instance().getCost());
        assertEquals(1250, Dagon5Recipe.instance().getCost());
        assertEquals(2720, Dagon1.instance().getCost());
        assertEquals(3970, Dagon2.instance().getCost());
        assertEquals(5220, Dagon3.instance().getCost());
        assertEquals(6470, Dagon4.instance().getCost());
        assertEquals(7720, Dagon5.instance().getCost());

        assertEquals(700, DiffusalBlade1Recipe.instance().getCost());
        assertEquals(700, DiffusalBlade2Recipe.instance().getCost());
        assertEquals(3150, DiffusalBlade1.instance().getCost());
        assertEquals(3850, DiffusalBlade2.instance().getCost());

        assertEquals(2650, Necronomicon1.instance().getCost());
        assertEquals(1200, Necronomicon1Recipe.instance().getCost());
        assertEquals(3850, Necronomicon2.instance().getCost());
        assertEquals(1200, Necronomicon2Recipe.instance().getCost());
        assertEquals(5050, Necronomicon3.instance().getCost());
        assertEquals(1200, Necronomicon3Recipe.instance().getCost());

        assertEquals(2400, BootsOfTravel.instance().getCost());
        assertEquals(2000, BootsOfTravelRecipe.instance().getCost());
        assertEquals(4400, BootsofTravel2.instance().getCost());
        assertEquals(2000, BootsofTravel2Recipe.instance().getCost());
    }

    @Test
    public void testRecipe() {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_recipe_aether_lens");
        expected.add("item_recipe_armlet");
        expected.add("item_recipe_assault");
        expected.add("item_recipe_black_king_bar");
        expected.add("item_recipe_bloodstone");
        expected.add("item_recipe_travel_boots_2");
        expected.add("item_recipe_travel_boots");
        expected.add("item_recipe_bracer");
        expected.add("item_recipe_buckler");
        expected.add("item_recipe_crimson_guard");
        expected.add("item_recipe_lesser_crit");
        expected.add("item_recipe_greater_crit");
        expected.add("item_recipe_dagon");
        expected.add("item_recipe_dagon_2");
        expected.add("item_recipe_dagon_3");
        expected.add("item_recipe_dagon_4");
        expected.add("item_recipe_dagon_5");
        expected.add("item_recipe_desolator");
        expected.add("item_recipe_diffusal_blade");
        expected.add("item_recipe_diffusal_blade_2");
        expected.add("item_recipe_ancient_janggo");
        expected.add("item_recipe_cyclone");
        expected.add("item_recipe_force_staff");
        expected.add("item_recipe_guardian_greaves");
        expected.add("item_recipe_hand_of_midas");
        expected.add("item_recipe_headdress");
        expected.add("item_recipe_heart");
        expected.add("item_recipe_iron_talon");
        expected.add("item_recipe_sphere");
        expected.add("item_recipe_lotus_orb");
        expected.add("item_recipe_maelstrom");
        expected.add("item_recipe_manta");
        expected.add("item_recipe_mask_of_madness");
        expected.add("item_recipe_medallion_of_courage");
        expected.add("item_recipe_mekansm");
        expected.add("item_recipe_mjollnir");
        expected.add("item_recipe_necronomicon");
        expected.add("item_recipe_necronomicon_2");
        expected.add("item_recipe_necronomicon_3");
        expected.add("item_recipe_null_talisman");
        expected.add("item_recipe_orchid");
        expected.add("item_recipe_pipe");
        expected.add("item_recipe_radiance");
        expected.add("item_recipe_refresher");
        expected.add("item_recipe_sange");
        expected.add("item_recipe_satanic");
        expected.add("item_recipe_shivas_guard");
        expected.add("item_recipe_silver_edge");
        expected.add("item_recipe_basher");
        expected.add("item_recipe_soul_ring");
        expected.add("item_recipe_urn_of_shadows");
        expected.add("item_recipe_vladmir");
        expected.add("item_recipe_wraith_band");
        expected.add("item_recipe_yasha");

        //test positives
        for (String itemKey : expected) {
            assertTrue(library.getItem(itemKey).isRecipe());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.isRecipe());
            }
        }

    }

    @Test
    public void testConsumable() {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_cheese");
        expected.add("item_clarity");
        expected.add("item_dust");
        expected.add("item_enchanted_mango");
        expected.add("item_faerie_fire");
        expected.add("item_flask");
        expected.add("item_moon_shard");
        expected.add("item_tango_single");
        expected.add("item_smoke_of_deceit");
        expected.add("item_tango");
        expected.add("item_tpscroll");


        //test positives
        for (String itemKey : expected) {
            assertTrue(library.getItem(itemKey).isConsumable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.isConsumable());
            }
        }

    }

    @Test
    public void testPlaceable() {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_courier");
        expected.add("item_flying_courier");
        expected.add("item_branches");
        expected.add("item_ward_observer");
        expected.add("item_ward_sentry");

        //test positives
        for (String itemKey : expected) {
            assertTrue(library.getItem(itemKey).isPlaceable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.isPlaceable());
            }
        }
    }

    @Test
    public void testPlaceholder() {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_ward_dispenser");

        //test positives
        for (String itemKey : expected) {
            assertTrue(library.getItem(itemKey).isPlaceholder());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.isPlaceholder());
            }
        }
    }


    @Test
    public void testGetShareability() throws Exception {
        HashSet<String> fully = new HashSet<>();
        fully.add("item_tango_single");
        fully.add("item_courier");
        fully.add("item_cheese");
        fully.add("item_smoke_of_deceit");
        fully.add("item_flying_courier");
        fully.add("item_tpscroll");
        fully.add("item_ward_observer");
        fully.add("item_ward_sentry");
        fully.add("item_dust");

        for (String itemKey : fully) {
            assertEquals(Item.Shareablilty.FULLY_SHAREABLE, library.getItem(itemKey).getShareability());
        }


        HashSet<String> partial = new HashSet<>();
        partial.add("item_sobi_mask");
        partial.add("item_void_stone");
        partial.add("item_ring_of_regen");
        partial.add("item_gem");
        partial.add("item_bottle");
        partial.add("item_pers");
        partial.add("item_ring_of_health");
        partial.add("item_rapier");

        for (String itemKey : partial) {
            assertEquals(Item.Shareablilty.PARTIALLY_SHAREABLE, library.getItem(itemKey).getShareability());
        }
    }

    @Test
    public void testGetVendorLocations() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_aegis");
        expected.add("item_cheese");

        for (String itemKey : expected) {
            assertTrue(containsOnly(Item.Vendor.ROSHAN_DEATH, library.getItem(itemKey).getVendorLocations()));
        }
        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(containsOnly(Item.Vendor.ROSHAN_DEATH, item.getVendorLocations()));
            }
        }
        expected.clear();

        expected.add("item_demon_edge");
        expected.add("item_eagle");
        expected.add("item_energy_booster");
        expected.add("item_hyperstone");
        expected.add("item_mystic_staff");
        expected.add("item_platemail");
        expected.add("item_point_booster");
        expected.add("item_reaver");
        expected.add("item_relic");
        expected.add("item_talisman_of_evasion");
        expected.add("item_ultimate_orb");
        expected.add("item_vitality_booster");


        for (String itemKey : expected) {
            assertTrue(containsOnly(Item.Vendor.SECRET_SHOP, library.getItem(itemKey).getVendorLocations()));
        }
        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(containsOnly(Item.Vendor.SECRET_SHOP, item.getVendorLocations()));
            }
        }
        expected.clear();


        expected.add("item_boots_of_elves");
        expected.add("item_belt_of_strength");
        expected.add("item_blades_of_attack");
        expected.add("item_blink");
        expected.add("item_boots");
        expected.add("item_bottle");
        expected.add("item_broadsword");
        expected.add("item_chainmail");
        expected.add("item_cloak");
        expected.add("item_gloves");
        expected.add("item_helm_of_iron_will");
        expected.add("item_magic_stick");
        expected.add("item_lifesteal");
        expected.add("item_orb_of_venom");
        expected.add("item_quarterstaff");
        expected.add("item_quelling_blade");
        expected.add("item_ring_of_health");
        expected.add("item_ring_of_regen");
        expected.add("item_robe");
        expected.add("item_sobi_mask");
        expected.add("item_slippers");
        expected.add("item_stout_shield");
        expected.add("item_tpscroll");
        expected.add("item_void_stone");

        for (String itemKey : expected) {
            assertTrue(contains(Item.Vendor.SIDE_SHOP, library.getItem(itemKey).getVendorLocations()));
        }
        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(contains(Item.Vendor.SIDE_SHOP, item.getVendorLocations()));
            }
        }
        expected.clear();

        expected.add("item_abyssal_blade");
        expected.add("item_aether_lens");
        expected.add("item_recipe_aether_lens");
        expected.add("item_ultimate_scepter");
        expected.add("item_courier");
        expected.add("item_arcane_boots");
        expected.add("item_armlet");
        expected.add("item_recipe_armlet");
        expected.add("item_assault");
        expected.add("item_recipe_assault");
        expected.add("item_boots_of_elves");
        expected.add("item_bfury");
        expected.add("item_belt_of_strength");
        expected.add("item_black_king_bar");
        expected.add("item_recipe_black_king_bar");
        expected.add("item_blade_mail");
        expected.add("item_blade_of_alacrity");
        expected.add("item_blades_of_attack");
        expected.add("item_blink");
        expected.add("item_bloodstone");
        expected.add("item_recipe_bloodstone");
        expected.add("item_boots");
        expected.add("item_travel_boots");
        expected.add("item_travel_boots_2");
        expected.add("item_recipe_travel_boots_2");
        expected.add("item_recipe_travel_boots");
        expected.add("item_bottle");
        expected.add("item_bracer");
        expected.add("item_recipe_bracer");
        expected.add("item_broadsword");
        expected.add("item_buckler");
        expected.add("item_recipe_buckler");
        expected.add("item_butterfly");
        expected.add("item_chainmail");
        expected.add("item_circlet");
        expected.add("item_clarity");
        expected.add("item_claymore");
        expected.add("item_cloak");
        expected.add("item_crimson_guard");
        expected.add("item_recipe_crimson_guard");
        expected.add("item_lesser_crit");
        expected.add("item_recipe_lesser_crit");
        expected.add("item_greater_crit");
        expected.add("item_recipe_greater_crit");
        expected.add("item_dagon");
        expected.add("item_recipe_dagon");
        expected.add("item_dagon_2");
        expected.add("item_recipe_dagon_2");
        expected.add("item_dagon_3");
        expected.add("item_recipe_dagon_3");
        expected.add("item_dagon_4");
        expected.add("item_recipe_dagon_4");
        expected.add("item_dagon_5");
        expected.add("item_recipe_dagon_5");
        expected.add("item_desolator");
        expected.add("item_recipe_desolator");
        expected.add("item_diffusal_blade");
        expected.add("item_recipe_diffusal_blade");
        expected.add("item_diffusal_blade_2");
        expected.add("item_recipe_diffusal_blade_2");
        expected.add("item_rapier");
        expected.add("item_dragon_lance");
        expected.add("item_ancient_janggo");
        expected.add("item_recipe_ancient_janggo");
        expected.add("item_dust");
        expected.add("item_enchanted_mango");
        expected.add("item_ethereal_blade");
        expected.add("item_cyclone");
        expected.add("item_recipe_cyclone");
        expected.add("item_skadi");
        expected.add("item_faerie_fire");
        expected.add("item_flying_courier");
        expected.add("item_force_staff");
        expected.add("item_recipe_force_staff");
        expected.add("item_gauntlets");
        expected.add("item_gem");
        expected.add("item_ghost");
        expected.add("item_glimmer_cape");
        expected.add("item_gloves");
        expected.add("item_guardian_greaves");
        expected.add("item_recipe_guardian_greaves");
        expected.add("item_hand_of_midas");
        expected.add("item_recipe_hand_of_midas");
        expected.add("item_headdress");
        expected.add("item_recipe_headdress");
        expected.add("item_flask");
        expected.add("item_heart");
        expected.add("item_recipe_heart");
        expected.add("item_heavens_halberd");
        expected.add("item_helm_of_iron_will");
        expected.add("item_helm_of_the_dominator");
        expected.add("item_hood_of_defiance");
        expected.add("item_branches");
        expected.add("item_iron_talon");
        expected.add("item_recipe_iron_talon");
        expected.add("item_javelin");
        expected.add("item_sphere");
        expected.add("item_recipe_sphere");
        expected.add("item_lotus_orb");
        expected.add("item_recipe_lotus_orb");
        expected.add("item_maelstrom");
        expected.add("item_recipe_maelstrom");
        expected.add("item_magic_stick");
        expected.add("item_magic_wand");
        expected.add("item_manta");
        expected.add("item_recipe_manta");
        expected.add("item_mantle");
        expected.add("item_mask_of_madness");
        expected.add("item_recipe_mask_of_madness");
        expected.add("item_medallion_of_courage");
        expected.add("item_recipe_medallion_of_courage");
        expected.add("item_mekansm");
        expected.add("item_recipe_mekansm");
        expected.add("item_mithril_hammer");
        expected.add("item_mjollnir");
        expected.add("item_recipe_mjollnir");
        expected.add("item_monkey_king_bar");
        expected.add("item_moon_shard");
        expected.add("item_lifesteal");
        expected.add("item_necronomicon");
        expected.add("item_recipe_necronomicon");
        expected.add("item_necronomicon_2");
        expected.add("item_recipe_necronomicon_2");
        expected.add("item_necronomicon_3");
        expected.add("item_recipe_necronomicon_3");
        expected.add("item_null_talisman");
        expected.add("item_recipe_null_talisman");
        expected.add("item_oblivion_staff");
        expected.add("item_ward_observer");
        expected.add("item_octarine_core");
        expected.add("item_ogre_axe");
        expected.add("item_orb_of_venom");
        expected.add("item_orchid");
        expected.add("item_recipe_orchid");
        expected.add("item_pers");
        expected.add("item_phase_boots");
        expected.add("item_pipe");
        expected.add("item_recipe_pipe");
        expected.add("item_poor_mans_shield");
        expected.add("item_power_treads");
        expected.add("item_quarterstaff");
        expected.add("item_quelling_blade");
        expected.add("item_radiance");
        expected.add("item_recipe_radiance");
        expected.add("item_refresher");
        expected.add("item_recipe_refresher");
        expected.add("item_ring_of_aquila");
        expected.add("item_ring_of_basilius");
        expected.add("item_ring_of_health");
        expected.add("item_ring_of_protection");
        expected.add("item_ring_of_regen");
        expected.add("item_robe");
        expected.add("item_rod_of_atos");
        expected.add("item_sobi_mask");
        expected.add("item_sange");
        expected.add("item_sange_and_yasha");
        expected.add("item_recipe_sange");
        expected.add("item_satanic");
        expected.add("item_recipe_satanic");
        expected.add("item_sheepstick");
        expected.add("item_ward_sentry");
        expected.add("item_shadow_amulet");
        expected.add("item_invis_sword");
        expected.add("item_tango_single");
        expected.add("item_shivas_guard");
        expected.add("item_recipe_shivas_guard");
        expected.add("item_silver_edge");
        expected.add("item_recipe_silver_edge");
        expected.add("item_basher");
        expected.add("item_recipe_basher");
        expected.add("item_slippers");
        expected.add("item_smoke_of_deceit");
        expected.add("item_solar_crest");
        expected.add("item_soul_booster");
        expected.add("item_soul_ring");
        expected.add("item_recipe_soul_ring");
        expected.add("item_staff_of_wizardry");
        expected.add("item_stout_shield");
        expected.add("item_tango");
        expected.add("item_tpscroll");
        expected.add("item_tranquil_boots");
        expected.add("item_urn_of_shadows");
        expected.add("item_recipe_urn_of_shadows");
        expected.add("item_vanguard");
        expected.add("item_veil_of_discord");
        expected.add("item_vladmir");
        expected.add("item_recipe_vladmir");
        expected.add("item_void_stone");
        expected.add("item_ward_dispenser");
        expected.add("item_wraith_band");
        expected.add("item_recipe_wraith_band");
        expected.add("item_yasha");
        expected.add("item_recipe_yasha");

        for (String itemKey : expected) {
            assertTrue(contains(Item.Vendor.FOUNTAIN_SHOP, library.getItem(itemKey).getVendorLocations()));
        }
        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(contains(Item.Vendor.FOUNTAIN_SHOP, item.getVendorLocations()));
            }
        }
    }

    private boolean contains(Item.Vendor vendor, Item.Vendor[] vendors) {
        for (Item.Vendor v : vendors) {
            if (v == vendor) return true;
        }
        return false;
    }

    private boolean containsOnly(Item.Vendor vendor, Item.Vendor[] vendors) {
        return vendors.length == 1 && vendors[0] == vendor;
    }

    @Test
    public void testGetSellValue() throws Exception {
        assertEquals(975, library.getItem("item_glimmer_cape").getSellValue());
        assertEquals(0, library.getItem("item_aegis").getSellValue());
        assertEquals(63, library.getItem("item_enchanted_mango").getSellValue());
    }

    @Test
    public void testGetComponentsCount() throws Exception {
        //Count
        int expected = 88;
        int actual = 0;
        for( Item item: library.getItems()) {
            if( item.getComponents().length > 0){
                actual++;
            }
        }
        assertEquals( expected, actual);
    }

    @Test
    public void testGetComponentsKeys() throws Exception {
        for( Item item: library.getItems()) {
            if( item.getComponents().length > 0){
               for( String key : item.getComponents()) {
                   assertNotNull( library.getItem(key));
               }
            }
        }
    }

    @Test
    public void testGetComponentsValues() throws Exception {
        String[] expected = new String[]{"item_point_booster","item_staff_of_wizardry","item_ogre_axe","item_blade_of_alacrity"};
        Item item = library.getItem("item_ultimate_scepter");
        assertArrayEquals(expected, item.getComponents());

        expected = new String[]{"item_sange","item_talisman_of_evasion"};
        item = library.getItem("item_heavens_halberd");
        assertArrayEquals(expected, item.getComponents());

        expected = new String[]{"item_vitality_booster","item_staff_of_wizardry","item_staff_of_wizardry"};
        item = library.getItem("item_rod_of_atos");
        assertArrayEquals(expected, item.getComponents());

        expected = new String[]{"item_blade_of_alacrity","item_boots_of_elves","item_recipe_yasha"};
        item = library.getItem("item_yasha");
        assertArrayEquals(expected, item.getComponents());

        expected = new String[0];
        item = library.getItem("item_belt_of_strength");
        assertArrayEquals(expected, item.getComponents());
    }

    @Test
    public void testGetPartOfCount() throws Exception {
        //Count
        int expected = 130;
        int actual = 0;
        for( Item item: library.getItems()) {
            if( item.getPartOf().length > 0) actual++;
        }
        assertEquals( expected, actual);
    }

    @Test
    public void testGetPartOfKeys() throws Exception {
        for( Item item: library.getItems()) {
            if( item.getPartOf().length > 0){
                for( String key : item.getPartOf()) {
                    assertNotNull( library.getItem(key));
                }
            }
        }
    }

    @Test
    public void testGetPartOfValues() throws Exception {
        String[] expected = new String[]{"item_guardian_greaves"};
        Item item = library.getItem("item_arcane_boots");
        assertArrayEquals(expected, item.getPartOf());

        expected = new String[]{"item_monkey_king_bar","item_rapier","item_greater_crit"};
        item = library.getItem("item_demon_edge");
        assertArrayEquals(expected, item.getPartOf());

        expected = new String[]{"item_soul_booster","item_arcane_boots","item_aether_lens"};
        item = library.getItem("item_energy_booster");
        assertArrayEquals(expected, item.getPartOf());

        expected = new String[0];
        item = library.getItem("item_ultimate_scepter");
        assertArrayEquals(expected, item.getPartOf());
    }

    @Test
    public void testGetQuantity() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_tango");
        expected.add("item_ward_sentry");

        assertEquals(4, library.getItem("item_tango").getQuantity());
        assertEquals(2,  library.getItem("item_ward_sentry").getQuantity());


        //test the rest
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertEquals(1, item.getQuantity());
            }
        }
    }

    @Test
    public void testIsChargeable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_bloodstone");
        expected.add("item_bottle");
        expected.add("item_diffusal_blade");
        expected.add("item_diffusal_blade_2");
        expected.add("item_ancient_janggo");
        expected.add("item_magic_stick");
        expected.add("item_magic_wand");
        expected.add("item_urn_of_shadows");

        //test positives
        for (String itemKey : expected) {
            assertTrue(library.getItem(itemKey).isChargeable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.isChargeable());
            }
        }
    }

    @Test
    public void testGetInitialCharges() throws Exception {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("item_bloodstone", 8);
        expected.put("item_bottle", 3);
        expected.put("item_diffusal_blade", 8);
        expected.put("item_diffusal_blade_2", 8);
        expected.put("item_ancient_janggo", 6);
        expected.put("item_magic_stick", 0);
        expected.put("item_magic_wand", 0);
        expected.put("item_urn_of_shadows", 0);

        //test positives
        for (String itemKey : expected.keySet()) {
            assertEquals( expected.get(itemKey).intValue(), library.getItem(itemKey).getInitialCharges() );
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.containsKey(item.getKey())) {
                assertEquals( 0, item.getInitialCharges() );
            }
        }

    }

    @Test
    public void testGetMaxCharges() throws Exception {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("item_bloodstone", 9999);
        expected.put("item_bottle", 3);
        expected.put("item_diffusal_blade", 8);
        expected.put("item_diffusal_blade_2", 8);
        expected.put("item_ancient_janggo", 6);
        expected.put("item_magic_stick", 10);
        expected.put("item_magic_wand", 17);
        expected.put("item_urn_of_shadows", 9999);

        //test positives
        for (String itemKey : expected.keySet()) {
            assertEquals( expected.get(itemKey).intValue(), library.getItem(itemKey).getMaxCharges() );
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.containsKey(item.getKey())) {
                assertEquals( 0, item.getMaxCharges() );
            }
        }
    }

    @Test
    public void testGetPlaceableDuration() throws Exception {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("item_courier", 9999);
        expected.put("item_flying_courier", 9999);
        expected.put("item_branches", 20);
        expected.put("item_ward_observer", 420);
        expected.put("item_ward_sentry", 240);

        //test positives
        for (String itemKey : expected.keySet()) {
            assertEquals( expected.get(itemKey).intValue(), library.getItem(itemKey).getPlaceableDuration() );
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.containsKey(item.getKey())) {
                assertEquals( 0, item.getPlaceableDuration() );
            }
        }
    }

    @Test
    public void testIsDeniable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_rapier");
        expected.add("item_gem");

        //test positives
        for (String itemKey : expected) {
            assertFalse(library.getItem(itemKey).isDeniable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertTrue(item.isDeniable());
            }
        }
    }

    @Test
    public void testIsDisassemblable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_pers");
        expected.add("item_ring_of_basilius");
        expected.add("item_shivas_guard");
        expected.add("item_lotus_orb");
        expected.add("item_manta");
        expected.add("item_dragon_lance");
        expected.add("item_sange_and_yasha");
        expected.add("item_mjollnir");
        expected.add("item_helm_of_the_dominator");
        expected.add("item_ethereal_blade");
        expected.add("item_arcane_boots");
        expected.add("item_octarine_core");
        expected.add("item_solar_crest");
        expected.add("item_abyssal_blade");
        expected.add("item_heavens_halberd");
        expected.add("item_ring_of_aquila");
        expected.add("item_glimmer_cape");

        //test positives
        for (String itemKey : expected) {
            assertTrue(library.getItem(itemKey).isDisassemblable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.isDisassemblable());
            }
        }
    }

    @Test
    public void testIsDroppable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_aegis");
        expected.add("item_rapier");


        //test positives
        for (String itemKey : expected) {
            assertFalse(library.getItem(itemKey).isDroppable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertTrue(item.isDroppable());
            }
        }
    }

    @Test
    public void testIsPurchasable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_aegis");
        expected.add("item_cheese");
        expected.add("item_ward_dispenser");
        expected.add("item_tango_single");


        //test positives
        for (String itemKey : expected) {
            assertFalse(library.getItem(itemKey).isPurchasable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertTrue(item.isPurchasable());
            }
        }
    }

    @Test
    public void testIsStackable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_cheese");
        expected.add("item_clarity");
        expected.add("item_flask");
        expected.add("item_dust");
        expected.add("item_ward_observer");
        expected.add("item_ward_sentry");
        expected.add("item_tango");
        expected.add("item_tpscroll");
        expected.add("item_smoke_of_deceit");

        //test positives
        for (String itemKey : expected) {
            assertTrue(itemKey,library.getItem(itemKey).isStackable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertFalse(item.getKey(), item.isStackable());
            }
        }
    }

    @Test
    public void testIsSellable() throws Exception {
        HashSet<String> expected = new HashSet<>();
        expected.add("item_gem");
        expected.add("item_tango_single");
        expected.add("item_aegis");
        expected.add("item_rapier");

        //test positives
        for (String itemKey : expected) {
            assertFalse(library.getItem(itemKey).isSellable());
        }

        //test negatives
        for (Item item : library.getItems()) {
            if (!expected.contains(item.getKey())) {
                assertTrue(item.isSellable());
            }
        }
    }
}
