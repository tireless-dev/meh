// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Function2: ImageVector
  get() {
    val current = _function2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Function2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12.3 13 11 26.2 c-.1 1 -.9 1.8 -1.9 1.8 H4 v-2 h5 l1.3 -13 H6 v-2 h4.5 L11 5.8 c.1 -1 1 -1.8 2 -1.8 h5 v2 h-5 l-.5 5 H17 v2z m3.7 6 v7 a2 2 0 0 0 2 2 h2 v-2 h-2 v-7 h2 v-2 h-2 a2 2 0 0 0 -2 2 m10 -2 h-2 v2 h2 v7 h-2 v2 h2 a2 2 0 0 0 2 -2 v-7 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12.3 13
          moveTo(x = 12.3f, y = 13.0f)
          // L 11 26.2
          lineTo(x = 11.0f, y = 26.2f)
          // c -0.1 1 -0.9 1.8 -1.9 1.8
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 1.0f,
            dx2 = -0.9f,
            dy2 = 1.8f,
            dx3 = -1.9f,
            dy3 = 1.8f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // l 1.3 -13
          lineToRelative(dx = 1.3f, dy = -13.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4.5
          horizontalLineToRelative(dx = 4.5f)
          // L 11 5.8
          lineTo(x = 11.0f, y = 5.8f)
          // c 0.1 -1 1 -1.8 2 -1.8
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -1.0f,
            dx2 = 1.0f,
            dy2 = -1.8f,
            dx3 = 2.0f,
            dy3 = -1.8f,
          )
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // l -0.5 5
          lineToRelative(dx = -0.5f, dy = 5.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
          // m 3.7 6
          moveToRelative(dx = 3.7f, dy = 6.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
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
          // m 10 -2
          moveToRelative(dx = 10.0f, dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v -7
          verticalLineToRelative(dy = -7.0f)
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
      .also { _function2 = it }
  }

@Suppress("ObjectPropertyName")
private var _function2: ImageVector? = null
