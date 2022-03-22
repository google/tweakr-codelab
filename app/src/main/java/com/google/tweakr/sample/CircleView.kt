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

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/** A View that draws a circle **/
class CircleView @JvmOverloads constructor(
  context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
  var centerX = 180f
  var centerY = 180f
  var radius = 50f
  var style = Paint.Style.FILL
  var color = Color.GREEN

  private val paint = Paint()

  override fun onDraw(canvas: Canvas) {
    super.onDraw(canvas)
    paint.style = style
    paint.color = color
    canvas.drawCircle(centerX, centerY, radius, paint)
  }
}