// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimeFilled: ImageVector
  get() {
    val current = _timeFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TimeFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 C8.4 2 2 8.4 2 16 s6.4 14 14 14 14 -6.4 14 -14 S23.6 2 16 2 m4.59 20 L15 16.41 V7 h2 v8.58 l5 5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // C 8.4 2 2 8.4 2 16
          curveTo(
            x1 = 8.4f,
            y1 = 2.0f,
            x2 = 2.0f,
            y2 = 8.4f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // s 6.4 14 14 14
          reflectiveCurveToRelative(
            dx1 = 6.4f,
            dy1 = 14.0f,
            dx2 = 14.0f,
            dy2 = 14.0f,
          )
          // s 14 -6.4 14 -14
          reflectiveCurveToRelative(
            dx1 = 14.0f,
            dy1 = -6.4f,
            dx2 = 14.0f,
            dy2 = -14.0f,
          )
          // S 23.6 2 16 2
          reflectiveCurveTo(
            x1 = 23.6f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // m 4.59 20
          moveToRelative(dx = 4.59f, dy = 20.0f)
          // L 15 16.41
          lineTo(x = 15.0f, y = 16.41f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8.58
          verticalLineToRelative(dy = 8.58f)
          // l 5 5z
          lineToRelative(dx = 5.0f, dy = 5.0f)
          close()
        }
        // <polygon points="20.5872 22.0 15.0 16.4099 15.0 7.0 17.0 7.0 17.0 15.5822 22.0 20.5866 20.5872 22.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 20.5872 22
          moveTo(x = 20.5872f, y = 22.0f)
          // L 15 16.4099
          lineTo(x = 15.0f, y = 16.4099f)
          // L 15 7
          lineTo(x = 15.0f, y = 7.0f)
          // L 17 7
          lineTo(x = 17.0f, y = 7.0f)
          // L 17 15.5822
          lineTo(x = 17.0f, y = 15.5822f)
          // L 22 20.5866
          lineTo(x = 22.0f, y = 20.5866f)
          // L 20.5872 22z
          lineTo(x = 20.5872f, y = 22.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      }.build()
      .also { _timeFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _timeFilled: ImageVector? = null
