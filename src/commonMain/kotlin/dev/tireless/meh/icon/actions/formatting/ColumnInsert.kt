// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ColumnInsert: ImageVector
  get() {
    val current = _columnInsert
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ColumnInsert",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 30 h-6 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v18 a2 2 0 0 1 -2 2 m-6 -20 v18 h6 V10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // m -6 -20
          moveToRelative(dx = -6.0f, dy = -20.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 10z
          verticalLineTo(y = 10.0f)
          close()
        }
        // <polygon points="16.0 9.0 21.586 3.414 20.172 2.0 16.0 6.172 11.828 2.0 10.414 3.414 16.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 9
          moveTo(x = 16.0f, y = 9.0f)
          // L 21.586 3.414
          lineTo(x = 21.586f, y = 3.414f)
          // L 20.172 2
          lineTo(x = 20.172f, y = 2.0f)
          // L 16 6.172
          lineTo(x = 16.0f, y = 6.172f)
          // L 11.828 2
          lineTo(x = 11.828f, y = 2.0f)
          // L 10.414 3.414
          lineTo(x = 10.414f, y = 3.414f)
          // L 16 9z
          lineTo(x = 16.0f, y = 9.0f)
          close()
        }
        // M10 30 H4 a2 2 0 0 1 -2 -2 V10 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v18 a2 2 0 0 1 -2 2 M4 10 v18 h6 V10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 30
          moveTo(x = 10.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 10z
          verticalLineTo(y = 10.0f)
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
      .also { _columnInsert = it }
  }

@Suppress("ObjectPropertyName")
private var _columnInsert: ImageVector? = null
