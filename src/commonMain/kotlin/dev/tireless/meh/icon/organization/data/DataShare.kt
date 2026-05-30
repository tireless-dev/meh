// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataShare: ImageVector
  get() {
    val current = _dataShare
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataShare",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M5 25 v-9.17 L1.41 19.4 0 18 l6 -6 6 6 -1.41 1.41 L7 15.83 V25 h12 v2 H7 a2 2 0 0 1 -2 -2 m19 -3 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 m4 6 v-4 h-4 v4Z M27 6 v9.17 l3.59 -3.58 L32 13 l-6 6 -6 -6 1.41 -1.41 L25 15.17 V6 H13 V4 h12 a2 2 0 0 1 2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 25
          moveTo(x = 5.0f, y = 25.0f)
          // v -9.17
          verticalLineToRelative(dy = -9.17f)
          // L 1.41 19.4
          lineTo(x = 1.41f, y = 19.4f)
          // L 0 18
          lineTo(x = 0.0f, y = 18.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l 6 6
          lineToRelative(dx = 6.0f, dy = 6.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 7 15.83
          lineTo(x = 7.0f, y = 15.83f)
          // V 25
          verticalLineTo(y = 25.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // m 19 -3
          moveToRelative(dx = 19.0f, dy = -3.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // m 4 6
          moveToRelative(dx = 4.0f, dy = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
          // M 27 6
          moveTo(x = 27.0f, y = 6.0f)
          // v 9.17
          verticalLineToRelative(dy = 9.17f)
          // l 3.59 -3.58
          lineToRelative(dx = 3.59f, dy = -3.58f)
          // L 32 13
          lineTo(x = 32.0f, y = 13.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 25 15.17
          lineTo(x = 25.0f, y = 15.17f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 13
          horizontalLineTo(x = 13.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
        }
        // <rect width="6" height="2" x="2.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 6
          moveTo(x = 2.0f, y = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="8" height="2" x="2.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 2
          moveTo(x = 2.0f, y = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
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
      .also { _dataShare = it }
  }

@Suppress("ObjectPropertyName")
private var _dataShare: ImageVector? = null
