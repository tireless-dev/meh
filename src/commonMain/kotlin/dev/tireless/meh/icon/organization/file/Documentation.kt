// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Documentation: ImageVector
  get() {
    val current = _documentation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Documentation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.32 9.5 -8 -7 A2 2 0 0 0 20 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V11 a2 2 0 0 0 -.68 -1.5 M28 13 v15 H4 V4 h14 v7 a2 2 0 0 0 2 2z M6 14 h4.37 c3.13 0 5.17 2 5.17 6 s-2.04 6 -5.17 6 H6z m4.37 9.99 c1.68 0 2.77 -1 2.77 -3.05 v-1.88 c0 -2.05 -1.09 -3.05 -2.77 -3.05 h-2.1 V24z m6.63 -2.5 c0 -2.87 1.6 -4.67 4.16 -4.67 2.58 0 4.18 1.8 4.18 4.67 0 2.9 -1.6 4.72 -4.18 4.72 -2.56 0 -4.16 -1.83 -4.16 -4.72 m6.04 .85 v-1.67 c0 -1.34 -.73 -2.08 -1.88 -2.08 -1.13 0 -1.86 .74 -1.86 2.08 v1.67 c0 1.36 .73 2.1 1.86 2.1 1.15 0 1.88 -.74 1.88 -2.1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.32 9.5
          moveTo(x = 29.32f, y = 9.5f)
          // l -8 -7
          lineToRelative(dx = -8.0f, dy = -7.0f)
          // A 2 2 0 0 0 20 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 2.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 2 2 0 0 0 -0.68 -1.5
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.68f,
            dy1 = -1.5f,
          )
          // M 28 13
          moveTo(x = 28.0f, y = 13.0f)
          // v 15
          verticalLineToRelative(dy = 15.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 2 2 0 0 0 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
          // M 6 14
          moveTo(x = 6.0f, y = 14.0f)
          // h 4.37
          horizontalLineToRelative(dx = 4.37f)
          // c 3.13 0 5.17 2 5.17 6
          curveToRelative(
            dx1 = 3.13f,
            dy1 = 0.0f,
            dx2 = 5.17f,
            dy2 = 2.0f,
            dx3 = 5.17f,
            dy3 = 6.0f,
          )
          // s -2.04 6 -5.17 6
          reflectiveCurveToRelative(
            dx1 = -2.04f,
            dy1 = 6.0f,
            dx2 = -5.17f,
            dy2 = 6.0f,
          )
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 4.37 9.99
          moveToRelative(dx = 4.37f, dy = 9.99f)
          // c 1.68 0 2.77 -1 2.77 -3.05
          curveToRelative(
            dx1 = 1.68f,
            dy1 = 0.0f,
            dx2 = 2.77f,
            dy2 = -1.0f,
            dx3 = 2.77f,
            dy3 = -3.05f,
          )
          // v -1.88
          verticalLineToRelative(dy = -1.88f)
          // c 0 -2.05 -1.09 -3.05 -2.77 -3.05
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.05f,
            dx2 = -1.09f,
            dy2 = -3.05f,
            dx3 = -2.77f,
            dy3 = -3.05f,
          )
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // V 24z
          verticalLineTo(y = 24.0f)
          close()
          // m 6.63 -2.5
          moveToRelative(dx = 6.63f, dy = -2.5f)
          // c 0 -2.87 1.6 -4.67 4.16 -4.67
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.87f,
            dx2 = 1.6f,
            dy2 = -4.67f,
            dx3 = 4.16f,
            dy3 = -4.67f,
          )
          // c 2.58 0 4.18 1.8 4.18 4.67
          curveToRelative(
            dx1 = 2.58f,
            dy1 = 0.0f,
            dx2 = 4.18f,
            dy2 = 1.8f,
            dx3 = 4.18f,
            dy3 = 4.67f,
          )
          // c 0 2.9 -1.6 4.72 -4.18 4.72
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.9f,
            dx2 = -1.6f,
            dy2 = 4.72f,
            dx3 = -4.18f,
            dy3 = 4.72f,
          )
          // c -2.56 0 -4.16 -1.83 -4.16 -4.72
          curveToRelative(
            dx1 = -2.56f,
            dy1 = 0.0f,
            dx2 = -4.16f,
            dy2 = -1.83f,
            dx3 = -4.16f,
            dy3 = -4.72f,
          )
          // m 6.04 0.85
          moveToRelative(dx = 6.04f, dy = 0.85f)
          // v -1.67
          verticalLineToRelative(dy = -1.67f)
          // c 0 -1.34 -0.73 -2.08 -1.88 -2.08
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.34f,
            dx2 = -0.73f,
            dy2 = -2.08f,
            dx3 = -1.88f,
            dy3 = -2.08f,
          )
          // c -1.13 0 -1.86 0.74 -1.86 2.08
          curveToRelative(
            dx1 = -1.13f,
            dy1 = 0.0f,
            dx2 = -1.86f,
            dy2 = 0.74f,
            dx3 = -1.86f,
            dy3 = 2.08f,
          )
          // v 1.67
          verticalLineToRelative(dy = 1.67f)
          // c 0 1.36 0.73 2.1 1.86 2.1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.36f,
            dx2 = 0.73f,
            dy2 = 2.1f,
            dx3 = 1.86f,
            dy3 = 2.1f,
          )
          // c 1.15 0 1.88 -0.74 1.88 -2.1
          curveToRelative(
            dx1 = 1.15f,
            dy1 = 0.0f,
            dx2 = 1.88f,
            dy2 = -0.74f,
            dx3 = 1.88f,
            dy3 = -2.1f,
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
      .also { _documentation = it }
  }

@Suppress("ObjectPropertyName")
private var _documentation: ImageVector? = null
