// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stickies: ImageVector
  get() {
    val current = _stickies
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Stickies",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 22 V10 a2 2 0 0 0 -2 -2 H12 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h10 c.3 0 .5 -.1 .7 -.3 l7 -7 A1 1 0 0 0 30 22 m-8 0 h5.6 L22 27.6z m6 -2 h-6 a2 2 0 0 0 -2 2 v6 h-8 V10 h16z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 22
          moveTo(x = 30.0f, y = 22.0f)
          // V 10
          verticalLineTo(y = 10.0f)
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
          // H 12
          horizontalLineTo(x = 12.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 0.3 0 0.5 -0.1 0.7 -0.3
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 0.0f,
            dx2 = 0.5f,
            dy2 = -0.1f,
            dx3 = 0.7f,
            dy3 = -0.3f,
          )
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // A 1 1 0 0 0 30 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 22.0f,
          )
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // h 5.6
          horizontalLineToRelative(dx = 5.6f)
          // L 22 27.6z
          lineTo(x = 22.0f, y = 27.6f)
          close()
          // m 6 -2
          moveToRelative(dx = 6.0f, dy = -2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
        }
        // M4 22 V4 h16 v2 h2 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h4 v-2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 22
          moveTo(x = 4.0f, y = 22.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _stickies = it }
  }

@Suppress("ObjectPropertyName")
private var _stickies: ImageVector? = null
