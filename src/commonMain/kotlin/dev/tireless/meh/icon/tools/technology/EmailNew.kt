// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmailNew: ImageVector
  get() {
    val current = _emailNew
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EmailNew",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M19 24 H4 V8.9 l11.43 7.92 a1 1 0 0 0 1.14 0 L28 8.91 V18 h2 V8 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v16 a2 2 0 0 0 2 2 h15Z m6.8 -16 L16 14.78 6.2 8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 24
          moveTo(x = 19.0f, y = 24.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 8.9
          verticalLineTo(y = 8.9f)
          // l 11.43 7.92
          lineToRelative(dx = 11.43f, dy = 7.92f)
          // a 1 1 0 0 0 1.14 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.14f,
            dy1 = 0.0f,
          )
          // L 28 8.91
          lineTo(x = 28.0f, y = 8.91f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
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
          // h 15z
          horizontalLineToRelative(dx = 15.0f)
          close()
          // m 6.8 -16
          moveToRelative(dx = 6.8f, dy = -16.0f)
          // L 16 14.78
          lineTo(x = 16.0f, y = 14.78f)
          // L 6.2 8z
          lineTo(x = 6.2f, y = 8.0f)
          close()
        }
        // <circle cx="26.0" cy="24.0" radius="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 24
          moveTo(x = 26.0f, y = 24.0f)
          // m -4 0
          moveToRelative(dx = -4.0f, dy = 0.0f)
          // a 4 4 0 1 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 1 1 -8 0z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
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
      .also { _emailNew = it }
  }

@Suppress("ObjectPropertyName")
private var _emailNew: ImageVector? = null
