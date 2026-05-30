// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Headphones: ImageVector
  get() {
    val current = _headphones
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Headphones",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25 16 v-1 a9 9 0 0 0 -18 0 v1 a5 5 0 0 0 0 10 h2 V15 a7 7 0 0 1 14 0 v11 h2 a5 5 0 0 0 0 -10 M4 21 a3 3 0 0 1 3 -3 v6 a3 3 0 0 1 -3 -3 m21 3 v-6 a3 3 0 0 1 0 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 16
          moveTo(x = 25.0f, y = 16.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 9 9 0 0 0 -18 0
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -18.0f,
            dy1 = 0.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 5 5 0 0 0 0 10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 10.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 15
          verticalLineTo(y = 15.0f)
          // a 7 7 0 0 1 14 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = 0.0f,
          )
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 5 5 0 0 0 0 -10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -10.0f,
          )
          // M 4 21
          moveTo(x = 4.0f, y = 21.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 3 3 0 0 1 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // m 21 3
          moveToRelative(dx = 21.0f, dy = 3.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 3 3 0 0 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
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
      .also { _headphones = it }
  }

@Suppress("ObjectPropertyName")
private var _headphones: ImageVector? = null
