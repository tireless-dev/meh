// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LoadBalancerPool: ImageVector
  get() {
    val current = _loadBalancerPool
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LoadBalancerPool",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="12" height="2" x="10.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 15
          moveTo(x = 10.0f, y = 15.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M8.7 6.29 A3 3 0 0 0 9 5 a3 3 0 1 0 -3 3 3 3 0 0 0 1.29 -.3 L10 10.4 V13 h2 V9.59Z M6 6 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m13 -1 a3 3 0 1 0 -4 2.82 V13 h2 V7.82 A3 3 0 0 0 19 5 m-3 1 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m10 -4 a3 3 0 0 0 -3 3 3 3 0 0 0 .3 1.29 L20 9.59 V13 h2 v-2.59 l2.71 -2.71 A3 3 0 0 0 26 8 a3 3 0 0 0 0 -6 m0 4 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 M12 19 h-2 v2.59 L7.29 24.3 A3 3 0 0 0 6 24 a3 3 0 1 0 3 3 3 3 0 0 0 -.3 -1.29 l3.3 -3.3Z m-6 9 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m11 -3.82 V19 h-2 v5.18 a3 3 0 1 0 2 0 M16 28 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1 m10 -4 a3 3 0 0 0 -1.29 .3 L22 21.6 V19 h-2 v3.41 l3.3 3.3 A3 3 0 0 0 23 27 a3 3 0 1 0 3 -3 m0 4 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.7 6.29
          moveTo(x = 8.7f, y = 6.29f)
          // A 3 3 0 0 0 9 5
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 5.0f,
          )
          // a 3 3 0 1 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 0 1.29 -0.3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.29f,
            dy1 = -0.3f,
          )
          // L 10 10.4
          lineTo(x = 10.0f, y = 10.4f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9.59z
          verticalLineTo(y = 9.59f)
          close()
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m 13 -1
          moveToRelative(dx = 13.0f, dy = -1.0f)
          // a 3 3 0 1 0 -4 2.82
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 2.82f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 7.82
          verticalLineTo(y = 7.82f)
          // A 3 3 0 0 0 19 5
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 5.0f,
          )
          // m -3 1
          moveToRelative(dx = -3.0f, dy = 1.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m 10 -4
          moveToRelative(dx = 10.0f, dy = -4.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 0 0.3 1.29
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.3f,
            dy1 = 1.29f,
          )
          // L 20 9.59
          lineTo(x = 20.0f, y = 9.59f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.59
          verticalLineToRelative(dy = -2.59f)
          // l 2.71 -2.71
          lineToRelative(dx = 2.71f, dy = -2.71f)
          // A 3 3 0 0 0 26 8
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 8.0f,
          )
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // M 12 19
          moveTo(x = 12.0f, y = 19.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.59
          verticalLineToRelative(dy = 2.59f)
          // L 7.29 24.3
          lineTo(x = 7.29f, y = 24.3f)
          // A 3 3 0 0 0 6 24
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 24.0f,
          )
          // a 3 3 0 1 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 0 -0.3 -1.29
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.3f,
            dy1 = -1.29f,
          )
          // l 3.3 -3.3z
          lineToRelative(dx = 3.3f, dy = -3.3f)
          close()
          // m -6 9
          moveToRelative(dx = -6.0f, dy = 9.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m 11 -3.82
          moveToRelative(dx = 11.0f, dy = -3.82f)
          // V 19
          verticalLineTo(y = 19.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 5.18
          verticalLineToRelative(dy = 5.18f)
          // a 3 3 0 1 0 2 0
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // m 10 -4
          moveToRelative(dx = 10.0f, dy = -4.0f)
          // a 3 3 0 0 0 -1.29 0.3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.29f,
            dy1 = 0.3f,
          )
          // L 22 21.6
          lineTo(x = 22.0f, y = 21.6f)
          // V 19
          verticalLineTo(y = 19.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3.41
          verticalLineToRelative(dy = 3.41f)
          // l 3.3 3.3
          lineToRelative(dx = 3.3f, dy = 3.3f)
          // A 3 3 0 0 0 23 27
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 27.0f,
          )
          // a 3 3 0 1 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
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
      .also { _loadBalancerPool = it }
  }

@Suppress("ObjectPropertyName")
private var _loadBalancerPool: ImageVector? = null
