// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Drink02: ImageVector
  get() {
    val current = _drink02
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Drink02",
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
        // M16 7.05 V4 a1 1 0 0 0 -1 -1 H9 a1 1 0 0 0 -1 1 v3.05 a6 6 0 0 0 -2 4.45 V29 a1 1 0 0 0 1 1 h5 v-2 H8 V11.5 c0 -2.36 2 -3.48 2 -3.48 V5 h4 v3.02 s2 1.12 2 3.48 V12 h2 v-.5 c0 -1.71 -.72 -3.3 -2 -4.45
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 7.05
          moveTo(x = 16.0f, y = 7.05f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // v 3.05
          verticalLineToRelative(dy = 3.05f)
          // a 6 6 0 0 0 -2 4.45
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 4.45f,
          )
          // V 29
          verticalLineTo(y = 29.0f)
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
          // V 11.5
          verticalLineTo(y = 11.5f)
          // c 0 -2.36 2 -3.48 2 -3.48
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.36f,
            dx2 = 2.0f,
            dy2 = -3.48f,
            dx3 = 2.0f,
            dy3 = -3.48f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3.02
          verticalLineToRelative(dy = 3.02f)
          // s 2 1.12 2 3.48
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 1.12f,
            dx2 = 2.0f,
            dy2 = 3.48f,
          )
          // V 12
          verticalLineTo(y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -0.5
          verticalLineToRelative(dy = -0.5f)
          // c 0 -1.71 -0.72 -3.3 -2 -4.45
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.71f,
            dx2 = -0.72f,
            dy2 = -3.3f,
            dx3 = -2.0f,
            dy3 = -4.45f,
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
      .also { _drink02 = it }
  }

@Suppress("ObjectPropertyName")
private var _drink02: ImageVector? = null
