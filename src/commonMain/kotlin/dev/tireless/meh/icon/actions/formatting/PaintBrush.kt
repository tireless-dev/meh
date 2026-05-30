// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PaintBrush: ImageVector
  get() {
    val current = _paintBrush
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PaintBrush",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.83 23.17 23 17.33 V13 a1 1 0 0 0 -.29 -.71 l-10 -10 a1 1 0 0 0 -1.42 0 l-9 9 a1 1 0 0 0 0 1.42 l10 10 A1 1 0 0 0 13 23 h4.34 l5.83 5.84 a4 4 0 0 0 5.66 -5.66Z M6 10.41 l2.29 2.3 1.42 -1.42 L7.41 9 9 7.41 l4.29 4.3 1.42 -1.42 L10.41 6 12 4.41 18.59 11 11 18.59 4.41 12Z m21.41 17 a2 2 0 0 1 -2.82 0 l-6.13 -6.12 A2 2 0 0 0 17.75 21 h-4.34 l-1 -1 L20 12.41 l1 1 v4.34 a1 1 0 0 0 .29 .7 l6.12 6.14 a2 2 0 0 1 0 2.82
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.83 23.17
          moveTo(x = 28.83f, y = 23.17f)
          // L 23 17.33
          lineTo(x = 23.0f, y = 17.33f)
          // V 13
          verticalLineTo(y = 13.0f)
          // a 1 1 0 0 0 -0.29 -0.71
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.29f,
            dy1 = -0.71f,
          )
          // l -10 -10
          lineToRelative(dx = -10.0f, dy = -10.0f)
          // a 1 1 0 0 0 -1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 0.0f,
          )
          // l -9 9
          lineToRelative(dx = -9.0f, dy = 9.0f)
          // a 1 1 0 0 0 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l 10 10
          lineToRelative(dx = 10.0f, dy = 10.0f)
          // A 1 1 0 0 0 13 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 23.0f,
          )
          // h 4.34
          horizontalLineToRelative(dx = 4.34f)
          // l 5.83 5.84
          lineToRelative(dx = 5.83f, dy = 5.84f)
          // a 4 4 0 0 0 5.66 -5.66z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.66f,
            dy1 = -5.66f,
          )
          close()
          // M 6 10.41
          moveTo(x = 6.0f, y = 10.41f)
          // l 2.29 2.3
          lineToRelative(dx = 2.29f, dy = 2.3f)
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // L 7.41 9
          lineTo(x = 7.41f, y = 9.0f)
          // L 9 7.41
          lineTo(x = 9.0f, y = 7.41f)
          // l 4.29 4.3
          lineToRelative(dx = 4.29f, dy = 4.3f)
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // L 10.41 6
          lineTo(x = 10.41f, y = 6.0f)
          // L 12 4.41
          lineTo(x = 12.0f, y = 4.41f)
          // L 18.59 11
          lineTo(x = 18.59f, y = 11.0f)
          // L 11 18.59
          lineTo(x = 11.0f, y = 18.59f)
          // L 4.41 12z
          lineTo(x = 4.41f, y = 12.0f)
          close()
          // m 21.41 17
          moveToRelative(dx = 21.41f, dy = 17.0f)
          // a 2 2 0 0 1 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // l -6.13 -6.12
          lineToRelative(dx = -6.13f, dy = -6.12f)
          // A 2 2 0 0 0 17.75 21
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.75f,
            y1 = 21.0f,
          )
          // h -4.34
          horizontalLineToRelative(dx = -4.34f)
          // l -1 -1
          lineToRelative(dx = -1.0f, dy = -1.0f)
          // L 20 12.41
          lineTo(x = 20.0f, y = 12.41f)
          // l 1 1
          lineToRelative(dx = 1.0f, dy = 1.0f)
          // v 4.34
          verticalLineToRelative(dy = 4.34f)
          // a 1 1 0 0 0 0.29 0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.29f,
            dy1 = 0.7f,
          )
          // l 6.12 6.14
          lineToRelative(dx = 6.12f, dy = 6.14f)
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
      .also { _paintBrush = it }
  }

@Suppress("ObjectPropertyName")
private var _paintBrush: ImageVector? = null
