// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ResetAlt: ImageVector
  get() {
    val current = _resetAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ResetAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 8 H6.83 l3.58 -3.59 L9 3 3 9 l6 6 1.41 -1.41 L6.83 10 H27 v16 H7 v-7 H5 v7 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 8
          moveTo(x = 27.0f, y = 8.0f)
          // H 6.83
          horizontalLineTo(x = 6.83f)
          // l 3.58 -3.59
          lineToRelative(dx = 3.58f, dy = -3.59f)
          // L 9 3
          lineTo(x = 9.0f, y = 3.0f)
          // L 3 9
          lineTo(x = 3.0f, y = 9.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 6.83 10
          lineTo(x = 6.83f, y = 10.0f)
          // H 27
          horizontalLineTo(x = 27.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
      .also { _resetAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _resetAlt: ImageVector? = null
