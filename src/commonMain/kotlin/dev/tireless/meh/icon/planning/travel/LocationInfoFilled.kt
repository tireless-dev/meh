// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocationInfoFilled: ImageVector
  get() {
    val current = _locationInfoFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LocationInfoFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a11.01 11.01 0 0 0 -8.44 18.05 L16 30 l8.44 -9.95 .34 -.45 A11.01 11.01 0 0 0 16 2 m-.5 4 a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0 -3 M20 20 h-8 v-2 h3 v-5 h-2 v-2 h4 v7 h3z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 11.01 11.01 0 0 0 -8.44 18.05
          arcToRelative(
            a = 11.01f,
            b = 11.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.44f,
            dy1 = 18.05f,
          )
          // L 16 30
          lineTo(x = 16.0f, y = 30.0f)
          // l 8.44 -9.95
          lineToRelative(dx = 8.44f, dy = -9.95f)
          // l 0.34 -0.45
          lineToRelative(dx = 0.34f, dy = -0.45f)
          // A 11.01 11.01 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 11.01f,
            verticalEllipseRadius = 11.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m -0.5 4
          moveToRelative(dx = -0.5f, dy = 4.0f)
          // a 1.5 1.5 0 1 1 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 1 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
        }
        // M15.5 6 a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0 -3 M20 20 h-8 v-2 h3 v-5 h-2 v-2 h4 v7 h3z
        path(
          strokeLineWidth = 0.0f,
        ) {
          // M 15.5 6
          moveTo(x = 15.5f, y = 6.0f)
          // a 1.5 1.5 0 1 1 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 1 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _locationInfoFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _locationInfoFilled: ImageVector? = null
