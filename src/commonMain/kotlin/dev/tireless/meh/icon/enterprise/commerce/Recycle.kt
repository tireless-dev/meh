// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Recycle: ImageVector
  get() {
    val current = _recycle
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Recycle",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.5 22.25 -2.07 -3.74 -1.75 .98 2.08 3.74 a1.9 1.9 0 0 1 -.02 1.85 A1.9 1.9 0 0 1 26.13 26 h-7.3 l2.58 -2.59 L20 22 l-5 5 5 5 1.41 -1.41 L18.83 28 h7.3 a3.8 3.8 0 0 0 3.33 -1.9 3.8 3.8 0 0 0 .05 -3.85 M5.88 26 a1.9 1.9 0 0 1 -1.6 -.92 1.9 1.9 0 0 1 -.03 -1.85 l4.11 -7.4 1.05 3.52 1.91 -.57 -2 -6.78 -6.79 2 .57 1.92 3.5 -1.03 -4.1 7.36 a3.8 3.8 0 0 0 .05 3.84 A3.8 3.8 0 0 0 5.87 28 H12 v-2z M25.51 9.65 l-1.05 3.52 -5.11 -9.2 C18.66 2.74 17.41 2 16 2 s-2.66 .74 -3.35 1.97 L9.57 9.51 l1.75 .98 3.08 -5.55 C14.73 4.35 15.32 4 16 4 s1.27 .35 1.6 .94 l5.1 9.17 -3.5 -1.03 -.57 1.91 L25.41 17 l2.01 -6.78z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.5 22.25
          moveTo(x = 29.5f, y = 22.25f)
          // l -2.07 -3.74
          lineToRelative(dx = -2.07f, dy = -3.74f)
          // l -1.75 0.98
          lineToRelative(dx = -1.75f, dy = 0.98f)
          // l 2.08 3.74
          lineToRelative(dx = 2.08f, dy = 3.74f)
          // a 1.9 1.9 0 0 1 -0.02 1.85
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.02f,
            dy1 = 1.85f,
          )
          // A 1.9 1.9 0 0 1 26.13 26
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 26.13f,
            y1 = 26.0f,
          )
          // h -7.3
          horizontalLineToRelative(dx = -7.3f)
          // l 2.58 -2.59
          lineToRelative(dx = 2.58f, dy = -2.59f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 18.83 28
          lineTo(x = 18.83f, y = 28.0f)
          // h 7.3
          horizontalLineToRelative(dx = 7.3f)
          // a 3.8 3.8 0 0 0 3.33 -1.9
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.33f,
            dy1 = -1.9f,
          )
          // a 3.8 3.8 0 0 0 0.05 -3.85
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.05f,
            dy1 = -3.85f,
          )
          // M 5.88 26
          moveTo(x = 5.88f, y = 26.0f)
          // a 1.9 1.9 0 0 1 -1.6 -0.92
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.6f,
            dy1 = -0.92f,
          )
          // a 1.9 1.9 0 0 1 -0.03 -1.85
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.03f,
            dy1 = -1.85f,
          )
          // l 4.11 -7.4
          lineToRelative(dx = 4.11f, dy = -7.4f)
          // l 1.05 3.52
          lineToRelative(dx = 1.05f, dy = 3.52f)
          // l 1.91 -0.57
          lineToRelative(dx = 1.91f, dy = -0.57f)
          // l -2 -6.78
          lineToRelative(dx = -2.0f, dy = -6.78f)
          // l -6.79 2
          lineToRelative(dx = -6.79f, dy = 2.0f)
          // l 0.57 1.92
          lineToRelative(dx = 0.57f, dy = 1.92f)
          // l 3.5 -1.03
          lineToRelative(dx = 3.5f, dy = -1.03f)
          // l -4.1 7.36
          lineToRelative(dx = -4.1f, dy = 7.36f)
          // a 3.8 3.8 0 0 0 0.05 3.84
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.05f,
            dy1 = 3.84f,
          )
          // A 3.8 3.8 0 0 0 5.87 28
          arcTo(
            horizontalEllipseRadius = 3.8f,
            verticalEllipseRadius = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 5.87f,
            y1 = 28.0f,
          )
          // H 12
          horizontalLineTo(x = 12.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 25.51 9.65
          moveTo(x = 25.51f, y = 9.65f)
          // l -1.05 3.52
          lineToRelative(dx = -1.05f, dy = 3.52f)
          // l -5.11 -9.2
          lineToRelative(dx = -5.11f, dy = -9.2f)
          // C 18.66 2.74 17.41 2 16 2
          curveTo(
            x1 = 18.66f,
            y1 = 2.74f,
            x2 = 17.41f,
            y2 = 2.0f,
            x3 = 16.0f,
            y3 = 2.0f,
          )
          // s -2.66 0.74 -3.35 1.97
          reflectiveCurveToRelative(
            dx1 = -2.66f,
            dy1 = 0.74f,
            dx2 = -3.35f,
            dy2 = 1.97f,
          )
          // L 9.57 9.51
          lineTo(x = 9.57f, y = 9.51f)
          // l 1.75 0.98
          lineToRelative(dx = 1.75f, dy = 0.98f)
          // l 3.08 -5.55
          lineToRelative(dx = 3.08f, dy = -5.55f)
          // C 14.73 4.35 15.32 4 16 4
          curveTo(
            x1 = 14.73f,
            y1 = 4.35f,
            x2 = 15.32f,
            y2 = 4.0f,
            x3 = 16.0f,
            y3 = 4.0f,
          )
          // s 1.27 0.35 1.6 0.94
          reflectiveCurveToRelative(
            dx1 = 1.27f,
            dy1 = 0.35f,
            dx2 = 1.6f,
            dy2 = 0.94f,
          )
          // l 5.1 9.17
          lineToRelative(dx = 5.1f, dy = 9.17f)
          // l -3.5 -1.03
          lineToRelative(dx = -3.5f, dy = -1.03f)
          // l -0.57 1.91
          lineToRelative(dx = -0.57f, dy = 1.91f)
          // L 25.41 17
          lineTo(x = 25.41f, y = 17.0f)
          // l 2.01 -6.78z
          lineToRelative(dx = 2.01f, dy = -6.78f)
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
      .also { _recycle = it }
  }

@Suppress("ObjectPropertyName")
private var _recycle: ImageVector? = null
