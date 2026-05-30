// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataReference: ImageVector
  get() {
    val current = _dataReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 12.0 25.0 3.0 23.0 3.0 23.0 5.0 20.0 5.0 20.0 7.0 23.0 7.0 23.0 12.0 20.0 12.0 20.0 14.0 28.0 14.0 28.0 12.0 25.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 12
          moveTo(x = 25.0f, y = 12.0f)
          // L 25 3
          lineTo(x = 25.0f, y = 3.0f)
          // L 23 3
          lineTo(x = 23.0f, y = 3.0f)
          // L 23 5
          lineTo(x = 23.0f, y = 5.0f)
          // L 20 5
          lineTo(x = 20.0f, y = 5.0f)
          // L 20 7
          lineTo(x = 20.0f, y = 7.0f)
          // L 23 7
          lineTo(x = 23.0f, y = 7.0f)
          // L 23 12
          lineTo(x = 23.0f, y = 12.0f)
          // L 20 12
          lineTo(x = 20.0f, y = 12.0f)
          // L 20 14
          lineTo(x = 20.0f, y = 14.0f)
          // L 28 14
          lineTo(x = 28.0f, y = 14.0f)
          // L 28 12
          lineTo(x = 28.0f, y = 12.0f)
          // L 25 12z
          lineTo(x = 25.0f, y = 12.0f)
          close()
        }
        // M8.5 5 a3.5 3.5 0 1 1 0 7 3.5 3.5 0 0 1 0 -7 m0 -2 a5.5 5.5 0 1 0 0 11 5.5 5.5 0 0 0 0 -11 m15 17 a3.5 3.5 0 1 1 0 7 3.5 3.5 0 0 1 0 -7 m0 -2 a5.5 5.5 0 1 0 0 11 5.5 5.5 0 0 0 0 -11
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.5 5
          moveTo(x = 8.5f, y = 5.0f)
          // a 3.5 3.5 0 1 1 0 7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 7.0f,
          )
          // a 3.5 3.5 0 0 1 0 -7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -7.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 5.5 5.5 0 1 0 0 11
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 11.0f,
          )
          // a 5.5 5.5 0 0 0 0 -11
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -11.0f,
          )
          // m 15 17
          moveToRelative(dx = 15.0f, dy = 17.0f)
          // a 3.5 3.5 0 1 1 0 7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 7.0f,
          )
          // a 3.5 3.5 0 0 1 0 -7
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -7.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 5.5 5.5 0 1 0 0 11
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 11.0f,
          )
          // a 5.5 5.5 0 0 0 0 -11
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -11.0f,
          )
        }
        // <polygon points="6.0 19.0 6.0 21.0 9.5859 21.0 4.0 26.5859 5.4141 28.0 11.0 22.4141 11.0 26.0 13.0 26.0 13.0 19.0 6.0 19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 19
          moveTo(x = 6.0f, y = 19.0f)
          // L 6 21
          lineTo(x = 6.0f, y = 21.0f)
          // L 9.5859 21
          lineTo(x = 9.5859f, y = 21.0f)
          // L 4 26.5859
          lineTo(x = 4.0f, y = 26.5859f)
          // L 5.4141 28
          lineTo(x = 5.4141f, y = 28.0f)
          // L 11 22.4141
          lineTo(x = 11.0f, y = 22.4141f)
          // L 11 26
          lineTo(x = 11.0f, y = 26.0f)
          // L 13 26
          lineTo(x = 13.0f, y = 26.0f)
          // L 13 19
          lineTo(x = 13.0f, y = 19.0f)
          // L 6 19z
          lineTo(x = 6.0f, y = 19.0f)
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
      .also { _dataReference = it }
  }

@Suppress("ObjectPropertyName")
private var _dataReference: ImageVector? = null
