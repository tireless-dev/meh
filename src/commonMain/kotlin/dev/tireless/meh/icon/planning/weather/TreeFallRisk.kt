// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TreeFallRisk: ImageVector
  get() {
    val current = _treeFallRisk
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TreeFallRisk",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.75 10 h-1.5 V6 h1.5Z M23 11 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
        path {
          // M 23.75 10
          moveTo(x = 23.75f, y = 10.0f)
          // h -1.5
          horizontalLineToRelative(dx = -1.5f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 1.5z
          horizontalLineToRelative(dx = 1.5f)
          close()
          // M 23 11
          moveTo(x = 23.0f, y = 11.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
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
        }
        // M29.91 13.94 23.63 2.37 a.72 .72 0 0 0 -1.26 0 L16.1 13.94 A.72 .72 0 0 0 16.72 15 h12.56 a.72 .72 0 0 0 .63 -1.06 M22.25 6 h1.5 v4 h-1.5Z M23 13 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m3 6 v-2 h-9 v11 a2 2 0 0 0 2 2 h3 v-2 h-3 v-9Z M12 30 H9 v-2 h3 V15.57 l-3.51 -2.11 1.02 -1.72 3.52 2.11 A2 2 0 0 1 14 15.57 V28 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.91 13.94
          moveTo(x = 29.91f, y = 13.94f)
          // L 23.63 2.37
          lineTo(x = 23.63f, y = 2.37f)
          // a 0.72 0.72 0 0 0 -1.26 0
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.26f,
            dy1 = 0.0f,
          )
          // L 16.1 13.94
          lineTo(x = 16.1f, y = 13.94f)
          // A 0.72 0.72 0 0 0 16.72 15
          arcTo(
            horizontalEllipseRadius = 0.72f,
            verticalEllipseRadius = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.72f,
            y1 = 15.0f,
          )
          // h 12.56
          horizontalLineToRelative(dx = 12.56f)
          // a 0.72 0.72 0 0 0 0.63 -1.06
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.63f,
            dy1 = -1.06f,
          )
          // M 22.25 6
          moveTo(x = 22.25f, y = 6.0f)
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -1.5z
          horizontalLineToRelative(dx = -1.5f)
          close()
          // M 23 13
          moveTo(x = 23.0f, y = 13.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m 3 6
          moveToRelative(dx = 3.0f, dy = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -9z
          verticalLineToRelative(dy = -9.0f)
          close()
          // M 12 30
          moveTo(x = 12.0f, y = 30.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 15.57
          verticalLineTo(y = 15.57f)
          // l -3.51 -2.11
          lineToRelative(dx = -3.51f, dy = -2.11f)
          // l 1.02 -1.72
          lineToRelative(dx = 1.02f, dy = -1.72f)
          // l 3.52 2.11
          lineToRelative(dx = 3.52f, dy = 2.11f)
          // A 2 2 0 0 1 14 15.57
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 15.57f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
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
        // m18.66 5 .96 -1.76 A9 9 0 0 0 15 2 a8 8 0 0 0 -6.92 4 H8 a6 6 0 0 0 0 12 v-2 a4 4 0 0 1 0 -8 l.39 .04 .86 .11 .3 -.66 A6 6 0 0 1 15 4 a7 7 0 0 1 3.66 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.66 5
          moveTo(x = 18.66f, y = 5.0f)
          // l 0.96 -1.76
          lineToRelative(dx = 0.96f, dy = -1.76f)
          // A 9 9 0 0 0 15 2
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 2.0f,
          )
          // a 8 8 0 0 0 -6.92 4
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.92f,
            dy1 = 4.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 6 6 0 0 0 0 12
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 12.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 4 4 0 0 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // l 0.39 0.04
          lineToRelative(dx = 0.39f, dy = 0.04f)
          // l 0.86 0.11
          lineToRelative(dx = 0.86f, dy = 0.11f)
          // l 0.3 -0.66
          lineToRelative(dx = 0.3f, dy = -0.66f)
          // A 6 6 0 0 1 15 4
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 4.0f,
          )
          // a 7 7 0 0 1 3.66 1
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.66f,
            dy1 = 1.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _treeFallRisk = it }
  }

@Suppress("ObjectPropertyName")
private var _treeFallRisk: ImageVector? = null
