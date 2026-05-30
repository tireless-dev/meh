// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataRegular: ImageVector
  get() {
    val current = _dataRegular
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataRegular",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 24 a3 3 0 0 0 -1.29 .3 l-4.82 -4.83 a6 6 0 0 0 -8.36 -8.36 L7.7 6.3 A2.98 2.98 0 0 0 5 2 a3 3 0 1 0 1.29 5.7 l4.82 4.83 a6 6 0 0 0 8.36 8.36 l4.83 4.82 A2.98 2.98 0 0 0 27 30 a3 3 0 0 0 0 -6 m-11 -4 a4 4 0 1 1 0 -8 4 4 0 0 1 0 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 24
          moveTo(x = 27.0f, y = 24.0f)
          // a 3 3 0 0 0 -1.29 0.3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.29f,
            dy1 = 0.3f,
          )
          // l -4.82 -4.83
          lineToRelative(dx = -4.82f, dy = -4.83f)
          // a 6 6 0 0 0 -8.36 -8.36
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.36f,
            dy1 = -8.36f,
          )
          // L 7.7 6.3
          lineTo(x = 7.7f, y = 6.3f)
          // A 2.98 2.98 0 0 0 5 2
          arcTo(
            horizontalEllipseRadius = 2.98f,
            verticalEllipseRadius = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 2.0f,
          )
          // a 3 3 0 1 0 1.29 5.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.29f,
            dy1 = 5.7f,
          )
          // l 4.82 4.83
          lineToRelative(dx = 4.82f, dy = 4.83f)
          // a 6 6 0 0 0 8.36 8.36
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.36f,
            dy1 = 8.36f,
          )
          // l 4.83 4.82
          lineToRelative(dx = 4.83f, dy = 4.82f)
          // A 2.98 2.98 0 0 0 27 30
          arcTo(
            horizontalEllipseRadius = 2.98f,
            verticalEllipseRadius = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 30.0f,
          )
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m -11 -4
          moveToRelative(dx = -11.0f, dy = -4.0f)
          // a 4 4 0 1 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // a 4 4 0 0 1 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 8.0f,
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
      .also { _dataRegular = it }
  }

@Suppress("ObjectPropertyName")
private var _dataRegular: ImageVector? = null
