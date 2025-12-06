// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VirtualColumn: ImageVector
  get() {
    val current = _virtualColumn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VirtualColumn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 11.0 26.414 12.414 23.828 15.0 30.0 15.0 30.0 17.0 23.828 17.0 26.414 19.586 25.0 21.0 20.0 16.0 25.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // L 26.414 12.414
          lineTo(x = 26.414f, y = 12.414f)
          // L 23.828 15
          lineTo(x = 23.828f, y = 15.0f)
          // L 30 15
          lineTo(x = 30.0f, y = 15.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 23.828 17
          lineTo(x = 23.828f, y = 17.0f)
          // L 26.414 19.586
          lineTo(x = 26.414f, y = 19.586f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 20 16
          lineTo(x = 20.0f, y = 16.0f)
          // L 25 11z
          lineTo(x = 25.0f, y = 11.0f)
          close()
        }
        // M30 28 H20 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h10 v2 H20 v20 h10Z m-18 0 H2 v-2 h10 V6 H2 V4 h10 a2 2 0 0 1 2 2 v20 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 28
          moveTo(x = 30.0f, y = 28.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 20
          horizontalLineTo(x = 20.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // m -18 0
          moveToRelative(dx = -18.0f, dy = 0.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
        }
        // <polygon points="7.0 11.0 5.586 12.414 8.172 15.0 2.0 15.0 2.0 17.0 8.172 17.0 5.586 19.586 7.0 21.0 12.0 16.0 7.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
          // L 5.586 12.414
          lineTo(x = 5.586f, y = 12.414f)
          // L 8.172 15
          lineTo(x = 8.172f, y = 15.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 8.172 17
          lineTo(x = 8.172f, y = 17.0f)
          // L 5.586 19.586
          lineTo(x = 5.586f, y = 19.586f)
          // L 7 21
          lineTo(x = 7.0f, y = 21.0f)
          // L 12 16
          lineTo(x = 12.0f, y = 16.0f)
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
      .also { _virtualColumn = it }
  }

@Suppress("ObjectPropertyName")
private var _virtualColumn: ImageVector? = null
