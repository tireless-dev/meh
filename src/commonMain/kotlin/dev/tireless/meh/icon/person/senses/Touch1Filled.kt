// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.senses

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Touch1Filled: ImageVector
  get() {
    val current = _touch1Filled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Touch1Filled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13 2 a6 6 0 0 0 -6 6 h2 a4 4 0 0 1 8 0 h2 a6 6 0 0 0 -6 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 2
          moveTo(x = 13.0f, y = 2.0f)
          // a 6 6 0 0 0 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 4 4 0 0 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
        }
        // M21 30 h-4.44 a4 4 0 0 1 -2.7 -1.06 l-9.2 -8.46 a2 2 0 0 1 .11 -3.06 2.1 2.1 0 0 1 2.66 .17 L11 20.86 V8 a2 2 0 0 1 4 0 v7 a2 2 0 0 1 4 0 v1 a2 2 0 0 1 4 0 v1 a2 2 0 0 1 4 0 v7 a6 6 0 0 1 -6 6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // h -4.44
          horizontalLineToRelative(dx = -4.44f)
          // a 4 4 0 0 1 -2.7 -1.06
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.7f,
            dy1 = -1.06f,
          )
          // l -9.2 -8.46
          lineToRelative(dx = -9.2f, dy = -8.46f)
          // a 2 2 0 0 1 0.11 -3.06
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.11f,
            dy1 = -3.06f,
          )
          // a 2.1 2.1 0 0 1 2.66 0.17
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.66f,
            dy1 = 0.17f,
          )
          // L 11 20.86
          lineTo(x = 11.0f, y = 20.86f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 2 2 0 0 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 6 6 0 0 1 -6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
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
      .also { _touch1Filled = it }
  }

@Suppress("ObjectPropertyName")
private var _touch1Filled: ImageVector? = null
