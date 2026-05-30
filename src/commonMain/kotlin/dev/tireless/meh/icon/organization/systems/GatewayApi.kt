// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GatewayApi: ImageVector
  get() {
    val current = _gatewayApi
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GatewayApi",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 18.18 v-4.36 a3 3 0 1 0 -2 0 v4.36 a3 3 0 1 0 2 0 M16 10 a1 1 0 1 1 -1 1 1 1 0 0 1 1 -1 m0 12 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 18.18
          moveTo(x = 17.0f, y = 18.18f)
          // v -4.36
          verticalLineToRelative(dy = -4.36f)
          // a 3 3 0 1 0 -2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // v 4.36
          verticalLineToRelative(dy = 4.36f)
          // a 3 3 0 1 0 2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // a 1 1 0 1 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // m 0 12
          moveToRelative(dx = 0.0f, dy = 12.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
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
      .also { _gatewayApi = it }
  }

@Suppress("ObjectPropertyName")
private var _gatewayApi: ImageVector? = null
