// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MP4: ImageVector
  get() {
    val current = _mP4
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MP4",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 10 v8z m1 -1 h-2 v8 h-3 V9 h-2 v10 h5 v4 h2 v-4 h1 v-2 h-1z M14 23 h-2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-4Z m0 -7 h4 v-5 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 10
          moveTo(x = 28.0f, y = 10.0f)
          // v 8z
          verticalLineToRelative(dy = 8.0f)
          close()
          // m 1 -1
          moveToRelative(dx = 1.0f, dy = -1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -1z
          horizontalLineToRelative(dx = -1.0f)
          close()
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
        // <polygon points="8.0 9.0 6.49 14.0 6.0 15.98 5.54 14.0 4.0 9.0 2.0 9.0 2.0 23.0 4.0 23.0 4.0 15.0 3.84 13.0 4.42 15.0 6.0 19.63 7.58 15.0 8.16 13.0 8.0 15.0 8.0 23.0 10.0 23.0 10.0 9.0 8.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // L 6.49 14
          lineTo(x = 6.49f, y = 14.0f)
          // L 6 15.98
          lineTo(x = 6.0f, y = 15.98f)
          // L 5.54 14
          lineTo(x = 5.54f, y = 14.0f)
          // L 4 9
          lineTo(x = 4.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 2 23
          lineTo(x = 2.0f, y = 23.0f)
          // L 4 23
          lineTo(x = 4.0f, y = 23.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 3.84 13
          lineTo(x = 3.84f, y = 13.0f)
          // L 4.42 15
          lineTo(x = 4.42f, y = 15.0f)
          // L 6 19.63
          lineTo(x = 6.0f, y = 19.63f)
          // L 7.58 15
          lineTo(x = 7.58f, y = 15.0f)
          // L 8.16 13
          lineTo(x = 8.16f, y = 13.0f)
          // L 8 15
          lineTo(x = 8.0f, y = 15.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 8 9z
          lineTo(x = 8.0f, y = 9.0f)
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
      .also { _mP4 = it }
  }

@Suppress("ObjectPropertyName")
private var _mP4: ImageVector? = null
