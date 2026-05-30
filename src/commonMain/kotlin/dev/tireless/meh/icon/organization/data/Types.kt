// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Types: ImageVector
  get() {
    val current = _types
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Types",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 16.0 22.0 24.0 20.586 22.586 27.172 16.0 20.586 9.414 22.0 8.0 30.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // L 22 24
          lineTo(x = 22.0f, y = 24.0f)
          // L 20.586 22.586
          lineTo(x = 20.586f, y = 22.586f)
          // L 27.172 16
          lineTo(x = 27.172f, y = 16.0f)
          // L 20.586 9.414
          lineTo(x = 20.586f, y = 9.414f)
          // L 22 8
          lineTo(x = 22.0f, y = 8.0f)
          // L 30 16z
          lineTo(x = 30.0f, y = 16.0f)
          close()
        }
        // M16 22 a1 1 0 0 1 -.7 -.3 l-5 -5 a1 1 0 0 1 0 -1.4 l5 -5 a1 1 0 0 1 1.4 0 l5 5 a1 1 0 0 1 0 1.4 l-5 5 A1 1 0 0 1 16 22 m-3.59 -6 L16 19.59 19.59 16 16 12.41Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // a 1 1 0 0 1 -0.7 -0.3
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.7f,
            dy1 = -0.3f,
          )
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // a 1 1 0 0 1 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // a 1 1 0 0 1 1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = 0.0f,
          )
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // a 1 1 0 0 1 0 1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.4f,
          )
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // A 1 1 0 0 1 16 22
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 22.0f,
          )
          // m -3.59 -6
          moveToRelative(dx = -3.59f, dy = -6.0f)
          // L 16 19.59
          lineTo(x = 16.0f, y = 19.59f)
          // L 19.59 16
          lineTo(x = 19.59f, y = 16.0f)
          // L 16 12.41z
          lineTo(x = 16.0f, y = 12.41f)
          close()
        }
        // <polygon points="2.0 16.0 10.0 8.0 11.414 9.414 4.828 16.0 11.414 22.586 10.0 24.0 2.0 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 16
          moveTo(x = 2.0f, y = 16.0f)
          // L 10 8
          lineTo(x = 10.0f, y = 8.0f)
          // L 11.414 9.414
          lineTo(x = 11.414f, y = 9.414f)
          // L 4.828 16
          lineTo(x = 4.828f, y = 16.0f)
          // L 11.414 22.586
          lineTo(x = 11.414f, y = 22.586f)
          // L 10 24
          lineTo(x = 10.0f, y = 24.0f)
          // L 2 16z
          lineTo(x = 2.0f, y = 16.0f)
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
      .also { _types = it }
  }

@Suppress("ObjectPropertyName")
private var _types: ImageVector? = null
