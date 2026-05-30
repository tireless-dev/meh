// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EventChange: ImageVector
  get() {
    val current = _eventChange
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EventChange",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="7" x="17.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 15
          moveTo(x = 17.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <circle cx="18.0" cy="25.0" radius="1.25" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 25
          moveTo(x = 18.0f, y = 25.0f)
          // m -1.25 0
          moveToRelative(dx = -1.25f, dy = 0.0f)
          // a 1.25 1.25 0 1 1 2.5 0
          arcToRelative(
            a = 1.25f,
            b = 1.25f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = 0.0f,
          )
          // a 1.25 1.25 0 1 1 -2.5 0z
          arcToRelative(
            a = 1.25f,
            b = 1.25f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.5f,
            dy1 = 0.0f,
          )
          close()
        }
        // M29 30 H7 a1 1 0 0 1 -.89 -1.46 l11 -21 C17.3 7.2 17.64 7 18 7 s.71 .2 .89 .54 l11 21 A1 1 0 0 1 29 30 M8.65 28 h18.7 L18 10.16z M7 23 H3 a1 1 0 0 1 -.9 -1.45 l2.5 -5 1.8 .9 L4.61 21 H7z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 30
          moveTo(x = 29.0f, y = 30.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // l 11 -21
          lineToRelative(dx = 11.0f, dy = -21.0f)
          // C 17.3 7.2 17.64 7 18 7
          curveTo(
            x1 = 17.3f,
            y1 = 7.2f,
            x2 = 17.64f,
            y2 = 7.0f,
            x3 = 18.0f,
            y3 = 7.0f,
          )
          // s 0.71 0.2 0.89 0.54
          reflectiveCurveToRelative(
            dx1 = 0.71f,
            dy1 = 0.2f,
            dx2 = 0.89f,
            dy2 = 0.54f,
          )
          // l 11 21
          lineToRelative(dx = 11.0f, dy = 21.0f)
          // A 1 1 0 0 1 29 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 30.0f,
          )
          // M 8.65 28
          moveTo(x = 8.65f, y = 28.0f)
          // h 18.7
          horizontalLineToRelative(dx = 18.7f)
          // L 18 10.16z
          lineTo(x = 18.0f, y = 10.16f)
          close()
          // M 7 23
          moveTo(x = 7.0f, y = 23.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 1 1 0 0 1 -0.9 -1.45
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = -1.45f,
          )
          // l 2.5 -5
          lineToRelative(dx = 2.5f, dy = -5.0f)
          // l 1.8 0.9
          lineToRelative(dx = 1.8f, dy = 0.9f)
          // L 4.61 21
          lineTo(x = 4.61f, y = 21.0f)
          // H 7z
          horizontalLineTo(x = 7.0f)
          close()
        }
        // <rect width="6" height="2" x="4.955" y="11.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5.6056128 14.552713
          moveTo(x = 5.6056128f, y = 14.552713f)
          // l 2.6832762 -5.3665657
          lineToRelative(dx = 2.6832762f, dy = -5.3665657f)
          // l 1.7888553 0.8944254
          lineToRelative(dx = 1.7888553f, dy = 0.8944254f)
          // l -2.6832762 5.3665657z
          lineToRelative(dx = -2.6832762f, dy = 5.3665657f)
          close()
        }
        // m10.9 8.45 -1.8 -.9 2.5 -5 C11.78 2.21 12.15 2 12.5 2 s.73 .21 .9 .55 l2 4 -1.8 .9 -1.1 -2.21z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.9 8.45
          moveTo(x = 10.9f, y = 8.45f)
          // l -1.8 -0.9
          lineToRelative(dx = -1.8f, dy = -0.9f)
          // l 2.5 -5
          lineToRelative(dx = 2.5f, dy = -5.0f)
          // C 11.78 2.21 12.15 2 12.5 2
          curveTo(
            x1 = 11.78f,
            y1 = 2.21f,
            x2 = 12.15f,
            y2 = 2.0f,
            x3 = 12.5f,
            y3 = 2.0f,
          )
          // s 0.73 0.21 0.9 0.55
          reflectiveCurveToRelative(
            dx1 = 0.73f,
            dy1 = 0.21f,
            dx2 = 0.9f,
            dy2 = 0.55f,
          )
          // l 2 4
          lineToRelative(dx = 2.0f, dy = 4.0f)
          // l -1.8 0.9
          lineToRelative(dx = -1.8f, dy = 0.9f)
          // l -1.1 -2.21z
          lineToRelative(dx = -1.1f, dy = -2.21f)
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
      .also { _eventChange = it }
  }

@Suppress("ObjectPropertyName")
private var _eventChange: ImageVector? = null
