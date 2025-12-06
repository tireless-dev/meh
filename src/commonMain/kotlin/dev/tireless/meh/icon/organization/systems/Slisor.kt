// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Slisor: ImageVector
  get() {
    val current = _slisor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Slisor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 20 h-2 v2 h2 v6 H4 v-6 h2 v-2 H4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 20
          moveTo(x = 28.0f, y = 20.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
        }
        // <circle cx="7.0" cy="25.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 25
          moveTo(x = 7.0f, y = 25.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M16 22 a1 1 0 0 1 -.45 -.1 l-10 -5 .9 -1.8 L16 19.89 l9.55 -4.77 .9 1.78 -10 5 A1 1 0 0 1 16 22
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // a 1 1 0 0 1 -0.45 -0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -0.1f,
          )
          // l -10 -5
          lineToRelative(dx = -10.0f, dy = -5.0f)
          // l 0.9 -1.8
          lineToRelative(dx = 0.9f, dy = -1.8f)
          // L 16 19.89
          lineTo(x = 16.0f, y = 19.89f)
          // l 9.55 -4.77
          lineToRelative(dx = 9.55f, dy = -4.77f)
          // l 0.9 1.78
          lineToRelative(dx = 0.9f, dy = 1.78f)
          // l -10 5
          lineToRelative(dx = -10.0f, dy = 5.0f)
          // A 1 1 0 0 1 16 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 22.0f,
          )
        }
        // M16 16 a1 1 0 0 1 -.45 -.1 l-10 -5 a1 1 0 0 1 0 -1.8 l10 -5 a1 1 0 0 1 .9 0 l10 5 a1 1 0 0 1 0 1.8 l-10 5 A1 1 0 0 1 16 16 m-7.76 -6 L16 13.88 23.76 10 16 6.12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // a 1 1 0 0 1 -0.45 -0.1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.45f,
            dy1 = -0.1f,
          )
          // l -10 -5
          lineToRelative(dx = -10.0f, dy = -5.0f)
          // a 1 1 0 0 1 0 -1.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.8f,
          )
          // l 10 -5
          lineToRelative(dx = 10.0f, dy = -5.0f)
          // a 1 1 0 0 1 0.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = 0.0f,
          )
          // l 10 5
          lineToRelative(dx = 10.0f, dy = 5.0f)
          // a 1 1 0 0 1 0 1.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.8f,
          )
          // l -10 5
          lineToRelative(dx = -10.0f, dy = 5.0f)
          // A 1 1 0 0 1 16 16
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 16.0f,
          )
          // m -7.76 -6
          moveToRelative(dx = -7.76f, dy = -6.0f)
          // L 16 13.88
          lineTo(x = 16.0f, y = 13.88f)
          // L 23.76 10
          lineTo(x = 23.76f, y = 10.0f)
          // L 16 6.12z
          lineTo(x = 16.0f, y = 6.12f)
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
      .also { _slisor = it }
  }

@Suppress("ObjectPropertyName")
private var _slisor: ImageVector? = null
