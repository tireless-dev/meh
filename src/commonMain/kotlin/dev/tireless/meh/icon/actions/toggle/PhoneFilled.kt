// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneFilled: ImageVector
  get() {
    val current = _phoneFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PhoneFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m20.33 21.48 2.24 -2.24 a2.2 2.2 0 0 1 2.34 -.48 l2.73 1.09 a2.2 2.2 0 0 1 1.36 2 v5 A2.17 2.17 0 0 1 26.72 29 C7.59 27.81 3.73 11.61 3 5.41 A2.17 2.17 0 0 1 5.17 3 H10 a2.2 2.2 0 0 1 2 1.36 l1.09 2.73 a2.2 2.2 0 0 1 -.47 2.34 l-2.24 2.24 s1.29 8.73 9.95 9.81
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.33 21.48
          moveTo(x = 20.33f, y = 21.48f)
          // l 2.24 -2.24
          lineToRelative(dx = 2.24f, dy = -2.24f)
          // a 2.2 2.2 0 0 1 2.34 -0.48
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.34f,
            dy1 = -0.48f,
          )
          // l 2.73 1.09
          lineToRelative(dx = 2.73f, dy = 1.09f)
          // a 2.2 2.2 0 0 1 1.36 2
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.36f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // A 2.17 2.17 0 0 1 26.72 29
          arcTo(
            horizontalEllipseRadius = 2.17f,
            verticalEllipseRadius = 2.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.72f,
            y1 = 29.0f,
          )
          // C 7.59 27.81 3.73 11.61 3 5.41
          curveTo(
            x1 = 7.59f,
            y1 = 27.81f,
            x2 = 3.73f,
            y2 = 11.61f,
            x3 = 3.0f,
            y3 = 5.41f,
          )
          // A 2.17 2.17 0 0 1 5.17 3
          arcTo(
            horizontalEllipseRadius = 2.17f,
            verticalEllipseRadius = 2.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.17f,
            y1 = 3.0f,
          )
          // H 10
          horizontalLineTo(x = 10.0f)
          // a 2.2 2.2 0 0 1 2 1.36
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 1.36f,
          )
          // l 1.09 2.73
          lineToRelative(dx = 1.09f, dy = 2.73f)
          // a 2.2 2.2 0 0 1 -0.47 2.34
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.47f,
            dy1 = 2.34f,
          )
          // l -2.24 2.24
          lineToRelative(dx = -2.24f, dy = 2.24f)
          // s 1.29 8.73 9.95 9.81
          reflectiveCurveToRelative(
            dx1 = 1.29f,
            dy1 = 8.73f,
            dx2 = 9.95f,
            dy2 = 9.81f,
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
      .also { _phoneFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _phoneFilled: ImageVector? = null
