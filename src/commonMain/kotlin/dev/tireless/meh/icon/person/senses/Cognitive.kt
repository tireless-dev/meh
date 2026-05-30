// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cognitive: ImageVector
  get() {
    val current = _cognitive
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Cognitive",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 13 A11 11 0 0 0 19 2 h-8 a9 9 0 0 0 -9 9 v3 a5 5 0 0 0 5 5 h1.1 a5 5 0 0 0 4.9 4 h1.38 l4 7 1.73 -1 -4 -6.89 A2 2 0 0 0 14.38 21 H13 a3 3 0 0 1 0 -6 h1 v-2 h-1 a5 5 0 0 0 -4.9 4 H7 a3 3 0 0 1 -3 -3 v-2 h2 a3 3 0 0 0 3 -3 V8 H7 v1 a1 1 0 0 1 -1 1 H4.08 A7 7 0 0 1 11 4 h6 v2 a1 1 0 0 1 -1 1 h-2 v2 h2 a3 3 0 0 0 3 -3 V4 a9 9 0 0 1 8.05 5 H26 a3 3 0 0 0 -3 3 v1 h2 v-1 a1 1 0 0 1 1 -1 h1.77 A9 9 0 0 1 28 13 v1 a5 5 0 0 1 -5 5 h-3 v2 h3 a7 7 0 0 0 3 -.68 V21 a3 3 0 0 1 -3 3 h-1 v2 h1 a5 5 0 0 0 5 -5 v-2.11 A7 7 0 0 0 30 14Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 13
          moveTo(x = 30.0f, y = 13.0f)
          // A 11 11 0 0 0 19 2
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 2.0f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 9 9 0 0 0 -9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = 9.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 5 5 0 0 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // h 1.1
          horizontalLineToRelative(dx = 1.1f)
          // a 5 5 0 0 0 4.9 4
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.9f,
            dy1 = 4.0f,
          )
          // h 1.38
          horizontalLineToRelative(dx = 1.38f)
          // l 4 7
          lineToRelative(dx = 4.0f, dy = 7.0f)
          // l 1.73 -1
          lineToRelative(dx = 1.73f, dy = -1.0f)
          // l -4 -6.89
          lineToRelative(dx = -4.0f, dy = -6.89f)
          // A 2 2 0 0 0 14.38 21
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.38f,
            y1 = 21.0f,
          )
          // H 13
          horizontalLineTo(x = 13.0f)
          // a 3 3 0 0 1 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 5 5 0 0 0 -4.9 4
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.9f,
            dy1 = 4.0f,
          )
          // H 7
          horizontalLineTo(x = 7.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // H 4.08
          horizontalLineTo(x = 4.08f)
          // A 7 7 0 0 1 11 4
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.0f,
            y1 = 4.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 9 9 0 0 1 8.05 5
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.05f,
            dy1 = 5.0f,
          )
          // H 26
          horizontalLineTo(x = 26.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
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
          // h 1.77
          horizontalLineToRelative(dx = 1.77f)
          // A 9 9 0 0 1 28 13
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 13.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 7 7 0 0 0 3 -0.68
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -0.68f,
          )
          // V 21
          verticalLineTo(y = 21.0f)
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 5 5 0 0 0 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // v -2.11
          verticalLineToRelative(dy = -2.11f)
          // A 7 7 0 0 0 30 14z
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 14.0f,
          )
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
      .also { _cognitive = it }
  }

@Suppress("ObjectPropertyName")
private var _cognitive: ImageVector? = null
