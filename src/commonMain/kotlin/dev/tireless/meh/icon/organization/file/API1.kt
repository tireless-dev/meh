// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val API1: ImageVector
  get() {
    val current = _aPI1
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.API1",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 9 H4 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V11 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 11
          verticalLineTo(y = 11.0f)
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
          // m -4 7
          moveToRelative(dx = -4.0f, dy = 7.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
          close()
        }
        // <polygon points="22.0 11.0 25.0 11.0 25.0 21.0 22.0 21.0 22.0 23.0 30.0 23.0 30.0 21.0 27.0 21.0 27.0 11.0 30.0 11.0 30.0 9.0 22.0 9.0 22.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 11
          moveTo(x = 22.0f, y = 11.0f)
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 22 21
          lineTo(x = 22.0f, y = 21.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 30 21
          lineTo(x = 30.0f, y = 21.0f)
          // L 27 21
          lineTo(x = 27.0f, y = 21.0f)
          // L 27 11
          lineTo(x = 27.0f, y = 11.0f)
          // L 30 11
          lineTo(x = 30.0f, y = 11.0f)
          // L 30 9
          lineTo(x = 30.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 11z
          lineTo(x = 22.0f, y = 11.0f)
          close()
        }
        // M14 23 h-2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-4Z m0 -7 h4 v-5 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 23
          moveTo(x = 14.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
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
      .also { _aPI1 = it }
  }

@Suppress("ObjectPropertyName")
private var _aPI1: ImageVector? = null
