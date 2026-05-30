// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hourglass: ImageVector
  get() {
    val current = _hourglass
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Hourglass",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="2" x="15.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 19
          moveTo(x = 15.0f, y = 19.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="15.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 23
          moveTo(x = 15.0f, y = 23.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M23 11.67 V4 h3 V2 H6 v2 h3 v7.67 a2 2 0 0 0 .4 1.2 L11.75 16 9.4 19.13 a2 2 0 0 0 -.4 1.2 V28 H6 v2 h20 v-2 h-3 v-7.67 a2 2 0 0 0 -.4 -1.2 L20.25 16 l2.35 -3.13 a2 2 0 0 0 .4 -1.2 M21 4 v7 H11 V4Z m0 16.33 V28 H11 v-7.67 L14.25 16 12 13 h8 l-2.25 3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 11.67
          moveTo(x = 23.0f, y = 11.67f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 7.67
          verticalLineToRelative(dy = 7.67f)
          // a 2 2 0 0 0 0.4 1.2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = 1.2f,
          )
          // L 11.75 16
          lineTo(x = 11.75f, y = 16.0f)
          // L 9.4 19.13
          lineTo(x = 9.4f, y = 19.13f)
          // a 2 2 0 0 0 -0.4 1.2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.4f,
            dy1 = 1.2f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -7.67
          verticalLineToRelative(dy = -7.67f)
          // a 2 2 0 0 0 -0.4 -1.2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.4f,
            dy1 = -1.2f,
          )
          // L 20.25 16
          lineTo(x = 20.25f, y = 16.0f)
          // l 2.35 -3.13
          lineToRelative(dx = 2.35f, dy = -3.13f)
          // a 2 2 0 0 0 0.4 -1.2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = -1.2f,
          )
          // M 21 4
          moveTo(x = 21.0f, y = 4.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 0 16.33
          moveToRelative(dx = 0.0f, dy = 16.33f)
          // V 28
          verticalLineTo(y = 28.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // v -7.67
          verticalLineToRelative(dy = -7.67f)
          // L 14.25 16
          lineTo(x = 14.25f, y = 16.0f)
          // L 12 13
          lineTo(x = 12.0f, y = 13.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // l -2.25 3z
          lineToRelative(dx = -2.25f, dy = 3.0f)
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
      .also { _hourglass = it }
  }

@Suppress("ObjectPropertyName")
private var _hourglass: ImageVector? = null
