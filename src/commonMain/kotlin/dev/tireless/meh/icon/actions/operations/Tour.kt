// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tour: ImageVector
  get() {
    val current = _tour
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tour",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m24 18 -4.78 -6.4 A6 6 0 1 1 30 8 c0 1.3 -.42 2.54 -1.22 3.6z m0 -14 a4 4 0 0 0 -4 4 4 4 0 0 0 .82 2.4 L24 14.66 l3.18 -4.26 A4 4 0 0 0 28 8 a4 4 0 0 0 -4 -4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 18
          moveTo(x = 24.0f, y = 18.0f)
          // l -4.78 -6.4
          lineToRelative(dx = -4.78f, dy = -6.4f)
          // A 6 6 0 1 1 30 8
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 8.0f,
          )
          // c 0 1.3 -0.42 2.54 -1.22 3.6z
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.3f,
            dx2 = -0.42f,
            dy2 = 2.54f,
            dx3 = -1.22f,
            dy3 = 3.6f,
          )
          close()
          // m 0 -14
          moveToRelative(dx = 0.0f, dy = -14.0f)
          // a 4 4 0 0 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // a 4 4 0 0 0 0.82 2.4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.82f,
            dy1 = 2.4f,
          )
          // L 24 14.66
          lineTo(x = 24.0f, y = 14.66f)
          // l 3.18 -4.26
          lineToRelative(dx = 3.18f, dy = -4.26f)
          // A 4 4 0 0 0 28 8
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 8.0f,
          )
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
        }
        // <circle cx="24.0" cy="8.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 8
          moveTo(x = 24.0f, y = 8.0f)
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
        // M28 18 v4 H4 V6 h10 V4 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h8 v4 H8 v2 h16 v-2 h-4 v-4 h8 a2 2 0 0 0 2 -2 v-4z M18 28 h-4 v-4 h4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 18
          moveTo(x = 28.0f, y = 18.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _tour = it }
  }

@Suppress("ObjectPropertyName")
private var _tour: ImageVector? = null
