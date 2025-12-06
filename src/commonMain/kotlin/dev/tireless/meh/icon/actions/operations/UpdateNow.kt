// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UpdateNow: ImageVector
  get() {
    val current = _updateNow
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UpdateNow",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="27.0 25.586 25.0 23.586 25.0 21.0 23.0 21.0 23.0 24.414 25.586 27.0 27.0 25.586" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 25.586
          moveTo(x = 27.0f, y = 25.586f)
          // L 25 23.586
          lineTo(x = 25.0f, y = 23.586f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 23 21
          lineTo(x = 23.0f, y = 21.0f)
          // L 23 24.414
          lineTo(x = 23.0f, y = 24.414f)
          // L 25.586 27
          lineTo(x = 25.586f, y = 27.0f)
          // L 27 25.586z
          lineTo(x = 27.0f, y = 25.586f)
          close()
        }
        // M24 31 a7 7 0 1 1 7 -7 7 7 0 0 1 -7 7 m0 -12 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5 m-8 9 A12 12 0 0 1 4 16 H2 a14 14 0 0 0 14 14Z M12 8 H7.08 A11.98 11.98 0 0 1 28 16 h2 A13.98 13.98 0 0 0 6 6.23 V2 H4 v8 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 31
          moveTo(x = 24.0f, y = 31.0f)
          // a 7 7 0 1 1 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // a 7 7 0 0 1 -7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 7.0f,
          )
          // m 0 -12
          moveToRelative(dx = 0.0f, dy = -12.0f)
          // a 5 5 0 1 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // m -8 9
          moveToRelative(dx = -8.0f, dy = 9.0f)
          // A 12 12 0 0 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // a 14 14 0 0 0 14 14z
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          close()
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
          // H 7.08
          horizontalLineTo(x = 7.08f)
          // A 11.98 11.98 0 0 1 28 16
          arcTo(
            horizontalEllipseRadius = 11.98f,
            verticalEllipseRadius = 11.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 13.98 13.98 0 0 0 6 6.23
          arcTo(
            horizontalEllipseRadius = 13.98f,
            verticalEllipseRadius = 13.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 6.23f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _updateNow = it }
  }

@Suppress("ObjectPropertyName")
private var _updateNow: ImageVector? = null
