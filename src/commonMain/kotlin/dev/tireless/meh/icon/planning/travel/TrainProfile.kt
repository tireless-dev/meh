// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrainProfile: ImageVector
  get() {
    val current = _trainProfile
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrainProfile",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 25.0 2.0 25.0 2.0 27.0 4.0 27.0 4.0 29.0 6.0 29.0 6.0 27.0 11.0 27.0 11.0 29.0 13.0 29.0 13.0 27.0 18.0 27.0 18.0 29.0 20.0 29.0 20.0 27.0 25.0 27.0 25.0 29.0 27.0 29.0 27.0 27.0 30.0 27.0 30.0 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 25
          moveTo(x = 30.0f, y = 25.0f)
          // L 2 25
          lineTo(x = 2.0f, y = 25.0f)
          // L 2 27
          lineTo(x = 2.0f, y = 27.0f)
          // L 4 27
          lineTo(x = 4.0f, y = 27.0f)
          // L 4 29
          lineTo(x = 4.0f, y = 29.0f)
          // L 6 29
          lineTo(x = 6.0f, y = 29.0f)
          // L 6 27
          lineTo(x = 6.0f, y = 27.0f)
          // L 11 27
          lineTo(x = 11.0f, y = 27.0f)
          // L 11 29
          lineTo(x = 11.0f, y = 29.0f)
          // L 13 29
          lineTo(x = 13.0f, y = 29.0f)
          // L 13 27
          lineTo(x = 13.0f, y = 27.0f)
          // L 18 27
          lineTo(x = 18.0f, y = 27.0f)
          // L 18 29
          lineTo(x = 18.0f, y = 29.0f)
          // L 20 29
          lineTo(x = 20.0f, y = 29.0f)
          // L 20 27
          lineTo(x = 20.0f, y = 27.0f)
          // L 25 27
          lineTo(x = 25.0f, y = 27.0f)
          // L 25 29
          lineTo(x = 25.0f, y = 29.0f)
          // L 27 29
          lineTo(x = 27.0f, y = 29.0f)
          // L 27 27
          lineTo(x = 27.0f, y = 27.0f)
          // L 30 27
          lineTo(x = 30.0f, y = 27.0f)
          // L 30 25z
          lineTo(x = 30.0f, y = 25.0f)
          close()
        }
        // M8 16 H2 v-2 h6 v-2 H2 v-2 h6 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
        }
        // m28.55 14.23 -8.58 -7.86 A9 9 0 0 0 13.89 4 H2 v2 h10 v4 a2 2 0 0 0 2 2 h9.16 l4.04 3.7 a2.47 2.47 0 0 1 -1.67 4.3 H2 v2 h23.53 a4.47 4.47 0 0 0 3.02 -7.77 M14 10 V6 a7 7 0 0 1 4.62 1.84 L20.97 10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.55 14.23
          moveTo(x = 28.55f, y = 14.23f)
          // l -8.58 -7.86
          lineToRelative(dx = -8.58f, dy = -7.86f)
          // A 9 9 0 0 0 13.89 4
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.89f,
            y1 = 4.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 9.16
          horizontalLineToRelative(dx = 9.16f)
          // l 4.04 3.7
          lineToRelative(dx = 4.04f, dy = 3.7f)
          // a 2.47 2.47 0 0 1 -1.67 4.3
          arcToRelative(
            a = 2.47f,
            b = 2.47f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.67f,
            dy1 = 4.3f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 23.53
          horizontalLineToRelative(dx = 23.53f)
          // a 4.47 4.47 0 0 0 3.02 -7.77
          arcToRelative(
            a = 4.47f,
            b = 4.47f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.02f,
            dy1 = -7.77f,
          )
          // M 14 10
          moveTo(x = 14.0f, y = 10.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 7 7 0 0 1 4.62 1.84
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.62f,
            dy1 = 1.84f,
          )
          // L 20.97 10z
          lineTo(x = 20.97f, y = 10.0f)
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
      .also { _trainProfile = it }
  }

@Suppress("ObjectPropertyName")
private var _trainProfile: ImageVector? = null
