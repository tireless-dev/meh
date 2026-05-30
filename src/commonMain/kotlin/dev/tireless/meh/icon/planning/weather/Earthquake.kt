// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Earthquake: ImageVector
  get() {
    val current = _earthquake
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Earthquake",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16.61 2.21 a1 1 0 0 0 -1.24 0 L1 13.41 2.24 15 4 13.62 V26 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V13.63 L29.76 15 31 13.43Z M6 12.06 l9 -7.01 v7.36 l3.46 3.46 -6.74 4.81 L14.38 26 H6Z M26 26 h-9.38 l-2.34 -4.68 7.26 -5.2 L17 11.6 V5.05 l9 7.02Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16.61 2.21
          moveTo(x = 16.61f, y = 2.21f)
          // a 1 1 0 0 0 -1.24 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.24f,
            dy1 = 0.0f,
          )
          // L 1 13.41
          lineTo(x = 1.0f, y = 13.41f)
          // L 2.24 15
          lineTo(x = 2.24f, y = 15.0f)
          // L 4 13.62
          lineTo(x = 4.0f, y = 13.62f)
          // V 26
          verticalLineTo(y = 26.0f)
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
          // V 13.63
          verticalLineTo(y = 13.63f)
          // L 29.76 15
          lineTo(x = 29.76f, y = 15.0f)
          // L 31 13.43z
          lineTo(x = 31.0f, y = 13.43f)
          close()
          // M 6 12.06
          moveTo(x = 6.0f, y = 12.06f)
          // l 9 -7.01
          lineToRelative(dx = 9.0f, dy = -7.01f)
          // v 7.36
          verticalLineToRelative(dy = 7.36f)
          // l 3.46 3.46
          lineToRelative(dx = 3.46f, dy = 3.46f)
          // l -6.74 4.81
          lineToRelative(dx = -6.74f, dy = 4.81f)
          // L 14.38 26
          lineTo(x = 14.38f, y = 26.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // h -9.38
          horizontalLineToRelative(dx = -9.38f)
          // l -2.34 -4.68
          lineToRelative(dx = -2.34f, dy = -4.68f)
          // l 7.26 -5.2
          lineToRelative(dx = 7.26f, dy = -5.2f)
          // L 17 11.6
          lineTo(x = 17.0f, y = 11.6f)
          // V 5.05
          verticalLineTo(y = 5.05f)
          // l 9 7.02z
          lineToRelative(dx = 9.0f, dy = 7.02f)
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
      .also { _earthquake = it }
  }

@Suppress("ObjectPropertyName")
private var _earthquake: ImageVector? = null
