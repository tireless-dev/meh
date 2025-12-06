// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckmarkFilledError: ImageVector
  get() {
    val current = _checkmarkFilledError
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CheckmarkFilledError",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 24 a6 6 0 1 0 -6 6 6 6 0 0 0 6 -6 m-2 0 a4 4 0 0 1 -.57 2.02 l-5.45 -5.45 A4 4 0 0 1 24 20 a4 4 0 0 1 4 4 m-8 0 a4 4 0 0 1 .57 -2.02 l5.45 5.45 A4 4 0 0 1 24 28 a4 4 0 0 1 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 24
          moveTo(x = 30.0f, y = 24.0f)
          // a 6 6 0 1 0 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 4 4 0 0 1 -0.57 2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.57f,
            dy1 = 2.02f,
          )
          // l -5.45 -5.45
          lineToRelative(dx = -5.45f, dy = -5.45f)
          // A 4 4 0 0 1 24 20
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 20.0f,
          )
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // a 4 4 0 0 1 0.57 -2.02
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.57f,
            dy1 = -2.02f,
          )
          // l 5.45 5.45
          lineToRelative(dx = 5.45f, dy = 5.45f)
          // A 4 4 0 0 1 24 28
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 28.0f,
          )
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
        }
        // M14 2 a12 12 0 1 0 2 23.82 V24 a8 8 0 0 1 8 -8 h1.82 A11.93 11.93 0 0 0 14 2 m-2 16.6 -4 -4 L9.6 13 l2.4 2.4 5.4 -5.4 1.6 1.6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 2
          moveTo(x = 14.0f, y = 2.0f)
          // a 12 12 0 1 0 2 23.82
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 23.82f,
          )
          // V 24
          verticalLineTo(y = 24.0f)
          // a 8 8 0 0 1 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = -8.0f,
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
      .also { _checkmarkFilledError = it }
  }

@Suppress("ObjectPropertyName")
private var _checkmarkFilledError: ImageVector? = null
