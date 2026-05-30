// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ViewOffFilled: ImageVector
  get() {
    val current = _viewOffFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ViewOffFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30.94 15.66 a16.4 16.4 0 0 0 -5.73 -7.45 L30 3.41 28.59 2 2 28.59 3.41 30 l5.1 -5.09 A15.4 15.4 0 0 0 16 27 a16.7 16.7 0 0 0 14.94 -10.66 1 1 0 0 0 0 -.68 M16 22.5 a6.5 6.5 0 0 1 -3.83 -1.26 L14 19.43 A4 4 0 0 0 19.43 14 l1.81 -1.81 A6.49 6.49 0 0 1 16 22.5 M4.53 21.81 l5 -5 A7 7 0 0 1 9.5 16 6.5 6.5 0 0 1 16 9.5 a7 7 0 0 1 .79 .05 l3.78 -3.77 A14 14 0 0 0 16 5 16.7 16.7 0 0 0 1.06 15.66 a1 1 0 0 0 0 .68 16 16 0 0 0 3.47 5.47
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.94 15.66
          moveTo(x = 30.94f, y = 15.66f)
          // a 16.4 16.4 0 0 0 -5.73 -7.45
          arcToRelative(
            a = 16.4f,
            b = 16.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.73f,
            dy1 = -7.45f,
          )
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 5.1 -5.09
          lineToRelative(dx = 5.1f, dy = -5.09f)
          // A 15.4 15.4 0 0 0 16 27
          arcTo(
            horizontalEllipseRadius = 15.4f,
            verticalEllipseRadius = 15.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 27.0f,
          )
          // a 16.7 16.7 0 0 0 14.94 -10.66
          arcToRelative(
            a = 16.7f,
            b = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.94f,
            dy1 = -10.66f,
          )
          // a 1 1 0 0 0 0 -0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.68f,
          )
          // M 16 22.5
          moveTo(x = 16.0f, y = 22.5f)
          // a 6.5 6.5 0 0 1 -3.83 -1.26
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.83f,
            dy1 = -1.26f,
          )
          // L 14 19.43
          lineTo(x = 14.0f, y = 19.43f)
          // A 4 4 0 0 0 19.43 14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.43f,
            y1 = 14.0f,
          )
          // l 1.81 -1.81
          lineToRelative(dx = 1.81f, dy = -1.81f)
          // A 6.49 6.49 0 0 1 16 22.5
          arcTo(
            horizontalEllipseRadius = 6.49f,
            verticalEllipseRadius = 6.49f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 22.5f,
          )
          // M 4.53 21.81
          moveTo(x = 4.53f, y = 21.81f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // A 7 7 0 0 1 9.5 16
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.5f,
            y1 = 16.0f,
          )
          // A 6.5 6.5 0 0 1 16 9.5
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 9.5f,
          )
          // a 7 7 0 0 1 0.79 0.05
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.79f,
            dy1 = 0.05f,
          )
          // l 3.78 -3.77
          lineToRelative(dx = 3.78f, dy = -3.77f)
          // A 14 14 0 0 0 16 5
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 5.0f,
          )
          // A 16.7 16.7 0 0 0 1.06 15.66
          arcTo(
            horizontalEllipseRadius = 16.7f,
            verticalEllipseRadius = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 1.06f,
            y1 = 15.66f,
          )
          // a 1 1 0 0 0 0 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.68f,
          )
          // a 16 16 0 0 0 3.47 5.47
          arcToRelative(
            a = 16.0f,
            b = 16.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.47f,
            dy1 = 5.47f,
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
      .also { _viewOffFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _viewOffFilled: ImageVector? = null
