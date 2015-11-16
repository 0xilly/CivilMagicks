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

import net.minecraft.item.ItemStack;

public class ElementalCrafting {

    ItemStack[]    inputs;
    ItemStack      output;
    ElementalTypes elemental;
    
    /**
     * @param inputs
     * @param output
     * @param elemental
     */
    public ElementalCrafting(ItemStack[] inputs, ItemStack output, ElementalTypes elemental) {
        this.inputs = inputs;
        this.output = output;
        this.elemental = elemental;
    }
    /**
     * @return the inputs
     */
    public ItemStack[] getInputs() {
        return inputs;
    }
    /**
     * @param inputs the inputs to set
     */
    public void setInputs(ItemStack[] inputs) {
        this.inputs = inputs;
    }
    /**
     * @return the output
     */
    public ItemStack getOutput() {
        return output;
    }
    /**
     * @param output the output to set
     */
    public void setOutput(ItemStack output) {
        this.output = output;
    }
    /**
     * @return the elemental
     */
    public ElementalTypes getElemental() {
        return elemental;
    }
    /**
     * @param elemental the elemental to set
     */
    public void setElemental(ElementalTypes elemental) {
        this.elemental = elemental;
    }

}
