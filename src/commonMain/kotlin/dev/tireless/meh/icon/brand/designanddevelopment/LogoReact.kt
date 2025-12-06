// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoReact: ImageVector
  get() {
    val current = _logoReact
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoReact",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m25 11.6 -.9 -.3 c0 -.2 .1 -.4 .1 -.6 .7 -3.3 .2 -6 -1.3 -6.9 -1.5 -.8 -3.9 0 -6.3 2.1 -.2 .2 -.5 .4 -.7 .6 -.2 -.1 -.3 -.3 -.5 -.4 C13 3.9 10.5 3 9 3.9 c-1.5 .8 -1.9 3.4 -1.3 6.5 .1 .3 .1 .6 .2 .9 -.4 .1 -.7 .2 -1 .3 -3 1 -4.9 2.7 -4.9 4.3 0 1.7 2 3.5 5.1 4.5 .2 .1 .5 .2 .8 .2 a4 4 0 0 0 -.2 1 C7.1 24.7 7.6 27.1 9 28 c1.5 .9 4 0 6.5 -2.2 .2 -.2 .4 -.4 .6 -.5 .2 .2 .5 .5 .8 .7 2.4 2.1 4.7 2.9 6.2 2 s2 -3.5 1.4 -6.7 c0 -.2 -.1 -.5 -.2 -.8 .2 -.1 .4 -.1 .5 -.2 3.2 -1.1 5.3 -2.8 5.3 -4.5 -.1 -1.5 -2.1 -3.1 -5.1 -4.2 m-7.5 -4.7 c2.1 -1.8 4 -2.5 4.9 -2 s1.3 2.7 .7 5.6 c0 .2 -.1 .4 -.1 .6 -1.2 -.3 -2.5 -.5 -3.7 -.6 q-1.05 -1.5 -2.4 -3z m-7.2 10.5 c.3 .5 .5 1 .8 1.5 s.6 1 .9 1.4 c-.9 -.1 -1.7 -.2 -2.6 -.4 .2 -.8 .5 -1.6 .9 -2.5 m0 -2.8 c-.4 -.8 -.6 -1.6 -.9 -2.4 .8 -.2 1.7 -.3 2.5 -.4 -.3 .5 -.6 .9 -.9 1.4 -.2 .4 -.5 .9 -.7 1.4 m.6 1.4 c.4 -.8 .8 -1.5 1.2 -2.3 .4 -.7 .9 -1.5 1.4 -2.2 .8 -.1 1.7 -.1 2.6 -.1 s1.7 0 2.6 .1 c.5 .7 .9 1.4 1.3 2.2 .4 .7 .8 1.5 1.2 2.3 -.4 .8 -.8 1.5 -1.2 2.3 -.4 .7 -.9 1.5 -1.3 2.2 -.8 .1 -1.7 .1 -2.6 .1 s-1.7 0 -2.5 -.1 c-.5 -.7 -.9 -1.4 -1.4 -2.2 s-.9 -1.5 -1.3 -2.3 m10 2.9 c.3 -.5 .6 -1 .8 -1.5 .4 .8 .7 1.6 .9 2.5 -.9 .2 -1.7 .3 -2.6 .4 .4 -.5 .7 -1 .9 -1.4 m.8 -4.3 c-.3 -.5 -.5 -1 -.8 -1.5 s-.6 -.9 -.8 -1.4 c.9 .1 1.7 .3 2.6 .4 -.3 .9 -.6 1.7 -1 2.5 M16 8.3 c.6 .6 1.1 1.3 1.6 2 q-1.65 -.15 -3.3 0z M9.6 4.9 c.9 -.5 3 .2 5.2 2.2 l.4 .4 q-1.35 1.35 -2.4 3 c-1.3 .1 -2.5 .3 -3.7 .6 C9 10.8 9 10.5 8.9 10.2 8.3 7.5 8.7 5.4 9.6 4.9 M8.2 19.6 c-.2 -.1 -.5 -.1 -.7 -.2 -1.4 -.5 -2.5 -1.1 -3.3 -1.7 -.7 -.6 -1 -1.2 -1 -1.7 0 -1 1.5 -2.3 4.1 -3.2 .3 -.1 .6 -.2 1 -.3 .3 1.2 .7 2.4 1.3 3.5 -.6 1.2 -1 2.4 -1.4 3.6 m6.5 5.5 c-1.1 1 -2.2 1.6 -3.1 2 -.9 .3 -1.5 .3 -2 .1 -.9 -.5 -1.3 -2.5 -.8 -5.1 C8.9 21.7 9 21.4 9 21 c1.2 .3 2.5 .5 3.8 .5 q1.05 1.5 2.4 3 c-.2 .2 -.3 .4 -.5 .6 m1.3 -1.4 c-.6 -.6 -1.1 -1.3 -1.7 -2 h3.3 c-.4 .7 -1 1.4 -1.6 2 m7.3 1.7 c-.2 .9 -.5 1.5 -.9 1.7 -.9 .5 -2.8 -.2 -4.8 -1.9 -.2 -.2 -.5 -.4 -.7 -.6 .8 -.9 1.6 -1.9 2.3 -3 A25 25 0 0 0 23 21 c.1 .2 .1 .5 .2 .7 .3 1.4 .3 2.7 .1 3.7 m1 -6 c-.2 0 -.3 .1 -.5 .1 -.4 -1.2 -.9 -2.4 -1.4 -3.6 .5 -1.1 1 -2.3 1.4 -3.5 .3 .1 .6 .2 .8 .3 2.6 .9 4.2 2.2 4.2 3.2 0 1.2 -1.7 2.6 -4.5 3.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11.6
          moveTo(x = 25.0f, y = 11.6f)
          // l -0.9 -0.3
          lineToRelative(dx = -0.9f, dy = -0.3f)
          // c 0 -0.2 0.1 -0.4 0.1 -0.6
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.2f,
            dx2 = 0.1f,
            dy2 = -0.4f,
            dx3 = 0.1f,
            dy3 = -0.6f,
          )
          // c 0.7 -3.3 0.2 -6 -1.3 -6.9
          curveToRelative(
            dx1 = 0.7f,
            dy1 = -3.3f,
            dx2 = 0.2f,
            dy2 = -6.0f,
            dx3 = -1.3f,
            dy3 = -6.9f,
          )
          // c -1.5 -0.8 -3.9 0 -6.3 2.1
          curveToRelative(
            dx1 = -1.5f,
            dy1 = -0.8f,
            dx2 = -3.9f,
            dy2 = 0.0f,
            dx3 = -6.3f,
            dy3 = 2.1f,
          )
          // c -0.2 0.2 -0.5 0.4 -0.7 0.6
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.2f,
            dx2 = -0.5f,
            dy2 = 0.4f,
            dx3 = -0.7f,
            dy3 = 0.6f,
          )
          // c -0.2 -0.1 -0.3 -0.3 -0.5 -0.4
          curveToRelative(
            dx1 = -0.2f,
            dy1 = -0.1f,
            dx2 = -0.3f,
            dy2 = -0.3f,
            dx3 = -0.5f,
            dy3 = -0.4f,
          )
          // C 13 3.9 10.5 3 9 3.9
          curveTo(
            x1 = 13.0f,
            y1 = 3.9f,
            x2 = 10.5f,
            y2 = 3.0f,
            x3 = 9.0f,
            y3 = 3.9f,
          )
          // c -1.5 0.8 -1.9 3.4 -1.3 6.5
          curveToRelative(
            dx1 = -1.5f,
            dy1 = 0.8f,
            dx2 = -1.9f,
            dy2 = 3.4f,
            dx3 = -1.3f,
            dy3 = 6.5f,
          )
          // c 0.1 0.3 0.1 0.6 0.2 0.9
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.3f,
            dx2 = 0.1f,
            dy2 = 0.6f,
            dx3 = 0.2f,
            dy3 = 0.9f,
          )
          // c -0.4 0.1 -0.7 0.2 -1 0.3
          curveToRelative(
            dx1 = -0.4f,
            dy1 = 0.1f,
            dx2 = -0.7f,
            dy2 = 0.2f,
            dx3 = -1.0f,
            dy3 = 0.3f,
          )
          // c -3 1 -4.9 2.7 -4.9 4.3
          curveToRelative(
            dx1 = -3.0f,
            dy1 = 1.0f,
            dx2 = -4.9f,
            dy2 = 2.7f,
            dx3 = -4.9f,
            dy3 = 4.3f,
          )
          // c 0 1.7 2 3.5 5.1 4.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.7f,
            dx2 = 2.0f,
            dy2 = 3.5f,
            dx3 = 5.1f,
            dy3 = 4.5f,
          )
          // c 0.2 0.1 0.5 0.2 0.8 0.2
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.1f,
            dx2 = 0.5f,
            dy2 = 0.2f,
            dx3 = 0.8f,
            dy3 = 0.2f,
          )
          // a 4 4 0 0 0 -0.2 1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.2f,
            dy1 = 1.0f,
          )
          // C 7.1 24.7 7.6 27.1 9 28
          curveTo(
            x1 = 7.1f,
            y1 = 24.7f,
            x2 = 7.6f,
            y2 = 27.1f,
            x3 = 9.0f,
            y3 = 28.0f,
          )
          // c 1.5 0.9 4 0 6.5 -2.2
          curveToRelative(
            dx1 = 1.5f,
            dy1 = 0.9f,
            dx2 = 4.0f,
            dy2 = 0.0f,
            dx3 = 6.5f,
            dy3 = -2.2f,
          )
          // c 0.2 -0.2 0.4 -0.4 0.6 -0.5
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.2f,
            dx2 = 0.4f,
            dy2 = -0.4f,
            dx3 = 0.6f,
            dy3 = -0.5f,
          )
          // c 0.2 0.2 0.5 0.5 0.8 0.7
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.2f,
            dx2 = 0.5f,
            dy2 = 0.5f,
            dx3 = 0.8f,
            dy3 = 0.7f,
          )
          // c 2.4 2.1 4.7 2.9 6.2 2
          curveToRelative(
            dx1 = 2.4f,
            dy1 = 2.1f,
            dx2 = 4.7f,
            dy2 = 2.9f,
            dx3 = 6.2f,
            dy3 = 2.0f,
          )
          // s 2 -3.5 1.4 -6.7
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = -3.5f,
            dx2 = 1.4f,
            dy2 = -6.7f,
          )
          // c 0 -0.2 -0.1 -0.5 -0.2 -0.8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.2f,
            dx2 = -0.1f,
            dy2 = -0.5f,
            dx3 = -0.2f,
            dy3 = -0.8f,
          )
          // c 0.2 -0.1 0.4 -0.1 0.5 -0.2
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.1f,
            dx2 = 0.4f,
            dy2 = -0.1f,
            dx3 = 0.5f,
            dy3 = -0.2f,
          )
          // c 3.2 -1.1 5.3 -2.8 5.3 -4.5
          curveToRelative(
            dx1 = 3.2f,
            dy1 = -1.1f,
            dx2 = 5.3f,
            dy2 = -2.8f,
            dx3 = 5.3f,
            dy3 = -4.5f,
          )
          // c -0.1 -1.5 -2.1 -3.1 -5.1 -4.2
          curveToRelative(
            dx1 = -0.1f,
            dy1 = -1.5f,
            dx2 = -2.1f,
            dy2 = -3.1f,
            dx3 = -5.1f,
            dy3 = -4.2f,
          )
          // m -7.5 -4.7
          moveToRelative(dx = -7.5f, dy = -4.7f)
          // c 2.1 -1.8 4 -2.5 4.9 -2
          curveToRelative(
            dx1 = 2.1f,
            dy1 = -1.8f,
            dx2 = 4.0f,
            dy2 = -2.5f,
            dx3 = 4.9f,
            dy3 = -2.0f,
          )
          // s 1.3 2.7 0.7 5.6
          reflectiveCurveToRelative(
            dx1 = 1.3f,
            dy1 = 2.7f,
            dx2 = 0.7f,
            dy2 = 5.6f,
          )
          // c 0 0.2 -0.1 0.4 -0.1 0.6
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.2f,
            dx2 = -0.1f,
            dy2 = 0.4f,
            dx3 = -0.1f,
            dy3 = 0.6f,
          )
          // c -1.2 -0.3 -2.5 -0.5 -3.7 -0.6
          curveToRelative(
            dx1 = -1.2f,
            dy1 = -0.3f,
            dx2 = -2.5f,
            dy2 = -0.5f,
            dx3 = -3.7f,
            dy3 = -0.6f,
          )
          // q -1.05 -1.5 -2.4 -3z
          quadToRelative(
            dx1 = -1.05f,
            dy1 = -1.5f,
            dx2 = -2.4f,
            dy2 = -3.0f,
          )
          close()
          // m -7.2 10.5
          moveToRelative(dx = -7.2f, dy = 10.5f)
          // c 0.3 0.5 0.5 1 0.8 1.5
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 0.5f,
            dx2 = 0.5f,
            dy2 = 1.0f,
            dx3 = 0.8f,
            dy3 = 1.5f,
          )
          // s 0.6 1 0.9 1.4
          reflectiveCurveToRelative(
            dx1 = 0.6f,
            dy1 = 1.0f,
            dx2 = 0.9f,
            dy2 = 1.4f,
          )
          // c -0.9 -0.1 -1.7 -0.2 -2.6 -0.4
          curveToRelative(
            dx1 = -0.9f,
            dy1 = -0.1f,
            dx2 = -1.7f,
            dy2 = -0.2f,
            dx3 = -2.6f,
            dy3 = -0.4f,
          )
          // c 0.2 -0.8 0.5 -1.6 0.9 -2.5
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.8f,
            dx2 = 0.5f,
            dy2 = -1.6f,
            dx3 = 0.9f,
            dy3 = -2.5f,
          )
          // m 0 -2.8
          moveToRelative(dx = 0.0f, dy = -2.8f)
          // c -0.4 -0.8 -0.6 -1.6 -0.9 -2.4
          curveToRelative(
            dx1 = -0.4f,
            dy1 = -0.8f,
            dx2 = -0.6f,
            dy2 = -1.6f,
            dx3 = -0.9f,
            dy3 = -2.4f,
          )
          // c 0.8 -0.2 1.7 -0.3 2.5 -0.4
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.2f,
            dx2 = 1.7f,
            dy2 = -0.3f,
            dx3 = 2.5f,
            dy3 = -0.4f,
          )
          // c -0.3 0.5 -0.6 0.9 -0.9 1.4
          curveToRelative(
            dx1 = -0.3f,
            dy1 = 0.5f,
            dx2 = -0.6f,
            dy2 = 0.9f,
            dx3 = -0.9f,
            dy3 = 1.4f,
          )
          // c -0.2 0.4 -0.5 0.9 -0.7 1.4
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.4f,
            dx2 = -0.5f,
            dy2 = 0.9f,
            dx3 = -0.7f,
            dy3 = 1.4f,
          )
          // m 0.6 1.4
          moveToRelative(dx = 0.6f, dy = 1.4f)
          // c 0.4 -0.8 0.8 -1.5 1.2 -2.3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.8f,
            dx2 = 0.8f,
            dy2 = -1.5f,
            dx3 = 1.2f,
            dy3 = -2.3f,
          )
          // c 0.4 -0.7 0.9 -1.5 1.4 -2.2
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.7f,
            dx2 = 0.9f,
            dy2 = -1.5f,
            dx3 = 1.4f,
            dy3 = -2.2f,
          )
          // c 0.8 -0.1 1.7 -0.1 2.6 -0.1
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.1f,
            dx2 = 1.7f,
            dy2 = -0.1f,
            dx3 = 2.6f,
            dy3 = -0.1f,
          )
          // s 1.7 0 2.6 0.1
          reflectiveCurveToRelative(
            dx1 = 1.7f,
            dy1 = 0.0f,
            dx2 = 2.6f,
            dy2 = 0.1f,
          )
          // c 0.5 0.7 0.9 1.4 1.3 2.2
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.7f,
            dx2 = 0.9f,
            dy2 = 1.4f,
            dx3 = 1.3f,
            dy3 = 2.2f,
          )
          // c 0.4 0.7 0.8 1.5 1.2 2.3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 0.7f,
            dx2 = 0.8f,
            dy2 = 1.5f,
            dx3 = 1.2f,
            dy3 = 2.3f,
          )
          // c -0.4 0.8 -0.8 1.5 -1.2 2.3
          curveToRelative(
            dx1 = -0.4f,
            dy1 = 0.8f,
            dx2 = -0.8f,
            dy2 = 1.5f,
            dx3 = -1.2f,
            dy3 = 2.3f,
          )
          // c -0.4 0.7 -0.9 1.5 -1.3 2.2
          curveToRelative(
            dx1 = -0.4f,
            dy1 = 0.7f,
            dx2 = -0.9f,
            dy2 = 1.5f,
            dx3 = -1.3f,
            dy3 = 2.2f,
          )
          // c -0.8 0.1 -1.7 0.1 -2.6 0.1
          curveToRelative(
            dx1 = -0.8f,
            dy1 = 0.1f,
            dx2 = -1.7f,
            dy2 = 0.1f,
            dx3 = -2.6f,
            dy3 = 0.1f,
          )
          // s -1.7 0 -2.5 -0.1
          reflectiveCurveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -2.5f,
            dy2 = -0.1f,
          )
          // c -0.5 -0.7 -0.9 -1.4 -1.4 -2.2
          curveToRelative(
            dx1 = -0.5f,
            dy1 = -0.7f,
            dx2 = -0.9f,
            dy2 = -1.4f,
            dx3 = -1.4f,
            dy3 = -2.2f,
          )
          // s -0.9 -1.5 -1.3 -2.3
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = -1.5f,
            dx2 = -1.3f,
            dy2 = -2.3f,
          )
          // m 10 2.9
          moveToRelative(dx = 10.0f, dy = 2.9f)
          // c 0.3 -0.5 0.6 -1 0.8 -1.5
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.5f,
            dx2 = 0.6f,
            dy2 = -1.0f,
            dx3 = 0.8f,
            dy3 = -1.5f,
          )
          // c 0.4 0.8 0.7 1.6 0.9 2.5
          curveToRelative(
            dx1 = 0.4f,
            dy1 = 0.8f,
            dx2 = 0.7f,
            dy2 = 1.6f,
            dx3 = 0.9f,
            dy3 = 2.5f,
          )
          // c -0.9 0.2 -1.7 0.3 -2.6 0.4
          curveToRelative(
            dx1 = -0.9f,
            dy1 = 0.2f,
            dx2 = -1.7f,
            dy2 = 0.3f,
            dx3 = -2.6f,
            dy3 = 0.4f,
          )
          // c 0.4 -0.5 0.7 -1 0.9 -1.4
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.5f,
            dx2 = 0.7f,
            dy2 = -1.0f,
            dx3 = 0.9f,
            dy3 = -1.4f,
          )
          // m 0.8 -4.3
          moveToRelative(dx = 0.8f, dy = -4.3f)
          // c -0.3 -0.5 -0.5 -1 -0.8 -1.5
          curveToRelative(
            dx1 = -0.3f,
            dy1 = -0.5f,
            dx2 = -0.5f,
            dy2 = -1.0f,
            dx3 = -0.8f,
            dy3 = -1.5f,
          )
          // s -0.6 -0.9 -0.8 -1.4
          reflectiveCurveToRelative(
            dx1 = -0.6f,
            dy1 = -0.9f,
            dx2 = -0.8f,
            dy2 = -1.4f,
          )
          // c 0.9 0.1 1.7 0.3 2.6 0.4
          curveToRelative(
            dx1 = 0.9f,
            dy1 = 0.1f,
            dx2 = 1.7f,
            dy2 = 0.3f,
            dx3 = 2.6f,
            dy3 = 0.4f,
          )
          // c -0.3 0.9 -0.6 1.7 -1 2.5
          curveToRelative(
            dx1 = -0.3f,
            dy1 = 0.9f,
            dx2 = -0.6f,
            dy2 = 1.7f,
            dx3 = -1.0f,
            dy3 = 2.5f,
          )
          // M 16 8.3
          moveTo(x = 16.0f, y = 8.3f)
          // c 0.6 0.6 1.1 1.3 1.6 2
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 0.6f,
            dx2 = 1.1f,
            dy2 = 1.3f,
            dx3 = 1.6f,
            dy3 = 2.0f,
          )
          // q -1.65 -0.15 -3.3 0z
          quadToRelative(
            dx1 = -1.65f,
            dy1 = -0.15f,
            dx2 = -3.3f,
            dy2 = 0.0f,
          )
          close()
          // M 9.6 4.9
          moveTo(x = 9.6f, y = 4.9f)
          // c 0.9 -0.5 3 0.2 5.2 2.2
          curveToRelative(
            dx1 = 0.9f,
            dy1 = -0.5f,
            dx2 = 3.0f,
            dy2 = 0.2f,
            dx3 = 5.2f,
            dy3 = 2.2f,
          )
          // l 0.4 0.4
          lineToRelative(dx = 0.4f, dy = 0.4f)
          // q -1.35 1.35 -2.4 3
          quadToRelative(
            dx1 = -1.35f,
            dy1 = 1.35f,
            dx2 = -2.4f,
            dy2 = 3.0f,
          )
          // c -1.3 0.1 -2.5 0.3 -3.7 0.6
          curveToRelative(
            dx1 = -1.3f,
            dy1 = 0.1f,
            dx2 = -2.5f,
            dy2 = 0.3f,
            dx3 = -3.7f,
            dy3 = 0.6f,
          )
          // C 9 10.8 9 10.5 8.9 10.2
          curveTo(
            x1 = 9.0f,
            y1 = 10.8f,
            x2 = 9.0f,
            y2 = 10.5f,
            x3 = 8.9f,
            y3 = 10.2f,
          )
          // C 8.3 7.5 8.7 5.4 9.6 4.9
          curveTo(
            x1 = 8.3f,
            y1 = 7.5f,
            x2 = 8.7f,
            y2 = 5.4f,
            x3 = 9.6f,
            y3 = 4.9f,
          )
          // M 8.2 19.6
          moveTo(x = 8.2f, y = 19.6f)
          // c -0.2 -0.1 -0.5 -0.1 -0.7 -0.2
          curveToRelative(
            dx1 = -0.2f,
            dy1 = -0.1f,
            dx2 = -0.5f,
            dy2 = -0.1f,
            dx3 = -0.7f,
            dy3 = -0.2f,
          )
          // c -1.4 -0.5 -2.5 -1.1 -3.3 -1.7
          curveToRelative(
            dx1 = -1.4f,
            dy1 = -0.5f,
            dx2 = -2.5f,
            dy2 = -1.1f,
            dx3 = -3.3f,
            dy3 = -1.7f,
          )
          // c -0.7 -0.6 -1 -1.2 -1 -1.7
          curveToRelative(
            dx1 = -0.7f,
            dy1 = -0.6f,
            dx2 = -1.0f,
            dy2 = -1.2f,
            dx3 = -1.0f,
            dy3 = -1.7f,
          )
          // c 0 -1 1.5 -2.3 4.1 -3.2
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.0f,
            dx2 = 1.5f,
            dy2 = -2.3f,
            dx3 = 4.1f,
            dy3 = -3.2f,
          )
          // c 0.3 -0.1 0.6 -0.2 1 -0.3
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.1f,
            dx2 = 0.6f,
            dy2 = -0.2f,
            dx3 = 1.0f,
            dy3 = -0.3f,
          )
          // c 0.3 1.2 0.7 2.4 1.3 3.5
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 1.2f,
            dx2 = 0.7f,
            dy2 = 2.4f,
            dx3 = 1.3f,
            dy3 = 3.5f,
          )
          // c -0.6 1.2 -1 2.4 -1.4 3.6
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 1.2f,
            dx2 = -1.0f,
            dy2 = 2.4f,
            dx3 = -1.4f,
            dy3 = 3.6f,
          )
          // m 6.5 5.5
          moveToRelative(dx = 6.5f, dy = 5.5f)
          // c -1.1 1 -2.2 1.6 -3.1 2
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 1.0f,
            dx2 = -2.2f,
            dy2 = 1.6f,
            dx3 = -3.1f,
            dy3 = 2.0f,
          )
          // c -0.9 0.3 -1.5 0.3 -2 0.1
          curveToRelative(
            dx1 = -0.9f,
            dy1 = 0.3f,
            dx2 = -1.5f,
            dy2 = 0.3f,
            dx3 = -2.0f,
            dy3 = 0.1f,
          )
          // c -0.9 -0.5 -1.3 -2.5 -0.8 -5.1
          curveToRelative(
            dx1 = -0.9f,
            dy1 = -0.5f,
            dx2 = -1.3f,
            dy2 = -2.5f,
            dx3 = -0.8f,
            dy3 = -5.1f,
          )
          // C 8.9 21.7 9 21.4 9 21
          curveTo(
            x1 = 8.9f,
            y1 = 21.7f,
            x2 = 9.0f,
            y2 = 21.4f,
            x3 = 9.0f,
            y3 = 21.0f,
          )
          // c 1.2 0.3 2.5 0.5 3.8 0.5
          curveToRelative(
            dx1 = 1.2f,
            dy1 = 0.3f,
            dx2 = 2.5f,
            dy2 = 0.5f,
            dx3 = 3.8f,
            dy3 = 0.5f,
          )
          // q 1.05 1.5 2.4 3
          quadToRelative(
            dx1 = 1.05f,
            dy1 = 1.5f,
            dx2 = 2.4f,
            dy2 = 3.0f,
          )
          // c -0.2 0.2 -0.3 0.4 -0.5 0.6
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.2f,
            dx2 = -0.3f,
            dy2 = 0.4f,
            dx3 = -0.5f,
            dy3 = 0.6f,
          )
          // m 1.3 -1.4
          moveToRelative(dx = 1.3f, dy = -1.4f)
          // c -0.6 -0.6 -1.1 -1.3 -1.7 -2
          curveToRelative(
            dx1 = -0.6f,
            dy1 = -0.6f,
            dx2 = -1.1f,
            dy2 = -1.3f,
            dx3 = -1.7f,
            dy3 = -2.0f,
          )
          // h 3.3
          horizontalLineToRelative(dx = 3.3f)
          // c -0.4 0.7 -1 1.4 -1.6 2
          curveToRelative(
            dx1 = -0.4f,
            dy1 = 0.7f,
            dx2 = -1.0f,
            dy2 = 1.4f,
            dx3 = -1.6f,
            dy3 = 2.0f,
          )
          // m 7.3 1.7
          moveToRelative(dx = 7.3f, dy = 1.7f)
          // c -0.2 0.9 -0.5 1.5 -0.9 1.7
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.9f,
            dx2 = -0.5f,
            dy2 = 1.5f,
            dx3 = -0.9f,
            dy3 = 1.7f,
          )
          // c -0.9 0.5 -2.8 -0.2 -4.8 -1.9
          curveToRelative(
            dx1 = -0.9f,
            dy1 = 0.5f,
            dx2 = -2.8f,
            dy2 = -0.2f,
            dx3 = -4.8f,
            dy3 = -1.9f,
          )
          // c -0.2 -0.2 -0.5 -0.4 -0.7 -0.6
          curveToRelative(
            dx1 = -0.2f,
            dy1 = -0.2f,
            dx2 = -0.5f,
            dy2 = -0.4f,
            dx3 = -0.7f,
            dy3 = -0.6f,
          )
          // c 0.8 -0.9 1.6 -1.9 2.3 -3
          curveToRelative(
            dx1 = 0.8f,
            dy1 = -0.9f,
            dx2 = 1.6f,
            dy2 = -1.9f,
            dx3 = 2.3f,
            dy3 = -3.0f,
          )
          // A 25 25 0 0 0 23 21
          arcTo(
            horizontalEllipseRadius = 25.0f,
            verticalEllipseRadius = 25.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 21.0f,
          )
          // c 0.1 0.2 0.1 0.5 0.2 0.7
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.2f,
            dx2 = 0.1f,
            dy2 = 0.5f,
            dx3 = 0.2f,
            dy3 = 0.7f,
          )
          // c 0.3 1.4 0.3 2.7 0.1 3.7
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 1.4f,
            dx2 = 0.3f,
            dy2 = 2.7f,
            dx3 = 0.1f,
            dy3 = 3.7f,
          )
          // m 1 -6
          moveToRelative(dx = 1.0f, dy = -6.0f)
          // c -0.2 0 -0.3 0.1 -0.5 0.1
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.0f,
            dx2 = -0.3f,
            dy2 = 0.1f,
            dx3 = -0.5f,
            dy3 = 0.1f,
          )
          // c -0.4 -1.2 -0.9 -2.4 -1.4 -3.6
          curveToRelative(
            dx1 = -0.4f,
            dy1 = -1.2f,
            dx2 = -0.9f,
            dy2 = -2.4f,
            dx3 = -1.4f,
            dy3 = -3.6f,
          )
          // c 0.5 -1.1 1 -2.3 1.4 -3.5
          curveToRelative(
            dx1 = 0.5f,
            dy1 = -1.1f,
            dx2 = 1.0f,
            dy2 = -2.3f,
            dx3 = 1.4f,
            dy3 = -3.5f,
          )
          // c 0.3 0.1 0.6 0.2 0.8 0.3
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 0.1f,
            dx2 = 0.6f,
            dy2 = 0.2f,
            dx3 = 0.8f,
            dy3 = 0.3f,
          )
          // c 2.6 0.9 4.2 2.2 4.2 3.2
          curveToRelative(
            dx1 = 2.6f,
            dy1 = 0.9f,
            dx2 = 4.2f,
            dy2 = 2.2f,
            dx3 = 4.2f,
            dy3 = 3.2f,
          )
          // c 0 1.2 -1.7 2.6 -4.5 3.5
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.2f,
            dx2 = -1.7f,
            dy2 = 2.6f,
            dx3 = -4.5f,
            dy3 = 3.5f,
          )
        }
        // M16 18.5 c.5 0 1 -.1 1.4 -.4 s.7 -.7 .9 -1.1 c.2 -.5 .2 -1 .1 -1.5 a2.4 2.4 0 0 0 -.7 -1.3 2 2 0 0 0 -1.3 -.7 c-.5 -.1 -1 0 -1.5 .1 a2 2 0 0 0 -1.1 .9 2.3 2.3 0 0 0 -.4 1.4 c0 .3 .1 .7 .2 1 s.3 .6 .5 .8 .5 .4 .8 .5 a3 3 0 0 0 1.1 .3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 18.5
          moveTo(x = 16.0f, y = 18.5f)
          // c 0.5 0 1 -0.1 1.4 -0.4
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.0f,
            dx2 = 1.0f,
            dy2 = -0.1f,
            dx3 = 1.4f,
            dy3 = -0.4f,
          )
          // s 0.7 -0.7 0.9 -1.1
          reflectiveCurveToRelative(
            dx1 = 0.7f,
            dy1 = -0.7f,
            dx2 = 0.9f,
            dy2 = -1.1f,
          )
          // c 0.2 -0.5 0.2 -1 0.1 -1.5
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.5f,
            dx2 = 0.2f,
            dy2 = -1.0f,
            dx3 = 0.1f,
            dy3 = -1.5f,
          )
          // a 2.4 2.4 0 0 0 -0.7 -1.3
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = -1.3f,
          )
          // a 2 2 0 0 0 -1.3 -0.7
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.3f,
            dy1 = -0.7f,
          )
          // c -0.5 -0.1 -1 0 -1.5 0.1
          curveToRelative(
            dx1 = -0.5f,
          dy1 = -0.1f,
          dx2 = -1.0f,
          dy2 = 0.0f,
          dx3 = -1.5f,
          dy3 = 0.1f,
        )
        // a 2 2 0 0 0 -1.1 0.9
        arcToRelative(
          a = 2.0f,
          b = 2.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = -1.1f,
          dy1 = 0.9f,
        )
        // a 2.3 2.3 0 0 0 -0.4 1.4
        arcToRelative(
          a = 2.3f,
          b = 2.3f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = -0.4f,
          dy1 = 1.4f,
        )
        // c 0 0.3 0.1 0.7 0.2 1
        curveToRelative(
          dx1 = 0.0f,
          dy1 = 0.3f,
          dx2 = 0.1f,
          dy2 = 0.7f,
          dx3 = 0.2f,
          dy3 = 1.0f,
        )
        // s 0.3 0.6 0.5 0.8
        reflectiveCurveToRelative(
          dx1 = 0.3f,
          dy1 = 0.6f,
          dx2 = 0.5f,
          dy2 = 0.8f,
        )
        // s 0.5 0.4 0.8 0.5
        reflectiveCurveToRelative(
          dx1 = 0.5f,
          dy1 = 0.4f,
          dx2 = 0.8f,
          dy2 = 0.5f,
        )
        // a 3 3 0 0 0 1.1 0.3
        arcToRelative(
          a = 3.0f,
          b = 3.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = 1.1f,
          dy1 = 0.3f,
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
      .also { _logoReact = it }
  }

@Suppress("ObjectPropertyName")
private var _logoReact: ImageVector? = null
