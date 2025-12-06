// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bullhorn: ImageVector
  get() {
    val current = _bullhorn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Bullhorn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 6 v2.17 l-20.36 3.7 a2 2 0 0 0 -1.64 2 v4.34 a2 2 0 0 0 1.64 2 L8 20.56 V24 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 v-1.26 l6 1.09 V26 h2 V6Z m-8 18 h-8 v-3.07 l8 1.45Z M6 18.17 v-4.34 l20 -3.63 v11.6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // v 2.17
          verticalLineToRelative(dy = 2.17f)
          // l -20.36 3.7
          lineToRelative(dx = -20.36f, dy = 3.7f)
          // a 2 2 0 0 0 -1.64 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.64f,
            dy1 = 2.0f,
          )
          // v 4.34
          verticalLineToRelative(dy = 4.34f)
          // a 2 2 0 0 0 1.64 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.64f,
            dy1 = 2.0f,
          )
          // L 8 20.56
          lineTo(x = 8.0f, y = 20.56f)
          // V 24
          verticalLineTo(y = 24.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // v -1.26
          verticalLineToRelative(dy = -1.26f)
          // l 6 1.09
          lineToRelative(dx = 6.0f, dy = 1.09f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
          close()
          // m -8 18
          moveToRelative(dx = -8.0f, dy = 18.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -3.07
          verticalLineToRelative(dy = -3.07f)
          // l 8 1.45z
          lineToRelative(dx = 8.0f, dy = 1.45f)
          close()
          // M 6 18.17
          moveTo(x = 6.0f, y = 18.17f)
          // v -4.34
          verticalLineToRelative(dy = -4.34f)
          // l 20 -3.63
          lineToRelative(dx = 20.0f, dy = -3.63f)
          // v 11.6z
          verticalLineToRelative(dy = 11.6f)
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
      .also { _bullhorn = it }
  }

@Suppress("ObjectPropertyName")
private var _bullhorn: ImageVector? = null
