// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AssetMovement: ImageVector
  get() {
    val current = _assetMovement
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AssetMovement",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 13 h14.2 l-2.6 2.6 L25 17 l5 -5 -5 -5 -1.4 1.4 2.6 2.6 H12z m16 6 H14.8 l2.6 -2.6 L16 15 l-5 5 5 5 1.4 -1.4 -2.6 -2.6 H28z M22 7 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 v-3 h-2 v3 H4 V4 h16 v3z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 13
          moveTo(x = 12.0f, y = 13.0f)
          // h 14.2
          horizontalLineToRelative(dx = 14.2f)
          // l -2.6 2.6
          lineToRelative(dx = -2.6f, dy = 2.6f)
          // L 25 17
          lineTo(x = 25.0f, y = 17.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 2.6 2.6
          lineToRelative(dx = 2.6f, dy = 2.6f)
          // H 12z
          horizontalLineTo(x = 12.0f)
          close()
          // m 16 6
          moveToRelative(dx = 16.0f, dy = 6.0f)
          // H 14.8
          horizontalLineTo(x = 14.8f)
          // l 2.6 -2.6
          lineToRelative(dx = 2.6f, dy = -2.6f)
          // L 16 15
          lineTo(x = 16.0f, y = 15.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -2.6 -2.6
          lineToRelative(dx = -2.6f, dy = -2.6f)
          // H 28z
          horizontalLineTo(x = 28.0f)
          close()
          // M 22 7
          moveTo(x = 22.0f, y = 7.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
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
      .also { _assetMovement = it }
  }

@Suppress("ObjectPropertyName")
private var _assetMovement: ImageVector? = null
