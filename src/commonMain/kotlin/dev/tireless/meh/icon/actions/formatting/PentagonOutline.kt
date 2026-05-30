// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PentagonOutline: ImageVector
  get() {
    val current = _pentagonOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PentagonOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 4.24 11.83 8.68 L23.3 27 H8.7 L4.17 12.92z M16 2 a1 1 0 0 0 -.6 .2 l-13 9.54 a1 1 0 0 0 -.35 1.11 l4.97 15.46 A1 1 0 0 0 7.97 29 h16.06 a1 1 0 0 0 .95 -.7 l4.97 -15.45 a1 1 0 0 0 -.36 -1.11 l-13 -9.55 A1 1 0 0 0 16 2
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 4.24
          moveTo(x = 16.0f, y = 4.24f)
          // l 11.83 8.68
          lineToRelative(dx = 11.83f, dy = 8.68f)
          // L 23.3 27
          lineTo(x = 23.3f, y = 27.0f)
          // H 8.7
          horizontalLineTo(x = 8.7f)
          // L 4.17 12.92z
          lineTo(x = 4.17f, y = 12.92f)
          close()
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 1 1 0 0 0 -0.6 0.2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.6f,
            dy1 = 0.2f,
          )
          // l -13 9.54
          lineToRelative(dx = -13.0f, dy = 9.54f)
          // a 1 1 0 0 0 -0.35 1.11
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.35f,
            dy1 = 1.11f,
          )
          // l 4.97 15.46
          lineToRelative(dx = 4.97f, dy = 15.46f)
          // A 1 1 0 0 0 7.97 29
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.97f,
            y1 = 29.0f,
          )
          // h 16.06
          horizontalLineToRelative(dx = 16.06f)
          // a 1 1 0 0 0 0.95 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.95f,
            dy1 = -0.7f,
          )
          // l 4.97 -15.45
          lineToRelative(dx = 4.97f, dy = -15.45f)
          // a 1 1 0 0 0 -0.36 -1.11
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.36f,
            dy1 = -1.11f,
          )
          // l -13 -9.55
          lineToRelative(dx = -13.0f, dy = -9.55f)
          // A 1 1 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
        ) {
          // M 32 32
          moveTo(x = 32.0f, y = 32.0f)
          // l -32 0
          lineToRelative(dx = -32.0f, dy = 0.0f)
          // l 0 -32
          lineToRelative(dx = 0.0f, dy = -32.0f)
          // l 32 -0z
          lineToRelative(dx = 32.0f, dy = -0.0f)
          close()
        }
      }.build()
      .also { _pentagonOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _pentagonOutline: ImageVector? = null
