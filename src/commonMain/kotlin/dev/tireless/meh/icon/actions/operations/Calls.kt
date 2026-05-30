// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Calls: ImageVector
  get() {
    val current = _calls
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Calls",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 14 a2 2 0 1 1 0 4 2 2 0 0 1 0 -4 m0 -2 a4 4 0 1 0 0 8 4 4 0 0 0 0 -8 m-11 -1 -1.41 1.41 L16.17 15 H7.82 a3 3 0 1 0 0 2 h8.35 l-2.58 2.59 L15 21 l5 -5z M5 17 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 14
          moveTo(x = 26.0f, y = 14.0f)
          // a 2 2 0 1 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // a 2 2 0 0 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 4 4 0 1 0 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // m -11 -1
          moveToRelative(dx = -11.0f, dy = -1.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 16.17 15
          lineTo(x = 16.17f, y = 15.0f)
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // a 3 3 0 1 0 0 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // h 8.35
          horizontalLineToRelative(dx = 8.35f)
          // l -2.58 2.59
          lineToRelative(dx = -2.58f, dy = 2.59f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
          close()
          // M 5 17
          moveTo(x = 5.0f, y = 17.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
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
      .also { _calls = it }
  }

@Suppress("ObjectPropertyName")
private var _calls: ImageVector? = null
