// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Run: ImageVector
  get() {
    val current = _run
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Run",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 16 a6 6 0 1 1 -6 6 6 6 0 0 1 6 -6 m0 -2 a8 8 0 1 0 8 8 8 8 0 0 0 -8 -8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 16
          moveTo(x = 21.0f, y = 16.0f)
          // a 6 6 0 1 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 1 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -6.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 8 8 0 1 0 8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 8.0f,
          )
          // a 8 8 0 0 0 -8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = -8.0f,
          )
        }
        // M26 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h4 v-2 H6 V12 h22 V6 a2 2 0 0 0 -2 -2 M6 10 V6 h20 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // M 6 10
          moveTo(x = 6.0f, y = 10.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
        }
        // <polygon points="19.0 19.0 19.0 25.0 24.0 22.0 19.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 19
          moveTo(x = 19.0f, y = 19.0f)
          // L 19 25
          lineTo(x = 19.0f, y = 25.0f)
          // L 24 22
          lineTo(x = 24.0f, y = 22.0f)
          // L 19 19z
          lineTo(x = 19.0f, y = 19.0f)
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
      .also { _run = it }
  }

@Suppress("ObjectPropertyName")
private var _run: ImageVector? = null
