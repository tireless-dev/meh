// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RowExpand: ImageVector
  get() {
    val current = _rowExpand
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RowExpand",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 18.0 15.0 18.0 15.0 24.172 12.414 21.586 11.0 23.0 16.0 28.0 21.0 23.0 19.586 21.586 17.0 24.172 17.0 18.0 28.0 18.0 28.0 16.0 4.0 16.0 4.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 18
          moveTo(x = 4.0f, y = 18.0f)
          // L 15 18
          lineTo(x = 15.0f, y = 18.0f)
          // L 15 24.172
          lineTo(x = 15.0f, y = 24.172f)
          // L 12.414 21.586
          lineTo(x = 12.414f, y = 21.586f)
          // L 11 23
          lineTo(x = 11.0f, y = 23.0f)
          // L 16 28
          lineTo(x = 16.0f, y = 28.0f)
          // L 21 23
          lineTo(x = 21.0f, y = 23.0f)
          // L 19.586 21.586
          lineTo(x = 19.586f, y = 21.586f)
          // L 17 24.172
          lineTo(x = 17.0f, y = 24.172f)
          // L 17 18
          lineTo(x = 17.0f, y = 18.0f)
          // L 28 18
          lineTo(x = 28.0f, y = 18.0f)
          // L 28 16
          lineTo(x = 28.0f, y = 16.0f)
          // L 4 16
          lineTo(x = 4.0f, y = 16.0f)
          // L 4 18z
          lineTo(x = 4.0f, y = 18.0f)
          close()
        }
        // M26 4 H6 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m0 6 H6 V6 h20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 20z
          horizontalLineToRelative(dx = 20.0f)
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
      .also { _rowExpand = it }
  }

@Suppress("ObjectPropertyName")
private var _rowExpand: ImageVector? = null
