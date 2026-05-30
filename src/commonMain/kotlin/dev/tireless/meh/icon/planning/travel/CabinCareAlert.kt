// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CabinCareAlert: ImageVector
  get() {
    val current = _cabinCareAlert
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CabinCareAlert",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="7" x="24.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 2
          moveTo(x = 24.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="3" height="3" rx="1.5" x="23.5" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 12.5
          moveTo(x = 23.5f, y = 12.5f)
          // a 1.5 1.5 0 0 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // h 0
          horizontalLineToRelative(dx = 0.0f)
          // a 1.5 1.5 0 0 1 1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = 1.5f,
          )
          // v 0
          verticalLineToRelative(dy = 0.0f)
          // a 1.5 1.5 0 0 1 -1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.5f,
            dy1 = 1.5f,
          )
          // h -0
          horizontalLineToRelative(dx = -0.0f)
          // a 1.5 1.5 0 0 1 -1.5 -1.5z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.5f,
            dy1 = -1.5f,
          )
          close()
        }
        // M23.82 18 h-8.74 L11.86 5.97 a4 4 0 0 0 -7.72 2.07 l4.4 16.48 A2 2 0 0 0 10.49 26 H19 v2 H4 v2 h15 a2 2 0 0 0 2 -2 v-2 h3 a4 4 0 0 0 3.98 -4.4 4.1 4.1 0 0 0 -4.16 -3.6 M24 24 H10.48 L6.07 7.52 a2 2 0 1 1 3.86 -1.04 L13.55 20 H24 a2 2 0 0 1 0 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.82 18
          moveTo(x = 23.82f, y = 18.0f)
          // h -8.74
          horizontalLineToRelative(dx = -8.74f)
          // L 11.86 5.97
          lineTo(x = 11.86f, y = 5.97f)
          // a 4 4 0 0 0 -7.72 2.07
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.72f,
            dy1 = 2.07f,
          )
          // l 4.4 16.48
          lineToRelative(dx = 4.4f, dy = 16.48f)
          // A 2 2 0 0 0 10.49 26
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.49f,
            y1 = 26.0f,
          )
          // H 19
          horizontalLineTo(x = 19.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 15
          horizontalLineToRelative(dx = 15.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 4 4 0 0 0 3.98 -4.4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.98f,
            dy1 = -4.4f,
          )
          // a 4.1 4.1 0 0 0 -4.16 -3.6
          arcToRelative(
            a = 4.1f,
            b = 4.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.16f,
            dy1 = -3.6f,
          )
          // M 24 24
          moveTo(x = 24.0f, y = 24.0f)
          // H 10.48
          horizontalLineTo(x = 10.48f)
          // L 6.07 7.52
          lineTo(x = 6.07f, y = 7.52f)
          // a 2 2 0 1 1 3.86 -1.04
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.86f,
            dy1 = -1.04f,
          )
          // L 13.55 20
          lineTo(x = 13.55f, y = 20.0f)
          // H 24
          horizontalLineTo(x = 24.0f)
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
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
      .also { _cabinCareAlert = it }
  }

@Suppress("ObjectPropertyName")
private var _cabinCareAlert: ImageVector? = null
