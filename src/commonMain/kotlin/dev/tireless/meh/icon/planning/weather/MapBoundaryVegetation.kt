// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MapBoundaryVegetation: ImageVector
  get() {
    val current = _mapBoundaryVegetation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MapBoundaryVegetation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 16 H18 v-2 h5 v-4 a2 2 0 0 1 2 -2 h1.5 a1.5 1.5 0 0 0 .28 -2.97 l-.7 -.14 L26 4.32 a2.6 2.6 0 0 0 -1.68 -2.18 2.5 2.5 0 0 0 -3.09 1.3 l-.3 .65 L20.23 4 a2.02 2.02 0 0 0 -2.18 2.44 A2.1 2.1 0 0 0 20.13 8 H21 v2 h-.78 a4.15 4.15 0 0 1 -4.2 -3.69 4 4 0 0 1 3.73 -4.3 4.5 4.5 0 0 1 8.08 1.25 3.5 3.5 0 0 1 2.14 3.7 A3.6 3.6 0 0 1 26.32 10 H25 v4 h3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // a 1.5 1.5 0 0 0 0.28 -2.97
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.28f,
            dy1 = -2.97f,
          )
          // l -0.7 -0.14
          lineToRelative(dx = -0.7f, dy = -0.14f)
          // L 26 4.32
          lineTo(x = 26.0f, y = 4.32f)
          // a 2.6 2.6 0 0 0 -1.68 -2.18
          arcToRelative(
            a = 2.6f,
            b = 2.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.68f,
            dy1 = -2.18f,
          )
          // a 2.5 2.5 0 0 0 -3.09 1.3
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.09f,
            dy1 = 1.3f,
          )
          // l -0.3 0.65
          lineToRelative(dx = -0.3f, dy = 0.65f)
          // L 20.23 4
          lineTo(x = 20.23f, y = 4.0f)
          // a 2.02 2.02 0 0 0 -2.18 2.44
          arcToRelative(
            a = 2.02f,
            b = 2.02f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.18f,
            dy1 = 2.44f,
          )
          // A 2.1 2.1 0 0 0 20.13 8
          arcTo(
            horizontalEllipseRadius = 2.1f,
            verticalEllipseRadius = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.13f,
            y1 = 8.0f,
          )
          // H 21
          horizontalLineTo(x = 21.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -0.78
          horizontalLineToRelative(dx = -0.78f)
          // a 4.15 4.15 0 0 1 -4.2 -3.69
          arcToRelative(
            a = 4.15f,
            b = 4.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.2f,
            dy1 = -3.69f,
          )
          // a 4 4 0 0 1 3.73 -4.3
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.73f,
            dy1 = -4.3f,
          )
          // a 4.5 4.5 0 0 1 8.08 1.25
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.08f,
            dy1 = 1.25f,
          )
          // a 3.5 3.5 0 0 1 2.14 3.7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.14f,
            dy1 = 3.7f,
          )
          // A 3.6 3.6 0 0 1 26.32 10
          arcTo(
            horizontalEllipseRadius = 3.6f,
            verticalEllipseRadius = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.32f,
            y1 = 10.0f,
          )
          // H 25
          horizontalLineTo(x = 25.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
        }
        // <rect width="4" height="2" x="18.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 18
          moveTo(x = 18.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <polygon points="14.0 18.0 14.0 16.0 12.0 16.0 12.0 20.0 16.0 20.0 16.0 18.0 14.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 18
          moveTo(x = 14.0f, y = 18.0f)
          // L 14 16
          lineTo(x = 14.0f, y = 16.0f)
          // L 12 16
          lineTo(x = 12.0f, y = 16.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 16 20
          lineTo(x = 16.0f, y = 20.0f)
          // L 16 18
          lineTo(x = 16.0f, y = 18.0f)
          // L 14 18z
          lineTo(x = 14.0f, y = 18.0f)
          close()
        }
        // <rect width="2" height="4" x="12.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 10
          moveTo(x = 12.0f, y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="17.885 30.0 11.819 26.142 4.0 27.989 4.0 4.0 14.0 4.0 14.0 8.0 12.0 8.0 12.0 6.0 6.0 6.0 6.0 25.461 12.181 24.001 18.115 27.776 22.818 26.0 26.0 26.0 26.0 20.0 24.0 20.0 24.0 18.0 28.0 18.0 28.0 28.0 23.182 28.0 17.885 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.885 30
          moveTo(x = 17.885f, y = 30.0f)
          // L 11.819 26.142
          lineTo(x = 11.819f, y = 26.142f)
          // L 4 27.989
          lineTo(x = 4.0f, y = 27.989f)
          // L 4 4
          lineTo(x = 4.0f, y = 4.0f)
          // L 14 4
          lineTo(x = 14.0f, y = 4.0f)
          // L 14 8
          lineTo(x = 14.0f, y = 8.0f)
          // L 12 8
          lineTo(x = 12.0f, y = 8.0f)
          // L 12 6
          lineTo(x = 12.0f, y = 6.0f)
          // L 6 6
          lineTo(x = 6.0f, y = 6.0f)
          // L 6 25.461
          lineTo(x = 6.0f, y = 25.461f)
          // L 12.181 24.001
          lineTo(x = 12.181f, y = 24.001f)
          // L 18.115 27.776
          lineTo(x = 18.115f, y = 27.776f)
          // L 22.818 26
          lineTo(x = 22.818f, y = 26.0f)
          // L 26 26
          lineTo(x = 26.0f, y = 26.0f)
          // L 26 20
          lineTo(x = 26.0f, y = 20.0f)
          // L 24 20
          lineTo(x = 24.0f, y = 20.0f)
          // L 24 18
          lineTo(x = 24.0f, y = 18.0f)
          // L 28 18
          lineTo(x = 28.0f, y = 18.0f)
          // L 28 28
          lineTo(x = 28.0f, y = 28.0f)
          // L 23.182 28
          lineTo(x = 23.182f, y = 28.0f)
          // L 17.885 30z
          lineTo(x = 17.885f, y = 30.0f)
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
      .also { _mapBoundaryVegetation = it }
  }

@Suppress("ObjectPropertyName")
private var _mapBoundaryVegetation: ImageVector? = null
