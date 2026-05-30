// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Mountain: ImageVector
  get() {
    val current = _mountain
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Mountain",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.63 26 17.8 5.1 a2 2 0 0 0 -3.59 .03 L4.37 26 H2 v2 h28 v-2Z M16 5.98 l4.96 10.52 L19 17.8 l-3 -2 -3 2 -1.96 -1.3Z m-5.8 12.34 L13 20.2 l3 -2 3 2 2.8 -1.87 L25.43 26 H6.58Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.63 26
          moveTo(x = 27.63f, y = 26.0f)
          // L 17.8 5.1
          lineTo(x = 17.8f, y = 5.1f)
          // a 2 2 0 0 0 -3.59 0.03
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.59f,
            dy1 = 0.03f,
          )
          // L 4.37 26
          lineTo(x = 4.37f, y = 26.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 16 5.98
          moveTo(x = 16.0f, y = 5.98f)
          // l 4.96 10.52
          lineToRelative(dx = 4.96f, dy = 10.52f)
          // L 19 17.8
          lineTo(x = 19.0f, y = 17.8f)
          // l -3 -2
          lineToRelative(dx = -3.0f, dy = -2.0f)
          // l -3 2
          lineToRelative(dx = -3.0f, dy = 2.0f)
          // l -1.96 -1.3z
          lineToRelative(dx = -1.96f, dy = -1.3f)
          close()
          // m -5.8 12.34
          moveToRelative(dx = -5.8f, dy = 12.34f)
          // L 13 20.2
          lineTo(x = 13.0f, y = 20.2f)
          // l 3 -2
          lineToRelative(dx = 3.0f, dy = -2.0f)
          // l 3 2
          lineToRelative(dx = 3.0f, dy = 2.0f)
          // l 2.8 -1.87
          lineToRelative(dx = 2.8f, dy = -1.87f)
          // L 25.43 26
          lineTo(x = 25.43f, y = 26.0f)
          // H 6.58z
          horizontalLineTo(x = 6.58f)
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
      .also { _mountain = it }
  }

@Suppress("ObjectPropertyName")
private var _mountain: ImageVector? = null
