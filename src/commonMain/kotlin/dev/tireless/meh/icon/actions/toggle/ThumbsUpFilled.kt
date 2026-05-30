// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsUpFilled: ImageVector
  get() {
    val current = _thumbsUpFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ThumbsUpFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="5" height="14" x="2.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 16
          moveTo(x = 2.0f, y = 16.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -5z
          horizontalLineToRelative(dx = -5.0f)
          close()
        }
        // M23 30 H9 V15.2 l3.04 -4.57 .85 -5.91 A2 2 0 0 1 14.87 3 H15 a3 3 0 0 1 3 3 v6 h8 a4 4 0 0 1 4 4 v7 a7 7 0 0 1 -7 7
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 30
          moveTo(x = 23.0f, y = 30.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 15.2
          verticalLineTo(y = 15.2f)
          // l 3.04 -4.57
          lineToRelative(dx = 3.04f, dy = -4.57f)
          // l 0.85 -5.91
          lineToRelative(dx = 0.85f, dy = -5.91f)
          // A 2 2 0 0 1 14.87 3
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 14.87f,
            y1 = 3.0f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // a 3 3 0 0 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 7 7 0 0 1 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 7.0f,
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
      .also { _thumbsUpFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _thumbsUpFilled: ImageVector? = null
