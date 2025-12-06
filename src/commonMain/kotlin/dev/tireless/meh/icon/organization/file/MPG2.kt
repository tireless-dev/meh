// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MPG2: ImageVector
  get() {
    val current = _mPG2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MPG2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M32 21 h-6 v-4 a2 2 0 0 1 2 -2 h2 v-2 h-4 v-2 h4 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 h-2 v2 h4Z m-8 0 h-4 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h4 v2 h-4 v6 h2 v-2 h-1 v-2 h3Z M14 11 H9 v10 h2 v-3 h3 a2 2 0 0 0 2 -2 v-3 a2 2 0 0 0 -2 -2 m-3 5 v-3 h3 v3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 32 21
          moveTo(x = 32.0f, y = 21.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m -8 0
          moveToRelative(dx = -8.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3z
          horizontalLineToRelative(dx = 3.0f)
          close()
          // M 14 11
          moveTo(x = 14.0f, y = 11.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // m -3 5
          moveToRelative(dx = -3.0f, dy = 5.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3z
          verticalLineToRelative(dy = 3.0f)
          close()
        }
        // <polygon points="7.0 11.0 5.0 11.0 3.5 15.0 2.0 11.0 0.0 11.0 0.0 21.0 2.0 21.0 2.0 14.0 3.5 18.0 5.0 14.0 5.0 21.0 7.0 21.0 7.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
          // L 5 11
          lineTo(x = 5.0f, y = 11.0f)
          // L 3.5 15
          lineTo(x = 3.5f, y = 15.0f)
          // L 2 11
          lineTo(x = 2.0f, y = 11.0f)
          // L 0 11
          lineTo(x = 0.0f, y = 11.0f)
          // L 0 21
          lineTo(x = 0.0f, y = 21.0f)
          // L 2 21
          lineTo(x = 2.0f, y = 21.0f)
          // L 2 14
          lineTo(x = 2.0f, y = 14.0f)
          // L 3.5 18
          lineTo(x = 3.5f, y = 18.0f)
          // L 5 14
          lineTo(x = 5.0f, y = 14.0f)
          // L 5 21
          lineTo(x = 5.0f, y = 21.0f)
          // L 7 21
          lineTo(x = 7.0f, y = 21.0f)
          // L 7 11z
          lineTo(x = 7.0f, y = 11.0f)
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
      .also { _mPG2 = it }
  }

@Suppress("ObjectPropertyName")
private var _mPG2: ImageVector? = null
