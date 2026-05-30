// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Password: ImageVector
  get() {
    val current = _password
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Password",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 2 a9 9 0 0 0 -8.61 11.61 L2 24 v6 h6 l10.39 -10.39 A9 9 0 1 0 21 2 m0 16 a7 7 0 0 1 -2.03 -.3 l-1.15 -.35 -.85 .85 -3.18 3.18 L12.41 20 11 21.41 l1.38 1.38 -1.59 1.59 L9.41 23 8 24.41 l1.38 1.38 L7.18 28 H4 v-3.17 l9.8 -9.8 .85 -.85 -.35 -1.15 A7 7 0 1 1 21 18
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 2
          moveTo(x = 21.0f, y = 2.0f)
          // a 9 9 0 0 0 -8.61 11.61
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.61f,
            dy1 = 11.61f,
          )
          // L 2 24
          lineTo(x = 2.0f, y = 24.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // l 10.39 -10.39
          lineToRelative(dx = 10.39f, dy = -10.39f)
          // A 9 9 0 1 0 21 2
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 2.0f,
          )
          // m 0 16
          moveToRelative(dx = 0.0f, dy = 16.0f)
          // a 7 7 0 0 1 -2.03 -0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.03f,
            dy1 = -0.3f,
          )
          // l -1.15 -0.35
          lineToRelative(dx = -1.15f, dy = -0.35f)
          // l -0.85 0.85
          lineToRelative(dx = -0.85f, dy = 0.85f)
          // l -3.18 3.18
          lineToRelative(dx = -3.18f, dy = 3.18f)
          // L 12.41 20
          lineTo(x = 12.41f, y = 20.0f)
          // L 11 21.41
          lineTo(x = 11.0f, y = 21.41f)
          // l 1.38 1.38
          lineToRelative(dx = 1.38f, dy = 1.38f)
          // l -1.59 1.59
          lineToRelative(dx = -1.59f, dy = 1.59f)
          // L 9.41 23
          lineTo(x = 9.41f, y = 23.0f)
          // L 8 24.41
          lineTo(x = 8.0f, y = 24.41f)
          // l 1.38 1.38
          lineToRelative(dx = 1.38f, dy = 1.38f)
          // L 7.18 28
          lineTo(x = 7.18f, y = 28.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -3.17
          verticalLineToRelative(dy = -3.17f)
          // l 9.8 -9.8
          lineToRelative(dx = 9.8f, dy = -9.8f)
          // l 0.85 -0.85
          lineToRelative(dx = 0.85f, dy = -0.85f)
          // l -0.35 -1.15
          lineToRelative(dx = -0.35f, dy = -1.15f)
          // A 7 7 0 1 1 21 18
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 18.0f,
          )
        }
        // <circle cx="22.0" cy="10.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 10
          moveTo(x = 22.0f, y = 10.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
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
      .also { _password = it }
  }

@Suppress("ObjectPropertyName")
private var _password: ImageVector? = null
