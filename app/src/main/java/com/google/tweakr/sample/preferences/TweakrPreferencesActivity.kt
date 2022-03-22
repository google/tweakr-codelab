// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.tweakr.sample.preferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yourdomain.tweakr.sample.R
import com.google.tweakr.sample.preferences.TweakrPreferencesActivity.SettingsFragment
import androidx.preference.PreferenceFragmentCompat
import android.app.Activity
import android.widget.TextView
import android.view.animation.AccelerateDecelerateInterpolator

// import androidx.preference.Preference;
// import androidx.preference.PreferenceCategory;
// import androidx.preference.PreferenceFragmentCompat;
// import androidx.preference.PreferenceGroup;
// import androidx.preference.PreferenceManager;
// import androidx.preference.PreferenceScreen;
// import com.google.tweakr.preferences.TweakrPreferencesRepo;
// import com.google.tweakr.sample.R;
class TweakrPreferencesActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.settings_activity)
    supportFragmentManager
      .beginTransaction()
      .replace(R.id.settings, SettingsFragment())
      .commit()
    val actionBar = supportActionBar
    actionBar?.setDisplayHomeAsUpEnabled(true)
  }

  class SettingsFragment : PreferenceFragmentCompat() {
    //         private TweakrPreferencesRepo repo;
    //
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
//             repo = new TweakrPreferencesRepo(getContext());
//
//             // Uncomment if you want to load static preferences here and add the new ones from Tweakr at the bottom.
// //            setPreferencesFromResource(R.xml.root_preferences, rootKey);
// //            PreferenceScreen screen = getPreferenceScreen();
//
//             // Comment out this line if you are loading your own static prefs above.
//             PreferenceScreen screen = getPreferenceManager().createPreferenceScreen(getContext());
//
//
//             PreferenceGroup group = new PreferenceCategory(getContext());
//             screen.addPreference(group);
//             repo.populatePreferences(group);
//
//             setPreferenceScreen(screen);
    }
  }
}