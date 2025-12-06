// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Map: ImageVector
  get() {
    val current = _map
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Map",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 24 -6.09 -8.6 A8.14 8.14 0 0 1 16 2 a8.1 8.1 0 0 1 8 8.13 8.2 8.2 0 0 1 -1.8 5.13Z m0 -20 a6.07 6.07 0 0 0 -6 6.13 6.2 6.2 0 0 0 1.49 4 L16 20.52 20.63 14 A6.2 6.2 0 0 0 22 10.13 6.07 6.07 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // l -6.09 -8.6
          lineToRelative(dx = -6.09f, dy = -8.6f)
          // A 8.14 8.14 0 0 1 16 2
          arcTo(
            horizontalEllipseRadius = 8.14f,
            verticalEllipseRadius = 8.14f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // a 8.1 8.1 0 0 1 8 8.13
          arcToRelative(
            a = 8.1f,
            b = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 8.13f,
          )
          // a 8.2 8.2 0 0 1 -1.8 5.13z
          arcToRelative(
            a = 8.2f,
            b = 8.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.8f,
            dy1 = 5.13f,
          )
          close()
          // m 0 -20
          moveToRelative(dx = 0.0f, dy = -20.0f)
          // a 6.07 6.07 0 0 0 -6 6.13
          arcToRelative(
            a = 6.07f,
            b = 6.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.13f,
          )
          // a 6.2 6.2 0 0 0 1.49 4
          arcToRelative(
            a = 6.2f,
            b = 6.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.49f,
            dy1 = 4.0f,
          )
          // L 16 20.52
          lineTo(x = 16.0f, y = 20.52f)
          // L 20.63 14
          lineTo(x = 20.63f, y = 14.0f)
          // A 6.2 6.2 0 0 0 22 10.13
          arcTo(
            horizontalEllipseRadius = 6.2f,
            verticalEllipseRadius = 6.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 10.13f,
          )
          // A 6.07 6.07 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 6.07f,
            verticalEllipseRadius = 6.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
          )
        }
        // <circle cx="16.0" cy="9.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 9
          moveTo(x = 16.0f, y = 9.0f)
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
        // M28 12 h-2 v2 h2 v14 H4 V14 h2 v-2 H4 a2 2 0 0 0 -2 2 v14 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V14 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // v 14
          verticalLineToRelative(dy = 14.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 14
          verticalLineTo(y = 14.0f)
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
      .also { _map = it }
  }

@Suppress("ObjectPropertyName")
private var _map: ImageVector? = null
