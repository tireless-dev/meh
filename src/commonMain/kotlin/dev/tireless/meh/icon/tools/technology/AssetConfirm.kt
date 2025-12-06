// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AssetConfirm: ImageVector
  get() {
    val current = _assetConfirm
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AssetConfirm",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="21.0 27.18 18.41 24.59 17.0 26.0 21.0 30.0 28.0 23.0 26.59 21.59 21.0 27.18" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 27.18
          moveTo(x = 21.0f, y = 27.18f)
          // L 18.41 24.59
          lineTo(x = 18.41f, y = 24.59f)
          // L 17 26
          lineTo(x = 17.0f, y = 26.0f)
          // L 21 30
          lineTo(x = 21.0f, y = 30.0f)
          // L 28 23
          lineTo(x = 28.0f, y = 23.0f)
          // L 26.59 21.59
          lineTo(x = 26.59f, y = 21.59f)
          // L 21 27.18z
          lineTo(x = 21.0f, y = 27.18f)
          close()
        }
        // M12 24 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 24
          moveTo(x = 12.0f, y = 24.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        // M26 2 a4 4 0 0 0 -1.85 .48 L7.76 10.96 A9.99 9.99 0 0 0 12 30 a9 9 0 0 0 2 -.21 v-2.04 A8 8 0 0 1 12 28 a8 8 0 1 1 8 -8 8 8 0 0 1 -.06 1 h2.78 l6.84 -13.21 A3.97 3.97 0 0 0 26 2 m-4.14 16.34 a10 10 0 0 0 -8.22 -8.19 l8.38 -4.34 L22 6 a4 4 0 0 0 4 4 l.19 -.02Z M26 8 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
          // a 4 4 0 0 0 -1.85 0.48
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.85f,
            dy1 = 0.48f,
          )
          // L 7.76 10.96
          lineTo(x = 7.76f, y = 10.96f)
          // A 9.99 9.99 0 0 0 12 30
          arcTo(
            horizontalEllipseRadius = 9.99f,
            verticalEllipseRadius = 9.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 30.0f,
          )
          // a 9 9 0 0 0 2 -0.21
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -0.21f,
          )
          // v -2.04
          verticalLineToRelative(dy = -2.04f)
          // A 8 8 0 0 1 12 28
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 28.0f,
          )
          // a 8 8 0 1 1 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
          // a 8 8 0 0 1 -0.06 1
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.06f,
            dy1 = 1.0f,
          )
          // h 2.78
          horizontalLineToRelative(dx = 2.78f)
          // l 6.84 -13.21
          lineToRelative(dx = 6.84f, dy = -13.21f)
          // A 3.97 3.97 0 0 0 26 2
          arcTo(
            horizontalEllipseRadius = 3.97f,
            verticalEllipseRadius = 3.97f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 2.0f,
          )
          // m -4.14 16.34
          moveToRelative(dx = -4.14f, dy = 16.34f)
          // a 10 10 0 0 0 -8.22 -8.19
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.22f,
            dy1 = -8.19f,
          )
          // l 8.38 -4.34
          lineToRelative(dx = 8.38f, dy = -4.34f)
          // L 22 6
          lineTo(x = 22.0f, y = 6.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // l 0.19 -0.02z
          lineToRelative(dx = 0.19f, dy = -0.02f)
          close()
          // M 26 8
          moveTo(x = 26.0f, y = 8.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
      .also { _assetConfirm = it }
  }

@Suppress("ObjectPropertyName")
private var _assetConfirm: ImageVector? = null
