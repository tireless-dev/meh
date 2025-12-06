// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snooze: ImageVector
  get() {
    val current = _snooze
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Snooze",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.0 14.0 20.0 12.0 12.0 12.0 12.0 14.0 17.5 14.0 12.0 20.0 12.0 22.0 20.0 22.0 20.0 20.0 14.507 20.0 20.0 14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 14
          moveTo(x = 20.0f, y = 14.0f)
          // L 20 12
          lineTo(x = 20.0f, y = 12.0f)
          // L 12 12
          lineTo(x = 12.0f, y = 12.0f)
          // L 12 14
          lineTo(x = 12.0f, y = 14.0f)
          // L 17.5 14
          lineTo(x = 17.5f, y = 14.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // L 20 20
          lineTo(x = 20.0f, y = 20.0f)
          // L 14.507 20
          lineTo(x = 14.507f, y = 20.0f)
          // L 20 14z
          lineTo(x = 20.0f, y = 14.0f)
          close()
        }
        // <rect width="2" height="5" x="24.5" y="3.965" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.00142 5.4121933
          moveTo(x = 23.00142f, y = 5.4121933f)
          // l 1.4155704 -1.4128554
          lineToRelative(dx = 1.4155704f, dy = -1.4128554f)
          // l 3.5321383 3.538926
          lineToRelative(dx = 3.5321383f, dy = 3.538926f)
          // l -1.4155704 1.4128554z
          lineToRelative(dx = -1.4155704f, dy = 1.4128554f)
          close()
        }
        // M16 28 a11 11 0 1 1 11 -11 11 11 0 0 1 -11 11 m0 -20 a9 9 0 1 0 9 9 9 9 0 0 0 -9 -9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 11 11 0 1 1 11 -11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 11.0f,
            dy1 = -11.0f,
          )
          // a 11 11 0 0 1 -11 11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -11.0f,
            dy1 = 11.0f,
          )
          // m 0 -20
          moveToRelative(dx = 0.0f, dy = -20.0f)
          // a 9 9 0 1 0 9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 9.0f,
            dy1 = 9.0f,
          )
          // a 9 9 0 0 0 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = -9.0f,
          )
        }
        // <rect width="5" height="2" x="3.965" y="5.501" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.0021286 7.588515
          moveTo(x = 4.0021286f, y = 7.588515f)
          // l 3.5321383 -3.5389261
          lineToRelative(dx = 3.5321383f, dy = -3.5389261f)
          // l 1.4155705 1.4128554
          lineToRelative(dx = 1.4155705f, dy = 1.4128554f)
          // l -3.5321383 3.5389261z
          lineToRelative(dx = -3.5321383f, dy = 3.5389261f)
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
      .also { _snooze = it }
  }

@Suppress("ObjectPropertyName")
private var _snooze: ImageVector? = null
