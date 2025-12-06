// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinInnerAlt: ImageVector
  get() {
    val current = _joinInnerAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JoinInnerAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M9.3 12.6 8 14.1 c-1.1 -1 -2 -2.2 -2.7 -3.5 l1.8 -.9 c.6 1.1 1.3 2.1 2.2 2.9 M6.4 7.7 A9 9 0 0 1 6 4.9 V4 H4 v.9 C4 6 4.2 7.2 4.5 8.3z m7.8 7.3 a10 10 0 0 1 -3.4 -1.3 l-1 1.7 c.3 .2 .7 .4 1.1 .6 -.4 .2 -.7 .4 -1.1 .6 l1 1.7 c1.1 -.7 2.2 -1.1 3.4 -1.3 v-1.9Z m-8.9 6.4 1.8 .9 c.6 -1.1 1.3 -2.1 2.2 -2.9 L8 17.9 c-1.1 1 -2 2.2 -2.7 3.5 M4 27.1 V28 h2 v-.9 c0 -1 .1 -1.9 .4 -2.8 l-1.9 -.6 A13 13 0 0 0 4 27.1 M23 11 l-1.4 1.4 2.6 2.6 H16 v2 h8.2 l-2.6 2.6 L23 21 l5 -5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.3 12.6
          moveTo(x = 9.3f, y = 12.6f)
          // L 8 14.1
          lineTo(x = 8.0f, y = 14.1f)
          // c -1.1 -1 -2 -2.2 -2.7 -3.5
          curveToRelative(
            dx1 = -1.1f,
            dy1 = -1.0f,
            dx2 = -2.0f,
            dy2 = -2.2f,
            dx3 = -2.7f,
            dy3 = -3.5f,
          )
          // l 1.8 -0.9
          lineToRelative(dx = 1.8f, dy = -0.9f)
          // c 0.6 1.1 1.3 2.1 2.2 2.9
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 1.1f,
            dx2 = 1.3f,
            dy2 = 2.1f,
            dx3 = 2.2f,
            dy3 = 2.9f,
          )
          // M 6.4 7.7
          moveTo(x = 6.4f, y = 7.7f)
          // A 9 9 0 0 1 6 4.9
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.0f,
            y1 = 4.9f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 0.9
          verticalLineToRelative(dy = 0.9f)
          // C 4 6 4.2 7.2 4.5 8.3z
          curveTo(
            x1 = 4.0f,
            y1 = 6.0f,
            x2 = 4.2f,
            y2 = 7.2f,
            x3 = 4.5f,
            y3 = 8.3f,
          )
          close()
          // m 7.8 7.3
          moveToRelative(dx = 7.8f, dy = 7.3f)
          // a 10 10 0 0 1 -3.4 -1.3
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.4f,
            dy1 = -1.3f,
          )
          // l -1 1.7
          lineToRelative(dx = -1.0f, dy = 1.7f)
          // c 0.3 0.2 0.7 0.4 1.1 0.6
          curveToRelative(
            dx1 = 0.3f,
            dy1 = 0.2f,
            dx2 = 0.7f,
            dy2 = 0.4f,
            dx3 = 1.1f,
            dy3 = 0.6f,
          )
          // c -0.4 0.2 -0.7 0.4 -1.1 0.6
          curveToRelative(
            dx1 = -0.4f,
            dy1 = 0.2f,
            dx2 = -0.7f,
            dy2 = 0.4f,
            dx3 = -1.1f,
            dy3 = 0.6f,
          )
          // l 1 1.7
          lineToRelative(dx = 1.0f, dy = 1.7f)
          // c 1.1 -0.7 2.2 -1.1 3.4 -1.3
          curveToRelative(
            dx1 = 1.1f,
            dy1 = -0.7f,
            dx2 = 2.2f,
            dy2 = -1.1f,
            dx3 = 3.4f,
            dy3 = -1.3f,
          )
          // v -1.9z
          verticalLineToRelative(dy = -1.9f)
          close()
          // m -8.9 6.4
          moveToRelative(dx = -8.9f, dy = 6.4f)
          // l 1.8 0.9
          lineToRelative(dx = 1.8f, dy = 0.9f)
          // c 0.6 -1.1 1.3 -2.1 2.2 -2.9
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -1.1f,
            dx2 = 1.3f,
            dy2 = -2.1f,
            dx3 = 2.2f,
            dy3 = -2.9f,
          )
          // L 8 17.9
          lineTo(x = 8.0f, y = 17.9f)
          // c -1.1 1 -2 2.2 -2.7 3.5
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 1.0f,
            dx2 = -2.0f,
            dy2 = 2.2f,
            dx3 = -2.7f,
            dy3 = 3.5f,
          )
          // M 4 27.1
          moveTo(x = 4.0f, y = 27.1f)
          // V 28
          verticalLineTo(y = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -0.9
          verticalLineToRelative(dy = -0.9f)
          // c 0 -1 0.1 -1.9 0.4 -2.8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.0f,
            dx2 = 0.1f,
            dy2 = -1.9f,
            dx3 = 0.4f,
            dy3 = -2.8f,
          )
          // l -1.9 -0.6
          lineToRelative(dx = -1.9f, dy = -0.6f)
          // A 13 13 0 0 0 4 27.1
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 27.1f,
          )
          // M 23 11
          moveTo(x = 23.0f, y = 11.0f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 2.6 2.6
          lineToRelative(dx = 2.6f, dy = 2.6f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8.2
          horizontalLineToRelative(dx = 8.2f)
          // l -2.6 2.6
          lineToRelative(dx = -2.6f, dy = 2.6f)
          // L 23 21
          lineTo(x = 23.0f, y = 21.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
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
      .also { _joinInnerAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _joinInnerAlt: ImageVector? = null
