// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FitToWidth: ImageVector
  get() {
    val current = _fitToWidth
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FitToWidth",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 11.0 20.59 12.41 23.17 15.0 8.83 15.0 11.41 12.41 10.0 11.0 5.0 16.0 10.0 21.0 11.41 19.59 8.83 17.0 23.17 17.0 20.59 19.59 22.0 21.0 27.0 16.0 22.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 11
          moveTo(x = 22.0f, y = 11.0f)
          // L 20.59 12.41
          lineTo(x = 20.59f, y = 12.41f)
          // L 23.17 15
          lineTo(x = 23.17f, y = 15.0f)
          // L 8.83 15
          lineTo(x = 8.83f, y = 15.0f)
          // L 11.41 12.41
          lineTo(x = 11.41f, y = 12.41f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 5 16
          lineTo(x = 5.0f, y = 16.0f)
          // L 10 21
          lineTo(x = 10.0f, y = 21.0f)
          // L 11.41 19.59
          lineTo(x = 11.41f, y = 19.59f)
          // L 8.83 17
          lineTo(x = 8.83f, y = 17.0f)
          // L 23.17 17
          lineTo(x = 23.17f, y = 17.0f)
          // L 20.59 19.59
          lineTo(x = 20.59f, y = 19.59f)
          // L 22 21
          lineTo(x = 22.0f, y = 21.0f)
          // L 27 16
          lineTo(x = 27.0f, y = 16.0f)
          // L 22 11z
          lineTo(x = 22.0f, y = 11.0f)
          close()
        }
        // M28 30 H4 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M4 4 v24 h24 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // M 4 4
          moveTo(x = 4.0f, y = 4.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
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
      .also { _fitToWidth = it }
  }

@Suppress("ObjectPropertyName")
private var _fitToWidth: ImageVector? = null
