# dota-model

## Overview
This library provides a simple Java API for the Dota 2 VPK file data. This includes:
 
 * npc_heroes
 * items
 * npc_units
 * npc_abilities
 
## Usage
You can use this library in one of two ways: through the Library class or by getting the object you want directly.

The Library class allows you to find the object by using its key.For example to get the data for the hero Anti-Mage,

```java
import us.sharknet.dota.model;

Library library = new Library();
Antimage antimage = library.getHero("npc_dota_hero_antimage");
System.out.println( antimage.getAttackRange() );
```  

This is useful if you are using the Clarity replay parser and need to get the hero data from a key.
  
Alternately, you can simply get the object you want directly. For example, to get the data for a Yash:

```java
import us.sharknet.dota.model;
import us.sharknet.dota.model.item.*;


Yasha yasha = Yasha.instance();
System.out.println( yasha.getBonusAgility() );
```  

You will have to browse through the classes under model.item, model.hero, etc. to see what is available.

## Design
 
These are challenging to model in Java because they do not follow a standard class hierarchy. Instead, each "object" can have different properties. For this reason I have modeled them as distinct classes. Every hero, item, unit, and ability is its own class. There is, however, a parent, abstract class for each that has a few common properties.
 
All the Dota object are modeled as immutable, singletons. There is only one instance of every object. Every object is a JavaBean as well so you can use them with other libraries that recognize the JavaBean standard.

## Status
This is alpha level code and is guranteed to have bugs and probably to change somewhat as I refine it. All the Java code is generated from a custom parser so its deeply ugly.  

 I've also provided CSV files with the English name to Dota key mappings in case that is useful for you as well.