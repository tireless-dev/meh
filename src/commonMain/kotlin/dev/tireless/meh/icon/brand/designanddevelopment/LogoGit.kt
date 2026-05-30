// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoGit: ImageVector
  get() {
    val current = _logoGit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoGit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.52 14.8 17.2 2.52 a1.76 1.76 0 0 0 -2.5 0 l-2.5 2.5 3.2 3.2 c.8 -.3 1.6 0 2.2 .5 a2 2 0 0 1 .5 2.19 l3.1 3.1 c.81 -.3 1.61 0 2.21 .5 .8 .8 .8 2.19 0 2.99 a2.2 2.2 0 0 1 -3 0 2.2 2.2 0 0 1 -.5 -2.3 L17 12.3 v7.6 c1.1 .5 1.5 1.79 1 2.89 -.1 .2 -.2 .4 -.4 .6 a2.2 2.2 0 0 1 -3.01 0 2.17 2.17 0 0 1 0 -3 c.2 -.2 .4 -.4 .7 -.5 v-7.68 c-.3 -.1 -.5 -.3 -.7 -.5 a2.2 2.2 0 0 1 -.5 -2.3 l-3.2 -3.2 -8.42 8.5 c-.7 .7 -.7 1.79 0 2.59 L14.7 29.48 c.7 .7 1.8 .7 2.5 0 L29.42 17.3 c.7 -.7 .7 -1.8 0 -2.6
        path(
          fill = SolidColor(Color(0xFF100F0D)),
        ) {
          // M 29.52 14.8
          moveTo(x = 29.52f, y = 14.8f)
          // L 17.2 2.52
          lineTo(x = 17.2f, y = 2.52f)
          // a 1.76 1.76 0 0 0 -2.5 0
          arcToRelative(
            a = 1.76f,
            b = 1.76f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.5f,
            dy1 = 0.0f,
          )
          // l -2.5 2.5
          lineToRelative(dx = -2.5f, dy = 2.5f)
          // l 3.2 3.2
          lineToRelative(dx = 3.2f, dy = 3.2f)
          // c 0.8 -0.3 1.6 0 2.2 0.5
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.3f,
            dx2 = 1.6f,
            dy2 = 0.0f,
            dx3 = 2.2f,
            dy3 = 0.5f,
          )
          // a 2 2 0 0 1 0.5 2.19
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = 2.19f,
          )
          // l 3.1 3.1
          lineToRelative(dx = 3.1f, dy = 3.1f)
          // c 0.81 -0.3 1.61 0 2.21 0.5
          curveToRelative(
            dx1 = 0.81f,
            dy1 = -0.3f,
            dx2 = 1.61f,
            dy2 = 0.0f,
            dx3 = 2.21f,
            dy3 = 0.5f,
          )
          // c 0.8 0.8 0.8 2.19 0 2.99
          curveToRelative(
            dx1 = 0.8f,
            dy1 = 0.8f,
            dx2 = 0.8f,
            dy2 = 2.19f,
            dx3 = 0.0f,
            dy3 = 2.99f,
          )
          // a 2.2 2.2 0 0 1 -3 0
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          // a 2.2 2.2 0 0 1 -0.5 -2.3
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = -2.3f,
          )
          // L 17 12.3
          lineTo(x = 17.0f, y = 12.3f)
          // v 7.6
          verticalLineToRelative(dy = 7.6f)
          // c 1.1 0.5 1.5 1.79 1 2.89
          curveToRelative(
            dx1 = 1.1f,
            dy1 = 0.5f,
            dx2 = 1.5f,
            dy2 = 1.79f,
            dx3 = 1.0f,
            dy3 = 2.89f,
          )
          // c -0.1 0.2 -0.2 0.4 -0.4 0.6
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 0.2f,
            dx2 = -0.2f,
            dy2 = 0.4f,
            dx3 = -0.4f,
            dy3 = 0.6f,
          )
          // a 2.2 2.2 0 0 1 -3.01 0
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.01f,
            dy1 = 0.0f,
          )
          // a 2.17 2.17 0 0 1 0 -3
          arcToRelative(
            a = 2.17f,
            b = 2.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
          // c 0.2 -0.2 0.4 -0.4 0.7 -0.5
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.2f,
            dx2 = 0.4f,
            dy2 = -0.4f,
            dx3 = 0.7f,
            dy3 = -0.5f,
          )
          // v -7.68
          verticalLineToRelative(dy = -7.68f)
          // c -0.3 -0.1 -0.5 -0.3 -0.7 -0.5
          curveToRelative(
            dx1 = -0.3f,
            dy1 = -0.1f,
            dx2 = -0.5f,
            dy2 = -0.3f,
            dx3 = -0.7f,
            dy3 = -0.5f,
          )
          // a 2.2 2.2 0 0 1 -0.5 -2.3
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = -2.3f,
          )
          // l -3.2 -3.2
          lineToRelative(dx = -3.2f, dy = -3.2f)
          // l -8.42 8.5
          lineToRelative(dx = -8.42f, dy = 8.5f)
          // c -0.7 0.7 -0.7 1.79 0 2.59
          curveToRelative(
            dx1 = -0.7f,
            dy1 = 0.7f,
            dx2 = -0.7f,
            dy2 = 1.79f,
            dx3 = 0.0f,
            dy3 = 2.59f,
          )
          // L 14.7 29.48
          lineTo(x = 14.7f, y = 29.48f)
          // c 0.7 0.7 1.8 0.7 2.5 0
          curveToRelative(
            dx1 = 0.7f,
            dy1 = 0.7f,
            dx2 = 1.8f,
            dy2 = 0.7f,
            dx3 = 2.5f,
            dy3 = 0.0f,
          )
          // L 29.42 17.3
          lineTo(x = 29.42f, y = 17.3f)
          // c 0.7 -0.7 0.7 -1.8 0 -2.6
          curveToRelative(
            dx1 = 0.7f,
            dy1 = -0.7f,
            dx2 = 0.7f,
            dy2 = -1.8f,
            dx3 = 0.0f,
            dy3 = -2.6f,
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
      .also { _logoGit = it }
  }

@Suppress("ObjectPropertyName")
private var _logoGit: ImageVector? = null
