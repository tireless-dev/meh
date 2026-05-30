// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoMastodon: ImageVector
  get() {
    val current = _logoMastodon
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoMastodon",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.06 11.2 c0 -6.08 -3.98 -7.86 -3.98 -7.86 -2 -.92 -5.45 -1.31 -9.03 -1.34 h-.1 c-3.57 .03 -7.01 .42 -9.02 1.34 0 0 -3.98 1.78 -3.98 7.85 0 1.4 -.03 3.06 .02 4.82 .14 5.94 1.09 11.8 6.58 13.25 A21 21 0 0 0 16 29.97 a13 13 0 0 0 4.96 -1.13 l-.1 -2.3 s-2.27 .71 -4.82 .62 c-2.52 -.08 -5.19 -.27 -5.6 -3.37 a6 6 0 0 1 -.05 -.87 s2.47 .6 5.61 .75 a33 33 0 0 0 5.56 -.33 c3.5 -.42 6.56 -2.58 6.94 -4.55 .6 -3.12 .56 -7.6 .56 -7.6 m-4.7 7.82 h-2.91 v-7.14 q0 -2.26 -1.9 -2.27 -2.1 0 -2.1 2.7 v3.9 h-2.9 v-3.9 q0 -2.7 -2.1 -2.7 -1.9 .01 -1.9 2.27 v7.14 H7.64 v-7.36 q0 -2.26 1.15 -3.58 a4 4 0 0 1 3.12 -1.33 q2.24 0 3.36 1.72 L16 9.68 l.73 -1.21 a3.8 3.8 0 0 1 3.36 -1.72 4 4 0 0 1 3.12 1.33 5.3 5.3 0 0 1 1.15 3.58z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.06 11.2
          moveTo(x = 29.06f, y = 11.2f)
          // c 0 -6.08 -3.98 -7.86 -3.98 -7.86
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -6.08f,
            dx2 = -3.98f,
            dy2 = -7.86f,
            dx3 = -3.98f,
            dy3 = -7.86f,
          )
          // c -2 -0.92 -5.45 -1.31 -9.03 -1.34
          curveToRelative(
            dx1 = -2.0f,
            dy1 = -0.92f,
            dx2 = -5.45f,
            dy2 = -1.31f,
            dx3 = -9.03f,
            dy3 = -1.34f,
          )
          // h -0.1
          horizontalLineToRelative(dx = -0.1f)
          // c -3.57 0.03 -7.01 0.42 -9.02 1.34
          curveToRelative(
            dx1 = -3.57f,
            dy1 = 0.03f,
            dx2 = -7.01f,
            dy2 = 0.42f,
            dx3 = -9.02f,
            dy3 = 1.34f,
          )
          // c 0 0 -3.98 1.78 -3.98 7.85
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.0f,
            dx2 = -3.98f,
            dy2 = 1.78f,
            dx3 = -3.98f,
            dy3 = 7.85f,
          )
          // c 0 1.4 -0.03 3.06 0.02 4.82
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.4f,
            dx2 = -0.03f,
            dy2 = 3.06f,
            dx3 = 0.02f,
            dy3 = 4.82f,
          )
          // c 0.14 5.94 1.09 11.8 6.58 13.25
          curveToRelative(
            dx1 = 0.14f,
            dy1 = 5.94f,
            dx2 = 1.09f,
            dy2 = 11.8f,
            dx3 = 6.58f,
            dy3 = 13.25f,
          )
          // A 21 21 0 0 0 16 29.97
          arcTo(
            horizontalEllipseRadius = 21.0f,
            verticalEllipseRadius = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 29.97f,
          )
          // a 13 13 0 0 0 4.96 -1.13
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.96f,
            dy1 = -1.13f,
          )
          // l -0.1 -2.3
          lineToRelative(dx = -0.1f, dy = -2.3f)
          // s -2.27 0.71 -4.82 0.62
          reflectiveCurveToRelative(
            dx1 = -2.27f,
            dy1 = 0.71f,
            dx2 = -4.82f,
            dy2 = 0.62f,
          )
          // c -2.52 -0.08 -5.19 -0.27 -5.6 -3.37
          curveToRelative(
            dx1 = -2.52f,
            dy1 = -0.08f,
            dx2 = -5.19f,
            dy2 = -0.27f,
            dx3 = -5.6f,
            dy3 = -3.37f,
          )
          // a 6 6 0 0 1 -0.05 -0.87
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.05f,
            dy1 = -0.87f,
          )
          // s 2.47 0.6 5.61 0.75
          reflectiveCurveToRelative(
            dx1 = 2.47f,
            dy1 = 0.6f,
            dx2 = 5.61f,
            dy2 = 0.75f,
          )
          // a 33 33 0 0 0 5.56 -0.33
          arcToRelative(
            a = 33.0f,
            b = 33.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.56f,
            dy1 = -0.33f,
          )
          // c 3.5 -0.42 6.56 -2.58 6.94 -4.55
          curveToRelative(
            dx1 = 3.5f,
            dy1 = -0.42f,
            dx2 = 6.56f,
            dy2 = -2.58f,
            dx3 = 6.94f,
            dy3 = -4.55f,
          )
          // c 0.6 -3.12 0.56 -7.6 0.56 -7.6
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -3.12f,
            dx2 = 0.56f,
            dy2 = -7.6f,
            dx3 = 0.56f,
            dy3 = -7.6f,
          )
          // m -4.7 7.82
          moveToRelative(dx = -4.7f, dy = 7.82f)
          // h -2.91
          horizontalLineToRelative(dx = -2.91f)
          // v -7.14
          verticalLineToRelative(dy = -7.14f)
          // q 0 -2.26 -1.9 -2.27
          quadToRelative(
            dx1 = 0.0f,
            dy1 = -2.26f,
            dx2 = -1.9f,
            dy2 = -2.27f,
          )
          // q -2.1 0 -2.1 2.7
          quadToRelative(
            dx1 = -2.1f,
            dy1 = 0.0f,
            dx2 = -2.1f,
            dy2 = 2.7f,
          )
          // v 3.9
          verticalLineToRelative(dy = 3.9f)
          // h -2.9
          horizontalLineToRelative(dx = -2.9f)
          // v -3.9
          verticalLineToRelative(dy = -3.9f)
          // q 0 -2.7 -2.1 -2.7
          quadToRelative(
            dx1 = 0.0f,
            dy1 = -2.7f,
            dx2 = -2.1f,
            dy2 = -2.7f,
          )
          // q -1.9 0.01 -1.9 2.27
          quadToRelative(
            dx1 = -1.9f,
            dy1 = 0.01f,
            dx2 = -1.9f,
            dy2 = 2.27f,
          )
          // v 7.14
          verticalLineToRelative(dy = 7.14f)
          // H 7.64
          horizontalLineTo(x = 7.64f)
          // v -7.36
          verticalLineToRelative(dy = -7.36f)
          // q 0 -2.26 1.15 -3.58
          quadToRelative(
            dx1 = 0.0f,
            dy1 = -2.26f,
            dx2 = 1.15f,
            dy2 = -3.58f,
          )
          // a 4 4 0 0 1 3.12 -1.33
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.12f,
            dy1 = -1.33f,
          )
          // q 2.24 0 3.36 1.72
          quadToRelative(
            dx1 = 2.24f,
            dy1 = 0.0f,
            dx2 = 3.36f,
            dy2 = 1.72f,
          )
          // L 16 9.68
          lineTo(x = 16.0f, y = 9.68f)
          // l 0.73 -1.21
          lineToRelative(dx = 0.73f, dy = -1.21f)
          // a 3.8 3.8 0 0 1 3.36 -1.72
          arcToRelative(
            a = 3.8f,
            b = 3.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.36f,
            dy1 = -1.72f,
          )
          // a 4 4 0 0 1 3.12 1.33
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.12f,
            dy1 = 1.33f,
          )
          // a 5.3 5.3 0 0 1 1.15 3.58z
          arcToRelative(
            a = 5.3f,
            b = 5.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.15f,
            dy1 = 3.58f,
          )
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
      .also { _logoMastodon = it }
  }

@Suppress("ObjectPropertyName")
private var _logoMastodon: ImageVector? = null
