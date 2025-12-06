// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TransformInstructions: ImageVector
  get() {
    val current = _transformInstructions
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TransformInstructions",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 17 v-2 h-2.1 c-.1 -.6 -.4 -1.2 -.7 -1.8 l1.5 -1.5 -1.4 -1.4 -1.5 1.5 a5 5 0 0 0 -1.8 -.7 V9 h-2 v2.1 c-.6 .1 -1.2 .4 -1.8 .7 l-1.5 -1.5 -1.4 1.4 1.5 1.5 a5 5 0 0 0 -.7 1.8 H9 v2 h2.1 c.1 .6 .4 1.2 .7 1.8 l-1.5 1.5 1.4 1.4 1.5 -1.5 c.5 .3 1.1 .6 1.8 .7 V23 h2 v-2.1 c.6 -.1 1.2 -.4 1.8 -.7 l1.5 1.5 1.4 -1.4 -1.5 -1.5 c.3 -.5 .6 -1.1 .7 -1.8z m-7 2 c-1.7 0 -3 -1.3 -3 -3 s1.3 -3 3 -3 3 1.3 3 3 -1.3 3 -3 3
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 17
          moveTo(x = 23.0f, y = 17.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // c -0.1 -0.6 -0.4 -1.2 -0.7 -1.8
          curveToRelative(
            dx1 = -0.1f,
            dy1 = -0.6f,
            dx2 = -0.4f,
            dy2 = -1.2f,
            dx3 = -0.7f,
            dy3 = -1.8f,
          )
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -1.8 -0.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.8f,
            dy1 = -0.7f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // c -0.6 0.1 -1.2 0.4 -1.8 0.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.1f,
            dx2 = -1.2f,
            dy2 = 0.4f,
            dx3 = -1.8f,
            dy3 = 0.7f,
          )
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -0.7 1.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 1.8f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // c 0.1 0.6 0.4 1.2 0.7 1.8
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.6f,
            dx2 = 0.4f,
            dy2 = 1.2f,
            dx3 = 0.7f,
            dy3 = 1.8f,
          )
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // c 0.5 0.3 1.1 0.6 1.8 0.7
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.3f,
            dx2 = 1.1f,
            dy2 = 0.6f,
            dx3 = 1.8f,
            dy3 = 0.7f,
          )
          // V 23
          verticalLineTo(y = 23.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // c 0.6 -0.1 1.2 -0.4 1.8 -0.7
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -0.1f,
            dx2 = 1.2f,
            dy2 = -0.4f,
            dx3 = 1.8f,
            dy3 = -0.7f,
          )
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // c 0.3 -0.5 0.6 -1.1 0.7 -1.8z
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.5f,
            dx2 = 0.6f,
            dy2 = -1.1f,
            dx3 = 0.7f,
            dy3 = -1.8f,
          )
          close()
          // m -7 2
          moveToRelative(dx = -7.0f, dy = 2.0f)
          // c -1.7 0 -3 -1.3 -3 -3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = -1.3f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // s 1.3 -3 3 -3
          reflectiveCurveToRelative(
            dx1 = 1.3f,
            dy1 = -3.0f,
            dx2 = 3.0f,
            dy2 = -3.0f,
          )
          // s 3 1.3 3 3
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 1.3f,
            dx2 = 3.0f,
            dy2 = 3.0f,
          )
          // s -1.3 3 -3 3
          reflectiveCurveToRelative(
            dx1 = -1.3f,
            dy1 = 3.0f,
            dx2 = -3.0f,
            dy2 = 3.0f,
          )
        }
        // M16 2 v2 c6.6 0 12 5.4 12 12 s-5.4 12 -12 12 v2 c7.7 0 14 -6.3 14 -14 S23.7 2 16 2 M8.2 25.1 7 26.7 c1.2 1 2.6 1.9 4.2 2.4 l.7 -1.9 c-1.4 -.5 -2.6 -1.2 -3.7 -2.1 m-4 -7.1 -2 .4 A15 15 0 0 0 3.9 23 l1.7 -1 c-.7 -1.2 -1.2 -2.6 -1.4 -4 m1.4 -8 L3.9 9 c-.8 1.4 -1.4 3 -1.6 4.6 l2 .3 c.1 -1.4 .6 -2.7 1.3 -3.9 m6.2 -5.2 -.7 -1.9 C9.6 3.5 8.2 4.3 7 5.3 l1.3 1.5 c1 -.8 2.2 -1.5 3.5 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // c 6.6 0 12 5.4 12 12
          curveToRelative(
            dx1 = 6.6f,
            dy1 = 0.0f,
            dx2 = 12.0f,
            dy2 = 5.4f,
            dx3 = 12.0f,
            dy3 = 12.0f,
          )
          // s -5.4 12 -12 12
          reflectiveCurveToRelative(
            dx1 = -5.4f,
            dy1 = 12.0f,
            dx2 = -12.0f,
            dy2 = 12.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // c 7.7 0 14 -6.3 14 -14
          curveToRelative(
            dx1 = 7.7f,
            dy1 = 0.0f,
            dx2 = 14.0f,
            dy2 = -6.3f,
            dx3 = 14.0f,
            dy3 = -14.0f,
          )
          // S 23.7 2 16 2
          reflectiveCurveTo(
            x1 = 23.7f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // M 8.2 25.1
          moveTo(x = 8.2f, y = 25.1f)
          // L 7 26.7
          lineTo(x = 7.0f, y = 26.7f)
          // c 1.2 1 2.6 1.9 4.2 2.4
          curveToRelative(
            dx1 = 1.2f,
            dy1 = 1.0f,
            dx2 = 2.6f,
            dy2 = 1.9f,
            dx3 = 4.2f,
            dy3 = 2.4f,
          )
          // l 0.7 -1.9
          lineToRelative(dx = 0.7f, dy = -1.9f)
          // c -1.4 -0.5 -2.6 -1.2 -3.7 -2.1
          curveToRelative(
            dx1 = -1.4f,
            dy1 = -0.5f,
            dx2 = -2.6f,
            dy2 = -1.2f,
            dx3 = -3.7f,
            dy3 = -2.1f,
          )
          // m -4 -7.1
          moveToRelative(dx = -4.0f, dy = -7.1f)
          // l -2 0.4
          lineToRelative(dx = -2.0f, dy = 0.4f)
          // A 15 15 0 0 0 3.9 23
          arcTo(
            horizontalEllipseRadius = 15.0f,
            verticalEllipseRadius = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 3.9f,
            y1 = 23.0f,
          )
          // l 1.7 -1
          lineToRelative(dx = 1.7f, dy = -1.0f)
          // c -0.7 -1.2 -1.2 -2.6 -1.4 -4
          curveToRelative(
            dx1 = -0.7f,
            dy1 = -1.2f,
            dx2 = -1.2f,
            dy2 = -2.6f,
            dx3 = -1.4f,
            dy3 = -4.0f,
          )
          // m 1.4 -8
          moveToRelative(dx = 1.4f, dy = -8.0f)
          // L 3.9 9
          lineTo(x = 3.9f, y = 9.0f)
          // c -0.8 1.4 -1.4 3 -1.6 4.6
          curveToRelative(
            dx1 = -0.8f,
            dy1 = 1.4f,
            dx2 = -1.4f,
            dy2 = 3.0f,
            dx3 = -1.6f,
            dy3 = 4.6f,
          )
          // l 2 0.3
          lineToRelative(dx = 2.0f, dy = 0.3f)
          // c 0.1 -1.4 0.6 -2.7 1.3 -3.9
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -1.4f,
            dx2 = 0.6f,
            dy2 = -2.7f,
            dx3 = 1.3f,
            dy3 = -3.9f,
          )
          // m 6.2 -5.2
          moveToRelative(dx = 6.2f, dy = -5.2f)
          // l -0.7 -1.9
          lineToRelative(dx = -0.7f, dy = -1.9f)
          // C 9.6 3.5 8.2 4.3 7 5.3
          curveTo(
            x1 = 9.6f,
            y1 = 3.5f,
            x2 = 8.2f,
            y2 = 4.3f,
            x3 = 7.0f,
            y3 = 5.3f,
          )
          // l 1.3 1.5
          lineToRelative(dx = 1.3f, dy = 1.5f)
          // c 1 -0.8 2.2 -1.5 3.5 -2
          curveToRelative(
            dx1 = 1.0f,
          dy1 = -0.8f,
          dx2 = 2.2f,
          dy2 = -1.5f,
          dx3 = 3.5f,
          dy3 = -2.0f,
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
      .also { _transformInstructions = it }
  }

@Suppress("ObjectPropertyName")
private var _transformInstructions: ImageVector? = null
