// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChatLaunch: ImageVector
  get() {
    val current = _chatLaunch
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChatLaunch",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 4.0 22.0 6.0 26.586 6.0 20.0 12.586 21.414 14.0 28.0 7.414 28.0 12.0 30.0 12.0 30.0 4.0 22.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 4
          moveTo(x = 22.0f, y = 4.0f)
          // L 22 6
          lineTo(x = 22.0f, y = 6.0f)
          // L 26.586 6
          lineTo(x = 26.586f, y = 6.0f)
          // L 20 12.586
          lineTo(x = 20.0f, y = 12.586f)
          // L 21.414 14
          lineTo(x = 21.414f, y = 14.0f)
          // L 28 7.414
          lineTo(x = 28.0f, y = 7.414f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 30 12
          lineTo(x = 30.0f, y = 12.0f)
          // L 30 4
          lineTo(x = 30.0f, y = 4.0f)
          // L 22 4z
          lineTo(x = 22.0f, y = 4.0f)
          close()
        }
        // M28 16 v4 a2 2 0 0 1 -2 2 h-6 l-4 7 1.74 1 3.42 -6 H26 a4 4 0 0 0 4 -4 v-4Z M4 20 V8 a2 2 0 0 1 2 -2 h12 V4 H6 a4 4 0 0 0 -4 4 v12 a4 4 0 0 0 4 4 h9 v-2 H6 a2 2 0 0 1 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 16
          moveTo(x = 28.0f, y = 16.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // l -4 7
          lineToRelative(dx = -4.0f, dy = 7.0f)
          // l 1.74 1
          lineToRelative(dx = 1.74f, dy = 1.0f)
          // l 3.42 -6
          lineToRelative(dx = 3.42f, dy = -6.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // a 4 4 0 0 0 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // V 8
          verticalLineTo(y = 8.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 4 4 0 0 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 4 4 0 0 0 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
      .also { _chatLaunch = it }
  }

@Suppress("ObjectPropertyName")
private var _chatLaunch: ImageVector? = null
