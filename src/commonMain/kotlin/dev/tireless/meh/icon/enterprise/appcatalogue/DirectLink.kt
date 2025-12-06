// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectLink: ImageVector
  get() {
    val current = _directLink
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectLink",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m20.41 14.58 -8 -8 a2 2 0 0 0 -2.83 0 l-8 8 a2 2 0 0 0 0 2.84 l3.3 3.29 L3 22.59 4.41 24 l1.88 -1.88 3.3 3.3 a2 2 0 0 0 2.83 0 l2.25 -2.26 -1.41 -1.42 L11 24 l-8 -8 8 -8 8 8 -1.5 1.5 1.41 1.41 1.5 -1.5 a2 2 0 0 0 0 -2.83
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.41 14.58
          moveTo(x = 20.41f, y = 14.58f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // l -8 8
          lineToRelative(dx = -8.0f, dy = 8.0f)
          // a 2 2 0 0 0 0 2.84
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.84f,
          )
          // l 3.3 3.29
          lineToRelative(dx = 3.3f, dy = 3.29f)
          // L 3 22.59
          lineTo(x = 3.0f, y = 22.59f)
          // L 4.41 24
          lineTo(x = 4.41f, y = 24.0f)
          // l 1.88 -1.88
          lineToRelative(dx = 1.88f, dy = -1.88f)
          // l 3.3 3.3
          lineToRelative(dx = 3.3f, dy = 3.3f)
          // a 2 2 0 0 0 2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = 0.0f,
          )
          // l 2.25 -2.26
          lineToRelative(dx = 2.25f, dy = -2.26f)
          // l -1.41 -1.42
          lineToRelative(dx = -1.41f, dy = -1.42f)
          // L 11 24
          lineTo(x = 11.0f, y = 24.0f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // a 2 2 0 0 0 0 -2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.83f,
          )
        }
        // m30.41 14.58 -3.29 -3.29 L29 9.41 27.59 8 25.7 9.88 l-3.3 -3.3 a2 2 0 0 0 -2.83 0 l-2.25 2.26 1.41 1.42 L21 8 l8 8 -8 8 -8 -8 1.5 -1.5 -1.41 -1.41 -1.5 1.5 a2 2 0 0 0 0 2.83 l8 8 a2 2 0 0 0 2.83 0 l8 -8 a2 2 0 0 0 0 -2.84
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.41 14.58
          moveTo(x = 30.41f, y = 14.58f)
          // l -3.29 -3.29
          lineToRelative(dx = -3.29f, dy = -3.29f)
          // L 29 9.41
          lineTo(x = 29.0f, y = 9.41f)
          // L 27.59 8
          lineTo(x = 27.59f, y = 8.0f)
          // L 25.7 9.88
          lineTo(x = 25.7f, y = 9.88f)
          // l -3.3 -3.3
          lineToRelative(dx = -3.3f, dy = -3.3f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // l -2.25 2.26
          lineToRelative(dx = -2.25f, dy = 2.26f)
          // l 1.41 1.42
          lineToRelative(dx = 1.41f, dy = 1.42f)
          // L 21 8
          lineTo(x = 21.0f, y = 8.0f)
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // l -8 8
          lineToRelative(dx = -8.0f, dy = 8.0f)
          // l -8 -8
          lineToRelative(dx = -8.0f, dy = -8.0f)
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // a 2 2 0 0 0 0 2.83
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.83f,
          )
          // l 8 8
          lineToRelative(dx = 8.0f, dy = 8.0f)
          // a 2 2 0 0 0 2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = 0.0f,
          )
          // l 8 -8
          lineToRelative(dx = 8.0f, dy = -8.0f)
          // a 2 2 0 0 0 0 -2.84
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.84f,
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
      .also { _directLink = it }
  }

@Suppress("ObjectPropertyName")
private var _directLink: ImageVector? = null
