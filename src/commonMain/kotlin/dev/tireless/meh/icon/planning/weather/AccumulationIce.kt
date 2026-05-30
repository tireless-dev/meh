// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AccumulationIce: ImageVector
  get() {
    val current = _accumulationIce
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AccumulationIce",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 8.0 22.0 16.0 23.0 18.0 24.0 16.0 24.0 8.0 22.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 8
          moveTo(x = 22.0f, y = 8.0f)
          // L 22 16
          lineTo(x = 22.0f, y = 16.0f)
          // L 23 18
          lineTo(x = 23.0f, y = 18.0f)
          // L 24 16
          lineTo(x = 24.0f, y = 16.0f)
          // L 24 8
          lineTo(x = 24.0f, y = 8.0f)
          // L 22 8z
          lineTo(x = 22.0f, y = 8.0f)
          close()
        }
        // <polygon points="18.0 8.0 18.0 18.0 19.0 20.0 20.0 18.0 20.0 8.0 18.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 8
          moveTo(x = 18.0f, y = 8.0f)
          // L 18 18
          lineTo(x = 18.0f, y = 18.0f)
          // L 19 20
          lineTo(x = 19.0f, y = 20.0f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 20 8
          lineTo(x = 20.0f, y = 8.0f)
          // L 18 8z
          lineTo(x = 18.0f, y = 8.0f)
          close()
        }
        // M28 4 a2 2 0 0 0 -2 2 v20 H6 v-4 h4 v-2 H6 v-4 h4 v-2 H6 v-4 h8 v4 l1 2 1 -2 V8 H6 V6 a2 2 0 0 0 -2 -2 H2 v2 h2 v20 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 h2 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 4
          moveTo(x = 28.0f, y = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // l 1 2
          lineToRelative(dx = 1.0f, dy = 2.0f)
          // l 1 -2
          lineToRelative(dx = 1.0f, dy = -2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
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
      .also { _accumulationIce = it }
  }

@Suppress("ObjectPropertyName")
private var _accumulationIce: ImageVector? = null
