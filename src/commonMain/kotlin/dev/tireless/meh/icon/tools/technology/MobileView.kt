// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileView: ImageVector
  get() {
    val current = _mobileView
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MobileView",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="23.0" cy="24.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 24
          moveTo(x = 23.0f, y = 24.0f)
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
        // M30.78 23.48 C29.35 20.15 26.3 18 23 18 s-6.35 2.15 -7.78 5.48 L15 24 l.22 .52 C16.65 27.85 19.7 30 23 30 s6.35 -2.15 7.78 -5.48 L31 24z M23 28 a4 4 0 1 1 0 -8 4 4 0 0 1 0 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.78 23.48
          moveTo(x = 30.78f, y = 23.48f)
          // C 29.35 20.15 26.3 18 23 18
          curveTo(
            x1 = 29.35f,
            y1 = 20.15f,
            x2 = 26.3f,
            y2 = 18.0f,
            x3 = 23.0f,
            y3 = 18.0f,
          )
          // s -6.35 2.15 -7.78 5.48
          reflectiveCurveToRelative(
            dx1 = -6.35f,
            dy1 = 2.15f,
            dx2 = -7.78f,
            dy2 = 5.48f,
          )
          // L 15 24
          lineTo(x = 15.0f, y = 24.0f)
          // l 0.22 0.52
          lineToRelative(dx = 0.22f, dy = 0.52f)
          // C 16.65 27.85 19.7 30 23 30
          curveTo(
            x1 = 16.65f,
            y1 = 27.85f,
            x2 = 19.7f,
            y2 = 30.0f,
            x3 = 23.0f,
            y3 = 30.0f,
          )
          // s 6.35 -2.15 7.78 -5.48
          reflectiveCurveToRelative(
            dx1 = 6.35f,
            dy1 = -2.15f,
            dx2 = 7.78f,
            dy2 = -5.48f,
          )
          // L 31 24z
          lineTo(x = 31.0f, y = 24.0f)
          close()
          // M 23 28
          moveTo(x = 23.0f, y = 28.0f)
          // a 4 4 0 1 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // a 4 4 0 0 1 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
        }
        // M14 28 H9 V8 h14 v7 h2 V4 a2 2 0 0 0 -2 -2 H9 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h5z M9 4 h14 v2 H9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 28
          moveTo(x = 14.0f, y = 28.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 9z
          horizontalLineTo(x = 9.0f)
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
      .also { _mobileView = it }
  }

@Suppress("ObjectPropertyName")
private var _mobileView: ImageVector? = null
