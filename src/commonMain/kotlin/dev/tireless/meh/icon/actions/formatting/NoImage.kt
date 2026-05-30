// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoImage: ImageVector
  get() {
    val current = _noImage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.NoImage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 3.41 28.59 2 2 28.59 3.41 30 l2 -2 H26 a2 2 0 0 0 2 -2 V5.41Z M26 26 H7.41 l7.8 -7.8 2.38 2.39 a2 2 0 0 0 2.82 0 L22 19 l4 4Z m0 -5.83 -2.59 -2.59 a2 2 0 0 0 -2.82 0 L19 19.17 l-2.38 -2.38 L26 7.41Z M6 22 v-3 l5 -5 1.37 1.38 1.42 -1.42 -1.38 -1.37 a2 2 0 0 0 -2.82 0 L6 16.17 V6 h16 V4 H6 a2 2 0 0 0 -2 2 v16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 3.41
          moveTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 5.41z
          verticalLineTo(y = 5.41f)
          close()
          // M 26 26
          moveTo(x = 26.0f, y = 26.0f)
          // H 7.41
          horizontalLineTo(x = 7.41f)
          // l 7.8 -7.8
          lineToRelative(dx = 7.8f, dy = -7.8f)
          // l 2.38 2.39
          lineToRelative(dx = 2.38f, dy = 2.39f)
          // a 2 2 0 0 0 2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = 0.0f,
          )
          // L 22 19
          lineTo(x = 22.0f, y = 19.0f)
          // l 4 4z
          lineToRelative(dx = 4.0f, dy = 4.0f)
          close()
          // m 0 -5.83
          moveToRelative(dx = 0.0f, dy = -5.83f)
          // l -2.59 -2.59
          lineToRelative(dx = -2.59f, dy = -2.59f)
          // a 2 2 0 0 0 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // L 19 19.17
          lineTo(x = 19.0f, y = 19.17f)
          // l -2.38 -2.38
          lineToRelative(dx = -2.38f, dy = -2.38f)
          // L 26 7.41z
          lineTo(x = 26.0f, y = 7.41f)
          close()
          // M 6 22
          moveTo(x = 6.0f, y = 22.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l 1.37 1.38
          lineToRelative(dx = 1.37f, dy = 1.38f)
          // l 1.42 -1.42
          lineToRelative(dx = 1.42f, dy = -1.42f)
          // l -1.38 -1.37
          lineToRelative(dx = -1.38f, dy = -1.37f)
          // a 2 2 0 0 0 -2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          // L 6 16.17
          lineTo(x = 6.0f, y = 16.17f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 16z
          verticalLineToRelative(dy = 16.0f)
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
      .also { _noImage = it }
  }

@Suppress("ObjectPropertyName")
private var _noImage: ImageVector? = null
