// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThunderstormSevere: ImageVector
  get() {
    val current = _thunderstormSevere
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ThunderstormSevere",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 30 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 21 30 M9 32 a1 1 0 0 1 -.9 -1.45 l2 -4 a1 1 0 1 1 1.8 .9 l-2 4 A1 1 0 0 1 9 32
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
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
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.8 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.8f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 21 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 30.0f,
          )
          // M 9 32
          moveTo(x = 9.0f, y = 32.0f)
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
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 1 1 1.8 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.8f,
            dy1 = 0.9f,
          )
          // l -2 4
          lineToRelative(dx = -2.0f, dy = 4.0f)
          // A 1 1 0 0 1 9 32
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 32.0f,
          )
        }
        // <polygon points="15.901 30.496 14.165 29.504 17.309 24.0 11.31 24.0 16.165 15.504 17.901 16.496 14.756 22.0 20.757 22.0 15.901 30.496" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15.901 30.496
          moveTo(x = 15.901f, y = 30.496f)
          // L 14.165 29.504
          lineTo(x = 14.165f, y = 29.504f)
          // L 17.309 24
          lineTo(x = 17.309f, y = 24.0f)
          // L 11.31 24
          lineTo(x = 11.31f, y = 24.0f)
          // L 16.165 15.504
          lineTo(x = 16.165f, y = 15.504f)
          // L 17.901 16.496
          lineTo(x = 17.901f, y = 16.496f)
          // L 14.756 22
          lineTo(x = 14.756f, y = 22.0f)
          // L 20.757 22
          lineTo(x = 20.757f, y = 22.0f)
          // L 15.901 30.496z
          lineTo(x = 15.901f, y = 30.496f)
          close()
        }
        // M27.95 15 28 15.5 a4.5 4.5 0 0 1 -4.5 4.5 H23 v2 h.5 a6.5 6.5 0 0 0 6.5 -6.5 q-.01 -.25 -.04 -.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.95 15
          moveTo(x = 27.95f, y = 15.0f)
          // L 28 15.5
          lineTo(x = 28.0f, y = 15.5f)
          // a 4.5 4.5 0 0 1 -4.5 4.5
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.5f,
            dy1 = 4.5f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 6.5 6.5 0 0 0 6.5 -6.5
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.5f,
            dy1 = -6.5f,
          )
          // q -0.01 -0.25 -0.04 -0.5z
          quadToRelative(
            dx1 = -0.01f,
            dy1 = -0.25f,
            dx2 = -0.04f,
            dy2 = -0.5f,
          )
          close()
        }
        // M25.75 8 h-1.5 V4 h1.5Z M25 9 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
        path {
          // M 25.75 8
          moveTo(x = 25.75f, y = 8.0f)
          // h -1.5
          horizontalLineToRelative(dx = -1.5f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 1.5z
          horizontalLineToRelative(dx = 1.5f)
          close()
          // M 25 9
          moveTo(x = 25.0f, y = 9.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
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
        // M31.91 11.94 25.63 .37 a.72 .72 0 0 0 -1.26 0 L18.1 11.94 A.72 .72 0 0 0 18.72 13 h12.56 a.72 .72 0 0 0 .63 -1.06 M24.25 4 h1.5 v4 h-1.5Z M25 11 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 M8.14 11.02 l.82 -.06 .1 -.82 a7 7 0 0 1 9.97 -5.45 L20 2.95 A8.98 8.98 0 0 0 7.2 9.14 6.5 6.5 0 0 0 7.43 21.9 l-1.32 2.65 a1 1 0 1 0 1.78 .9 l2 -4 a1 1 0 0 0 -.44 -1.34 A1 1 0 0 0 9 20 V20 H8.5 a4.5 4.5 0 0 1 -.36 -8.98
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.91 11.94
          moveTo(x = 31.91f, y = 11.94f)
          // L 25.63 0.37
          lineTo(x = 25.63f, y = 0.37f)
          // a 0.72 0.72 0 0 0 -1.26 0
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.26f,
            dy1 = 0.0f,
          )
          // L 18.1 11.94
          lineTo(x = 18.1f, y = 11.94f)
          // A 0.72 0.72 0 0 0 18.72 13
          arcTo(
            horizontalEllipseRadius = 0.72f,
            verticalEllipseRadius = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.72f,
            y1 = 13.0f,
          )
          // h 12.56
          horizontalLineToRelative(dx = 12.56f)
          // a 0.72 0.72 0 0 0 0.63 -1.06
          arcToRelative(
            a = 0.72f,
            b = 0.72f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.63f,
            dy1 = -1.06f,
          )
          // M 24.25 4
          moveTo(x = 24.25f, y = 4.0f)
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -1.5z
          horizontalLineToRelative(dx = -1.5f)
          close()
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
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
          // M 8.14 11.02
          moveTo(x = 8.14f, y = 11.02f)
          // l 0.82 -0.06
          lineToRelative(dx = 0.82f, dy = -0.06f)
          // l 0.1 -0.82
          lineToRelative(dx = 0.1f, dy = -0.82f)
          // a 7 7 0 0 1 9.97 -5.45
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.97f,
            dy1 = -5.45f,
          )
          // L 20 2.95
          lineTo(x = 20.0f, y = 2.95f)
          // A 8.98 8.98 0 0 0 7.2 9.14
          arcTo(
            horizontalEllipseRadius = 8.98f,
            verticalEllipseRadius = 8.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.2f,
            y1 = 9.14f,
          )
          // A 6.5 6.5 0 0 0 7.43 21.9
          arcTo(
            horizontalEllipseRadius = 6.5f,
            verticalEllipseRadius = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.43f,
            y1 = 21.9f,
          )
          // l -1.32 2.65
          lineToRelative(dx = -1.32f, dy = 2.65f)
          // a 1 1 0 1 0 1.78 0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.78f,
            dy1 = 0.9f,
          )
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // a 1 1 0 0 0 -0.44 -1.34
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.44f,
            dy1 = -1.34f,
          )
          // A 1 1 0 0 0 9 20
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 20.0f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
          // a 4.5 4.5 0 0 1 -0.36 -8.98
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.36f,
            dy1 = -8.98f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _thunderstormSevere = it }
  }

@Suppress("ObjectPropertyName")
private var _thunderstormSevere: ImageVector? = null
