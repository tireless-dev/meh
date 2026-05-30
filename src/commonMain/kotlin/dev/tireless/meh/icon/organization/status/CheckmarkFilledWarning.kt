// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmarkFilledWarning: ImageVector
  get() {
    val current = _checkmarkFilledWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CheckmarkFilledWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14 2 a12 12 0 1 0 3.4 23.5 l3.92 -7.84 A3 3 0 0 1 24 16 h1.82 A11.93 11.93 0 0 0 14 2 m-2 16.6 -4 -4 L9.6 13 l2.4 2.4 5.4 -5.4 1.6 1.6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 2
          moveTo(x = 14.0f, y = 2.0f)
          // a 12 12 0 1 0 3.4 23.5
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.4f,
            dy1 = 23.5f,
          )
          // l 3.92 -7.84
          lineToRelative(dx = 3.92f, dy = -7.84f)
          // A 3 3 0 0 1 24 16
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 16.0f,
          )
          // h 1.82
          horizontalLineToRelative(dx = 1.82f)
          // A 11.93 11.93 0 0 0 14 2
          arcTo(
            horizontalEllipseRadius = 11.93f,
            verticalEllipseRadius = 11.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 2.0f,
          )
          // m -2 16.6
          moveToRelative(dx = -2.0f, dy = 16.6f)
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // L 9.6 13
          lineTo(x = 9.6f, y = 13.0f)
          // l 2.4 2.4
          lineToRelative(dx = 2.4f, dy = 2.4f)
          // l 5.4 -5.4
          lineToRelative(dx = 5.4f, dy = -5.4f)
          // l 1.6 1.6z
          lineToRelative(dx = 1.6f, dy = 1.6f)
          close()
        }
        // M27.38 28 h-6.76 L24 21.24Z M24 18 a1 1 0 0 0 -.9 .55 l-5 10 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 .92 -1.39 L24.9 18.55 A1 1 0 0 0 24 18
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
        }
        // <polygon points="12.0 18.591 8.0 14.591 9.591 13.0 12.0 15.409 17.409 10.0 19.0 11.591 12.0 18.591" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 12 18.591
          moveTo(x = 12.0f, y = 18.591f)
          // L 8 14.591
          lineTo(x = 8.0f, y = 14.591f)
          // L 9.591 13
          lineTo(x = 9.591f, y = 13.0f)
          // L 12 15.409
          lineTo(x = 12.0f, y = 15.409f)
          // L 17.409 10
          lineTo(x = 17.409f, y = 10.0f)
          // L 19 11.591
          lineTo(x = 19.0f, y = 11.591f)
          // L 12 18.591z
          lineTo(x = 12.0f, y = 18.591f)
          close()
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
      .also { _checkmarkFilledWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _checkmarkFilledWarning: ImageVector? = null
