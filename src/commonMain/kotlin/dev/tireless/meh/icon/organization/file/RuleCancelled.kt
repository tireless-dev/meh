// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RuleCancelled: ImageVector
  get() {
    val current = _ruleCancelled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RuleCancelled",
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
        // <rect width="10" height="2" x="8.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="12" height="2" x="8.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // m14 27.73 -5.23 -2.79 A9 9 0 0 1 4 17 V4 h20 v11 h2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v13 a11 11 0 0 0 5.82 9.7 L14 30Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 27.73
          moveTo(x = 14.0f, y = 27.73f)
          // l -5.23 -2.79
          lineToRelative(dx = -5.23f, dy = -2.79f)
          // A 9 9 0 0 1 4 17
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 17.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 11 11 0 0 0 5.82 9.7
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.82f,
            dy1 = 9.7f,
          )
          // L 14 30z
          lineTo(x = 14.0f, y = 30.0f)
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
      .also { _ruleCancelled = it }
  }

@Suppress("ObjectPropertyName")
private var _ruleCancelled: ImageVector? = null
