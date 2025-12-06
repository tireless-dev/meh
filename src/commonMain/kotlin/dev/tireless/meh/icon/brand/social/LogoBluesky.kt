// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoBluesky: ImageVector
  get() {
    val current = _logoBluesky
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoBluesky",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M9.2 6.9 c2.7 2.1 5.7 6.3 6.8 8.5 1.1 -2.2 4 -6.4 6.8 -8.5 2 -1.5 5.2 -2.6 5.2 1 s-.4 6.2 -.7 7 c-.9 3.1 -4 3.8 -6.8 3.4 4.8 .8 6.1 3.6 3.4 6.3 -5.1 5.2 -7.3 -1.3 -7.8 -3 0 -.3 -.1 -.5 -.1 -.3 0 -.1 0 0 -.1 .3 -.6 1.7 -2.8 8.2 -7.8 3 -2.7 -2.7 -1.4 -5.5 3.4 -6.3 -2.8 .5 -5.9 -.3 -6.8 -3.4 C4.5 14 4 8.6 4 7.9 c0 -3.7 3.2 -2.5 5.2 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.2 6.9
          moveTo(x = 9.2f, y = 6.9f)
          // c 2.7 2.1 5.7 6.3 6.8 8.5
          curveToRelative(
            dx1 = 2.7f,
            dy1 = 2.1f,
            dx2 = 5.7f,
            dy2 = 6.3f,
            dx3 = 6.8f,
            dy3 = 8.5f,
          )
          // c 1.1 -2.2 4 -6.4 6.8 -8.5
          curveToRelative(
            dx1 = 1.1f,
            dy1 = -2.2f,
            dx2 = 4.0f,
            dy2 = -6.4f,
            dx3 = 6.8f,
            dy3 = -8.5f,
          )
          // c 2 -1.5 5.2 -2.6 5.2 1
          curveToRelative(
            dx1 = 2.0f,
            dy1 = -1.5f,
            dx2 = 5.2f,
            dy2 = -2.6f,
            dx3 = 5.2f,
            dy3 = 1.0f,
          )
          // s -0.4 6.2 -0.7 7
          reflectiveCurveToRelative(
            dx1 = -0.4f,
            dy1 = 6.2f,
            dx2 = -0.7f,
            dy2 = 7.0f,
          )
          // c -0.9 3.1 -4 3.8 -6.8 3.4
          curveToRelative(
            dx1 = -0.9f,
            dy1 = 3.1f,
            dx2 = -4.0f,
            dy2 = 3.8f,
            dx3 = -6.8f,
            dy3 = 3.4f,
          )
          // c 4.8 0.8 6.1 3.6 3.4 6.3
          curveToRelative(
            dx1 = 4.8f,
            dy1 = 0.8f,
            dx2 = 6.1f,
            dy2 = 3.6f,
            dx3 = 3.4f,
            dy3 = 6.3f,
          )
          // c -5.1 5.2 -7.3 -1.3 -7.8 -3
          curveToRelative(
            dx1 = -5.1f,
            dy1 = 5.2f,
            dx2 = -7.3f,
            dy2 = -1.3f,
            dx3 = -7.8f,
            dy3 = -3.0f,
          )
          // c 0 -0.3 -0.1 -0.5 -0.1 -0.3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.5f,
            dx3 = -0.1f,
            dy3 = -0.3f,
          )
          // c 0 -0.1 0 0 -0.1 0.3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.1f,
            dx2 = 0.0f,
            dy2 = 0.0f,
            dx3 = -0.1f,
            dy3 = 0.3f,
          )
          // c -0.6 1.7 -2.8 8.2 -7.8 3
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 1.7f,
            dx2 = -2.8f,
            dy2 = 8.2f,
            dx3 = -7.8f,
            dy3 = 3.0f,
          )
          // c -2.7 -2.7 -1.4 -5.5 3.4 -6.3
          curveToRelative(
            dx1 = -2.7f,
            dy1 = -2.7f,
            dx2 = -1.4f,
            dy2 = -5.5f,
            dx3 = 3.4f,
            dy3 = -6.3f,
          )
          // c -2.8 0.5 -5.9 -0.3 -6.8 -3.4
          curveToRelative(
            dx1 = -2.8f,
            dy1 = 0.5f,
            dx2 = -5.9f,
            dy2 = -0.3f,
            dx3 = -6.8f,
            dy3 = -3.4f,
          )
          // C 4.5 14 4 8.6 4 7.9
          curveTo(
            x1 = 4.5f,
            y1 = 14.0f,
            x2 = 4.0f,
            y2 = 8.6f,
            x3 = 4.0f,
            y3 = 7.9f,
          )
          // c 0 -3.7 3.2 -2.5 5.2 -1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.7f,
            dx2 = 3.2f,
            dy2 = -2.5f,
            dx3 = 5.2f,
            dy3 = -1.0f,
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
      .also { _logoBluesky = it }
  }

@Suppress("ObjectPropertyName")
private var _logoBluesky: ImageVector? = null
