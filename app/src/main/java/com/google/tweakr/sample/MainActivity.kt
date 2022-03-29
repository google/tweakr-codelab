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
package com.google.tweakr.sample

import android.os.Bundle
import com.yourdomain.tweakr.sample.R
import android.app.Activity
import android.widget.TextView
import android.view.animation.AccelerateDecelerateInterpolator
import com.google.tweakr.Tweakr
import com.google.tweakr.annotations.Tweak

class MainActivity : Activity() {
  lateinit var introText: TextView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    introText = findViewById(R.id.text)
    introText.setOnClickListener { animateText() }

    Tweakr.register(this)
  }

  @Tweak
  fun animateText() {
    introText.animate()
      .setDuration(700)
      .setInterpolator(AccelerateDecelerateInterpolator())
      .rotationXBy(360f)
      .start()
  }

  @Tweak
  fun setMessage(text: String) {
    introText.text = text
  }
}