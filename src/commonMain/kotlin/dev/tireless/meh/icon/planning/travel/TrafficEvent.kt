// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrafficEvent: ImageVector
  get() {
    val current = _trafficEvent
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrafficEvent",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="11.0" y="21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 21
          moveTo(x = 11.0f, y = 21.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // m24.25 8 1.71 6 H30 v-2 h-2.53 l-1.3 -4.55 A2 2 0 0 0 24.25 6 H22.9 l-.73 -2.55 A2 2 0 0 0 20.25 2 H7.75 a2 2 0 0 0 -1.92 1.45 L4.53 8 H2 v2 h4.04 l1.71 -6 h12.5 l.57 2 h-9.07 a2 2 0 0 0 -1.92 1.45 L8.82 11 h-1.1 a2 2 0 0 0 -1.9 1.35 L4.57 16 H2 v2 h2 v7 a2 2 0 0 0 2 2 v3 h2 v-3 h12 v3 h2 v-3 a2 2 0 0 0 2 -2 v-7 h2 v-2 h-2.57 l-1.25 -3.65 a2 2 0 0 0 -1.9 -1.35 H10.9 l.85 -3Z M22 19 v2 h-2 v2 h2 v2 H6 v-2 h2 v-2 H6 v-2Z m-.34 -2 H6.34 l1.37 -4 H20.3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.25 8
          moveTo(x = 24.25f, y = 8.0f)
          // l 1.71 6
          lineToRelative(dx = 1.71f, dy = 6.0f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.53
          horizontalLineToRelative(dx = -2.53f)
          // l -1.3 -4.55
          lineToRelative(dx = -1.3f, dy = -4.55f)
          // A 2 2 0 0 0 24.25 6
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.25f,
            y1 = 6.0f,
          )
          // H 22.9
          horizontalLineTo(x = 22.9f)
          // l -0.73 -2.55
          lineToRelative(dx = -0.73f, dy = -2.55f)
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
          // h 4.04
          horizontalLineToRelative(dx = 4.04f)
          // l 1.71 -6
          lineToRelative(dx = 1.71f, dy = -6.0f)
          // h 12.5
          horizontalLineToRelative(dx = 12.5f)
          // l 0.57 2
          lineToRelative(dx = 0.57f, dy = 2.0f)
          // h -9.07
          horizontalLineToRelative(dx = -9.07f)
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
          // L 8.82 11
          lineTo(x = 8.82f, y = 11.0f)
          // h -1.1
          horizontalLineToRelative(dx = -1.1f)
          // a 2 2 0 0 0 -1.9 1.35
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 1.35f,
          )
          // L 4.57 16
          lineTo(x = 4.57f, y = 16.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.57
          horizontalLineToRelative(dx = -2.57f)
          // l -1.25 -3.65
          lineToRelative(dx = -1.25f, dy = -3.65f)
          // a 2 2 0 0 0 -1.9 -1.35
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = -1.35f,
          )
          // H 10.9
          horizontalLineTo(x = 10.9f)
          // l 0.85 -3z
          lineToRelative(dx = 0.85f, dy = -3.0f)
          close()
          // M 22 19
          moveTo(x = 22.0f, y = 19.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -0.34 -2
          moveToRelative(dx = -0.34f, dy = -2.0f)
          // H 6.34
          horizontalLineTo(x = 6.34f)
          // l 1.37 -4
          lineToRelative(dx = 1.37f, dy = -4.0f)
          // H 20.3z
          horizontalLineTo(x = 20.3f)
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
      .also { _trafficEvent = it }
  }

@Suppress("ObjectPropertyName")
private var _trafficEvent: ImageVector? = null
