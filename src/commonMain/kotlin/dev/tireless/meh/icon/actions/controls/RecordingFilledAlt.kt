// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RecordingFilledAlt: ImageVector
  get() {
    val current = _recordingFilledAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RecordingFilledAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
        // M16 2 C8.3 2 2 8.3 2 16 s6.3 14 14 14 14 -6.3 14 -14 S23.7 2 16 2 m0 20 c-3.3 0 -6 -2.7 -6 -6 s2.7 -6 6 -6 6 2.7 6 6 -2.7 6 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // C 8.3 2 2 8.3 2 16
          curveTo(
            x1 = 8.3f,
            y1 = 2.0f,
            x2 = 2.0f,
            y2 = 8.3f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // s 6.3 14 14 14
          reflectiveCurveToRelative(
            dx1 = 6.3f,
            dy1 = 14.0f,
            dx2 = 14.0f,
            dy2 = 14.0f,
          )
          // s 14 -6.3 14 -14
          reflectiveCurveToRelative(
            dx1 = 14.0f,
            dy1 = -6.3f,
            dx2 = 14.0f,
            dy2 = -14.0f,
          )
          // S 23.7 2 16 2
          reflectiveCurveTo(
            x1 = 23.7f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // m 0 20
          moveToRelative(dx = 0.0f, dy = 20.0f)
          // c -3.3 0 -6 -2.7 -6 -6
          curveToRelative(
            dx1 = -3.3f,
            dy1 = 0.0f,
            dx2 = -6.0f,
            dy2 = -2.7f,
            dx3 = -6.0f,
            dy3 = -6.0f,
          )
          // s 2.7 -6 6 -6
          reflectiveCurveToRelative(
            dx1 = 2.7f,
            dy1 = -6.0f,
            dx2 = 6.0f,
            dy2 = -6.0f,
          )
          // s 6 2.7 6 6
          reflectiveCurveToRelative(
            dx1 = 6.0f,
            dy1 = 2.7f,
            dx2 = 6.0f,
            dy2 = 6.0f,
          )
          // s -2.7 6 -6 6
          reflectiveCurveToRelative(
          dx1 = -2.7f,
          dy1 = 6.0f,
          dx2 = -6.0f,
          dy2 = 6.0f,
        )
      }
    }.build()
      .also { _recordingFilledAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _recordingFilledAlt: ImageVector? = null
