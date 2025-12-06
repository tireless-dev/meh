// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildImage: ImageVector
  get() {
    val current = _buildImage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BuildImage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 25 v-2 h-2.1 c-.1 -.6 -.4 -1.2 -.7 -1.8 l1.5 -1.5 -1.4 -1.4 -1.5 1.5 a5 5 0 0 0 -1.8 -.7 V17 h-2 v2.1 c-.6 .1 -1.2 .4 -1.8 .7 l-1.5 -1.5 -1.4 1.4 1.5 1.5 a5 5 0 0 0 -.7 1.8 H16 v2 h2.1 c.1 .6 .4 1.2 .7 1.8 l-1.5 1.5 1.4 1.4 1.5 -1.5 c.5 .3 1.1 .6 1.8 .7 V31 h2 v-2.1 c.6 -.1 1.2 -.4 1.8 -.7 l1.5 1.5 1.4 -1.4 -1.5 -1.5 c.3 -.5 .6 -1.1 .7 -1.8z m-7 2 c-1.7 0 -3 -1.3 -3 -3 s1.3 -3 3 -3 3 1.3 3 3 -1.3 3 -3 3 M21.49 7.13 l-9 -5 a1 1 0 0 0 -.98 0 l-9 5 A1 1 0 0 0 2 8 v10 a1 1 0 0 0 .51 .87 l9 5 A1 1 0 0 0 13 23 v-9.41 l7 -3.9 V14 h2 V8 a1 1 0 0 0 -.51 -.87 M12 4.14 18.94 8 12 11.86 5.06 8z M4 17.41 V9.7 l7 3.89 v7.71z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 25
          moveTo(x = 30.0f, y = 25.0f)
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
          // V 17
          verticalLineTo(y = 17.0f)
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
          // H 16
          horizontalLineTo(x = 16.0f)
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
          // V 31
          verticalLineTo(y = 31.0f)
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
          // M 21.49 7.13
          moveTo(x = 21.49f, y = 7.13f)
          // l -9 -5
          lineToRelative(dx = -9.0f, dy = -5.0f)
          // a 1 1 0 0 0 -0.98 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.98f,
            dy1 = 0.0f,
          )
          // l -9 5
          lineToRelative(dx = -9.0f, dy = 5.0f)
          // A 1 1 0 0 0 2 8
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 8.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 1 1 0 0 0 0.51 0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.51f,
            dy1 = 0.87f,
          )
          // l 9 5
          lineToRelative(dx = 9.0f, dy = 5.0f)
          // A 1 1 0 0 0 13 23
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.0f,
            y1 = 23.0f,
          )
          // v -9.41
          verticalLineToRelative(dy = -9.41f)
          // l 7 -3.9
          lineToRelative(dx = 7.0f, dy = -3.9f)
          // V 14
          verticalLineTo(y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 1 1 0 0 0 -0.51 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.51f,
            dy1 = -0.87f,
          )
          // M 12 4.14
          moveTo(x = 12.0f, y = 4.14f)
          // L 18.94 8
          lineTo(x = 18.94f, y = 8.0f)
          // L 12 11.86
          lineTo(x = 12.0f, y = 11.86f)
          // L 5.06 8z
          lineTo(x = 5.06f, y = 8.0f)
          close()
          // M 4 17.41
          moveTo(x = 4.0f, y = 17.41f)
          // V 9.7
          verticalLineTo(y = 9.7f)
          // l 7 3.89
          lineToRelative(dx = 7.0f, dy = 3.89f)
          // v 7.71z
          verticalLineToRelative(dy = 7.71f)
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
      .also { _buildImage = it }
  }

@Suppress("ObjectPropertyName")
private var _buildImage: ImageVector? = null
