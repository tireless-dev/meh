// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Police: ImageVector
  get() {
    val current = _police
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Police",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="6" x="10.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 24
          moveTo(x = 10.0f, y = 24.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M21 20 H7 a3 3 0 0 1 -3 -3 V6 H2 v11 a5 5 0 0 0 5 5 h14 a5 5 0 0 1 2.1 .48 l-6.1 6.1 L18.41 30 l6.31 -6.3 A5 5 0 0 1 26 27 v3 h2 v-3 a7 7 0 0 0 -7 -7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 20
          moveTo(x = 21.0f, y = 20.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // a 5 5 0 0 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // a 5 5 0 0 1 2.1 0.48
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.1f,
            dy1 = 0.48f,
          )
          // l -6.1 6.1
          lineToRelative(dx = -6.1f, dy = 6.1f)
          // L 18.41 30
          lineTo(x = 18.41f, y = 30.0f)
          // l 6.31 -6.3
          lineToRelative(dx = 6.31f, dy = -6.3f)
          // A 5 5 0 0 1 26 27
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.0f,
            y1 = 27.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
        }
        // m25.27 4.04 -7 -2 a1 1 0 0 0 -.55 0 l-7 2 a1 1 0 0 0 -.69 1.2 L11 9.12 V11 a7 7 0 1 0 14 0 V9.12 l.97 -3.88 a1 1 0 0 0 -.7 -1.2 m-7.27 0 5.8 1.66 L23.22 8 H19 V6 h-2 v2 h-4.22 L12.2 5.7Z M18 16 a5 5 0 0 1 -5 -5 v-1 h10 v1 a5 5 0 0 1 -5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.27 4.04
          moveTo(x = 25.27f, y = 4.04f)
          // l -7 -2
          lineToRelative(dx = -7.0f, dy = -2.0f)
          // a 1 1 0 0 0 -0.55 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.55f,
            dy1 = 0.0f,
          )
          // l -7 2
          lineToRelative(dx = -7.0f, dy = 2.0f)
          // a 1 1 0 0 0 -0.69 1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.69f,
            dy1 = 1.2f,
          )
          // L 11 9.12
          lineTo(x = 11.0f, y = 9.12f)
          // V 11
          verticalLineTo(y = 11.0f)
          // a 7 7 0 1 0 14 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 0.0f,
          )
          // V 9.12
          verticalLineTo(y = 9.12f)
          // l 0.97 -3.88
          lineToRelative(dx = 0.97f, dy = -3.88f)
          // a 1 1 0 0 0 -0.7 -1.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = -1.2f,
          )
          // m -7.27 0
          moveToRelative(dx = -7.27f, dy = 0.0f)
          // l 5.8 1.66
          lineToRelative(dx = 5.8f, dy = 1.66f)
          // L 23.22 8
          lineTo(x = 23.22f, y = 8.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4.22
          horizontalLineToRelative(dx = -4.22f)
          // L 12.2 5.7z
          lineTo(x = 12.2f, y = 5.7f)
          close()
          // M 18 16
          moveTo(x = 18.0f, y = 16.0f)
          // a 5 5 0 0 1 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
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
      .also { _police = it }
  }

@Suppress("ObjectPropertyName")
private var _police: ImageVector? = null
