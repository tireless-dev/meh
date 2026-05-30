// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EarthAmericas: ImageVector
  get() {
    val current = _earthAmericas
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EarthAmericas",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 16 a14.03 14.03 0 1 0 -7.14 12.2 l.12 .02 L23 28.1 A14 14 0 0 0 30 16 M4 16 a12 12 0 0 1 .4 -3 h4.24 l4.99 4.16 -1.9 2.55 a2 2 0 0 0 .18 2.61 l2.09 2.1 v3.4 A12 12 0 0 1 4 16 m9.32 4.9 3.05 -4.06 -7 -5.84 H5.1 a11.96 11.96 0 0 1 17.77 -4.81 L22.28 8 h-5.7 l-3.04 3.04 9.36 8.32 -1.65 7.41 A12 12 0 0 1 16 28 v-4.41Z m10.32 4.35 1.2 -5.46 a2 2 0 0 0 -.62 -1.93 l-7.76 -6.9 L17.4 10 h4.87 a2 2 0 0 0 1.9 -1.37 l.35 -1.06 a12 12 0 0 1 -.9 17.68
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // a 14.03 14.03 0 1 0 -7.14 12.2
          arcToRelative(
            a = 14.03f,
            b = 14.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -7.14f,
            dy1 = 12.2f,
          )
          // l 0.12 0.02
          lineToRelative(dx = 0.12f, dy = 0.02f)
          // L 23 28.1
          lineTo(x = 23.0f, y = 28.1f)
          // A 14 14 0 0 0 30 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 16.0f,
          )
          // M 4 16
          moveTo(x = 4.0f, y = 16.0f)
          // a 12 12 0 0 1 0.4 -3
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.4f,
            dy1 = -3.0f,
          )
          // h 4.24
          horizontalLineToRelative(dx = 4.24f)
          // l 4.99 4.16
          lineToRelative(dx = 4.99f, dy = 4.16f)
          // l -1.9 2.55
          lineToRelative(dx = -1.9f, dy = 2.55f)
          // a 2 2 0 0 0 0.18 2.61
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.18f,
            dy1 = 2.61f,
          )
          // l 2.09 2.1
          lineToRelative(dx = 2.09f, dy = 2.1f)
          // v 3.4
          verticalLineToRelative(dy = 3.4f)
          // A 12 12 0 0 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // m 9.32 4.9
          moveToRelative(dx = 9.32f, dy = 4.9f)
          // l 3.05 -4.06
          lineToRelative(dx = 3.05f, dy = -4.06f)
          // l -7 -5.84
          lineToRelative(dx = -7.0f, dy = -5.84f)
          // H 5.1
          horizontalLineTo(x = 5.1f)
          // a 11.96 11.96 0 0 1 17.77 -4.81
          arcToRelative(
            a = 11.96f,
            b = 11.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 17.77f,
            dy1 = -4.81f,
          )
          // L 22.28 8
          lineTo(x = 22.28f, y = 8.0f)
          // h -5.7
          horizontalLineToRelative(dx = -5.7f)
          // l -3.04 3.04
          lineToRelative(dx = -3.04f, dy = 3.04f)
          // l 9.36 8.32
          lineToRelative(dx = 9.36f, dy = 8.32f)
          // l -1.65 7.41
          lineToRelative(dx = -1.65f, dy = 7.41f)
          // A 12 12 0 0 1 16 28
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 28.0f,
          )
          // v -4.41z
          verticalLineToRelative(dy = -4.41f)
          close()
          // m 10.32 4.35
          moveToRelative(dx = 10.32f, dy = 4.35f)
          // l 1.2 -5.46
          lineToRelative(dx = 1.2f, dy = -5.46f)
          // a 2 2 0 0 0 -0.62 -1.93
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.62f,
            dy1 = -1.93f,
          )
          // l -7.76 -6.9
          lineToRelative(dx = -7.76f, dy = -6.9f)
          // L 17.4 10
          lineTo(x = 17.4f, y = 10.0f)
          // h 4.87
          horizontalLineToRelative(dx = 4.87f)
          // a 2 2 0 0 0 1.9 -1.37
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.9f,
            dy1 = -1.37f,
          )
          // l 0.35 -1.06
          lineToRelative(dx = 0.35f, dy = -1.06f)
          // a 12 12 0 0 1 -0.9 17.68
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.9f,
            dy1 = 17.68f,
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
      .also { _earthAmericas = it }
  }

@Suppress("ObjectPropertyName")
private var _earthAmericas: ImageVector? = null
