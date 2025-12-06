// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RowInsert: ImageVector
  get() {
    val current = _rowInsert
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RowInsert",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 12 H10 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h18 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 M10 4 v6 h18 V4Z m18 26 H10 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h18 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-18 -8 v6 h18 v-6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // M 10 4
          moveTo(x = 10.0f, y = 4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 18 26
          moveToRelative(dx = 18.0f, dy = 26.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m -18 -8
          moveToRelative(dx = -18.0f, dy = -8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
        }
        // <polygon points="9.0 16.0 3.414 10.414 2.0 11.828 6.172 16.0 2.0 20.172 3.414 21.586 9.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 16
          moveTo(x = 9.0f, y = 16.0f)
          // L 3.414 10.414
          lineTo(x = 3.414f, y = 10.414f)
          // L 2 11.828
          lineTo(x = 2.0f, y = 11.828f)
          // L 6.172 16
          lineTo(x = 6.172f, y = 16.0f)
          // L 2 20.172
          lineTo(x = 2.0f, y = 20.172f)
          // L 3.414 21.586
          lineTo(x = 3.414f, y = 21.586f)
          // L 9 16z
          lineTo(x = 9.0f, y = 16.0f)
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
      .also { _rowInsert = it }
  }

@Suppress("ObjectPropertyName")
private var _rowInsert: ImageVector? = null
