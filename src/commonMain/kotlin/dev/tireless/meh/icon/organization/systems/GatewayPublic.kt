// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GatewayPublic: ImageVector
  get() {
    val current = _gatewayPublic
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GatewayPublic",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 14 h-5 v-2 a2 2 0 0 1 4 0 h2 a4 4 0 0 0 -8 0 v2.28 A2 2 0 0 0 11 16 v5 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 m0 7 h-6 v-5 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 14
          moveTo(x = 19.0f, y = 14.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 4 4 0 0 0 -8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          // v 2.28
          verticalLineToRelative(dy = 2.28f)
          // A 2 2 0 0 0 11 16
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 16.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // m 0 7
          moveToRelative(dx = 0.0f, dy = 7.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
      .also { _gatewayPublic = it }
  }

@Suppress("ObjectPropertyName")
private var _gatewayPublic: ImageVector? = null
