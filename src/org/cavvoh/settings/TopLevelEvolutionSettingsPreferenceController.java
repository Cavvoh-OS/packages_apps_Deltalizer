/*
 * Copyright (C) 2019-2024 The Cavvoh OS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.cavvoh.settings;

import android.content.Context;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class TopLevelCavvohSettingsPreferenceController extends BasePreferenceController {

    public TopLevelCavvohSettingsPreferenceController(Context context,
            String preferenceKey) {
        super(context, preferenceKey);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }
}
