// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Running: ImageVector
  get() {
    val current = _running
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Running",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m21.7 20.3 -5 -5 a1 1 0 0 0 -1.4 0 L2 28.58 3.41 30 16 17.41 19.59 21 14 26.59 15.41 28 l2.3 -2.3 4 -4 a1 1 0 0 0 0 -1.4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.7 20.3
          moveTo(x = 21.7f, y = 20.3f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // L 2 28.58
          lineTo(x = 2.0f, y = 28.58f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // L 16 17.41
          lineTo(x = 16.0f, y = 17.41f)
          // L 19.59 21
          lineTo(x = 19.59f, y = 21.0f)
          // L 14 26.59
          lineTo(x = 14.0f, y = 26.59f)
          // L 15.41 28
          lineTo(x = 15.41f, y = 28.0f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // l 4 -4
          lineToRelative(dx = 4.0f, dy = -4.0f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
        }
        // M28.59 9 23 14.59 l-6 -6 a2 2 0 0 0 -2.83 0 L8 14.75 l1.41 1.41 L15.58 10 l6.71 6.7 a1 1 0 0 0 1.42 0 L30 10.42z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.59 9
          moveTo(x = 28.59f, y = 9.0f)
          // L 23 14.59
          lineTo(x = 23.0f, y = 14.59f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // L 8 14.75
          lineTo(x = 8.0f, y = 14.75f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 15.58 10
          lineTo(x = 15.58f, y = 10.0f)
          // l 6.71 6.7
          lineToRelative(dx = 6.71f, dy = 6.7f)
          // a 1 1 0 0 0 1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 0.0f,
          )
          // L 30 10.42z
          lineTo(x = 30.0f, y = 10.42f)
          close()
        }
        // M22.5 9 a3.5 3.5 0 1 1 0 -7 3.5 3.5 0 0 1 0 7 m0 -5 a1.5 1.5 0 1 0 0 3 1.5 1.5 0 0 0 0 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.5 9
          moveTo(x = 22.5f, y = 9.0f)
          // a 3.5 3.5 0 1 1 0 -7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -7.0f,
          )
          // a 3.5 3.5 0 0 1 0 7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 7.0f,
          )
          // m 0 -5
          moveToRelative(dx = 0.0f, dy = -5.0f)
          // a 1.5 1.5 0 1 0 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 0 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.0f,
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
      .also { _running = it }
  }

@Suppress("ObjectPropertyName")
private var _running: ImageVector? = null
