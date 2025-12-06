// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.research

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Qiskit: ImageVector
  get() {
    val current = _qiskit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Qiskit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 1 C7.73 1 1 7.73 1 16 s6.73 15 15 15 15 -6.73 15 -15 S24.27 1 16 1 m6.58 20.5 a3 3 0 0 0 -3.11 -1.45 l-1.73 -3.02 c6.79 .24 10.12 1.83 10.26 2.47 -.1 .46 -1.9 1.41 -5.42 2 M20 22 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 M3 16 a13 13 0 0 1 .1 -1.6 A11 11 0 0 0 6.84 16 a11 11 0 0 0 -3.72 1.6 A13 13 0 0 1 3 16 m6.42 -5.5 a3 3 0 0 0 3.11 1.45 l1.73 3.02 C7.46 14.73 4.12 13.13 4 12.5 c.09 -.46 1.88 -1.41 5.42 -2 M12 10 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m13.17 6 a11 11 0 0 0 3.72 -1.6 13 13 0 0 1 0 3.2 11 11 0 0 0 -3.72 -1.6 M16 3 a13 13 0 0 1 11.39 6.75 c-2.29 -1 -5.8 -1.56 -9.39 -1.7 v2 c6.61 .26 9.87 1.82 10 2.45 -.14 .68 -3.85 2.4 -11.42 2.5 l-2.32 -4.05 A3 3 0 0 0 15 9 a3 3 0 0 0 -5.95 -.46 19 19 0 0 0 -4.44 1.2 A13 13 0 0 1 16 3 m0 26 a13 13 0 0 1 -11.39 -6.75 c2.29 1 5.8 1.56 9.39 1.7 v-2 C7.37 21.7 4.12 20.14 4 19.5 c.13 -.67 3.84 -2.4 11.42 -2.5 l2.32 4.05 A3 3 0 0 0 17 23 a3 3 0 0 0 5.95 .46 19 19 0 0 0 4.44 -1.2 A13 13 0 0 1 16 29
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 1
          moveTo(x = 16.0f, y = 1.0f)
          // C 7.73 1 1 7.73 1 16
          curveTo(
            x1 = 7.73f,
            y1 = 1.0f,
            x2 = 1.0f,
            y2 = 7.73f,
            x3 = 1.0f,
            y3 = 16.0f,
          )
          // s 6.73 15 15 15
          reflectiveCurveToRelative(
            dx1 = 6.73f,
            dy1 = 15.0f,
            dx2 = 15.0f,
            dy2 = 15.0f,
          )
          // s 15 -6.73 15 -15
          reflectiveCurveToRelative(
            dx1 = 15.0f,
            dy1 = -6.73f,
            dx2 = 15.0f,
            dy2 = -15.0f,
          )
          // S 24.27 1 16 1
          reflectiveCurveTo(
            x1 = 24.27f,
            y1 = 1.0f,
            x2 = 16.0f,
            y2 = 1.0f,
          )
          // m 6.58 20.5
          moveToRelative(dx = 6.58f, dy = 20.5f)
          // a 3 3 0 0 0 -3.11 -1.45
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.11f,
            dy1 = -1.45f,
          )
          // l -1.73 -3.02
          lineToRelative(dx = -1.73f, dy = -3.02f)
          // c 6.79 0.24 10.12 1.83 10.26 2.47
          curveToRelative(
            dx1 = 6.79f,
            dy1 = 0.24f,
            dx2 = 10.12f,
            dy2 = 1.83f,
            dx3 = 10.26f,
            dy3 = 2.47f,
          )
          // c -0.1 0.46 -1.9 1.41 -5.42 2
          curveToRelative(
            dx1 = -0.1f,
            dy1 = 0.46f,
            dx2 = -1.9f,
            dy2 = 1.41f,
            dx3 = -5.42f,
            dy3 = 2.0f,
          )
          // M 20 22
          moveTo(x = 20.0f, y = 22.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // M 3 16
          moveTo(x = 3.0f, y = 16.0f)
          // a 13 13 0 0 1 0.1 -1.6
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.1f,
            dy1 = -1.6f,
          )
          // A 11 11 0 0 0 6.84 16
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.84f,
            y1 = 16.0f,
          )
          // a 11 11 0 0 0 -3.72 1.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.72f,
            dy1 = 1.6f,
          )
          // A 13 13 0 0 1 3 16
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 16.0f,
          )
          // m 6.42 -5.5
          moveToRelative(dx = 6.42f, dy = -5.5f)
          // a 3 3 0 0 0 3.11 1.45
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.11f,
            dy1 = 1.45f,
          )
          // l 1.73 3.02
          lineToRelative(dx = 1.73f, dy = 3.02f)
          // C 7.46 14.73 4.12 13.13 4 12.5
          curveTo(
            x1 = 7.46f,
            y1 = 14.73f,
            x2 = 4.12f,
            y2 = 13.13f,
            x3 = 4.0f,
            y3 = 12.5f,
          )
          // c 0.09 -0.46 1.88 -1.41 5.42 -2
          curveToRelative(
            dx1 = 0.09f,
            dy1 = -0.46f,
            dx2 = 1.88f,
            dy2 = -1.41f,
            dx3 = 5.42f,
            dy3 = -2.0f,
          )
          // M 12 10
          moveTo(x = 12.0f, y = 10.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m 13.17 6
          moveToRelative(dx = 13.17f, dy = 6.0f)
          // a 11 11 0 0 0 3.72 -1.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.72f,
            dy1 = -1.6f,
          )
          // a 13 13 0 0 1 0 3.2
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.2f,
          )
          // a 11 11 0 0 0 -3.72 -1.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.72f,
            dy1 = -1.6f,
          )
          // M 16 3
          moveTo(x = 16.0f, y = 3.0f)
          // a 13 13 0 0 1 11.39 6.75
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 11.39f,
            dy1 = 6.75f,
          )
          // c -2.29 -1 -5.8 -1.56 -9.39 -1.7
          curveToRelative(
            dx1 = -2.29f,
            dy1 = -1.0f,
            dx2 = -5.8f,
            dy2 = -1.56f,
            dx3 = -9.39f,
            dy3 = -1.7f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // c 6.61 0.26 9.87 1.82 10 2.45
          curveToRelative(
            dx1 = 6.61f,
            dy1 = 0.26f,
            dx2 = 9.87f,
            dy2 = 1.82f,
            dx3 = 10.0f,
            dy3 = 2.45f,
          )
          // c -0.14 0.68 -3.85 2.4 -11.42 2.5
          curveToRelative(
            dx1 = -0.14f,
            dy1 = 0.68f,
            dx2 = -3.85f,
            dy2 = 2.4f,
            dx3 = -11.42f,
            dy3 = 2.5f,
          )
          // l -2.32 -4.05
          lineToRelative(dx = -2.32f, dy = -4.05f)
          // A 3 3 0 0 0 15 9
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 9.0f,
          )
          // a 3 3 0 0 0 -5.95 -0.46
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.95f,
            dy1 = -0.46f,
          )
          // a 19 19 0 0 0 -4.44 1.2
          arcToRelative(
            a = 19.0f,
            b = 19.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.44f,
            dy1 = 1.2f,
          )
          // A 13 13 0 0 1 16 3
          arcTo(
            horizontalEllipseRadius = 13.0f,
            verticalEllipseRadius = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 3.0f,
          )
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // a 13 13 0 0 1 -11.39 -6.75
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -11.39f,
            dy1 = -6.75f,
          )
          // c 2.29 1 5.8 1.56 9.39 1.7
          curveToRelative(
            dx1 = 2.29f,
            dy1 = 1.0f,
            dx2 = 5.8f,
            dy2 = 1.56f,
            dx3 = 9.39f,
            dy3 = 1.7f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // C 7.37 21.7 4.12 20.14 4 19.5
          curveTo(
            x1 = 7.37f,
            y1 = 21.7f,
            x2 = 4.12f,
            y2 = 20.14f,
            x3 = 4.0f,
            y3 = 19.5f,
          )
          // c 0.13 -0.67 3.84 -2.4 11.42 -2.5
          curveToRelative(
            dx1 = 0.13f,
            dy1 = -0.67f,
            dx2 = 3.84f,
            dy2 = -2.4f,
            dx3 = 11.42f,
            dy3 = -2.5f,
          )
          // l 2.32 4.05
          lineToRelative(dx = 2.32f, dy = 4.05f)
          // A 3 3 0 0 0 17 23
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 23.0f,
          )
          // a 3 3 0 0 0 5.95 0.46
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.95f,
            dy1 = 0.46f,
          )
          // a 19 19 0 0 0 4.44 -1.2
          arcToRelative(
            a = 19.0f,
            b = 19.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.44f,
            dy1 = -1.2f,
          )
          // A 13 13 0 0 1 16 29
        arcTo(
          horizontalEllipseRadius = 13.0f,
          verticalEllipseRadius = 13.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          x1 = 16.0f,
          y1 = 29.0f,
        )
      }
      // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
      path(
        fill = SolidColor(Color.Transparent),
        strokeLineWidth = 0.0f,
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
      .also { _qiskit = it }
  }

@Suppress("ObjectPropertyName")
private var _qiskit: ImageVector? = null
