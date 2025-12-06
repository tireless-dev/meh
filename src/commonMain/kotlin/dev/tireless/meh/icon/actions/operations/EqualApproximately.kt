// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EqualApproximately: ImageVector
  get() {
    val current = _equalApproximately
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EqualApproximately",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 15 c-1.78 0 -3.23 -.87 -4.51 -1.64 C14.32 12.66 13.22 12 12 12 c-1.4 0 -2.45 .86 -3.3 1.7 l-1.4 -1.4 C8.35 11.22 9.85 10 12 10 c1.78 0 3.23 .87 4.51 1.64 C17.68 12.34 18.78 13 20 13 c1.4 0 2.45 -.86 3.3 -1.7 l1.4 1.4 C23.65 13.78 22.15 15 20 15 m0 7 c-1.78 0 -3.23 -.87 -4.51 -1.64 C14.32 19.66 13.22 19 12 19 c-1.4 0 -2.45 .86 -3.3 1.7 l-1.4 -1.4 C8.35 18.22 9.85 17 12 17 c1.78 0 3.23 .87 4.51 1.64 C17.68 19.34 18.78 20 20 20 c1.4 0 2.45 -.86 3.3 -1.7 l1.4 1.4 C23.65 20.78 22.15 22 20 22
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 15
          moveTo(x = 20.0f, y = 15.0f)
          // c -1.78 0 -3.23 -0.87 -4.51 -1.64
          curveToRelative(
            dx1 = -1.78f,
            dy1 = 0.0f,
            dx2 = -3.23f,
            dy2 = -0.87f,
            dx3 = -4.51f,
            dy3 = -1.64f,
          )
          // C 14.32 12.66 13.22 12 12 12
          curveTo(
            x1 = 14.32f,
            y1 = 12.66f,
            x2 = 13.22f,
            y2 = 12.0f,
            x3 = 12.0f,
            y3 = 12.0f,
          )
          // c -1.4 0 -2.45 0.86 -3.3 1.7
          curveToRelative(
            dx1 = -1.4f,
            dy1 = 0.0f,
            dx2 = -2.45f,
            dy2 = 0.86f,
            dx3 = -3.3f,
            dy3 = 1.7f,
          )
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // C 8.35 11.22 9.85 10 12 10
          curveTo(
            x1 = 8.35f,
            y1 = 11.22f,
            x2 = 9.85f,
            y2 = 10.0f,
            x3 = 12.0f,
            y3 = 10.0f,
          )
          // c 1.78 0 3.23 0.87 4.51 1.64
          curveToRelative(
            dx1 = 1.78f,
            dy1 = 0.0f,
            dx2 = 3.23f,
            dy2 = 0.87f,
            dx3 = 4.51f,
            dy3 = 1.64f,
          )
          // C 17.68 12.34 18.78 13 20 13
          curveTo(
            x1 = 17.68f,
            y1 = 12.34f,
            x2 = 18.78f,
            y2 = 13.0f,
            x3 = 20.0f,
            y3 = 13.0f,
          )
          // c 1.4 0 2.45 -0.86 3.3 -1.7
          curveToRelative(
            dx1 = 1.4f,
            dy1 = 0.0f,
            dx2 = 2.45f,
            dy2 = -0.86f,
            dx3 = 3.3f,
            dy3 = -1.7f,
          )
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // C 23.65 13.78 22.15 15 20 15
          curveTo(
            x1 = 23.65f,
            y1 = 13.78f,
            x2 = 22.15f,
            y2 = 15.0f,
            x3 = 20.0f,
            y3 = 15.0f,
          )
          // m 0 7
          moveToRelative(dx = 0.0f, dy = 7.0f)
          // c -1.78 0 -3.23 -0.87 -4.51 -1.64
          curveToRelative(
            dx1 = -1.78f,
            dy1 = 0.0f,
            dx2 = -3.23f,
            dy2 = -0.87f,
            dx3 = -4.51f,
            dy3 = -1.64f,
          )
          // C 14.32 19.66 13.22 19 12 19
          curveTo(
            x1 = 14.32f,
            y1 = 19.66f,
            x2 = 13.22f,
            y2 = 19.0f,
            x3 = 12.0f,
            y3 = 19.0f,
          )
          // c -1.4 0 -2.45 0.86 -3.3 1.7
          curveToRelative(
            dx1 = -1.4f,
            dy1 = 0.0f,
            dx2 = -2.45f,
            dy2 = 0.86f,
            dx3 = -3.3f,
            dy3 = 1.7f,
          )
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // C 8.35 18.22 9.85 17 12 17
          curveTo(
            x1 = 8.35f,
            y1 = 18.22f,
            x2 = 9.85f,
            y2 = 17.0f,
            x3 = 12.0f,
            y3 = 17.0f,
          )
          // c 1.78 0 3.23 0.87 4.51 1.64
          curveToRelative(
            dx1 = 1.78f,
            dy1 = 0.0f,
            dx2 = 3.23f,
            dy2 = 0.87f,
            dx3 = 4.51f,
            dy3 = 1.64f,
          )
          // C 17.68 19.34 18.78 20 20 20
          curveTo(
            x1 = 17.68f,
            y1 = 19.34f,
            x2 = 18.78f,
            y2 = 20.0f,
            x3 = 20.0f,
            y3 = 20.0f,
          )
          // c 1.4 0 2.45 -0.86 3.3 -1.7
          curveToRelative(
            dx1 = 1.4f,
            dy1 = 0.0f,
            dx2 = 2.45f,
            dy2 = -0.86f,
            dx3 = 3.3f,
            dy3 = -1.7f,
          )
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // C 23.65 20.78 22.15 22 20 22
          curveTo(
            x1 = 23.65f,
            y1 = 20.78f,
            x2 = 22.15f,
            y2 = 22.0f,
            x3 = 20.0f,
            y3 = 22.0f,
          )
        }
        // M16 30 C8.28 30 2 23.72 2 16 S8.28 2 16 2 s14 6.28 14 14 -6.28 14 -14 14 m0 -26 a12.01 12.01 0 1 0 12 12 c0 -6.62 -5.38 -12 -12 -12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // C 8.28 30 2 23.72 2 16
          curveTo(
            x1 = 8.28f,
            y1 = 30.0f,
            x2 = 2.0f,
            y2 = 23.72f,
            x3 = 2.0f,
            y3 = 16.0f,
          )
          // S 8.28 2 16 2
          reflectiveCurveTo(
            x1 = 8.28f,
            y1 = 2.0f,
            x2 = 16.0f,
            y2 = 2.0f,
          )
          // s 14 6.28 14 14
          reflectiveCurveToRelative(
            dx1 = 14.0f,
            dy1 = 6.28f,
            dx2 = 14.0f,
            dy2 = 14.0f,
          )
          // s -6.28 14 -14 14
          reflectiveCurveToRelative(
            dx1 = -6.28f,
            dy1 = 14.0f,
            dx2 = -14.0f,
            dy2 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12.01 12.01 0 1 0 12 12
          arcToRelative(
            a = 12.01f,
            b = 12.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // c 0 -6.62 -5.38 -12 -12 -12
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -6.62f,
            dx2 = -5.38f,
            dy2 = -12.0f,
            dx3 = -12.0f,
            dy3 = -12.0f,
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
      .also { _equalApproximately = it }
  }

@Suppress("ObjectPropertyName")
private var _equalApproximately: ImageVector? = null
