// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AreaCustom: ImageVector
  get() {
    val current = _areaCustom
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AreaCustom",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 6 a4 4 0 0 0 -7.98 -.22 L9.6 8.26 A3.99 3.99 0 1 0 5 13.86 v8.28 A4 4 0 1 0 9.86 27 h8.28 a4 4 0 1 0 5.6 -4.59 l2.48 -12.43 A4 4 0 0 0 30 6 m-4 -2 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M4 10 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2 m2 18 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m12.14 -3 H9.86 A4 4 0 0 0 7 22.14 v-8.28 a4 4 0 0 0 2.98 -3.64 L22.4 7.74 a4 4 0 0 0 1.85 1.85 l-2.48 12.43 A4 4 0 0 0 18.14 25 M22 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6
          moveTo(x = 30.0f, y = 6.0f)
          // a 4 4 0 0 0 -7.98 -0.22
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.98f,
            dy1 = -0.22f,
          )
          // L 9.6 8.26
          lineTo(x = 9.6f, y = 8.26f)
          // A 3.99 3.99 0 1 0 5 13.86
          arcTo(
            horizontalEllipseRadius = 3.99f,
            verticalEllipseRadius = 3.99f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 13.86f,
          )
          // v 8.28
          verticalLineToRelative(dy = 8.28f)
          // A 4 4 0 1 0 9.86 27
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.86f,
            y1 = 27.0f,
          )
          // h 8.28
          horizontalLineToRelative(dx = 8.28f)
          // a 4 4 0 1 0 5.6 -4.59
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.6f,
            dy1 = -4.59f,
          )
          // l 2.48 -12.43
          lineToRelative(dx = 2.48f, dy = -12.43f)
          // A 4 4 0 0 0 30 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 6.0f,
          )
          // m -4 -2
          moveToRelative(dx = -4.0f, dy = -2.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
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
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // a 2 2 0 1 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
          // m 2 18
          moveToRelative(dx = 2.0f, dy = 18.0f)
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
          // m 12.14 -3
          moveToRelative(dx = 12.14f, dy = -3.0f)
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // A 4 4 0 0 0 7 22.14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 22.14f,
          )
          // v -8.28
          verticalLineToRelative(dy = -8.28f)
          // a 4 4 0 0 0 2.98 -3.64
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.98f,
            dy1 = -3.64f,
          )
          // L 22.4 7.74
          lineTo(x = 22.4f, y = 7.74f)
          // a 4 4 0 0 0 1.85 1.85
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.85f,
            dy1 = 1.85f,
          )
          // l -2.48 12.43
          lineToRelative(dx = -2.48f, dy = 12.43f)
          // A 4 4 0 0 0 18.14 25
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.14f,
            y1 = 25.0f,
          )
          // M 22 28
          moveTo(x = 22.0f, y = 28.0f)
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
      .also { _areaCustom = it }
  }

@Suppress("ObjectPropertyName")
private var _areaCustom: ImageVector? = null
