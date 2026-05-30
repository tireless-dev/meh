// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NavaidVordme: ImageVector
  get() {
    val current = _navaidVordme
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NavaidVordme",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="16.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M30 6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2Z m-2 6.93 L22.96 6 H28Z M27.76 16 20.5 26 h-8.98 L4.24 16 11.5 6 h8.98Z M9.04 6 4 12.92 V6Z M4 19.08 9.04 26 H4Z M22.96 26 28 19.07 V26Z
        path(
          fill = SolidColor(Color(0xFF171717)),
        ) {
          // M 30 6
          moveTo(x = 30.0f, y = 6.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          close()
          // m -2 6.93
          moveToRelative(dx = -2.0f, dy = 6.93f)
          // L 22.96 6
          lineTo(x = 22.96f, y = 6.0f)
          // H 28z
          horizontalLineTo(x = 28.0f)
          close()
          // M 27.76 16
          moveTo(x = 27.76f, y = 16.0f)
          // L 20.5 26
          lineTo(x = 20.5f, y = 26.0f)
          // h -8.98
          horizontalLineToRelative(dx = -8.98f)
          // L 4.24 16
          lineTo(x = 4.24f, y = 16.0f)
          // L 11.5 6
          lineTo(x = 11.5f, y = 6.0f)
          // h 8.98z
          horizontalLineToRelative(dx = 8.98f)
          close()
          // M 9.04 6
          moveTo(x = 9.04f, y = 6.0f)
          // L 4 12.92
          lineTo(x = 4.0f, y = 12.92f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // M 4 19.08
          moveTo(x = 4.0f, y = 19.08f)
          // L 9.04 26
          lineTo(x = 9.04f, y = 26.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // M 22.96 26
          moveTo(x = 22.96f, y = 26.0f)
          // L 28 19.07
          lineTo(x = 28.0f, y = 19.07f)
          // V 26z
          verticalLineTo(y = 26.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _navaidVordme = it }
  }

@Suppress("ObjectPropertyName")
private var _navaidVordme: ImageVector? = null
