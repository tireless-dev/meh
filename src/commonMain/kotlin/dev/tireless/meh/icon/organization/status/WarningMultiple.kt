// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningMultiple: ImageVector
  get() {
    val current = _warningMultiple
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningMultiple",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 23 h-4 v-2 h2.38 L19.5 5.24 l-1.1 2.2 -1.8 -.89 2 -4 C18.78 2.21 19.15 2 19.5 2 s.73 .21 .9 .55 l9.5 19 A1 1 0 0 1 29 23
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 23
          moveTo(x = 29.0f, y = 23.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2.38
          horizontalLineToRelative(dx = 2.38f)
          // L 19.5 5.24
          lineTo(x = 19.5f, y = 5.24f)
          // l -1.1 2.2
          lineToRelative(dx = -1.1f, dy = 2.2f)
          // l -1.8 -0.89
          lineToRelative(dx = -1.8f, dy = -0.89f)
          // l 2 -4
          lineToRelative(dx = 2.0f, dy = -4.0f)
          // C 18.78 2.21 19.15 2 19.5 2
          curveTo(
            x1 = 18.78f,
            y1 = 2.21f,
            x2 = 19.15f,
            y2 = 2.0f,
            x3 = 19.5f,
            y3 = 2.0f,
          )
          // s 0.73 0.21 0.9 0.55
          reflectiveCurveToRelative(
            dx1 = 0.73f,
            dy1 = 0.21f,
            dx2 = 0.9f,
            dy2 = 0.55f,
          )
          // l 9.5 19
          lineToRelative(dx = 9.5f, dy = 19.0f)
          // A 1 1 0 0 1 29 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 23.0f,
          )
        }
        // <circle cx="14.0" cy="25.0" radius="1.25" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 25
          moveTo(x = 14.0f, y = 25.0f)
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
        // <rect width="2" height="7" x="13.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 15
          moveTo(x = 13.0f, y = 15.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M25 30 H3 a1 1 0 0 1 -.89 -1.46 l11 -21 C13.3 7.2 13.64 7 14 7 s.71 .2 .89 .54 l11 21 A1 1 0 0 1 25 30 M4.65 28 h18.7 L14 10.16z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 30
          moveTo(x = 25.0f, y = 30.0f)
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
          // l 11 -21
          lineToRelative(dx = 11.0f, dy = -21.0f)
          // C 13.3 7.2 13.64 7 14 7
          curveTo(
            x1 = 13.3f,
            y1 = 7.2f,
            x2 = 13.64f,
            y2 = 7.0f,
            x3 = 14.0f,
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
          // A 1 1 0 0 1 25 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.0f,
            y1 = 30.0f,
          )
          // M 4.65 28
          moveTo(x = 4.65f, y = 28.0f)
          // h 18.7
          horizontalLineToRelative(dx = 18.7f)
          // L 14 10.16z
          lineTo(x = 14.0f, y = 10.16f)
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
      .also { _warningMultiple = it }
  }

@Suppress("ObjectPropertyName")
private var _warningMultiple: ImageVector? = null
