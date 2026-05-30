// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GatewaySecurity: ImageVector
  get() {
    val current = _gatewaySecurity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GatewaySecurity",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M11 11 v6.47 a5 5 0 0 0 2.86 4.52 L16 23 l2.14 -1.01 A5 5 0 0 0 21 17.47 V11Z m8 6.47 a3 3 0 0 1 -1.72 2.7 L16 20.8 l-1.28 -.61 A3 3 0 0 1 13 17.47 V13 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 11
          moveTo(x = 11.0f, y = 11.0f)
          // v 6.47
          verticalLineToRelative(dy = 6.47f)
          // a 5 5 0 0 0 2.86 4.52
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.86f,
            dy1 = 4.52f,
          )
          // L 16 23
          lineTo(x = 16.0f, y = 23.0f)
          // l 2.14 -1.01
          lineToRelative(dx = 2.14f, dy = -1.01f)
          // A 5 5 0 0 0 21 17.47
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 17.47f,
          )
          // V 11z
          verticalLineTo(y = 11.0f)
          close()
          // m 8 6.47
          moveToRelative(dx = 8.0f, dy = 6.47f)
          // a 3 3 0 0 1 -1.72 2.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.72f,
            dy1 = 2.7f,
          )
          // L 16 20.8
          lineTo(x = 16.0f, y = 20.8f)
          // l -1.28 -0.61
          lineToRelative(dx = -1.28f, dy = -0.61f)
          // A 3 3 0 0 1 13 17.47
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 17.47f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
        }
        // M30.41 17.41 a2 2 0 0 0 0 -2.82 l-5.78 -5.8 2.9 -2.85 a2 2 0 1 0 -1.44 -1.4 L23.2 7.39 l-5.8 -5.8 a2 2 0 0 0 -2.82 0 l-5.8 5.8 -2.85 -2.9 A2 2 0 1 0 4.55 5.9 L7.39 8.8 l-5.8 5.8 a2 2 0 0 0 0 2.82 l5.8 5.8 -2.84 2.88 a2 2 0 1 0 1.39 1.44 l2.86 -2.9 5.79 5.78 a2 2 0 0 0 2.82 0 l5.8 -5.8 2.88 2.84 a2 2 0 1 0 1.44 -1.39 l-2.9 -2.86Z M16 29 3 16 16 3 l13 13Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.41 17.41
          moveTo(x = 30.41f, y = 17.41f)
          // a 2 2 0 0 0 0 -2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.82f,
          )
          // l -5.78 -5.8
          lineToRelative(dx = -5.78f, dy = -5.8f)
          // l 2.9 -2.85
          lineToRelative(dx = 2.9f, dy = -2.85f)
          // a 2 2 0 1 0 -1.44 -1.4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.44f,
            dy1 = -1.4f,
          )
          // L 23.2 7.39
          lineTo(x = 23.2f, y = 7.39f)
          // l -5.8 -5.8
          lineToRelative(dx = -5.8f, dy = -5.8f)
          // a 2 2 0 0 0 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // l -5.8 5.8
          lineToRelative(dx = -5.8f, dy = 5.8f)
          // l -2.85 -2.9
          lineToRelative(dx = -2.85f, dy = -2.9f)
          // A 2 2 0 1 0 4.55 5.9
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 4.55f,
            y1 = 5.9f,
          )
          // L 7.39 8.8
          lineTo(x = 7.39f, y = 8.8f)
          // l -5.8 5.8
          lineToRelative(dx = -5.8f, dy = 5.8f)
          // a 2 2 0 0 0 0 2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.82f,
          )
          // l 5.8 5.8
          lineToRelative(dx = 5.8f, dy = 5.8f)
          // l -2.84 2.88
          lineToRelative(dx = -2.84f, dy = 2.88f)
          // a 2 2 0 1 0 1.39 1.44
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.39f,
            dy1 = 1.44f,
          )
          // l 2.86 -2.9
          lineToRelative(dx = 2.86f, dy = -2.9f)
          // l 5.79 5.78
          lineToRelative(dx = 5.79f, dy = 5.78f)
          // a 2 2 0 0 0 2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = 0.0f,
          )
          // l 5.8 -5.8
          lineToRelative(dx = 5.8f, dy = -5.8f)
          // l 2.88 2.84
          lineToRelative(dx = 2.88f, dy = 2.84f)
          // a 2 2 0 1 0 1.44 -1.39
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.44f,
            dy1 = -1.39f,
          )
          // l -2.9 -2.86z
          lineToRelative(dx = -2.9f, dy = -2.86f)
          close()
          // M 16 29
          moveTo(x = 16.0f, y = 29.0f)
          // L 3 16
          lineTo(x = 3.0f, y = 16.0f)
          // L 16 3
          lineTo(x = 16.0f, y = 3.0f)
          // l 13 13z
          lineToRelative(dx = 13.0f, dy = 13.0f)
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
      .also { _gatewaySecurity = it }
  }

@Suppress("ObjectPropertyName")
private var _gatewaySecurity: ImageVector? = null
