// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SimCard: ImageVector
  get() {
    val current = _simCard
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SimCard",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 9 H8 a2 2 0 0 0 -2 2 v10 a2 2 0 0 0 2 2 h13 a2 2 0 0 0 2 -2 V11 a2 2 0 0 0 -2 -2 m0 4 h-3 v-2 h3Z m-3 2 h3 v2 h-3Z m-2 -4 v10 h-3 v-7 a1 1 0 0 0 -1 -1 H8 v-2Z m-5 6 H8 v-2 h3Z m-3 2 h3 v2 H8Z m10 2 v-2 h3 v2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 9
          moveTo(x = 21.0f, y = 9.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // h 13
          horizontalLineToRelative(dx = 13.0f)
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
          // V 11
          verticalLineTo(y = 11.0f)
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
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // m -3 2
          moveToRelative(dx = -3.0f, dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
          // m -2 -4
          moveToRelative(dx = -2.0f, dy = -4.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -5 6
          moveToRelative(dx = -5.0f, dy = 6.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // m -3 2
          moveToRelative(dx = -3.0f, dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 10 2
          moveToRelative(dx = 10.0f, dy = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
        }
        // M23.53 27 H4 a2 2 0 0 1 -2 -2 V7 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v12.64 a2 2 0 0 1 -.46 1.28 l-4.47 5.36 A2 2 0 0 1 23.53 27 M4 7 v18 h19.53 L28 19.64 V7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.53 27
          moveTo(x = 23.53f, y = 27.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v 12.64
          verticalLineToRelative(dy = 12.64f)
          // a 2 2 0 0 1 -0.46 1.28
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.46f,
            dy1 = 1.28f,
          )
          // l -4.47 5.36
          lineToRelative(dx = -4.47f, dy = 5.36f)
          // A 2 2 0 0 1 23.53 27
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.53f,
            y1 = 27.0f,
          )
          // M 4 7
          moveTo(x = 4.0f, y = 7.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 19.53
          horizontalLineToRelative(dx = 19.53f)
          // L 28 19.64
          lineTo(x = 28.0f, y = 19.64f)
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
      .also { _simCard = it }
  }

@Suppress("ObjectPropertyName")
private var _simCard: ImageVector? = null
