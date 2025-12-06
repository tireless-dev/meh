// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EventWarning: ImageVector
  get() {
    val current = _eventWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EventWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.38 28 h-6.76 L24 21.24z M24 18 a1 1 0 0 0 -.9 .55 l-5 10 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 .92 -1.39 L24.9 18.55 A1 1 0 0 0 24 18 m-8 5 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.38 28
          moveTo(x = 27.38f, y = 28.0f)
          // h -6.76
          horizontalLineToRelative(dx = -6.76f)
          // L 24 21.24z
          lineTo(x = 24.0f, y = 21.24f)
          close()
          // M 24 18
          moveTo(x = 24.0f, y = 18.0f)
          // a 1 1 0 0 0 -0.9 0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.9f,
            dy1 = 0.55f,
          )
          // l -5 10
          lineToRelative(dx = -5.0f, dy = 10.0f)
          // A 1 1 0 0 0 19 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 0.92 -1.39
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = -1.39f,
          )
          // L 24.9 18.55
          lineTo(x = 24.9f, y = 18.55f)
          // A 1 1 0 0 0 24 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 18.0f,
          )
          // m -8 5
          moveToRelative(dx = -8.0f, dy = 5.0f)
          // a 1.5 1.5 0 1 0 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 0 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
        }
        // <rect width="2" height="9" x="15.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 12
          moveTo(x = 15.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M15 30 H3 a1 1 0 0 1 -.89 -1.46 l13 -25 C15.28 3.2 15.64 3 16 3 s.72 .2 .89 .54 l6 11.54 L21.1 16 16 6.17 4.65 28 H15z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 30
          moveTo(x = 15.0f, y = 30.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 -0.89 -1.46
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.89f,
            dy1 = -1.46f,
          )
          // l 13 -25
          lineToRelative(dx = 13.0f, dy = -25.0f)
          // C 15.28 3.2 15.64 3 16 3
          curveTo(
            x1 = 15.28f,
            y1 = 3.2f,
            x2 = 15.64f,
            y2 = 3.0f,
            x3 = 16.0f,
            y3 = 3.0f,
          )
          // s 0.72 0.2 0.89 0.54
          reflectiveCurveToRelative(
            dx1 = 0.72f,
            dy1 = 0.2f,
            dx2 = 0.89f,
            dy2 = 0.54f,
          )
          // l 6 11.54
          lineToRelative(dx = 6.0f, dy = 11.54f)
          // L 21.1 16
          lineTo(x = 21.1f, y = 16.0f)
          // L 16 6.17
          lineTo(x = 16.0f, y = 6.17f)
          // L 4.65 28
          lineTo(x = 4.65f, y = 28.0f)
          // H 15z
          horizontalLineTo(x = 15.0f)
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
      .also { _eventWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _eventWarning: ImageVector? = null
