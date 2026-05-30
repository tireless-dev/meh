// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WifiOff: ImageVector
  get() {
    val current = _wifiOff
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WifiOff",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="25.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M30 3.41 28.59 2 2 28.59 3.41 30 14.1 19.32 a6 6 0 0 1 6 1.32 l1.42 -1.42 a8 8 0 0 0 -5.12 -2.2 l3.38 -3.39 a12 12 0 0 1 4.57 2.77 l1.41 -1.42 a14 14 0 0 0 -4.43 -2.9 l3 -3 a18 18 0 0 1 4.26 3.08 L30 10.74 a20 20 0 0 0 -4.19 -3.14Z m-15.32 9.67 2.04 -2.04 Q16.36 11 16 11 a14 14 0 0 0 -9.77 4 l1.41 1.4 a12 12 0 0 1 7.04 -3.32 M16 7 a18 18 0 0 1 4.23 .53 l1.64 -1.65 A20 20 0 0 0 2 10.74 v.02 l1.4 1.4 A18 18 0 0 1 16 7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 3.41
          moveTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // L 14.1 19.32
          lineTo(x = 14.1f, y = 19.32f)
          // a 6 6 0 0 1 6 1.32
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 1.32f,
          )
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // a 8 8 0 0 0 -5.12 -2.2
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.12f,
            dy1 = -2.2f,
          )
          // l 3.38 -3.39
          lineToRelative(dx = 3.38f, dy = -3.39f)
          // a 12 12 0 0 1 4.57 2.77
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.57f,
            dy1 = 2.77f,
          )
          // l 1.41 -1.42
          lineToRelative(dx = 1.41f, dy = -1.42f)
          // a 14 14 0 0 0 -4.43 -2.9
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.43f,
            dy1 = -2.9f,
          )
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // a 18 18 0 0 1 4.26 3.08
          arcToRelative(
            a = 18.0f,
            b = 18.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.26f,
            dy1 = 3.08f,
          )
          // L 30 10.74
          lineTo(x = 30.0f, y = 10.74f)
          // a 20 20 0 0 0 -4.19 -3.14z
          arcToRelative(
            a = 20.0f,
            b = 20.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.19f,
            dy1 = -3.14f,
          )
          close()
          // m -15.32 9.67
          moveToRelative(dx = -15.32f, dy = 9.67f)
          // l 2.04 -2.04
          lineToRelative(dx = 2.04f, dy = -2.04f)
          // Q 16.36 11 16 11
          quadTo(
            x1 = 16.36f,
            y1 = 11.0f,
            x2 = 16.0f,
            y2 = 11.0f,
          )
          // a 14 14 0 0 0 -9.77 4
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.77f,
            dy1 = 4.0f,
          )
          // l 1.41 1.4
          lineToRelative(dx = 1.41f, dy = 1.4f)
          // a 12 12 0 0 1 7.04 -3.32
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.04f,
            dy1 = -3.32f,
          )
          // M 16 7
          moveTo(x = 16.0f, y = 7.0f)
          // a 18 18 0 0 1 4.23 0.53
          arcToRelative(
            a = 18.0f,
            b = 18.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.23f,
            dy1 = 0.53f,
          )
          // l 1.64 -1.65
          lineToRelative(dx = 1.64f, dy = -1.65f)
          // A 20 20 0 0 0 2 10.74
          arcTo(
            horizontalEllipseRadius = 20.0f,
            verticalEllipseRadius = 20.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 10.74f,
          )
          // v 0.02
          verticalLineToRelative(dy = 0.02f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // A 18 18 0 0 1 16 7
          arcTo(
            horizontalEllipseRadius = 18.0f,
            verticalEllipseRadius = 18.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 7.0f,
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
      .also { _wifiOff = it }
  }

@Suppress("ObjectPropertyName")
private var _wifiOff: ImageVector? = null
