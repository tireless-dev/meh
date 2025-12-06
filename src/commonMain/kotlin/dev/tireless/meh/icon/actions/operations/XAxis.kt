// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val XAxis: ImageVector
  get() {
    val current = _xAxis
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.XAxis",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m23 20 -1.41 1.41 L24.17 24 H6 V4 H4 v20 a2 2 0 0 0 2 2 h18.17 l-2.58 2.59 L23 30 l5 -5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 20
          moveTo(x = 23.0f, y = 20.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 24.17 24
          lineTo(x = 24.17f, y = 24.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // h 18.17
          horizontalLineToRelative(dx = 18.17f)
          // l -2.58 2.59
          lineToRelative(dx = -2.58f, dy = 2.59f)
          // L 23 30
          lineTo(x = 23.0f, y = 30.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
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
      .also { _xAxis = it }
  }

@Suppress("ObjectPropertyName")
private var _xAxis: ImageVector? = null
