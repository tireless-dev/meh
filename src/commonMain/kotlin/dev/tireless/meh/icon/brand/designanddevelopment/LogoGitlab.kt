// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoGitlab: ImageVector
  get() {
    val current = _logoGitlab
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoGitlab",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m28.57 12.9 -.04 -.1 L25 3.56 a1 1 0 0 0 -.36 -.44 .95 .95 0 0 0 -1.08 .06 1 1 0 0 0 -.32 .48 l-2.39 7.31 h-9.67 l-2.4 -7.31 a.93 .93 0 0 0 -1.75 -.1 L3.47 12.8 l-.04 .1 a6.6 6.6 0 0 0 2.18 7.6 h.02 l.03 .02 5.39 4.04 2.67 2.02 1.62 1.23 a1.1 1.1 0 0 0 1.32 0 l1.63 -1.23 2.66 -2.02 5.43 -4.06 .01 -.01 a6.6 6.6 0 0 0 2.18 -7.59
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.57 12.9
          moveTo(x = 28.57f, y = 12.9f)
          // l -0.04 -0.1
          lineToRelative(dx = -0.04f, dy = -0.1f)
          // L 25 3.56
          lineTo(x = 25.0f, y = 3.56f)
          // a 1 1 0 0 0 -0.36 -0.44
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.36f,
            dy1 = -0.44f,
          )
          // a 0.95 0.95 0 0 0 -1.08 0.06
          arcToRelative(
            a = 0.95f,
            b = 0.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.08f,
            dy1 = 0.06f,
          )
          // a 1 1 0 0 0 -0.32 0.48
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.32f,
            dy1 = 0.48f,
          )
          // l -2.39 7.31
          lineToRelative(dx = -2.39f, dy = 7.31f)
          // h -9.67
          horizontalLineToRelative(dx = -9.67f)
          // l -2.4 -7.31
          lineToRelative(dx = -2.4f, dy = -7.31f)
          // a 0.93 0.93 0 0 0 -1.75 -0.1
          arcToRelative(
            a = 0.93f,
            b = 0.93f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.75f,
            dy1 = -0.1f,
          )
          // L 3.47 12.8
          lineTo(x = 3.47f, y = 12.8f)
          // l -0.04 0.1
          lineToRelative(dx = -0.04f, dy = 0.1f)
          // a 6.6 6.6 0 0 0 2.18 7.6
          arcToRelative(
            a = 6.6f,
            b = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.18f,
            dy1 = 7.6f,
          )
          // h 0.02
          horizontalLineToRelative(dx = 0.02f)
          // l 0.03 0.02
          lineToRelative(dx = 0.03f, dy = 0.02f)
          // l 5.39 4.04
          lineToRelative(dx = 5.39f, dy = 4.04f)
          // l 2.67 2.02
          lineToRelative(dx = 2.67f, dy = 2.02f)
          // l 1.62 1.23
          lineToRelative(dx = 1.62f, dy = 1.23f)
          // a 1.1 1.1 0 0 0 1.32 0
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.32f,
            dy1 = 0.0f,
          )
          // l 1.63 -1.23
          lineToRelative(dx = 1.63f, dy = -1.23f)
          // l 2.66 -2.02
          lineToRelative(dx = 2.66f, dy = -2.02f)
          // l 5.43 -4.06
          lineToRelative(dx = 5.43f, dy = -4.06f)
          // l 0.01 -0.01
          lineToRelative(dx = 0.01f, dy = -0.01f)
          // a 6.6 6.6 0 0 0 2.18 -7.59
          arcToRelative(
            a = 6.6f,
            b = 6.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.18f,
            dy1 = -7.59f,
          )
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
      .also { _logoGitlab = it }
  }

@Suppress("ObjectPropertyName")
private var _logoGitlab: ImageVector? = null
