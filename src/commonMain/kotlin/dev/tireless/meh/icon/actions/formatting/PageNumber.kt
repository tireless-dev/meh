// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PageNumber: ImageVector
  get() {
    val current = _pageNumber
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PageNumber",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 26.0 16.0 26.0 16.0 20.0 20.0 20.0 20.0 18.0 16.0 18.0 16.0 16.0 22.0 16.0 22.0 22.0 18.0 22.0 18.0 24.0 22.0 24.0 22.0 26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 26
          moveTo(x = 22.0f, y = 26.0f)
          // L 16 26
          lineTo(x = 16.0f, y = 26.0f)
          // L 16 20
          lineTo(x = 16.0f, y = 20.0f)
          // L 20 20
          lineTo(x = 20.0f, y = 20.0f)
          // L 20 18
          lineTo(x = 20.0f, y = 18.0f)
          // L 16 18
          lineTo(x = 16.0f, y = 18.0f)
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // L 22 16
          lineTo(x = 22.0f, y = 16.0f)
          // L 22 22
          lineTo(x = 22.0f, y = 22.0f)
          // L 18 22
          lineTo(x = 18.0f, y = 22.0f)
          // L 18 24
          lineTo(x = 18.0f, y = 24.0f)
          // L 22 24
          lineTo(x = 22.0f, y = 24.0f)
          // L 22 26z
          lineTo(x = 22.0f, y = 26.0f)
          close()
        }
        // m25.7 9.3 -7 -7 A1 1 0 0 0 18 2 H8 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V10 a1 1 0 0 0 -.3 -.7 M18 4.4 l5.6 5.6 H18Z M24 28 H8 V4 h8 v6 a2 2 0 0 0 2 2 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.7 9.3
          moveTo(x = 25.7f, y = 9.3f)
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 18 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.0f,
            y1 = 2.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
          // a 1 1 0 0 0 -0.3 -0.7
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -0.7f,
          )
          // M 18 4.4
          moveTo(x = 18.0f, y = 4.4f)
          // l 5.6 5.6
          lineToRelative(dx = 5.6f, dy = 5.6f)
          // H 18z
          horizontalLineTo(x = 18.0f)
          close()
          // M 24 28
          moveTo(x = 24.0f, y = 28.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _pageNumber = it }
  }

@Suppress("ObjectPropertyName")
private var _pageNumber: ImageVector? = null
