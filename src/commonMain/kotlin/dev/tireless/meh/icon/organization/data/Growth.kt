// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Growth: ImageVector
  get() {
    val current = _growth
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Growth",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 8 v2 h6.59 L18 18.59 l-4.3 -4.3 a1 1 0 0 0 -1.4 0 L2 24.6 3.41 26 13 16.41 l4.3 4.3 a1 1 0 0 0 1.4 0 l9.3 -9.3 V18 h2 V8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 8
          moveTo(x = 20.0f, y = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // L 18 18.59
          lineTo(x = 18.0f, y = 18.59f)
          // l -4.3 -4.3
          lineToRelative(dx = -4.3f, dy = -4.3f)
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
          // L 2 24.6
          lineTo(x = 2.0f, y = 24.6f)
          // L 3.41 26
          lineTo(x = 3.41f, y = 26.0f)
          // L 13 16.41
          lineTo(x = 13.0f, y = 16.41f)
          // l 4.3 4.3
          lineToRelative(dx = 4.3f, dy = 4.3f)
          // a 1 1 0 0 0 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 9.3 -9.3
          lineToRelative(dx = 9.3f, dy = -9.3f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
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
      .also { _growth = it }
  }

@Suppress("ObjectPropertyName")
private var _growth: ImageVector? = null
