// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PicnicArea: ImageVector
  get() {
    val current = _picnicArea
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PicnicArea",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 12 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2 m2 16 h-4.15 l-.67 -4 H24 v-2 H8 v2 h2.82 l-.67 4 H6 v2 h3.82 l-.67 4 h2.03 l.67 -4 h8.3 l.67 4 h2.03 l-.67 -4 H26Z m-13.82 0 .67 -4 h6.3 l.67 4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 12
          moveTo(x = 24.0f, y = 12.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
          // m 2 16
          moveToRelative(dx = 2.0f, dy = 16.0f)
          // h -4.15
          horizontalLineToRelative(dx = -4.15f)
          // l -0.67 -4
          lineToRelative(dx = -0.67f, dy = -4.0f)
          // H 24
          horizontalLineTo(x = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.82
          horizontalLineToRelative(dx = 2.82f)
          // l -0.67 4
          lineToRelative(dx = -0.67f, dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3.82
          horizontalLineToRelative(dx = 3.82f)
          // l -0.67 4
          lineToRelative(dx = -0.67f, dy = 4.0f)
          // h 2.03
          horizontalLineToRelative(dx = 2.03f)
          // l 0.67 -4
          lineToRelative(dx = 0.67f, dy = -4.0f)
          // h 8.3
          horizontalLineToRelative(dx = 8.3f)
          // l 0.67 4
          lineToRelative(dx = 0.67f, dy = 4.0f)
          // h 2.03
          horizontalLineToRelative(dx = 2.03f)
          // l -0.67 -4
          lineToRelative(dx = -0.67f, dy = -4.0f)
          // H 26z
          horizontalLineTo(x = 26.0f)
          close()
          // m -13.82 0
          moveToRelative(dx = -13.82f, dy = 0.0f)
          // l 0.67 -4
          lineToRelative(dx = 0.67f, dy = -4.0f)
          // h 6.3
          horizontalLineToRelative(dx = 6.3f)
          // l 0.67 4z
          lineToRelative(dx = 0.67f, dy = 4.0f)
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
      .also { _picnicArea = it }
  }

@Suppress("ObjectPropertyName")
private var _picnicArea: ImageVector? = null
