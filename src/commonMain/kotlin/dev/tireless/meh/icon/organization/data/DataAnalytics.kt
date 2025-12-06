// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataAnalytics: ImageVector
  get() {
    val current = _dataAnalytics
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataAnalytics",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="6" x="12.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 11
          moveTo(x = 12.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="7.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 13
          moveTo(x = 7.0f, y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="2.0" y="7.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 7
          moveTo(x = 2.0f, y = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // m30 28.59 -7.55 -7.56 A11.01 11.01 0 0 0 7.4 5.2 l1.2 1.6 a9.01 9.01 0 1 1 -1.8 12.6 l-1.6 1.2 C7.3 23.4 10.5 25 14 25 c2.67 0 5.13 -.96 7.03 -2.55 L28.6 30z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 28.59
          moveTo(x = 30.0f, y = 28.59f)
          // l -7.55 -7.56
          lineToRelative(dx = -7.55f, dy = -7.56f)
          // A 11.01 11.01 0 0 0 7.4 5.2
          arcTo(
            horizontalEllipseRadius = 11.01f,
            verticalEllipseRadius = 11.01f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.4f,
            y1 = 5.2f,
          )
          // l 1.2 1.6
          lineToRelative(dx = 1.2f, dy = 1.6f)
          // a 9.01 9.01 0 1 1 -1.8 12.6
          arcToRelative(
            a = 9.01f,
            b = 9.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.8f,
            dy1 = 12.6f,
          )
          // l -1.6 1.2
          lineToRelative(dx = -1.6f, dy = 1.2f)
          // C 7.3 23.4 10.5 25 14 25
          curveTo(
            x1 = 7.3f,
            y1 = 23.4f,
            x2 = 10.5f,
            y2 = 25.0f,
            x3 = 14.0f,
            y3 = 25.0f,
          )
          // c 2.67 0 5.13 -0.96 7.03 -2.55
          curveToRelative(
            dx1 = 2.67f,
            dy1 = 0.0f,
            dx2 = 5.13f,
            dy2 = -0.96f,
            dx3 = 7.03f,
            dy3 = -2.55f,
          )
          // L 28.6 30z
          lineTo(x = 28.6f, y = 30.0f)
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
      .also { _dataAnalytics = it }
  }

@Suppress("ObjectPropertyName")
private var _dataAnalytics: ImageVector? = null
