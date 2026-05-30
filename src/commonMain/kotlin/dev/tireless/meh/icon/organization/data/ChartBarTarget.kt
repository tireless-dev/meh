// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartBarTarget: ImageVector
  get() {
    val current = _chartBarTarget
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartBarTarget",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="8" x="28.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 17
          moveTo(x = 28.0f, y = 17.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="8" x="20.0" y="5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 5
          moveTo(x = 20.0f, y = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M4 2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4 v-3 h22 v-8 H4 v-4 h14 V5 H4Z m20 17 v4 H4 v-4Z M16 7 v4 H4 V7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 2
          moveTo(x = 4.0f, y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 20 17
          moveToRelative(dx = 20.0f, dy = 17.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
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
      .also { _chartBarTarget = it }
  }

@Suppress("ObjectPropertyName")
private var _chartBarTarget: ImageVector? = null
