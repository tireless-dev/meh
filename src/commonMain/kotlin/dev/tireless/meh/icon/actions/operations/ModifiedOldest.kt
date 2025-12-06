// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModifiedOldest: ImageVector
  get() {
    val current = _modifiedOldest
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ModifiedOldest",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19.3 16.7 15 12.4 V6 h2 v5.6 l3.7 3.7z M16 4 c4.4 0 8 3.6 8 8 s-3.6 8 -8 8 -8 -3.6 -8 -8 3.6 -8 8 -8 m0 -2 C10.5 2 6 6.5 6 12 s4.5 10 10 10 10 -4.5 10 -10 S21.5 2 16 2 m0 28 5 -6 H11z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.3 16.7
          moveTo(x = 19.3f, y = 16.7f)
          // L 15 12.4
          lineTo(x = 15.0f, y = 12.4f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5.6
          verticalLineToRelative(dy = 5.6f)
          // l 3.7 3.7z
          lineToRelative(dx = 3.7f, dy = 3.7f)
          close()
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // c 4.4 0 8 3.6 8 8
          curveToRelative(
            dx1 = 4.4f,
            dy1 = 0.0f,
            dx2 = 8.0f,
            dy2 = 3.6f,
            dx3 = 8.0f,
            dy3 = 8.0f,
          )
          // s -3.6 8 -8 8
          reflectiveCurveToRelative(
            dx1 = -3.6f,
            dy1 = 8.0f,
            dx2 = -8.0f,
            dy2 = 8.0f,
          )
          // s -8 -3.6 -8 -8
          reflectiveCurveToRelative(
            dx1 = -8.0f,
            dy1 = -3.6f,
            dx2 = -8.0f,
            dy2 = -8.0f,
          )
          // s 3.6 -8 8 -8
          reflectiveCurveToRelative(
            dx1 = 3.6f,
            dy1 = -8.0f,
            dx2 = 8.0f,
            dy2 = -8.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // C 10.5 2 6 6.5 6 12
          curveTo(
            x1 = 10.5f,
            y1 = 2.0f,
            x2 = 6.0f,
            y2 = 6.5f,
            x3 = 6.0f,
            y3 = 12.0f,
          )
          // s 4.5 10 10 10
          reflectiveCurveToRelative(
            dx1 = 4.5f,
            dy1 = 10.0f,
            dx2 = 10.0f,
            dy2 = 10.0f,
          )
          // s 10 -4.5 10 -10
          reflectiveCurveToRelative(
            dx1 = 10.0f,
            dy1 = -4.5f,
            dx2 = 10.0f,
            dy2 = -10.0f,
          )
          // S 21.5 2 16 2
          reflectiveCurveTo(
            x1 = 21.5f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // m 0 28
          moveToRelative(dx = 0.0f, dy = 28.0f)
          // l 5 -6
          lineToRelative(dx = 5.0f, dy = -6.0f)
          // H 11z
          horizontalLineTo(x = 11.0f)
          close()
        }
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
    }.build()
      .also { _modifiedOldest = it }
  }

@Suppress("ObjectPropertyName")
private var _modifiedOldest: ImageVector? = null
