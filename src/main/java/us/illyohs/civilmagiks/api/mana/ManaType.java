/**
 * Copyright (c) 2016, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright notice, this
 *        list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright notice,
 *        this list of conditions and the following disclaimer in the documentation
 *        and/or other materials provided with the distribution.
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
 */

package us.illyohs.civilmagiks.api.mana;


import net.minecraft.util.text.translation.I18n;


public class ManaType {

    String  name;
    boolean spawnable;
    int     blend, color;

    /**
     *
     * @param name the name of the manaType
     * @param spawnable will this spawn with a monolith
     * @param color the color of the mana
     * @param blend the blend
     */
    public ManaType(String name, boolean spawnable, int color, int blend) {
        this.name       = name;
        this.spawnable  = spawnable;
        this.color      = color;
        this.blend      = blend;
    }

    public static void registerManaType(ManaType type) {

    }


    public String getLocalizedName() {
        return I18n.translateToLocal("civil.manatype." + name);
    }

    public boolean isSpawnable() {
        return spawnable;
    }

    public int getBlend() {
        return blend;
    }

    public int getColor() {
        return color;
    }

    /* These are the public manatypes */
    public static final ManaType EARTH  = new ManaType("earth", true, 0x4ca54c, 1);
    public static final ManaType FIRE   = new ManaType("fire",  true, 0xffb732, 1);
    public static final ManaType WATER  = new ManaType("water", true, 0x3030ff, 1);
    public static final ManaType WIND   = new ManaType("wind",  true, 0x8c8c8c, 1);
    //Gray is a neutral manatype that accepts all mana types
    public static final ManaType GREY   = new ManaType("grey",  true, 0x34332d, 1);
}
