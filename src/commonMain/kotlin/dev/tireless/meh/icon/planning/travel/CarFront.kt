// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CarFront: ImageVector
  get() {
    val current = _carFront
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CarFront",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="13.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 19
          moveTo(x = 13.0f, y = 19.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // m25.44 14 -1.27 -4.55 A2 2 0 0 0 22.25 8 H9.75 a2 2 0 0 0 -1.92 1.45 L6.53 14 H4 v2 h2 v7 a2 2 0 0 0 2 2 v3 h2 v-3 h12 v3 h2 v-3 a2 2 0 0 0 2 -2 v-7 h2 v-2Z M9.75 10 h12.5 l1.42 5 H8.33Z M24 21 v2 H8 v-2 h2 v-2 H8 v-2 h16 v2 h-2 v2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.44 14
          moveTo(x = 25.44f, y = 14.0f)
          // l -1.27 -4.55
          lineToRelative(dx = -1.27f, dy = -4.55f)
          // A 2 2 0 0 0 22.25 8
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.25f,
            y1 = 8.0f,
          )
          // H 9.75
          horizontalLineTo(x = 9.75f)
          // a 2 2 0 0 0 -1.92 1.45
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.92f,
            dy1 = 1.45f,
          )
          // L 6.53 14
          lineTo(x = 6.53f, y = 14.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 9.75 10
          moveTo(x = 9.75f, y = 10.0f)
          // h 12.5
          horizontalLineToRelative(dx = 12.5f)
          // l 1.42 5
          lineToRelative(dx = 1.42f, dy = 5.0f)
          // H 8.33z
          horizontalLineTo(x = 8.33f)
          close()
          // M 24 21
          moveTo(x = 24.0f, y = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
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
      .also { _carFront = it }
  }

@Suppress("ObjectPropertyName")
private var _carFront: ImageVector? = null
