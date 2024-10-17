/*
 * Copyright (C) 2019-2024 The Cavvoh OS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.cavvoh.settings;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.dashboard.DashboardFragment;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settingslib.search.SearchIndexable;

@SearchIndexable
public class CavvohSettings extends DashboardFragment {

    private static final String TAG = "CavvohSettings";

    @Override
    protected int getPreferenceScreenResId() {
        return R.xml.cavvoh_settings;
    }

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.DELTALIZER;
    }

    @Override
    protected String getLogTag() {
        return TAG;
    }

    public static final BaseSearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
            new BaseSearchIndexProvider(R.xml.cavvoh_settings);
}
