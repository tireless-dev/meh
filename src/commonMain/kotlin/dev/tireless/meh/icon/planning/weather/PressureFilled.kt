// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PressureFilled: ImageVector
  get() {
    val current = _pressureFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PressureFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 30 H10 v-5 H6 l10 -9 10 9 h-4Z m-6 -14 L6 7 h4 V2 h12 v5 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 30
          moveTo(x = 22.0f, y = 30.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // l 10 -9
          lineToRelative(dx = 10.0f, dy = -9.0f)
          // l 10 9
          lineToRelative(dx = 10.0f, dy = 9.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -6 -14
          moveToRelative(dx = -6.0f, dy = -14.0f)
          // L 6 7
          lineTo(x = 6.0f, y = 7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _pressureFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _pressureFilled: ImageVector? = null
