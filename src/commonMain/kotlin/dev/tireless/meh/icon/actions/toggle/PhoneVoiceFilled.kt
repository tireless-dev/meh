// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneVoiceFilled: ImageVector
  get() {
    val current = _phoneVoiceFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PhoneVoiceFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 13 h-2 a3 3 0 0 0 -3 -3 V8 a5 5 0 0 1 5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 13
          moveTo(x = 24.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // a 5 5 0 0 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
        }
        // M28 13 h-2 a7 7 0 0 0 -7 -7 V4 a9 9 0 0 1 9 9 m-7.67 8.48 2.24 -2.24 a2.2 2.2 0 0 1 2.34 -.48 l2.73 1.1 a2.2 2.2 0 0 1 1.36 2 v4.97 A2.17 2.17 0 0 1 26.72 29 C7.59 27.8 3.73 11.6 3.02 5.4 A2.16 2.16 0 0 1 5.16 3 h4.87 a2.2 2.2 0 0 1 2.01 1.36 l1.1 2.73 a2.2 2.2 0 0 1 -.49 2.34 l-2.24 2.24 s1.25 8.73 9.91 9.81
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 13
          moveTo(x = 28.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 9 9 0 0 1 9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.0f,
            dy1 = 9.0f,
          )
          // m -7.67 8.48
          moveToRelative(dx = -7.67f, dy = 8.48f)
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
          // l 2.73 1.1
          lineToRelative(dx = 2.73f, dy = 1.1f)
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
          // v 4.97
          verticalLineToRelative(dy = 4.97f)
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
          // C 7.59 27.8 3.73 11.6 3.02 5.4
          curveTo(
            x1 = 7.59f,
            y1 = 27.8f,
            x2 = 3.73f,
            y2 = 11.6f,
            x3 = 3.02f,
            y3 = 5.4f,
          )
          // A 2.16 2.16 0 0 1 5.16 3
          arcTo(
            horizontalEllipseRadius = 2.16f,
            verticalEllipseRadius = 2.16f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.16f,
            y1 = 3.0f,
          )
          // h 4.87
          horizontalLineToRelative(dx = 4.87f)
          // a 2.2 2.2 0 0 1 2.01 1.36
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.01f,
            dy1 = 1.36f,
          )
          // l 1.1 2.73
          lineToRelative(dx = 1.1f, dy = 2.73f)
          // a 2.2 2.2 0 0 1 -0.49 2.34
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.49f,
            dy1 = 2.34f,
          )
          // l -2.24 2.24
          lineToRelative(dx = -2.24f, dy = 2.24f)
          // s 1.25 8.73 9.91 9.81
          reflectiveCurveToRelative(
            dx1 = 1.25f,
            dy1 = 8.73f,
            dx2 = 9.91f,
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
      .also { _phoneVoiceFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _phoneVoiceFilled: ImageVector? = null
