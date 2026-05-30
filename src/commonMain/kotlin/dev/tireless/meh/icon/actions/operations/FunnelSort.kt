// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FunnelSort: ImageVector
  get() {
    val current = _funnelSort
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FunnelSort",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m21.4 15.6 2.6 2.6 2.6 -2.6 L28 17 l-4 4 -4 -4z m0 -2.2 2.6 -2.6 2.6 2.6 L28 12 l-4 -4 -4 4z M26 4 H4 a2 2 0 0 0 -2 2 v3.2 c0 .5 .2 1 .6 1.4 L10 18 v8 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 v-4 h-2 v4 h-4 v-8.8 l-.6 -.6 L4 9.2 V6 h22z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.4 15.6
          moveTo(x = 21.4f, y = 15.6f)
          // l 2.6 2.6
          lineToRelative(dx = 2.6f, dy = 2.6f)
          // l 2.6 -2.6
          lineToRelative(dx = 2.6f, dy = -2.6f)
          // L 28 17
          lineTo(x = 28.0f, y = 17.0f)
          // l -4 4
          lineToRelative(dx = -4.0f, dy = 4.0f)
          // l -4 -4z
          lineToRelative(dx = -4.0f, dy = -4.0f)
          close()
          // m 0 -2.2
          moveToRelative(dx = 0.0f, dy = -2.2f)
          // l 2.6 -2.6
          lineToRelative(dx = 2.6f, dy = -2.6f)
          // l 2.6 2.6
          lineToRelative(dx = 2.6f, dy = 2.6f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // l -4 -4
          lineToRelative(dx = -4.0f, dy = -4.0f)
          // l -4 4z
          lineToRelative(dx = -4.0f, dy = 4.0f)
          close()
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
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
          // v 3.2
          verticalLineToRelative(dy = 3.2f)
          // c 0 0.5 0.2 1 0.6 1.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.2f,
            dy2 = 1.0f,
            dx3 = 0.6f,
            dy3 = 1.4f,
          )
          // L 10 18
          lineTo(x = 10.0f, y = 18.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8.8
          verticalLineToRelative(dy = -8.8f)
          // l -0.6 -0.6
          lineToRelative(dx = -0.6f, dy = -0.6f)
          // L 4 9.2
          lineTo(x = 4.0f, y = 9.2f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 22z
          horizontalLineToRelative(dx = 22.0f)
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
      .also { _funnelSort = it }
  }

@Suppress("ObjectPropertyName")
private var _funnelSort: ImageVector? = null
