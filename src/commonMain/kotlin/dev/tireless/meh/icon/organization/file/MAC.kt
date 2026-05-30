// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MAC: ImageVector
  get() {
    val current = _mAC
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MAC",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 23 h-6 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h6 v2 h-6 v10 h6z M18 9 h-4 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V11 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 23
          moveTo(x = 30.0f, y = 23.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // V 11
          verticalLineTo(y = 11.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // M 18 9
          moveTo(x = 18.0f, y = 9.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
        // <polygon points="8.0 9.0 6.4849 14.0 6.0 15.977 5.535 14.0 4.0 9.0 2.0 9.0 2.0 23.0 4.0 23.0 4.0 15.0 3.8415 13.0039 4.4212 15.0 6.0 19.6263 7.5788 15.0 8.1588 13.0 8.0 15.0 8.0 23.0 10.0 23.0 10.0 9.0 8.0 9.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // L 6.4849 14
          lineTo(x = 6.4849f, y = 14.0f)
          // L 6 15.977
          lineTo(x = 6.0f, y = 15.977f)
          // L 5.535 14
          lineTo(x = 5.535f, y = 14.0f)
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
          // L 3.8415 13.0039
          lineTo(x = 3.8415f, y = 13.0039f)
          // L 4.4212 15
          lineTo(x = 4.4212f, y = 15.0f)
          // L 6 19.6263
          lineTo(x = 6.0f, y = 19.6263f)
          // L 7.5788 15
          lineTo(x = 7.5788f, y = 15.0f)
          // L 8.1588 13
          lineTo(x = 8.1588f, y = 13.0f)
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
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _mAC = it }
  }

@Suppress("ObjectPropertyName")
private var _mAC: ImageVector? = null
