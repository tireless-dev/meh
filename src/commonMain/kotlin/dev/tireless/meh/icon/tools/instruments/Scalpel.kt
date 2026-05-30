// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scalpel: ImageVector
  get() {
    val current = _scalpel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Scalpel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.83 5.17 a4.1 4.1 0 0 0 -5.66 0 L.34 28 h9.25 a5 5 0 0 0 3.53 -1.46 l15.71 -15.71 a4 4 0 0 0 0 -5.66 M12.29 18.88 l2.09 -2.09 2.83 2.83 -2.09 2.09Z m-.58 6.24 A3 3 0 0 1 9.59 26 H5.17 l5.71 -5.71 2.83 2.83Z m15.7 -15.71 -8.79 8.8 -2.83 -2.83 8.8 -8.79 a2 2 0 0 1 2.82 0 2 2 0 0 1 0 2.82
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.83 5.17
          moveTo(x = 28.83f, y = 5.17f)
          // a 4.1 4.1 0 0 0 -5.66 0
          arcToRelative(
            a = 4.1f,
            b = 4.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.66f,
            dy1 = 0.0f,
          )
          // L 0.34 28
          lineTo(x = 0.34f, y = 28.0f)
          // h 9.25
          horizontalLineToRelative(dx = 9.25f)
          // a 5 5 0 0 0 3.53 -1.46
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.53f,
            dy1 = -1.46f,
          )
          // l 15.71 -15.71
          lineToRelative(dx = 15.71f, dy = -15.71f)
          // a 4 4 0 0 0 0 -5.66
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -5.66f,
          )
          // M 12.29 18.88
          moveTo(x = 12.29f, y = 18.88f)
          // l 2.09 -2.09
          lineToRelative(dx = 2.09f, dy = -2.09f)
          // l 2.83 2.83
          lineToRelative(dx = 2.83f, dy = 2.83f)
          // l -2.09 2.09z
          lineToRelative(dx = -2.09f, dy = 2.09f)
          close()
          // m -0.58 6.24
          moveToRelative(dx = -0.58f, dy = 6.24f)
          // A 3 3 0 0 1 9.59 26
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.59f,
            y1 = 26.0f,
          )
          // H 5.17
          horizontalLineTo(x = 5.17f)
          // l 5.71 -5.71
          lineToRelative(dx = 5.71f, dy = -5.71f)
          // l 2.83 2.83z
          lineToRelative(dx = 2.83f, dy = 2.83f)
          close()
          // m 15.7 -15.71
          moveToRelative(dx = 15.7f, dy = -15.71f)
          // l -8.79 8.8
          lineToRelative(dx = -8.79f, dy = 8.8f)
          // l -2.83 -2.83
          lineToRelative(dx = -2.83f, dy = -2.83f)
          // l 8.8 -8.79
          lineToRelative(dx = 8.8f, dy = -8.79f)
          // a 2 2 0 0 1 2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.82f,
            dy1 = 0.0f,
          )
          // a 2 2 0 0 1 0 2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.82f,
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
      .also { _scalpel = it }
  }

@Suppress("ObjectPropertyName")
private var _scalpel: ImageVector? = null
