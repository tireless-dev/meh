// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FavoriteHalf: ImageVector
  get() {
    val current = _favoriteHalf
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FavoriteHalf",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4.21 17.06 16 29 l11.79 -11.94 a7.73 7.73 0 0 0 0 -10.82 7.5 7.5 0 0 0 -10.68 0 L16 7.36 l-1.1 -1.12 a7.5 7.5 0 0 0 -10.69 0 7.73 7.73 0 0 0 0 10.82 m22.15 -1.41 L16 26.13 v-15.9 l2.54 -2.57 a5.5 5.5 0 0 1 7.82 0 5.7 5.7 0 0 1 0 7.99
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.21 17.06
          moveTo(x = 4.21f, y = 17.06f)
          // L 16 29
          lineTo(x = 16.0f, y = 29.0f)
          // l 11.79 -11.94
          lineToRelative(dx = 11.79f, dy = -11.94f)
          // a 7.73 7.73 0 0 0 0 -10.82
          arcToRelative(
            a = 7.73f,
            b = 7.73f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -10.82f,
          )
          // a 7.5 7.5 0 0 0 -10.68 0
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -10.68f,
            dy1 = 0.0f,
          )
          // L 16 7.36
          lineTo(x = 16.0f, y = 7.36f)
          // l -1.1 -1.12
          lineToRelative(dx = -1.1f, dy = -1.12f)
          // a 7.5 7.5 0 0 0 -10.69 0
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -10.69f,
            dy1 = 0.0f,
          )
          // a 7.73 7.73 0 0 0 0 10.82
          arcToRelative(
            a = 7.73f,
            b = 7.73f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.82f,
          )
          // m 22.15 -1.41
          moveToRelative(dx = 22.15f, dy = -1.41f)
          // L 16 26.13
          lineTo(x = 16.0f, y = 26.13f)
          // v -15.9
          verticalLineToRelative(dy = -15.9f)
          // l 2.54 -2.57
          lineToRelative(dx = 2.54f, dy = -2.57f)
          // a 5.5 5.5 0 0 1 7.82 0
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.82f,
            dy1 = 0.0f,
          )
          // a 5.7 5.7 0 0 1 0 7.99
          arcToRelative(
            a = 5.7f,
            b = 5.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 7.99f,
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
      .also { _favoriteHalf = it }
  }

@Suppress("ObjectPropertyName")
private var _favoriteHalf: ImageVector? = null
