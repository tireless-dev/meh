// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BreakingChange: ImageVector
  get() {
    val current = _breakingChange
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BreakingChange",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M31 25 a6 6 0 1 0 -6 6 6 6 0 0 0 6 -6 m-2 0 a4 4 0 0 1 -.57 2.02 l-5.45 -5.45 A4 4 0 0 1 25 21 a4 4 0 0 1 4 4 m-8 0 a4 4 0 0 1 .57 -2.02 l5.45 5.45 A4 4 0 0 1 25 29 a4 4 0 0 1 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 25
          moveTo(x = 31.0f, y = 25.0f)
          // a 6 6 0 1 0 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 4 4 0 0 1 -0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.57f,
            dy1 = 2.02f,
          )
          // l -5.45 -5.45
          lineToRelative(dx = -5.45f, dy = -5.45f)
          // A 4 4 0 0 1 25 21
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 21.0f,
          )
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // a 4 4 0 0 1 0.57 -2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.57f,
            dy1 = -2.02f,
          )
          // l 5.45 5.45
          lineToRelative(dx = 5.45f, dy = 5.45f)
          // A 4 4 0 0 1 25 29
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 29.0f,
          )
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
        }
        // <polygon points="19.59 16.0 17.0 18.59 18.42 20.0 22.42 16.0 18.42 12.0 17.0 13.41 19.59 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19.59 16
          moveTo(x = 19.59f, y = 16.0f)
          // L 17 18.59
          lineTo(x = 17.0f, y = 18.59f)
          // L 18.42 20
          lineTo(x = 18.42f, y = 20.0f)
          // L 22.42 16
          lineTo(x = 22.42f, y = 16.0f)
          // L 18.42 12
          lineTo(x = 18.42f, y = 12.0f)
          // L 17 13.41
          lineTo(x = 17.0f, y = 13.41f)
          // L 19.59 16z
          lineTo(x = 19.59f, y = 16.0f)
          close()
        }
        // <polygon points="10.41 16.0 13.0 13.41 11.58 12.0 7.58 16.0 11.58 20.0 13.0 18.59 10.41 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.41 16
          moveTo(x = 10.41f, y = 16.0f)
          // L 13 13.41
          lineTo(x = 13.0f, y = 13.41f)
          // L 11.58 12
          lineTo(x = 11.58f, y = 12.0f)
          // L 7.58 16
          lineTo(x = 7.58f, y = 16.0f)
          // L 11.58 20
          lineTo(x = 11.58f, y = 20.0f)
          // L 13 18.59
          lineTo(x = 13.0f, y = 18.59f)
          // L 10.41 16z
          lineTo(x = 10.41f, y = 16.0f)
          close()
        }
        // M4 9 h22 v7 h2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h12 v-2 H4Z m0 -5 h22 v3 H4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 9
          moveTo(x = 4.0f, y = 9.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
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
      .also { _breakingChange = it }
  }

@Suppress("ObjectPropertyName")
private var _breakingChange: ImageVector? = null
