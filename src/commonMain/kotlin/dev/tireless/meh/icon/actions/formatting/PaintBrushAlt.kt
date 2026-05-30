// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PaintBrushAlt: ImageVector
  get() {
    val current = _paintBrushAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PaintBrushAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.83 3.17 a4.1 4.1 0 0 0 -5.66 0 L4.05 22.3 A7 7 0 0 0 2 27.24 V30 h2.76 a7 7 0 0 0 4.95 -2.05 L28.83 8.83 a4 4 0 0 0 0 -5.66 M10.9 18.26 l2.83 2.83 -2.12 2.12 -2.83 -2.83Z m-2.62 8.28 A5 5 0 0 1 4.76 28 H4 v-.76 a5 5 0 0 1 1.46 -3.53 l1.91 -1.91 2.83 2.82Z M27.41 7.4 15.15 19.67 l-2.83 -2.82 L24.6 4.59 a2.05 2.05 0 0 1 2.82 0 2 2 0 0 1 0 2.82
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.83 3.17
          moveTo(x = 28.83f, y = 3.17f)
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
          // L 4.05 22.3
          lineTo(x = 4.05f, y = 22.3f)
          // A 7 7 0 0 0 2 27.24
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 27.24f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2.76
          horizontalLineToRelative(dx = 2.76f)
          // a 7 7 0 0 0 4.95 -2.05
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.95f,
            dy1 = -2.05f,
          )
          // L 28.83 8.83
          lineTo(x = 28.83f, y = 8.83f)
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
          // M 10.9 18.26
          moveTo(x = 10.9f, y = 18.26f)
          // l 2.83 2.83
          lineToRelative(dx = 2.83f, dy = 2.83f)
          // l -2.12 2.12
          lineToRelative(dx = -2.12f, dy = 2.12f)
          // l -2.83 -2.83z
          lineToRelative(dx = -2.83f, dy = -2.83f)
          close()
          // m -2.62 8.28
          moveToRelative(dx = -2.62f, dy = 8.28f)
          // A 5 5 0 0 1 4.76 28
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.76f,
            y1 = 28.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -0.76
          verticalLineToRelative(dy = -0.76f)
          // a 5 5 0 0 1 1.46 -3.53
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.46f,
            dy1 = -3.53f,
          )
          // l 1.91 -1.91
          lineToRelative(dx = 1.91f, dy = -1.91f)
          // l 2.83 2.82z
          lineToRelative(dx = 2.83f, dy = 2.82f)
          close()
          // M 27.41 7.4
          moveTo(x = 27.41f, y = 7.4f)
          // L 15.15 19.67
          lineTo(x = 15.15f, y = 19.67f)
          // l -2.83 -2.82
          lineToRelative(dx = -2.83f, dy = -2.82f)
          // L 24.6 4.59
          lineTo(x = 24.6f, y = 4.59f)
          // a 2.05 2.05 0 0 1 2.82 0
          arcToRelative(
            a = 2.05f,
            b = 2.05f,
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
      .also { _paintBrushAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _paintBrushAlt: ImageVector? = null
