/*
 * Copyright (C) 2018 Citrus-CAF Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.deviceinfo.custom;

import android.content.Context;
import android.os.SystemProperties;
import android.support.v7.preference.Preference;
import android.text.TextUtils;

import com.android.settings.R;
import com.android.settings.core.PreferenceControllerMixin;
import com.android.settingslib.core.AbstractPreferenceController;
import com.android.internal.util.custom.CustomUtils;

public class AboutCitrusPreferenceController extends AbstractPreferenceController implements
        PreferenceControllerMixin {

    private static final String KEY_ABOUT_CITRUS_VERSION = "about_citrus";

    public AboutCitrusPreferenceController(Context context) {
        super(context);
    }

    @Override
    public String getPreferenceKey() {
        return KEY_ABOUT_CITRUS_VERSION;
    }

    @Override
    public boolean isAvailable() {
        return CustomUtils.isAppInstalled(mContext, "com.citrus.aboutcitrus");
    }
}
