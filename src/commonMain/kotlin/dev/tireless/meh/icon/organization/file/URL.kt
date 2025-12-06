// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val URL: ImageVector
  get() {
    val current = _uRL
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.URL",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="24.0 21.0 24.0 9.0 22.0 9.0 22.0 23.0 30.0 23.0 30.0 21.0 24.0 21.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 24 21
          moveTo(x = 24.0f, y = 21.0f)
          // L 24 9
          lineTo(x = 24.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 30 21
          lineTo(x = 30.0f, y = 21.0f)
          // L 24 21z
          lineTo(x = 24.0f, y = 21.0f)
          close()
        }
        // M20 15 v-4 a2 2 0 0 0 -2 -2 h-6 v14 h2 v-6 h1.48 l2.34 6 h2.14 l-2.33 -6 H18 a2 2 0 0 0 2 -2 m-6 -4 h4 v4 h-4z M8 23 H4 a2 2 0 0 1 -2 -2 V9 h2 v12 h4 V9 h2 v12 a2 2 0 0 1 -2 2
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 15
          moveTo(x = 20.0f, y = 15.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 1.48
          horizontalLineToRelative(dx = 1.48f)
          // l 2.34 6
          lineToRelative(dx = 2.34f, dy = 6.0f)
          // h 2.14
          horizontalLineToRelative(dx = 2.14f)
          // l -2.33 -6
          lineToRelative(dx = -2.33f, dy = -6.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
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
          // m -6 -4
          moveToRelative(dx = -6.0f, dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // M 8 23
          moveTo(x = 8.0f, y = 23.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _uRL = it }
  }

@Suppress("ObjectPropertyName")
private var _uRL: ImageVector? = null
