/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package info.mdhs.mods.civilmagicks.api.effect;

import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Optional;

public interface IEffectRegistry
{
    List<IEffect> getEffects();

    void registerEffect(IEffect effect);

    Optional<IEffect> getEffectByKey(ResourceLocation key);
}
