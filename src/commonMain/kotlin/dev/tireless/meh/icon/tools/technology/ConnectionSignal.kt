// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConnectionSignal: ImageVector
  get() {
    val current = _connectionSignal
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConnectionSignal",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="18" x="15.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 12
          moveTo(x = 15.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M11.33 18.22 a7 7 0 0 1 0 -10.44 l1.34 1.49 a5 5 0 0 0 0 7.46Z m9.34 0 -1.34 -1.49 a5 5 0 0 0 0 -7.46 l1.34 -1.49 a7 7 0 0 1 0 10.44
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.33 18.22
          moveTo(x = 11.33f, y = 18.22f)
          // a 7 7 0 0 1 0 -10.44
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -10.44f,
          )
          // l 1.34 1.49
          lineToRelative(dx = 1.34f, dy = 1.49f)
          // a 5 5 0 0 0 0 7.46z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 7.46f,
          )
          close()
          // m 9.34 0
          moveToRelative(dx = 9.34f, dy = 0.0f)
          // l -1.34 -1.49
          lineToRelative(dx = -1.34f, dy = -1.49f)
          // a 5 5 0 0 0 0 -7.46
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -7.46f,
          )
          // l 1.34 -1.49
          lineToRelative(dx = 1.34f, dy = -1.49f)
          // a 7 7 0 0 1 0 10.44
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 10.44f,
          )
        }
        // M8.4 21.8 a11 11 0 0 1 0 -17.6 l1.2 1.6 a9 9 0 0 0 0 14.4Z m15.2 0 -1.2 -1.6 a9 9 0 0 0 0 -14.4 l1.2 -1.6 a11 11 0 0 1 0 17.6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.4 21.8
          moveTo(x = 8.4f, y = 21.8f)
          // a 11 11 0 0 1 0 -17.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -17.6f,
          )
          // l 1.2 1.6
          lineToRelative(dx = 1.2f, dy = 1.6f)
          // a 9 9 0 0 0 0 14.4z
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 14.4f,
          )
          close()
          // m 15.2 0
          moveToRelative(dx = 15.2f, dy = 0.0f)
          // l -1.2 -1.6
          lineToRelative(dx = -1.2f, dy = -1.6f)
          // a 9 9 0 0 0 0 -14.4
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -14.4f,
          )
          // l 1.2 -1.6
          lineToRelative(dx = 1.2f, dy = -1.6f)
          // a 11 11 0 0 1 0 17.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 17.6f,
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
      .also { _connectionSignal = it }
  }

@Suppress("ObjectPropertyName")
private var _connectionSignal: ImageVector? = null
