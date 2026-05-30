// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReadMe: ImageVector
  get() {
    val current = _readMe
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ReadMe",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 7 H5 V5 h15z m0 3 H5 v2 h15z m-8 5 H5 v2 h7z m-2 5 H5 v2 h5z m10 0 c-1.1 0 -2 .9 -2 2 s.9 2 2 2 2 -.9 2 -2 -.9 -2 -2 -2 m8 2 -.22 .52 C26.36 25.85 23.3 28 20 28 s-6.35 -2.15 -7.78 -5.48 L12 22 l.22 -.52 C13.64 18.15 16.7 16 20 16 s6.35 2.15 7.78 5.48z m-4 0 a4 4 0 1 0 -8 0 4 4 0 0 0 8 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 7
          moveTo(x = 20.0f, y = 7.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 15z
          horizontalLineToRelative(dx = 15.0f)
          close()
          // m 0 3
          moveToRelative(dx = 0.0f, dy = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 15z
          horizontalLineToRelative(dx = 15.0f)
          close()
          // m -8 5
          moveToRelative(dx = -8.0f, dy = 5.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7z
          horizontalLineToRelative(dx = 7.0f)
          close()
          // m -2 5
          moveToRelative(dx = -2.0f, dy = 5.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // c -1.1 0 -2 0.9 -2 2
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = 0.9f,
            dx3 = -2.0f,
            dy3 = 2.0f,
          )
          // s 0.9 2 2 2
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = 2.0f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // s 2 -0.9 2 -2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = -0.9f,
            dx2 = 2.0f,
            dy2 = -2.0f,
          )
          // s -0.9 -2 -2 -2
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = -2.0f,
            dx2 = -2.0f,
            dy2 = -2.0f,
          )
          // m 8 2
          moveToRelative(dx = 8.0f, dy = 2.0f)
          // l -0.22 0.52
          lineToRelative(dx = -0.22f, dy = 0.52f)
          // C 26.36 25.85 23.3 28 20 28
          curveTo(
            x1 = 26.36f,
            y1 = 25.85f,
            x2 = 23.3f,
            y2 = 28.0f,
            x3 = 20.0f,
            y3 = 28.0f,
          )
          // s -6.35 -2.15 -7.78 -5.48
          reflectiveCurveToRelative(
            dx1 = -6.35f,
            dy1 = -2.15f,
            dx2 = -7.78f,
            dy2 = -5.48f,
          )
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // l 0.22 -0.52
          lineToRelative(dx = 0.22f, dy = -0.52f)
          // C 13.64 18.15 16.7 16 20 16
          curveTo(
            x1 = 13.64f,
            y1 = 18.15f,
            x2 = 16.7f,
            y2 = 16.0f,
            x3 = 20.0f,
            y3 = 16.0f,
          )
          // s 6.35 2.15 7.78 5.48z
          reflectiveCurveToRelative(
            dx1 = 6.35f,
            dy1 = 2.15f,
            dx2 = 7.78f,
            dy2 = 5.48f,
          )
          close()
          // m -4 0
          moveToRelative(dx = -4.0f, dy = 0.0f)
          // a 4 4 0 1 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 0 0 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 0.0f,
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
      .also { _readMe = it }
  }

@Suppress("ObjectPropertyName")
private var _readMe: ImageVector? = null
