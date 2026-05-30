// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunViewIcon: ImageVector
  get() {
    val current = _runViewIcon
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RunViewIcon",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m28.48 14.12 -20 -11 A1 1 0 0 0 7 4 v11 h2 V5.69 L25.92 15 l-7.04 3.88 1.47 1.47 8.13 -4.47 a1 1 0 0 0 0 -1.76 M13.98 26 H16 v-2 h-2 v-1.58 l2.7 -2.71 -1.4 -1.42 -1.84 1.84 a5.5 5.5 0 0 0 -9.92 0 l-1.83 -1.84 -1.42 1.42 L3 22.4 V24 H1 v2 h2.03 a6 6 0 0 0 .27 1.27 l-2.85 1.9 1.1 1.66 2.73 -1.81 a5.5 5.5 0 0 0 8.44 0 l2.73 1.81 1.1 -1.66 -2.85 -1.9 A6 6 0 0 0 13.97 26 M8.5 19 a3.5 3.5 0 0 1 3.15 2 h-6.3 a3.5 3.5 0 0 1 3.15 -2 m0 10 A3.5 3.5 0 0 1 5 25.5 V23 h7 v2.5 A3.5 3.5 0 0 1 8.5 29
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.48 14.12
          moveTo(x = 28.48f, y = 14.12f)
          // l -20 -11
          lineToRelative(dx = -20.0f, dy = -11.0f)
          // A 1 1 0 0 0 7 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 4.0f,
          )
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 5.69
          verticalLineTo(y = 5.69f)
          // L 25.92 15
          lineTo(x = 25.92f, y = 15.0f)
          // l -7.04 3.88
          lineToRelative(dx = -7.04f, dy = 3.88f)
          // l 1.47 1.47
          lineToRelative(dx = 1.47f, dy = 1.47f)
          // l 8.13 -4.47
          lineToRelative(dx = 8.13f, dy = -4.47f)
          // a 1 1 0 0 0 0 -1.76
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.76f,
          )
          // M 13.98 26
          moveTo(x = 13.98f, y = 26.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1.58
          verticalLineToRelative(dy = -1.58f)
          // l 2.7 -2.71
          lineToRelative(dx = 2.7f, dy = -2.71f)
          // l -1.4 -1.42
          lineToRelative(dx = -1.4f, dy = -1.42f)
          // l -1.84 1.84
          lineToRelative(dx = -1.84f, dy = 1.84f)
          // a 5.5 5.5 0 0 0 -9.92 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.92f,
            dy1 = 0.0f,
          )
          // l -1.83 -1.84
          lineToRelative(dx = -1.83f, dy = -1.84f)
          // l -1.42 1.42
          lineToRelative(dx = -1.42f, dy = 1.42f)
          // L 3 22.4
          lineTo(x = 3.0f, y = 22.4f)
          // V 24
          verticalLineTo(y = 24.0f)
          // H 1
          horizontalLineTo(x = 1.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.03
          horizontalLineToRelative(dx = 2.03f)
          // a 6 6 0 0 0 0.27 1.27
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.27f,
            dy1 = 1.27f,
          )
          // l -2.85 1.9
          lineToRelative(dx = -2.85f, dy = 1.9f)
          // l 1.1 1.66
          lineToRelative(dx = 1.1f, dy = 1.66f)
          // l 2.73 -1.81
          lineToRelative(dx = 2.73f, dy = -1.81f)
          // a 5.5 5.5 0 0 0 8.44 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.44f,
            dy1 = 0.0f,
          )
          // l 2.73 1.81
          lineToRelative(dx = 2.73f, dy = 1.81f)
          // l 1.1 -1.66
          lineToRelative(dx = 1.1f, dy = -1.66f)
          // l -2.85 -1.9
          lineToRelative(dx = -2.85f, dy = -1.9f)
          // A 6 6 0 0 0 13.97 26
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.97f,
            y1 = 26.0f,
          )
          // M 8.5 19
          moveTo(x = 8.5f, y = 19.0f)
          // a 3.5 3.5 0 0 1 3.15 2
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.15f,
            dy1 = 2.0f,
          )
          // h -6.3
          horizontalLineToRelative(dx = -6.3f)
          // a 3.5 3.5 0 0 1 3.15 -2
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.15f,
            dy1 = -2.0f,
          )
          // m 0 10
          moveToRelative(dx = 0.0f, dy = 10.0f)
          // A 3.5 3.5 0 0 1 5 25.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 25.5f,
          )
          // V 23
          verticalLineTo(y = 23.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2.5
          verticalLineToRelative(dy = 2.5f)
          // A 3.5 3.5 0 0 1 8.5 29
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.5f,
            y1 = 29.0f,
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
      .also { _runViewIcon = it }
  }

@Suppress("ObjectPropertyName")
private var _runViewIcon: ImageVector? = null
