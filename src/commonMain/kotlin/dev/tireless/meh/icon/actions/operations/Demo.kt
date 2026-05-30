// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Demo: ImageVector
  get() {
    val current = _demo
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Demo",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.0 2.0 20.0 14.0 30.0 8.0 20.0 2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 2
          moveTo(x = 20.0f, y = 2.0f)
          // L 20 14
          lineTo(x = 20.0f, y = 14.0f)
          // L 30 8
          lineTo(x = 30.0f, y = 8.0f)
          // L 20 2z
          lineTo(x = 20.0f, y = 2.0f)
          close()
        }
        // M28 14 v8 H4 V6 h10 V4 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h8 v4 H8 v2 h16 v-2 h-4 v-4 h8 a2 2 0 0 0 2 -2 v-8z M18 28 h-4 v-4 h4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 14
          moveTo(x = 28.0f, y = 14.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // M 18 28
          moveTo(x = 18.0f, y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _demo = it }
  }

@Suppress("ObjectPropertyName")
private var _demo: ImageVector? = null
