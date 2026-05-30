// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IncompleteCancel: ImageVector
  get() {
    val current = _incompleteCancel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IncompleteCancel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 21.41 28.59 20.0 25.0 23.59 21.41 20.0 20.0 21.41 23.59 25.0 20.0 28.59 21.41 30.0 25.0 26.41 28.59 30.0 30.0 28.59 26.41 25.0 30.0 21.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 21.41
          moveTo(x = 30.0f, y = 21.41f)
          // L 28.59 20
          lineTo(x = 28.59f, y = 20.0f)
          // L 25 23.59
          lineTo(x = 25.0f, y = 23.59f)
          // L 21.41 20
          lineTo(x = 21.41f, y = 20.0f)
          // L 20 21.41
          lineTo(x = 20.0f, y = 21.41f)
          // L 23.59 25
          lineTo(x = 23.59f, y = 25.0f)
          // L 20 28.59
          lineTo(x = 20.0f, y = 28.59f)
          // L 21.41 30
          lineTo(x = 21.41f, y = 30.0f)
          // L 25 26.41
          lineTo(x = 25.0f, y = 26.41f)
          // L 28.59 30
          lineTo(x = 28.59f, y = 30.0f)
          // L 30 28.59
          lineTo(x = 30.0f, y = 28.59f)
          // L 26.41 25
          lineTo(x = 26.41f, y = 25.0f)
          // L 30 21.41z
          lineTo(x = 30.0f, y = 21.41f)
          close()
        }
        // M14 26 a12 12 0 0 1 0 -24Z m3.83 -21.24 a10 10 0 0 1 3.24 2.17 l1.41 -1.41 a12 12 0 0 0 -3.89 -2.6Z M26 14 a12 12 0 0 0 -.92 -4.6 l-1.84 .77 A10 10 0 0 1 24 14Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 26
          moveTo(x = 14.0f, y = 26.0f)
          // a 12 12 0 0 1 0 -24z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -24.0f,
          )
          close()
          // m 3.83 -21.24
          moveToRelative(dx = 3.83f, dy = -21.24f)
          // a 10 10 0 0 1 3.24 2.17
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.24f,
            dy1 = 2.17f,
          )
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // a 12 12 0 0 0 -3.89 -2.6z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.89f,
            dy1 = -2.6f,
          )
          close()
          // M 26 14
          moveTo(x = 26.0f, y = 14.0f)
          // a 12 12 0 0 0 -0.92 -4.6
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.92f,
            dy1 = -4.6f,
          )
          // l -1.84 0.77
          lineToRelative(dx = -1.84f, dy = 0.77f)
          // A 10 10 0 0 1 24 14z
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 14.0f,
          )
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
      .also { _incompleteCancel = it }
  }

@Suppress("ObjectPropertyName")
private var _incompleteCancel: ImageVector? = null
