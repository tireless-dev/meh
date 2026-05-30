// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PcnMilitary: ImageVector
  get() {
    val current = _pcnMilitary
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PcnMilitary",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="16.0 16.0 14.407 19.0 11.0 19.414 13.5 21.667 13.0 25.0 16.0 23.125 19.0 25.0 18.5 21.667 21.0 19.414 17.5 19.0 16.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // L 14.407 19
          lineTo(x = 14.407f, y = 19.0f)
          // L 11 19.414
          lineTo(x = 11.0f, y = 19.414f)
          // L 13.5 21.667
          lineTo(x = 13.5f, y = 21.667f)
          // L 13 25
          lineTo(x = 13.0f, y = 25.0f)
          // L 16 23.125
          lineTo(x = 16.0f, y = 23.125f)
          // L 19 25
          lineTo(x = 19.0f, y = 25.0f)
          // L 18.5 21.667
          lineTo(x = 18.5f, y = 21.667f)
          // L 21 19.414
          lineTo(x = 21.0f, y = 19.414f)
          // L 17.5 19
          lineTo(x = 17.5f, y = 19.0f)
          // L 16 16z
          lineTo(x = 16.0f, y = 16.0f)
          close()
        }
        // <polygon points="12.414 17.414 16.0 13.834 16.0 13.834 19.588 17.416 21.0 16.0 16.0 11.0 11.0 16.0 12.414 17.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.414 17.414
          moveTo(x = 12.414f, y = 17.414f)
          // L 16 13.834
          lineTo(x = 16.0f, y = 13.834f)
          // L 16 13.834
          lineTo(x = 16.0f, y = 13.834f)
          // L 19.588 17.416
          lineTo(x = 19.588f, y = 17.416f)
          // L 21 16
          lineTo(x = 21.0f, y = 16.0f)
          // L 16 11
          lineTo(x = 16.0f, y = 11.0f)
          // L 11 16
          lineTo(x = 11.0f, y = 16.0f)
          // L 12.414 17.414z
          lineTo(x = 12.414f, y = 17.414f)
          close()
        }
        // <polygon points="12.414 12.414 16.0 8.834 16.0 8.834 19.588 12.416 21.0 11.0 16.0 6.0 11.0 11.0 12.414 12.414" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.414 12.414
          moveTo(x = 12.414f, y = 12.414f)
          // L 16 8.834
          lineTo(x = 16.0f, y = 8.834f)
          // L 16 8.834
          lineTo(x = 16.0f, y = 8.834f)
          // L 19.588 12.416
          lineTo(x = 19.588f, y = 12.416f)
          // L 21 11
          lineTo(x = 21.0f, y = 11.0f)
          // L 16 6
          lineTo(x = 16.0f, y = 6.0f)
          // L 11 11
          lineTo(x = 11.0f, y = 11.0f)
          // L 12.414 12.414z
          lineTo(x = 12.414f, y = 12.414f)
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
      .also { _pcnMilitary = it }
  }

@Suppress("ObjectPropertyName")
private var _pcnMilitary: ImageVector? = null
