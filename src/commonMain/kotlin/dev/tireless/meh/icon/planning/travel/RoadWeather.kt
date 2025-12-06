// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RoadWeather: ImageVector
  get() {
    val current = _roadWeather
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RoadWeather",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 31 h-2 v-.23 a3 3 0 0 0 -1.95 -2.8 l-3.53 -1.33 A3.9 3.9 0 0 1 6 23 h2 a1.9 1.9 0 0 0 1.22 1.77 l3.54 1.32 A5 5 0 0 1 16 30.77Z m14 0 h-2 v-.23 a3 3 0 0 0 -1.95 -2.8 l-3.53 -1.33 A3.9 3.9 0 0 1 20 23 h2 a1.9 1.9 0 0 0 1.22 1.77 l3.54 1.32 A5 5 0 0 1 30 30.77Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 31
          moveTo(x = 16.0f, y = 31.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -0.23
          verticalLineToRelative(dy = -0.23f)
          // a 3 3 0 0 0 -1.95 -2.8
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.95f,
            dy1 = -2.8f,
          )
          // l -3.53 -1.33
          lineToRelative(dx = -3.53f, dy = -1.33f)
          // A 3.9 3.9 0 0 1 6 23
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 23.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 1.9 1.9 0 0 0 1.22 1.77
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.22f,
            dy1 = 1.77f,
          )
          // l 3.54 1.32
          lineToRelative(dx = 3.54f, dy = 1.32f)
          // A 5 5 0 0 1 16 30.77z
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 30.77f,
          )
          close()
          // m 14 0
          moveToRelative(dx = 14.0f, dy = 0.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -0.23
          verticalLineToRelative(dy = -0.23f)
          // a 3 3 0 0 0 -1.95 -2.8
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.95f,
            dy1 = -2.8f,
          )
          // l -3.53 -1.33
          lineToRelative(dx = -3.53f, dy = -1.33f)
          // A 3.9 3.9 0 0 1 20 23
          arcTo(
            horizontalEllipseRadius = 3.9f,
            verticalEllipseRadius = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 23.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 1.9 1.9 0 0 0 1.22 1.77
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.22f,
            dy1 = 1.77f,
          )
          // l 3.54 1.32
          lineToRelative(dx = 3.54f, dy = 1.32f)
          // A 5 5 0 0 1 30 30.77z
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 30.77f,
          )
          close()
        }
        // <rect width="6" height="2" x="11.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 13
          moveTo(x = 11.0f, y = 13.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // m23.44 8 -1.27 -4.55 A2 2 0 0 0 20.25 2 H7.75 a2 2 0 0 0 -1.92 1.45 L4.53 8 H2 v2 h2 v7 a2 2 0 0 0 2 2 v2 h2 v-2 h12 v2 h2 v-2 a2 2 0 0 0 2 -2 v-7 h2 V8Z M7.75 4 h12.5 l1.42 5 H6.33Z M22 13 h-2 v2 h2 v2 H6 v-2 h2 v-2 H6 v-2 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.44 8
          moveTo(x = 23.44f, y = 8.0f)
          // l -1.27 -4.55
          lineToRelative(dx = -1.27f, dy = -4.55f)
          // A 2 2 0 0 0 20.25 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.25f,
            y1 = 2.0f,
          )
          // H 7.75
          horizontalLineTo(x = 7.75f)
          // a 2 2 0 0 0 -1.92 1.45
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.92f,
            dy1 = 1.45f,
          )
          // L 4.53 8
          lineTo(x = 4.53f, y = 8.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
          close()
          // M 7.75 4
          moveTo(x = 7.75f, y = 4.0f)
          // h 12.5
          horizontalLineToRelative(dx = 12.5f)
          // l 1.42 5
          lineToRelative(dx = 1.42f, dy = 5.0f)
          // H 6.33z
          horizontalLineTo(x = 6.33f)
          close()
          // M 22 13
          moveTo(x = 22.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
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
      .also { _roadWeather = it }
  }

@Suppress("ObjectPropertyName")
private var _roadWeather: ImageVector? = null
