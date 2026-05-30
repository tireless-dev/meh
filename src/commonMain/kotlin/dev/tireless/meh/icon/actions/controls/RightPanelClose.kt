// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RightPanelClose: ImageVector
  get() {
    val current = _rightPanelClose
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RightPanelClose",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M2 6 v20 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 m20 0 h6 v20 h-6z M4 6 h16 v20 H4 v-9 h10.17 l-3.58 3.59 L12 22 l6 -6 -6 -6 -1.41 1.41 L14.17 15 H4z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 6
          moveTo(x = 2.0f, y = 6.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // m 20 0
          moveToRelative(dx = 20.0f, dy = 0.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 10.17
          horizontalLineToRelative(dx = 10.17f)
          // l -3.58 3.59
          lineToRelative(dx = -3.58f, dy = 3.59f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 14.17 15
          lineTo(x = 14.17f, y = 15.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
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
      .also { _rightPanelClose = it }
  }

@Suppress("ObjectPropertyName")
private var _rightPanelClose: ImageVector? = null
