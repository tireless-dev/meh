// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScisControlTower: ImageVector
  get() {
    val current = _scisControlTower
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScisControlTower",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 19 c-.3 0 -.7 .1 -1 .2 L20.4 12 c1 -1.1 1.6 -2.5 1.6 -4 0 -3.3 -2.7 -6 -6 -6 s-6 2.7 -6 6 c0 1.6 .6 3 1.6 4 L6 19.2 A2.95 2.95 0 0 0 2 22 c0 1.7 1.3 3 3 3 a2.95 2.95 0 0 0 2.5 -4.6 l5.6 -7.1 c.6 .3 1.2 .5 1.9 .6 v10.3 c-1.2 .4 -2 1.5 -2 2.8 0 1.7 1.3 3 3 3 s3 -1.3 3 -3 c0 -1.3 -.8 -2.4 -2 -2.8 V13.9 c.7 -.1 1.3 -.3 1.9 -.6 l5.6 7.1 A2.95 2.95 0 0 0 27 25 c1.7 0 3 -1.3 3 -3 s-1.3 -3 -3 -3 M16 4 c2.2 0 4 1.8 4 4 s-1.8 4 -4 4 -4 -1.8 -4 -4 1.8 -4 4 -4 M5 23 c-.6 0 -1 -.4 -1 -1 s.4 -1 1 -1 1 .4 1 1 -.4 1 -1 1 m11 5 c-.6 0 -1 -.4 -1 -1 s.4 -1 1 -1 1 .4 1 1 -.4 1 -1 1 m11 -5 c-.6 0 -1 -.4 -1 -1 s.4 -1 1 -1 1 .4 1 1 -.4 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 19
          moveTo(x = 27.0f, y = 19.0f)
          // c -0.3 0 -0.7 0.1 -1 0.2
          curveToRelative(
            dx1 = -0.3f,
            dy1 = 0.0f,
            dx2 = -0.7f,
            dy2 = 0.1f,
            dx3 = -1.0f,
            dy3 = 0.2f,
          )
          // L 20.4 12
          lineTo(x = 20.4f, y = 12.0f)
          // c 1 -1.1 1.6 -2.5 1.6 -4
          curveToRelative(
            dx1 = 1.0f,
            dy1 = -1.1f,
            dx2 = 1.6f,
            dy2 = -2.5f,
            dx3 = 1.6f,
            dy3 = -4.0f,
          )
          // c 0 -3.3 -2.7 -6 -6 -6
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.3f,
            dx2 = -2.7f,
            dy2 = -6.0f,
            dx3 = -6.0f,
            dy3 = -6.0f,
          )
          // s -6 2.7 -6 6
          reflectiveCurveToRelative(
            dx1 = -6.0f,
            dy1 = 2.7f,
            dx2 = -6.0f,
            dy2 = 6.0f,
          )
          // c 0 1.6 0.6 3 1.6 4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.6f,
            dx2 = 0.6f,
            dy2 = 3.0f,
            dx3 = 1.6f,
            dy3 = 4.0f,
          )
          // L 6 19.2
          lineTo(x = 6.0f, y = 19.2f)
          // A 2.95 2.95 0 0 0 2 22
          arcTo(
            horizontalEllipseRadius = 2.95f,
            verticalEllipseRadius = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 22.0f,
          )
          // c 0 1.7 1.3 3 3 3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.7f,
            dx2 = 1.3f,
            dy2 = 3.0f,
            dx3 = 3.0f,
            dy3 = 3.0f,
          )
          // a 2.95 2.95 0 0 0 2.5 -4.6
          arcToRelative(
            a = 2.95f,
            b = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.5f,
            dy1 = -4.6f,
          )
          // l 5.6 -7.1
          lineToRelative(dx = 5.6f, dy = -7.1f)
          // c 0.6 0.3 1.2 0.5 1.9 0.6
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 0.3f,
            dx2 = 1.2f,
            dy2 = 0.5f,
            dx3 = 1.9f,
            dy3 = 0.6f,
          )
          // v 10.3
          verticalLineToRelative(dy = 10.3f)
          // c -1.2 0.4 -2 1.5 -2 2.8
          curveToRelative(
            dx1 = -1.2f,
            dy1 = 0.4f,
            dx2 = -2.0f,
            dy2 = 1.5f,
            dx3 = -2.0f,
            dy3 = 2.8f,
          )
          // c 0 1.7 1.3 3 3 3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.7f,
            dx2 = 1.3f,
            dy2 = 3.0f,
            dx3 = 3.0f,
            dy3 = 3.0f,
          )
          // s 3 -1.3 3 -3
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = -1.3f,
            dx2 = 3.0f,
            dy2 = -3.0f,
          )
          // c 0 -1.3 -0.8 -2.4 -2 -2.8
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.3f,
            dx2 = -0.8f,
            dy2 = -2.4f,
            dx3 = -2.0f,
            dy3 = -2.8f,
          )
          // V 13.9
          verticalLineTo(y = 13.9f)
          // c 0.7 -0.1 1.3 -0.3 1.9 -0.6
          curveToRelative(
            dx1 = 0.7f,
            dy1 = -0.1f,
            dx2 = 1.3f,
            dy2 = -0.3f,
            dx3 = 1.9f,
            dy3 = -0.6f,
          )
          // l 5.6 7.1
          lineToRelative(dx = 5.6f, dy = 7.1f)
          // A 2.95 2.95 0 0 0 27 25
          arcTo(
            horizontalEllipseRadius = 2.95f,
            verticalEllipseRadius = 2.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 25.0f,
          )
          // c 1.7 0 3 -1.3 3 -3
          curveToRelative(
            dx1 = 1.7f,
            dy1 = 0.0f,
            dx2 = 3.0f,
            dy2 = -1.3f,
            dx3 = 3.0f,
            dy3 = -3.0f,
          )
          // s -1.3 -3 -3 -3
          reflectiveCurveToRelative(
            dx1 = -1.3f,
            dy1 = -3.0f,
            dx2 = -3.0f,
            dy2 = -3.0f,
          )
          // M 16 4
          moveTo(x = 16.0f, y = 4.0f)
          // c 2.2 0 4 1.8 4 4
          curveToRelative(
            dx1 = 2.2f,
            dy1 = 0.0f,
            dx2 = 4.0f,
            dy2 = 1.8f,
            dx3 = 4.0f,
            dy3 = 4.0f,
          )
          // s -1.8 4 -4 4
          reflectiveCurveToRelative(
            dx1 = -1.8f,
            dy1 = 4.0f,
            dx2 = -4.0f,
            dy2 = 4.0f,
          )
          // s -4 -1.8 -4 -4
          reflectiveCurveToRelative(
            dx1 = -4.0f,
            dy1 = -1.8f,
            dx2 = -4.0f,
            dy2 = -4.0f,
          )
          // s 1.8 -4 4 -4
          reflectiveCurveToRelative(
            dx1 = 1.8f,
            dy1 = -4.0f,
            dx2 = 4.0f,
            dy2 = -4.0f,
          )
          // M 5 23
          moveTo(x = 5.0f, y = 23.0f)
          // c -0.6 0 -1 -0.4 -1 -1
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = -0.4f,
            dx3 = -1.0f,
            dy3 = -1.0f,
          )
          // s 0.4 -1 1 -1
          reflectiveCurveToRelative(
            dx1 = 0.4f,
            dy1 = -1.0f,
            dx2 = 1.0f,
            dy2 = -1.0f,
          )
          // s 1 0.4 1 1
          reflectiveCurveToRelative(
            dx1 = 1.0f,
            dy1 = 0.4f,
            dx2 = 1.0f,
            dy2 = 1.0f,
          )
          // s -0.4 1 -1 1
          reflectiveCurveToRelative(
            dx1 = -0.4f,
            dy1 = 1.0f,
            dx2 = -1.0f,
            dy2 = 1.0f,
          )
          // m 11 5
          moveToRelative(dx = 11.0f, dy = 5.0f)
          // c -0.6 0 -1 -0.4 -1 -1
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = -0.4f,
            dx3 = -1.0f,
            dy3 = -1.0f,
          )
          // s 0.4 -1 1 -1
          reflectiveCurveToRelative(
            dx1 = 0.4f,
            dy1 = -1.0f,
            dx2 = 1.0f,
            dy2 = -1.0f,
          )
          // s 1 0.4 1 1
          reflectiveCurveToRelative(
            dx1 = 1.0f,
            dy1 = 0.4f,
            dx2 = 1.0f,
            dy2 = 1.0f,
          )
          // s -0.4 1 -1 1
          reflectiveCurveToRelative(
            dx1 = -0.4f,
            dy1 = 1.0f,
            dx2 = -1.0f,
            dy2 = 1.0f,
          )
          // m 11 -5
          moveToRelative(dx = 11.0f, dy = -5.0f)
          // c -0.6 0 -1 -0.4 -1 -1
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = -0.4f,
            dx3 = -1.0f,
            dy3 = -1.0f,
          )
          // s 0.4 -1 1 -1
          reflectiveCurveToRelative(
            dx1 = 0.4f,
            dy1 = -1.0f,
            dx2 = 1.0f,
            dy2 = -1.0f,
          )
          // s 1 0.4 1 1
          reflectiveCurveToRelative(
            dx1 = 1.0f,
            dy1 = 0.4f,
            dx2 = 1.0f,
            dy2 = 1.0f,
          )
          // s -0.4 1 -1 1
        reflectiveCurveToRelative(
          dx1 = -0.4f,
          dy1 = 1.0f,
          dx2 = -1.0f,
          dy2 = 1.0f,
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
      .also { _scisControlTower = it }
  }

@Suppress("ObjectPropertyName")
private var _scisControlTower: ImageVector? = null
