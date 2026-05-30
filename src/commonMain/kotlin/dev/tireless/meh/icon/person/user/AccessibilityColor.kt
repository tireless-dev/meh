// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AccessibilityColor: ImageVector
  get() {
    val current = _accessibilityColor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AccessibilityColor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 20 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
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
        // M16 24 a10.65 10.65 0 0 1 -9.97 -7.76 L5.97 16 l.06 -.24 A10.65 10.65 0 0 1 16 8 a10.65 10.65 0 0 1 9.97 7.76 L26.03 16 l-.06 .24 A10.65 10.65 0 0 1 16 24 m-7.96 -8 A8.6 8.6 0 0 0 16 22 a8.6 8.6 0 0 0 7.96 -6 A8.6 8.6 0 0 0 16 10 a8.6 8.6 0 0 0 -7.96 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // a 10.65 10.65 0 0 1 -9.97 -7.76
          arcToRelative(
            a = 10.65f,
            b = 10.65f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -9.97f,
            dy1 = -7.76f,
          )
          // L 5.97 16
          lineTo(x = 5.97f, y = 16.0f)
          // l 0.06 -0.24
          lineToRelative(dx = 0.06f, dy = -0.24f)
          // A 10.65 10.65 0 0 1 16 8
          arcTo(
            horizontalEllipseRadius = 10.65f,
            verticalEllipseRadius = 10.65f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 8.0f,
          )
          // a 10.65 10.65 0 0 1 9.97 7.76
          arcToRelative(
            a = 10.65f,
            b = 10.65f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.97f,
            dy1 = 7.76f,
          )
          // L 26.03 16
          lineTo(x = 26.03f, y = 16.0f)
          // l -0.06 0.24
          lineToRelative(dx = -0.06f, dy = 0.24f)
          // A 10.65 10.65 0 0 1 16 24
          arcTo(
            horizontalEllipseRadius = 10.65f,
            verticalEllipseRadius = 10.65f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 24.0f,
          )
          // m -7.96 -8
          moveToRelative(dx = -7.96f, dy = -8.0f)
          // A 8.6 8.6 0 0 0 16 22
          arcTo(
            horizontalEllipseRadius = 8.6f,
            verticalEllipseRadius = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 22.0f,
          )
          // a 8.6 8.6 0 0 0 7.96 -6
          arcToRelative(
            a = 8.6f,
            b = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.96f,
            dy1 = -6.0f,
          )
          // A 8.6 8.6 0 0 0 16 10
          arcTo(
            horizontalEllipseRadius = 8.6f,
            verticalEllipseRadius = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 10.0f,
          )
          // a 8.6 8.6 0 0 0 -7.96 6
          arcToRelative(
            a = 8.6f,
            b = 8.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.96f,
            dy1 = 6.0f,
          )
        }
        // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 14 14 0 1 1 14 -14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // a 14 14 0 0 1 -14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12 12 0 1 0 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // A 12 12 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
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
      .also { _accessibilityColor = it }
  }

@Suppress("ObjectPropertyName")
private var _accessibilityColor: ImageVector? = null
