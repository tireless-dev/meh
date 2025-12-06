// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Percentage: ImageVector
  get() {
    val current = _percentage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Percentage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M9 14 a5 5 0 1 1 5 -5 5 5 0 0 1 -5 5 m0 -8 a3 3 0 1 0 3 3 3 3 0 0 0 -3 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 14
          moveTo(x = 9.0f, y = 14.0f)
          // a 5 5 0 1 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // a 3 3 0 1 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
        }
        // <rect width="32" height="2" x="0.029" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 3.999691 26.586096
          moveTo(x = 3.999691f, y = 26.586096f)
          // l 22.627417 -22.627417
          lineToRelative(dx = 22.627417f, dy = -22.627417f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -22.627417 22.627417z
          lineToRelative(dx = -22.627417f, dy = 22.627417f)
          close()
        }
        // M23 28 a5 5 0 1 1 5 -5 5 5 0 0 1 -5 5 m0 -8 a3 3 0 1 0 3 3 3 3 0 0 0 -3 -3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 28
          moveTo(x = 23.0f, y = 28.0f)
          // a 5 5 0 1 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // a 3 3 0 1 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
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
      .also { _percentage = it }
  }

@Suppress("ObjectPropertyName")
private var _percentage: ImageVector? = null
