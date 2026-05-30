// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningFilled: ImageVector
  get() {
    val current = _warningFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningFilled",
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
        // M16 2 C8.3 2 2 8.3 2 16 s6.3 14 14 14 14 -6.3 14 -14 S23.7 2 16 2 m-1.1 6 h2.2 v11 h-2.2z M16 25 c-.8 0 -1.5 -.7 -1.5 -1.5 S15.2 22 16 22 s1.5 .7 1.5 1.5 S16.8 25 16 25
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
          // m -1.1 6
          moveToRelative(dx = -1.1f, dy = 6.0f)
          // h 2.2
          horizontalLineToRelative(dx = 2.2f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h -2.2z
          horizontalLineToRelative(dx = -2.2f)
          close()
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
          // c -0.8 0 -1.5 -0.7 -1.5 -1.5
          curveToRelative(
            dx1 = -0.8f,
            dy1 = 0.0f,
            dx2 = -1.5f,
            dy2 = -0.7f,
            dx3 = -1.5f,
            dy3 = -1.5f,
          )
          // S 15.2 22 16 22
          reflectiveCurveTo(
            x1 = 15.2f,
            y1 = 22.0f,
            x2 = 16.0f,
            y2 = 22.0f,
          )
          // s 1.5 0.7 1.5 1.5
          reflectiveCurveToRelative(
            dx1 = 1.5f,
            dy1 = 0.7f,
            dx2 = 1.5f,
            dy2 = 1.5f,
          )
          // S 16.8 25 16 25
          reflectiveCurveTo(
            x1 = 16.8f,
            y1 = 25.0f,
            x2 = 16.0f,
            y2 = 25.0f,
          )
        }
      }.build()
      .also { _warningFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _warningFilled: ImageVector? = null
