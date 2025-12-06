// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drink01: ImageVector
  get() {
    val current = _drink01
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Drink01",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m23 10.41 3 -3 L24.59 6 l-3.3 3.3 A1 1 0 0 0 21 10 v4 h-7.07 l1.14 16 h8.86 l1.14 -16 H23z M22.07 28 h-5.14 l-.86 -12 h6.86z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 10.41
          moveTo(x = 23.0f, y = 10.41f)
          // l 3 -3
          lineToRelative(dx = 3.0f, dy = -3.0f)
          // L 24.59 6
          lineTo(x = 24.59f, y = 6.0f)
          // l -3.3 3.3
          lineToRelative(dx = -3.3f, dy = 3.3f)
          // A 1 1 0 0 0 21 10
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 10.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -7.07
          horizontalLineToRelative(dx = -7.07f)
          // l 1.14 16
          lineToRelative(dx = 1.14f, dy = 16.0f)
          // h 8.86
          horizontalLineToRelative(dx = 8.86f)
          // l 1.14 -16
          lineToRelative(dx = 1.14f, dy = -16.0f)
          // H 23z
          horizontalLineTo(x = 23.0f)
          close()
          // M 22.07 28
          moveTo(x = 22.07f, y = 28.0f)
          // h -5.14
          horizontalLineToRelative(dx = -5.14f)
          // l -0.86 -12
          lineToRelative(dx = -0.86f, dy = -12.0f)
          // h 6.86z
          horizontalLineToRelative(dx = 6.86f)
          close()
        }
        // M15 1 h-5 a1 1 0 0 0 -1 1 v7.37 C7.93 9.97 6 11.55 6 15 v14 a1 1 0 0 0 1 1 h5 v-2 H8 V15 c0 -3.75 3 -4.28 3 -4.28 V3 h3 v7 h2 V2 a1 1 0 0 0 -1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 1
          moveTo(x = 15.0f, y = 1.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 7.37
          verticalLineToRelative(dy = 7.37f)
          // C 7.93 9.97 6 11.55 6 15
          curveTo(
            x1 = 7.93f,
            y1 = 9.97f,
            x2 = 6.0f,
            y2 = 11.55f,
            x3 = 6.0f,
            y3 = 15.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 15
          verticalLineTo(y = 15.0f)
          // c 0 -3.75 3 -4.28 3 -4.28
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.75f,
            dx2 = 3.0f,
            dy2 = -4.28f,
            dx3 = 3.0f,
            dy3 = -4.28f,
          )
          // V 3
          verticalLineTo(y = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2
          verticalLineTo(y = 2.0f)
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
      .also { _drink01 = it }
  }

@Suppress("ObjectPropertyName")
private var _drink01: ImageVector? = null
