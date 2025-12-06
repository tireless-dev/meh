// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataConnected: ImageVector
  get() {
    val current = _dataConnected
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataConnected",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 30.0 24.0 30.0 24.0 28.0 28.0 28.0 28.0 4.0 24.0 4.0 24.0 2.0 30.0 2.0 30.0 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 30
          moveTo(x = 30.0f, y = 30.0f)
          // L 24 30
          lineTo(x = 24.0f, y = 30.0f)
          // L 24 28
          lineTo(x = 24.0f, y = 28.0f)
          // L 28 28
          lineTo(x = 28.0f, y = 28.0f)
          // L 28 4
          lineTo(x = 28.0f, y = 4.0f)
          // L 24 4
          lineTo(x = 24.0f, y = 4.0f)
          // L 24 2
          lineTo(x = 24.0f, y = 2.0f)
          // L 30 2
          lineTo(x = 30.0f, y = 2.0f)
          // L 30 30z
          lineTo(x = 30.0f, y = 30.0f)
          close()
        }
        // M24.91 19.59 a4.5 4.5 0 0 0 -2.66 -3.24 4.6 4.6 0 0 0 -3.5 0 5 5 0 0 0 -.64 .35 l-2.81 -2.81 a4.53 4.53 0 1 0 -1.41 1.41 l2.81 2.81 a4.5 4.5 0 0 0 -.61 3.3 4.5 4.5 0 0 0 2.66 3.24 4.6 4.6 0 0 0 3.5 0 4.5 4.5 0 0 0 2.66 -3.24 5 5 0 0 0 0 -1.82 M11.5 14 a2.5 2.5 0 1 1 2.5 -2.5 2.5 2.5 0 0 1 -2.5 2.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.91 19.59
          moveTo(x = 24.91f, y = 19.59f)
          // a 4.5 4.5 0 0 0 -2.66 -3.24
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.66f,
            dy1 = -3.24f,
          )
          // a 4.6 4.6 0 0 0 -3.5 0
          arcToRelative(
            a = 4.6f,
            b = 4.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.5f,
            dy1 = 0.0f,
          )
          // a 5 5 0 0 0 -0.64 0.35
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.64f,
            dy1 = 0.35f,
          )
          // l -2.81 -2.81
          lineToRelative(dx = -2.81f, dy = -2.81f)
          // a 4.53 4.53 0 1 0 -1.41 1.41
          arcToRelative(
            a = 4.53f,
            b = 4.53f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.41f,
            dy1 = 1.41f,
          )
          // l 2.81 2.81
          lineToRelative(dx = 2.81f, dy = 2.81f)
          // a 4.5 4.5 0 0 0 -0.61 3.3
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.61f,
            dy1 = 3.3f,
          )
          // a 4.5 4.5 0 0 0 2.66 3.24
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.66f,
            dy1 = 3.24f,
          )
          // a 4.6 4.6 0 0 0 3.5 0
          arcToRelative(
            a = 4.6f,
            b = 4.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.5f,
            dy1 = 0.0f,
          )
          // a 4.5 4.5 0 0 0 2.66 -3.24
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.66f,
            dy1 = -3.24f,
          )
          // a 5 5 0 0 0 0 -1.82
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.82f,
          )
          // M 11.5 14
          moveTo(x = 11.5f, y = 14.0f)
          // a 2.5 2.5 0 1 1 2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = -2.5f,
          )
          // a 2.5 2.5 0 0 1 -2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.5f,
            dy1 = 2.5f,
          )
        }
        // <polygon points="8.0 30.0 2.0 30.0 2.0 2.0 8.0 2.0 8.0 4.0 4.0 4.0 4.0 28.0 8.0 28.0 8.0 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 30
          moveTo(x = 8.0f, y = 30.0f)
          // L 2 30
          lineTo(x = 2.0f, y = 30.0f)
          // L 2 2
          lineTo(x = 2.0f, y = 2.0f)
          // L 8 2
          lineTo(x = 8.0f, y = 2.0f)
          // L 8 4
          lineTo(x = 8.0f, y = 4.0f)
          // L 4 4
          lineTo(x = 4.0f, y = 4.0f)
          // L 4 28
          lineTo(x = 4.0f, y = 28.0f)
          // L 8 28
          lineTo(x = 8.0f, y = 28.0f)
          // L 8 30z
          lineTo(x = 8.0f, y = 30.0f)
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
      .also { _dataConnected = it }
  }

@Suppress("ObjectPropertyName")
private var _dataConnected: ImageVector? = null
