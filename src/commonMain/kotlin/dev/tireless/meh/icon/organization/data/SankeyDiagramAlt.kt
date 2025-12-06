// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SankeyDiagramAlt: ImageVector
  get() {
    val current = _sankeyDiagramAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SankeyDiagramAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 2 H2 v14 h6.11 a7 7 0 0 1 3.13 .74 L15.76 19 l-4.52 2.26 A7 7 0 0 1 8.11 22 H2 v8 h7.22 a9 9 0 0 0 4.03 -.95 l8.62 -4.31 A7 7 0 0 1 25 24 h5 V14 h-5 a7 7 0 0 1 -3.13 -.74 L15.35 10 H30Z M8 4 h16 v4 H8Z M4 4 h2 v10 H4Z m0 20 h2 v4 H4Z m16.98 -1.05 -8.63 4.31 A7 7 0 0 1 9.22 28 H8 v-4 h.11 a9 9 0 0 0 4.03 -.95 L18 20.12 l1.86 .93 A9 9 0 0 0 23.9 22 H24 v.06 a9 9 0 0 0 -3.02 .89 M28 22 h-2 v-6 h2Z M12.35 10.74 l8.63 4.3 a9 9 0 0 0 3.02 .9 V20 h-.11 a7 7 0 0 1 -3.13 -.74 l-8.62 -4.3 A9 9 0 0 0 8.1 14 H8 v-4 h1.22 a7 7 0 0 1 3.13 .74 M28 8 h-2 V4 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 2
          moveTo(x = 30.0f, y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 6.11
          horizontalLineToRelative(dx = 6.11f)
          // a 7 7 0 0 1 3.13 0.74
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.13f,
            dy1 = 0.74f,
          )
          // L 15.76 19
          lineTo(x = 15.76f, y = 19.0f)
          // l -4.52 2.26
          lineToRelative(dx = -4.52f, dy = 2.26f)
          // A 7 7 0 0 1 8.11 22
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.11f,
            y1 = 22.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 7.22
          horizontalLineToRelative(dx = 7.22f)
          // a 9 9 0 0 0 4.03 -0.95
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.03f,
            dy1 = -0.95f,
          )
          // l 8.62 -4.31
          lineToRelative(dx = 8.62f, dy = -4.31f)
          // A 7 7 0 0 1 25 24
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 24.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 7 7 0 0 1 -3.13 -0.74
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.13f,
            dy1 = -0.74f,
          )
          // L 15.35 10
          lineTo(x = 15.35f, y = 10.0f)
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // M 8 4
          moveTo(x = 8.0f, y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 0 20
          moveToRelative(dx = 0.0f, dy = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 16.98 -1.05
          moveToRelative(dx = 16.98f, dy = -1.05f)
          // l -8.63 4.31
          lineToRelative(dx = -8.63f, dy = 4.31f)
          // A 7 7 0 0 1 9.22 28
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.22f,
            y1 = 28.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 0.11
          horizontalLineToRelative(dx = 0.11f)
          // a 9 9 0 0 0 4.03 -0.95
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.03f,
            dy1 = -0.95f,
          )
          // L 18 20.12
          lineTo(x = 18.0f, y = 20.12f)
          // l 1.86 0.93
          lineToRelative(dx = 1.86f, dy = 0.93f)
          // A 9 9 0 0 0 23.9 22
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.9f,
            y1 = 22.0f,
          )
          // H 24
          horizontalLineTo(x = 24.0f)
          // v 0.06
          verticalLineToRelative(dy = 0.06f)
          // a 9 9 0 0 0 -3.02 0.89
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.02f,
            dy1 = 0.89f,
          )
          // M 28 22
          moveTo(x = 28.0f, y = 22.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 12.35 10.74
          moveTo(x = 12.35f, y = 10.74f)
          // l 8.63 4.3
          lineToRelative(dx = 8.63f, dy = 4.3f)
          // a 9 9 0 0 0 3.02 0.9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.02f,
            dy1 = 0.9f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // h -0.11
          horizontalLineToRelative(dx = -0.11f)
          // a 7 7 0 0 1 -3.13 -0.74
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.13f,
            dy1 = -0.74f,
          )
          // l -8.62 -4.3
          lineToRelative(dx = -8.62f, dy = -4.3f)
          // A 9 9 0 0 0 8.1 14
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.1f,
            y1 = 14.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 1.22
          horizontalLineToRelative(dx = 1.22f)
          // a 7 7 0 0 1 3.13 0.74
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.13f,
            dy1 = 0.74f,
          )
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
      .also { _sankeyDiagramAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _sankeyDiagramAlt: ImageVector? = null
