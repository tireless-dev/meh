// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AssemblyCluster: ImageVector
  get() {
    val current = _assemblyCluster
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AssemblyCluster",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m21.3 4.9 -4.5 -2.7 C16.5 2.1 16.3 2 16 2 s-.5 .1 -.7 .2 l-4.5 2.7 A1.6 1.6 0 0 0 10 6.2 v5.6 c0 .5 .3 1 .7 1.3 l4.5 2.7 c.2 .1 .5 .2 .7 .2 s.5 -.1 .7 -.2 l4.5 -2.7 c.4 -.3 .7 -.7 .7 -1.3 V6.2 c.2 -.5 -.1 -1 -.5 -1.3 M20 11.5 l-4 2.4 -4 -2.4 v-5 l4 -2.4 4 2.4z m9.3 7.4 -4.5 -2.7 C24.5 16.1 24.3 16 24 16 s-.5 .1 -.7 .2 l-4.5 2.7 a1.6 1.6 0 0 0 -.7 1.3 v5.6 c0 .5 .3 1 .7 1.3 l4.5 2.7 c.2 .1 .5 .2 .7 .2 s.5 -.1 .7 -.2 l4.5 -2.7 c.4 -.3 .7 -.7 .7 -1.3 v-5.6 c.1 -.5 -.2 -1 -.6 -1.3 M28 25.5 l-4 2.4 -4 -2.4 v-5 l4 -2.4 4 2.4z m-14.7 -6.6 -4.5 -2.7 C8.5 16.1 8.3 16 8 16 s-.5 .1 -.7 .2 l-4.5 2.7 A1.6 1.6 0 0 0 2 20.2 v5.6 c0 .5 .3 1 .7 1.3 l4.5 2.7 C7.5 29.9 7.7 30 8 30 s.5 -.1 .7 -.2 l4.5 -2.7 c.4 -.3 .7 -.7 .7 -1.3 v-5.6 c.1 -.5 -.2 -1 -.6 -1.3 M12 25.5 l-4 2.4 -4 -2.4 v-5 l4 -2.4 4 2.4z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.3 4.9
          moveTo(x = 21.3f, y = 4.9f)
          // l -4.5 -2.7
          lineToRelative(dx = -4.5f, dy = -2.7f)
          // C 16.5 2.1 16.3 2 16 2
          curveTo(
            x1 = 16.5f,
            y1 = 2.1f,
            x2 = 16.3f,
            y2 = 2.0f,
            x3 = 16.0f,
            y3 = 2.0f,
          )
          // s -0.5 0.1 -0.7 0.2
          reflectiveCurveToRelative(
            dx1 = -0.5f,
            dy1 = 0.1f,
            dx2 = -0.7f,
            dy2 = 0.2f,
          )
          // l -4.5 2.7
          lineToRelative(dx = -4.5f, dy = 2.7f)
          // A 1.6 1.6 0 0 0 10 6.2
          arcTo(
            horizontalEllipseRadius = 1.6f,
            verticalEllipseRadius = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 6.2f,
          )
          // v 5.6
          verticalLineToRelative(dy = 5.6f)
          // c 0 0.5 0.3 1 0.7 1.3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.3f,
            dy2 = 1.0f,
            dx3 = 0.7f,
            dy3 = 1.3f,
          )
          // l 4.5 2.7
          lineToRelative(dx = 4.5f, dy = 2.7f)
          // c 0.2 0.1 0.5 0.2 0.7 0.2
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.1f,
            dx2 = 0.5f,
            dy2 = 0.2f,
            dx3 = 0.7f,
            dy3 = 0.2f,
          )
          // s 0.5 -0.1 0.7 -0.2
          reflectiveCurveToRelative(
            dx1 = 0.5f,
            dy1 = -0.1f,
            dx2 = 0.7f,
            dy2 = -0.2f,
          )
          // l 4.5 -2.7
          lineToRelative(dx = 4.5f, dy = -2.7f)
          // c 0.4 -0.3 0.7 -0.7 0.7 -1.3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.3f,
            dx2 = 0.7f,
            dy2 = -0.7f,
            dx3 = 0.7f,
            dy3 = -1.3f,
          )
          // V 6.2
          verticalLineTo(y = 6.2f)
          // c 0.2 -0.5 -0.1 -1 -0.5 -1.3
          curveToRelative(
            dx1 = 0.2f,
            dy1 = -0.5f,
            dx2 = -0.1f,
            dy2 = -1.0f,
            dx3 = -0.5f,
            dy3 = -1.3f,
          )
          // M 20 11.5
          moveTo(x = 20.0f, y = 11.5f)
          // l -4 2.4
          lineToRelative(dx = -4.0f, dy = 2.4f)
          // l -4 -2.4
          lineToRelative(dx = -4.0f, dy = -2.4f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // l 4 -2.4
          lineToRelative(dx = 4.0f, dy = -2.4f)
          // l 4 2.4z
          lineToRelative(dx = 4.0f, dy = 2.4f)
          close()
          // m 9.3 7.4
          moveToRelative(dx = 9.3f, dy = 7.4f)
          // l -4.5 -2.7
          lineToRelative(dx = -4.5f, dy = -2.7f)
          // C 24.5 16.1 24.3 16 24 16
          curveTo(
            x1 = 24.5f,
            y1 = 16.1f,
            x2 = 24.3f,
            y2 = 16.0f,
            x3 = 24.0f,
            y3 = 16.0f,
          )
          // s -0.5 0.1 -0.7 0.2
          reflectiveCurveToRelative(
            dx1 = -0.5f,
            dy1 = 0.1f,
            dx2 = -0.7f,
            dy2 = 0.2f,
          )
          // l -4.5 2.7
          lineToRelative(dx = -4.5f, dy = 2.7f)
          // a 1.6 1.6 0 0 0 -0.7 1.3
          arcToRelative(
            a = 1.6f,
            b = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 1.3f,
          )
          // v 5.6
          verticalLineToRelative(dy = 5.6f)
          // c 0 0.5 0.3 1 0.7 1.3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.3f,
            dy2 = 1.0f,
            dx3 = 0.7f,
            dy3 = 1.3f,
          )
          // l 4.5 2.7
          lineToRelative(dx = 4.5f, dy = 2.7f)
          // c 0.2 0.1 0.5 0.2 0.7 0.2
          curveToRelative(
            dx1 = 0.2f,
            dy1 = 0.1f,
            dx2 = 0.5f,
            dy2 = 0.2f,
            dx3 = 0.7f,
            dy3 = 0.2f,
          )
          // s 0.5 -0.1 0.7 -0.2
          reflectiveCurveToRelative(
            dx1 = 0.5f,
            dy1 = -0.1f,
            dx2 = 0.7f,
            dy2 = -0.2f,
          )
          // l 4.5 -2.7
          lineToRelative(dx = 4.5f, dy = -2.7f)
          // c 0.4 -0.3 0.7 -0.7 0.7 -1.3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.3f,
            dx2 = 0.7f,
            dy2 = -0.7f,
            dx3 = 0.7f,
            dy3 = -1.3f,
          )
          // v -5.6
          verticalLineToRelative(dy = -5.6f)
          // c 0.1 -0.5 -0.2 -1 -0.6 -1.3
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -0.5f,
            dx2 = -0.2f,
            dy2 = -1.0f,
            dx3 = -0.6f,
            dy3 = -1.3f,
          )
          // M 28 25.5
          moveTo(x = 28.0f, y = 25.5f)
          // l -4 2.4
          lineToRelative(dx = -4.0f, dy = 2.4f)
          // l -4 -2.4
          lineToRelative(dx = -4.0f, dy = -2.4f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // l 4 -2.4
          lineToRelative(dx = 4.0f, dy = -2.4f)
          // l 4 2.4z
          lineToRelative(dx = 4.0f, dy = 2.4f)
          close()
          // m -14.7 -6.6
          moveToRelative(dx = -14.7f, dy = -6.6f)
          // l -4.5 -2.7
          lineToRelative(dx = -4.5f, dy = -2.7f)
          // C 8.5 16.1 8.3 16 8 16
          curveTo(
            x1 = 8.5f,
            y1 = 16.1f,
            x2 = 8.3f,
            y2 = 16.0f,
            x3 = 8.0f,
            y3 = 16.0f,
          )
          // s -0.5 0.1 -0.7 0.2
          reflectiveCurveToRelative(
            dx1 = -0.5f,
            dy1 = 0.1f,
            dx2 = -0.7f,
            dy2 = 0.2f,
          )
          // l -4.5 2.7
          lineToRelative(dx = -4.5f, dy = 2.7f)
          // A 1.6 1.6 0 0 0 2 20.2
          arcTo(
            horizontalEllipseRadius = 1.6f,
            verticalEllipseRadius = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 20.2f,
          )
          // v 5.6
          verticalLineToRelative(dy = 5.6f)
          // c 0 0.5 0.3 1 0.7 1.3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.5f,
            dx2 = 0.3f,
            dy2 = 1.0f,
            dx3 = 0.7f,
            dy3 = 1.3f,
          )
          // l 4.5 2.7
          lineToRelative(dx = 4.5f, dy = 2.7f)
          // C 7.5 29.9 7.7 30 8 30
          curveTo(
            x1 = 7.5f,
            y1 = 29.9f,
            x2 = 7.7f,
            y2 = 30.0f,
            x3 = 8.0f,
            y3 = 30.0f,
          )
          // s 0.5 -0.1 0.7 -0.2
          reflectiveCurveToRelative(
            dx1 = 0.5f,
            dy1 = -0.1f,
            dx2 = 0.7f,
            dy2 = -0.2f,
          )
          // l 4.5 -2.7
          lineToRelative(dx = 4.5f, dy = -2.7f)
          // c 0.4 -0.3 0.7 -0.7 0.7 -1.3
          curveToRelative(
            dx1 = 0.4f,
            dy1 = -0.3f,
            dx2 = 0.7f,
            dy2 = -0.7f,
            dx3 = 0.7f,
            dy3 = -1.3f,
          )
          // v -5.6
          verticalLineToRelative(dy = -5.6f)
          // c 0.1 -0.5 -0.2 -1 -0.6 -1.3
          curveToRelative(
            dx1 = 0.1f,
            dy1 = -0.5f,
            dx2 = -0.2f,
            dy2 = -1.0f,
            dx3 = -0.6f,
            dy3 = -1.3f,
          )
          // M 12 25.5
          moveTo(x = 12.0f, y = 25.5f)
          // l -4 2.4
          lineToRelative(dx = -4.0f, dy = 2.4f)
          // l -4 -2.4
          lineToRelative(dx = -4.0f, dy = -2.4f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // l 4 -2.4
        lineToRelative(dx = 4.0f, dy = -2.4f)
        // l 4 2.4z
        lineToRelative(dx = 4.0f, dy = 2.4f)
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
      .also { _assemblyCluster = it }
  }

@Suppress("ObjectPropertyName")
private var _assemblyCluster: ImageVector? = null
