// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BastionHost: ImageVector
  get() {
    val current = _bastionHost
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BastionHost",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.53 2.7 A2 2 0 0 0 26 2 h-2.7 a1.5 1.5 0 0 0 -1.33 .83 L21.38 4 H20 V3.5 A1.5 1.5 0 0 0 18.5 2 h-5 A1.5 1.5 0 0 0 12 3.5 V4 h-1.38 l-.59 -1.17 A1.5 1.5 0 0 0 8.7 2 H6 a2 2 0 0 0 -1.97 2.33 l.7 4.17 A3 3 0 0 0 7.7 11 H8 v12 a3 3 0 0 0 -3 3 v4 h22 v-4 a3 3 0 0 0 -3 -3 V11 h.31 a3 3 0 0 0 2.96 -2.5 l.7 -4.17 a2 2 0 0 0 -.44 -1.62 M25 26 v2 H7 v-2 a1 1 0 0 1 1 -1 h16 a1 1 0 0 1 1 1 m-3 -3 H10 V11 h12Z m3.3 -14.83 A1 1 0 0 1 24.3 9 H7.69 A1 1 0 0 1 6.7 8.17 L6 4 h2.38 l1 2 H14 V4 h4 v2 h4.62 l1 -2 H26Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.53 2.7
          moveTo(x = 27.53f, y = 2.7f)
          // A 2 2 0 0 0 26 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 2.0f,
          )
          // h -2.7
          horizontalLineToRelative(dx = -2.7f)
          // a 1.5 1.5 0 0 0 -1.33 0.83
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.33f,
            dy1 = 0.83f,
          )
          // L 21.38 4
          lineTo(x = 21.38f, y = 4.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // V 3.5
          verticalLineTo(y = 3.5f)
          // A 1.5 1.5 0 0 0 18.5 2
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.5f,
            y1 = 2.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // A 1.5 1.5 0 0 0 12 3.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 3.5f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h -1.38
          horizontalLineToRelative(dx = -1.38f)
          // l -0.59 -1.17
          lineToRelative(dx = -0.59f, dy = -1.17f)
          // A 1.5 1.5 0 0 0 8.7 2
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.7f,
            y1 = 2.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -1.97 2.33
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.97f,
            dy1 = 2.33f,
          )
          // l 0.7 4.17
          lineToRelative(dx = 0.7f, dy = 4.17f)
          // A 3 3 0 0 0 7.7 11
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.7f,
            y1 = 11.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // h 0.31
          horizontalLineToRelative(dx = 0.31f)
          // a 3 3 0 0 0 2.96 -2.5
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.96f,
            dy1 = -2.5f,
          )
          // l 0.7 -4.17
          lineToRelative(dx = 0.7f, dy = -4.17f)
          // a 2 2 0 0 0 -0.44 -1.62
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.44f,
            dy1 = -1.62f,
          )
          // M 25 26
          moveTo(x = 25.0f, y = 26.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // m -3 -3
          moveToRelative(dx = -3.0f, dy = -3.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
          // m 3.3 -14.83
          moveToRelative(dx = 3.3f, dy = -14.83f)
          // A 1 1 0 0 1 24.3 9
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.3f,
            y1 = 9.0f,
          )
          // H 7.69
          horizontalLineTo(x = 7.69f)
          // A 1 1 0 0 1 6.7 8.17
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.7f,
            y1 = 8.17f,
          )
          // L 6 4
          lineTo(x = 6.0f, y = 4.0f)
          // h 2.38
          horizontalLineToRelative(dx = 2.38f)
          // l 1 2
          lineToRelative(dx = 1.0f, dy = 2.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4.62
          horizontalLineToRelative(dx = 4.62f)
          // l 1 -2
          lineToRelative(dx = 1.0f, dy = -2.0f)
          // H 26z
          horizontalLineTo(x = 26.0f)
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
      .also { _bastionHost = it }
  }

@Suppress("ObjectPropertyName")
private var _bastionHost: ImageVector? = null
