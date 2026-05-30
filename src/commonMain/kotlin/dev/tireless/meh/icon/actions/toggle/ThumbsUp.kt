// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ThumbsUp: ImageVector
  get() {
    val current = _thumbsUp
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ThumbsUp",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 12 h-6 V6 a3 3 0 0 0 -3 -3 h-2.13 a2 2 0 0 0 -1.98 1.72 l-.85 5.91 L8.46 16 H2 v14 h21 a7 7 0 0 0 7 -7 v-7 a4 4 0 0 0 -4 -4 M8 28 H4 V18 h4Z m20 -5 a5 5 0 0 1 -5 5 H10 V17.3 l3.96 -5.93 .9 -6.37 H17 a1 1 0 0 1 1 1 v8 h8 a2 2 0 0 1 2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 12
          moveTo(x = 26.0f, y = 12.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // h -2.13
          horizontalLineToRelative(dx = -2.13f)
          // a 2 2 0 0 0 -1.98 1.72
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.98f,
            dy1 = 1.72f,
          )
          // l -0.85 5.91
          lineToRelative(dx = -0.85f, dy = 5.91f)
          // L 8.46 16
          lineTo(x = 8.46f, y = 16.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 21
          horizontalLineToRelative(dx = 21.0f)
          // a 7 7 0 0 0 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // M 8 28
          moveTo(x = 8.0f, y = 28.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 20 -5
          moveToRelative(dx = 20.0f, dy = -5.0f)
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // H 10
          horizontalLineTo(x = 10.0f)
          // V 17.3
          verticalLineTo(y = 17.3f)
          // l 3.96 -5.93
          lineToRelative(dx = 3.96f, dy = -5.93f)
          // l 0.9 -6.37
          lineToRelative(dx = 0.9f, dy = -6.37f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
      .also { _thumbsUp = it }
  }

@Suppress("ObjectPropertyName")
private var _thumbsUp: ImageVector? = null
