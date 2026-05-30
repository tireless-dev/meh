// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smell: ImageVector
  get() {
    val current = _smell
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Smell",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 15 v-5 h-2 v7 h2 a3 3 0 0 1 0 6 h-1 v-2 h-2 v2 a3 3 0 0 1 -6 0 v-2 h-2 v2 h-1 a3 3 0 0 1 0 -6 h2 V9 a3 3 0 0 1 3 -3 h1 V4 h-1 a5 5 0 0 0 -5 5 v6 a5 5 0 0 0 0 10 h1.42 a5 5 0 0 0 9.16 0 H22 a5 5 0 0 0 0 -10
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 15
          moveTo(x = 22.0f, y = 15.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 3 3 0 0 1 -6 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = 0.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 3 3 0 0 1 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 1.42
          horizontalLineToRelative(dx = 1.42f)
          // a 5 5 0 0 0 9.16 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 9.16f,
            dy1 = 0.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
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
      .also { _smell = it }
  }

@Suppress("ObjectPropertyName")
private var _smell: ImageVector? = null
