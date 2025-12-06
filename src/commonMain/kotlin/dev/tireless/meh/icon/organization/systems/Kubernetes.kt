// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Kubernetes: ImageVector
  get() {
    val current = _kubernetes
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Kubernetes",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.22 17.96 -3.3 -.75 a9.8 9.8 0 0 0 -1.53 -6.62 l2.54 -2.03 L25.7 7 l-2.54 2.02 A10 10 0 0 0 17 6.05 V3 h-2 v3.05 a10 10 0 0 0 -6.15 2.97 L6.31 7 5.07 8.56 l2.54 2.03 a9.8 9.8 0 0 0 -1.53 6.62 l-3.3 .75 .44 1.95 3.3 -.75 a10 10 0 0 0 4.27 5.36 l-1.33 2.76 1.8 .87 1.33 -2.76 a9.8 9.8 0 0 0 6.82 0 l1.33 2.76 1.8 -.87 -1.33 -2.76 a10 10 0 0 0 4.27 -5.36 l3.3 .75Z M24 16 l-.04 .76 -5 -1.14 a3 3 0 0 0 -.14 -.6 l4 -3.18 A8 8 0 0 1 24 16 m-9 0 a1 1 0 1 1 1 1 1 1 0 0 1 -1 -1 m6.58 -5.73 -4 3.2 A3 3 0 0 0 17 13.17 V8.07 a8 8 0 0 1 4.58 2.2 M15 8.07 v5.11 a3 3 0 0 0 -.58 .28 l-4 -3.19 A8 8 0 0 1 15 8.07 M8 16 a8 8 0 0 1 1.18 -4.16 l4 3.19 a3 3 0 0 0 -.14 .6 l-5 1.13z m.48 2.71 4.98 -1.13 a3 3 0 0 0 .41 .53 l-2.21 4.6 a8 8 0 0 1 -3.18 -4 M16 24 a8 8 0 0 1 -2.54 -.42 l2.22 -4.61 L16 19 l.32 -.03 2.22 4.61 A8 8 0 0 1 16 24 m4.34 -1.29 -2.21 -4.6 a3 3 0 0 0 .41 -.53 l4.98 1.13 a8 8 0 0 1 -3.18 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.22 17.96
          moveTo(x = 29.22f, y = 17.96f)
          // l -3.3 -0.75
          lineToRelative(dx = -3.3f, dy = -0.75f)
          // a 9.8 9.8 0 0 0 -1.53 -6.62
          arcToRelative(
            a = 9.8f,
            b = 9.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.53f,
            dy1 = -6.62f,
          )
          // l 2.54 -2.03
          lineToRelative(dx = 2.54f, dy = -2.03f)
          // L 25.7 7
          lineTo(x = 25.7f, y = 7.0f)
          // l -2.54 2.02
          lineToRelative(dx = -2.54f, dy = 2.02f)
          // A 10 10 0 0 0 17 6.05
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 6.05f,
          )
          // V 3
          verticalLineTo(y = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3.05
          verticalLineToRelative(dy = 3.05f)
          // a 10 10 0 0 0 -6.15 2.97
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.15f,
            dy1 = 2.97f,
          )
          // L 6.31 7
          lineTo(x = 6.31f, y = 7.0f)
          // L 5.07 8.56
          lineTo(x = 5.07f, y = 8.56f)
          // l 2.54 2.03
          lineToRelative(dx = 2.54f, dy = 2.03f)
          // a 9.8 9.8 0 0 0 -1.53 6.62
          arcToRelative(
            a = 9.8f,
            b = 9.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.53f,
            dy1 = 6.62f,
          )
          // l -3.3 0.75
          lineToRelative(dx = -3.3f, dy = 0.75f)
          // l 0.44 1.95
          lineToRelative(dx = 0.44f, dy = 1.95f)
          // l 3.3 -0.75
          lineToRelative(dx = 3.3f, dy = -0.75f)
          // a 10 10 0 0 0 4.27 5.36
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.27f,
            dy1 = 5.36f,
          )
          // l -1.33 2.76
          lineToRelative(dx = -1.33f, dy = 2.76f)
          // l 1.8 0.87
          lineToRelative(dx = 1.8f, dy = 0.87f)
          // l 1.33 -2.76
          lineToRelative(dx = 1.33f, dy = -2.76f)
          // a 9.8 9.8 0 0 0 6.82 0
          arcToRelative(
            a = 9.8f,
            b = 9.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 6.82f,
            dy1 = 0.0f,
          )
          // l 1.33 2.76
          lineToRelative(dx = 1.33f, dy = 2.76f)
          // l 1.8 -0.87
          lineToRelative(dx = 1.8f, dy = -0.87f)
          // l -1.33 -2.76
          lineToRelative(dx = -1.33f, dy = -2.76f)
          // a 10 10 0 0 0 4.27 -5.36
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.27f,
            dy1 = -5.36f,
          )
          // l 3.3 0.75z
          lineToRelative(dx = 3.3f, dy = 0.75f)
          close()
          // M 24 16
          moveTo(x = 24.0f, y = 16.0f)
          // l -0.04 0.76
          lineToRelative(dx = -0.04f, dy = 0.76f)
          // l -5 -1.14
          lineToRelative(dx = -5.0f, dy = -1.14f)
          // a 3 3 0 0 0 -0.14 -0.6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.14f,
            dy1 = -0.6f,
          )
          // l 4 -3.18
          lineToRelative(dx = 4.0f, dy = -3.18f)
          // A 8 8 0 0 1 24 16
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 16.0f,
          )
          // m -9 0
          moveToRelative(dx = -9.0f, dy = 0.0f)
          // a 1 1 0 1 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // m 6.58 -5.73
          moveToRelative(dx = 6.58f, dy = -5.73f)
          // l -4 3.2
          lineToRelative(dx = -4.0f, dy = 3.2f)
          // A 3 3 0 0 0 17 13.17
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 13.17f,
          )
          // V 8.07
          verticalLineTo(y = 8.07f)
          // a 8 8 0 0 1 4.58 2.2
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.58f,
            dy1 = 2.2f,
          )
          // M 15 8.07
          moveTo(x = 15.0f, y = 8.07f)
          // v 5.11
          verticalLineToRelative(dy = 5.11f)
          // a 3 3 0 0 0 -0.58 0.28
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.58f,
            dy1 = 0.28f,
          )
          // l -4 -3.19
          lineToRelative(dx = -4.0f, dy = -3.19f)
          // A 8 8 0 0 1 15 8.07
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 8.07f,
          )
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // a 8 8 0 0 1 1.18 -4.16
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.18f,
            dy1 = -4.16f,
          )
          // l 4 3.19
          lineToRelative(dx = 4.0f, dy = 3.19f)
          // a 3 3 0 0 0 -0.14 0.6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.14f,
            dy1 = 0.6f,
          )
          // l -5 1.13z
          lineToRelative(dx = -5.0f, dy = 1.13f)
          close()
          // m 0.48 2.71
          moveToRelative(dx = 0.48f, dy = 2.71f)
          // l 4.98 -1.13
          lineToRelative(dx = 4.98f, dy = -1.13f)
          // a 3 3 0 0 0 0.41 0.53
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.41f,
            dy1 = 0.53f,
          )
          // l -2.21 4.6
          lineToRelative(dx = -2.21f, dy = 4.6f)
          // a 8 8 0 0 1 -3.18 -4
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.18f,
            dy1 = -4.0f,
          )
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // a 8 8 0 0 1 -2.54 -0.42
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.54f,
            dy1 = -0.42f,
          )
          // l 2.22 -4.61
          lineToRelative(dx = 2.22f, dy = -4.61f)
          // L 16 19
          lineTo(x = 16.0f, y = 19.0f)
          // l 0.32 -0.03
          lineToRelative(dx = 0.32f, dy = -0.03f)
          // l 2.22 4.61
          lineToRelative(dx = 2.22f, dy = 4.61f)
          // A 8 8 0 0 1 16 24
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 24.0f,
          )
          // m 4.34 -1.29
          moveToRelative(dx = 4.34f, dy = -1.29f)
          // l -2.21 -4.6
          lineToRelative(dx = -2.21f, dy = -4.6f)
          // a 3 3 0 0 0 0.41 -0.53
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.41f,
            dy1 = -0.53f,
          )
          // l 4.98 1.13
          lineToRelative(dx = 4.98f, dy = 1.13f)
          // a 8 8 0 0 1 -3.18 4
          arcToRelative(
          a = 8.0f,
          b = 8.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          dx1 = -3.18f,
          dy1 = 4.0f,
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
      .also { _kubernetes = it }
  }

@Suppress("ObjectPropertyName")
private var _kubernetes: ImageVector? = null
