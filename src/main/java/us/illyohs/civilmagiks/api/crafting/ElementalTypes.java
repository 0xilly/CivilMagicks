/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagiks.api.crafting;

import java.util.LinkedHashMap;

import org.apache.commons.lang3.text.WordUtils;

//Based after Azanors aspect class
public class ElementalTypes {

    String           key;
    ElementalTypes[] components;
    int              color;
    int              blend;

    /**
     * 
     */
    public ElementalTypes(String key, int color, int blend, ElementalTypes[] components) {
        if (elementalTypes.containsKey(key)) throw new IllegalArgumentException("The element: " + key + " has already been registerd");
        this.key = key;
        this.color = color;
        this.blend = blend;
        this.components = components;
    }

    //Shortcut method do not use
    public ElementalTypes(String key, int color, int blend) {
        this(key, color, blend, (ElementalTypes[]) null);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ElementalTypes[] getComponents() {
        return components;
    }

    public void setComponents(ElementalTypes[] components) {
        this.components = components;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getBlend() {
        return blend;
    }

    public void setBlend(int blend) {
        this.blend = blend;
    }
    
    public boolean isBaseElement() {
        return getComponents()==null || getComponents().length !=2;
    }
    
    public static ElementalTypes getElement(String key) {
        return elementalTypes.get(key);
    }
    
    public String getName(String key) {
        return WordUtils.capitalize(key);
    }

    public static LinkedHashMap<String, ElementalTypes> elementalTypes = new LinkedHashMap<String, ElementalTypes>();

    //Base elements there should ONLY be four of these I might break this if somebody adds more of these
    public static final ElementalTypes EARTH = new ElementalTypes("earth", 0x339933, 1);
    public static final ElementalTypes FIRE  = new ElementalTypes("fire" , 0xcc3300, 1);
    public static final ElementalTypes WATER = new ElementalTypes("water", 0x0099FF, 1);
    public static final ElementalTypes WIND  = new ElementalTypes("wind" , 0xCCFFFF, 1);

    // Combo for higher tier basins
    public static final ElementalTypes DUST  = new ElementalTypes("dust" , 0x996666, 1, new ElementalTypes[] {EARTH, WIND});
    public static final ElementalTypes LAVA  = new ElementalTypes("lava" , 0xFF9900, 1, new ElementalTypes[] {EARTH, FIRE});
    public static final ElementalTypes MIST  = new ElementalTypes("mist" , 0x88BBFF, 1, new ElementalTypes[] {WATER, WIND});
    public static final ElementalTypes MUD   = new ElementalTypes("mud"  , 0x665500, 1, new ElementalTypes[] {EARTH, WATER});
    public static final ElementalTypes SMOKE = new ElementalTypes("smoke", 0x808080, 1, new ElementalTypes[] {FIRE,  WIND});
    public static final ElementalTypes STEAM = new ElementalTypes("steam", 0x8080FF, 1, new ElementalTypes[] {WATER, FIRE});

}
