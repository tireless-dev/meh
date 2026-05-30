// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Loop: ImageVector
  get() {
    val current = _loop
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Loop",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.59 19.41 26.0 22.0 21.0 22.0 21.0 24.0 26.0 24.0 23.59 26.59 25.0 28.0 30.0 23.0 25.0 18.0 23.59 19.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.59 19.41
          moveTo(x = 23.59f, y = 19.41f)
          // L 26 22
          lineTo(x = 26.0f, y = 22.0f)
          // L 21 22
          lineTo(x = 21.0f, y = 22.0f)
          // L 21 24
          lineTo(x = 21.0f, y = 24.0f)
          // L 26 24
          lineTo(x = 26.0f, y = 24.0f)
          // L 23.59 26.59
          lineTo(x = 23.59f, y = 26.59f)
          // L 25 28
          lineTo(x = 25.0f, y = 28.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 25 18
          lineTo(x = 25.0f, y = 18.0f)
          // L 23.59 19.41z
          lineTo(x = 23.59f, y = 19.41f)
          close()
        }
        // M13 6 a9 9 0 0 0 -7.48 14 l1.66 -1.11 A7 7 0 1 1 13 22 H2 v2 h11 a9 9 0 0 0 0 -18
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 6
          moveTo(x = 13.0f, y = 6.0f)
          // a 9 9 0 0 0 -7.48 14
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.48f,
            dy1 = 14.0f,
          )
          // l 1.66 -1.11
          lineToRelative(dx = 1.66f, dy = -1.11f)
          // A 7 7 0 1 1 13 22
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 13.0f,
            y1 = 22.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // a 9 9 0 0 0 0 -18
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -18.0f,
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
      .also { _loop = it }
  }

@Suppress("ObjectPropertyName")
private var _loop: ImageVector? = null
