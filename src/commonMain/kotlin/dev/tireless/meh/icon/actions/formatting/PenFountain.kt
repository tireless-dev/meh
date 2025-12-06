// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PenFountain: ImageVector
  get() {
    val current = _penFountain
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PenFountain",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.7 5.3 -3 -3 a1 1 0 0 0 -1.4 0 L19.58 8 h-2.5 a11 11 0 0 0 -10.38 7.37 l-4.65 13.3 a1 1 0 0 0 1.27 1.27 l13.3 -4.65 A11 11 0 0 0 24 14.9 v-2.5 l5.7 -5.7 a1 1 0 0 0 0 -1.42 m-7.4 6 A1 1 0 0 0 22 12 v2.9 a9 9 0 0 1 -6.03 8.5 l-9.16 3.2 L16 17.42 14.59 16 l-9.2 9.2 3.21 -9.17 A9 9 0 0 1 17.1 10 H20 a1 1 0 0 0 .7 -.3 L26 4.42 27.59 6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.7 5.3
          moveTo(x = 29.7f, y = 5.3f)
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // L 19.58 8
          lineTo(x = 19.58f, y = 8.0f)
          // h -2.5
          horizontalLineToRelative(dx = -2.5f)
          // a 11 11 0 0 0 -10.38 7.37
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -10.38f,
            dy1 = 7.37f,
          )
          // l -4.65 13.3
          lineToRelative(dx = -4.65f, dy = 13.3f)
          // a 1 1 0 0 0 1.27 1.27
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.27f,
            dy1 = 1.27f,
          )
          // l 13.3 -4.65
          lineToRelative(dx = 13.3f, dy = -4.65f)
          // A 11 11 0 0 0 24 14.9
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 14.9f,
          )
          // v -2.5
          verticalLineToRelative(dy = -2.5f)
          // l 5.7 -5.7
          lineToRelative(dx = 5.7f, dy = -5.7f)
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // m -7.4 6
          moveToRelative(dx = -7.4f, dy = 6.0f)
          // A 1 1 0 0 0 22 12
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 12.0f,
          )
          // v 2.9
          verticalLineToRelative(dy = 2.9f)
          // a 9 9 0 0 1 -6.03 8.5
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.03f,
            dy1 = 8.5f,
          )
          // l -9.16 3.2
          lineToRelative(dx = -9.16f, dy = 3.2f)
          // L 16 17.42
          lineTo(x = 16.0f, y = 17.42f)
          // L 14.59 16
          lineTo(x = 14.59f, y = 16.0f)
          // l -9.2 9.2
          lineToRelative(dx = -9.2f, dy = 9.2f)
          // l 3.21 -9.17
          lineToRelative(dx = 3.21f, dy = -9.17f)
          // A 9 9 0 0 1 17.1 10
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.1f,
            y1 = 10.0f,
          )
          // H 20
          horizontalLineTo(x = 20.0f)
          // a 1 1 0 0 0 0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.7f,
            dy1 = -0.3f,
          )
          // L 26 4.42
          lineTo(x = 26.0f, y = 4.42f)
          // L 27.59 6z
          lineTo(x = 27.59f, y = 6.0f)
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
      .also { _penFountain = it }
  }

@Suppress("ObjectPropertyName")
private var _penFountain: ImageVector? = null
