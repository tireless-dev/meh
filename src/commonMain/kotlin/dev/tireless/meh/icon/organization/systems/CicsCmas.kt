// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsCmas: ImageVector
  get() {
    val current = _cicsCmas
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsCmas",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30.33 30 H26 v-2 h4 v-2 h-2 a2 2 0 0 1 -2 -2 v-2.33 A1.67 1.67 0 0 1 27.67 20 H32 v2 h-4 v2 h2 a2 2 0 0 1 2 2 v2.33 A1.67 1.67 0 0 1 30.33 30 m-8 -10 h-2.66 A1.67 1.67 0 0 0 18 21.67 V30 h2 v-4 h2 v4 h2 v-8.33 A1.67 1.67 0 0 0 22.33 20 M20 24 v-2 h2 v2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.33 30
          moveTo(x = 30.33f, y = 30.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // v -2.33
          verticalLineToRelative(dy = -2.33f)
          // A 1.67 1.67 0 0 1 27.67 20
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 27.67f,
            y1 = 20.0f,
          )
          // H 32
          horizontalLineTo(x = 32.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v 2.33
          verticalLineToRelative(dy = 2.33f)
          // A 1.67 1.67 0 0 1 30.33 30
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.33f,
            y1 = 30.0f,
          )
          // m -8 -10
          moveToRelative(dx = -8.0f, dy = -10.0f)
          // h -2.66
          horizontalLineToRelative(dx = -2.66f)
          // A 1.67 1.67 0 0 0 18 21.67
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 21.67f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8.33
          verticalLineToRelative(dy = -8.33f)
          // A 1.67 1.67 0 0 0 22.33 20
          arcTo(
            horizontalEllipseRadius = 1.67f,
            verticalEllipseRadius = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.33f,
            y1 = 20.0f,
          )
          // M 20 24
          moveTo(x = 20.0f, y = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
        }
        // <polygon points="12.5 24.0 11.0 20.0 9.0 20.0 9.0 30.0 11.0 30.0 11.0 23.0 12.5 27.0 14.0 23.0 14.0 30.0 16.0 30.0 16.0 20.0 14.0 20.0 12.5 24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.5 24
          moveTo(x = 12.5f, y = 24.0f)
          // L 11 20
          lineTo(x = 11.0f, y = 20.0f)
          // L 9 20
          lineTo(x = 9.0f, y = 20.0f)
          // L 9 30
          lineTo(x = 9.0f, y = 30.0f)
          // L 11 30
          lineTo(x = 11.0f, y = 30.0f)
          // L 11 23
          lineTo(x = 11.0f, y = 23.0f)
          // L 12.5 27
          lineTo(x = 12.5f, y = 27.0f)
          // L 14 23
          lineTo(x = 14.0f, y = 23.0f)
          // L 14 30
          lineTo(x = 14.0f, y = 30.0f)
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // L 16 20
          lineTo(x = 16.0f, y = 20.0f)
          // L 14 20
          lineTo(x = 14.0f, y = 20.0f)
          // L 12.5 24z
          lineTo(x = 12.5f, y = 24.0f)
          close()
        }
        // M1 22 v6.5 A1.47 1.47 0 0 0 2.5 30 H7 v-2 H3 v-6 h4 v-2 H3 a2 2 0 0 0 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 1 22
          moveTo(x = 1.0f, y = 22.0f)
          // v 6.5
          verticalLineToRelative(dy = 6.5f)
          // A 1.47 1.47 0 0 0 2.5 30
          arcTo(
            horizontalEllipseRadius = 1.47f,
            verticalEllipseRadius = 1.47f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.5f,
            y1 = 30.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
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
        }
        // <polygon points="13.0 8.0 11.0 8.0 11.0 11.0 8.0 11.0 8.0 13.0 11.0 13.0 11.0 16.0 13.0 16.0 13.0 13.0 16.0 13.0 16.0 11.0 13.0 11.0 13.0 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 8
          moveTo(x = 13.0f, y = 8.0f)
          // L 11 8
          lineTo(x = 11.0f, y = 8.0f)
          // L 11 11
          lineTo(x = 11.0f, y = 11.0f)
          // L 8 11
          lineTo(x = 8.0f, y = 11.0f)
          // L 8 13
          lineTo(x = 8.0f, y = 13.0f)
          // L 11 13
          lineTo(x = 11.0f, y = 13.0f)
          // L 11 16
          lineTo(x = 11.0f, y = 16.0f)
          // L 13 16
          lineTo(x = 13.0f, y = 16.0f)
          // L 13 13
          lineTo(x = 13.0f, y = 13.0f)
          // L 16 13
          lineTo(x = 16.0f, y = 13.0f)
          // L 16 11
          lineTo(x = 16.0f, y = 11.0f)
          // L 13 11
          lineTo(x = 13.0f, y = 11.0f)
          // L 13 8z
          lineTo(x = 13.0f, y = 8.0f)
          close()
        }
        // M6 6 h20 v12 h2 V6 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v12 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
        // h 2z
        horizontalLineToRelative(dx = 2.0f)
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
      .also { _cicsCmas = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsCmas: ImageVector? = null
