// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.designanddevelopment

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoVmwareAlt: ImageVector
  get() {
    val current = _logoVmwareAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoVmwareAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m22.41 19.11 -1.91 -5.54 a2 2 0 0 1 -.1 -.54 1.03 1.03 0 0 1 1.07 -1.01 c.55 0 .92 .35 1.08 .86 l1.2 3.98 L25 12.9 c.16 -.53 .57 -.89 1.14 -.89 h.13 c.58 0 .99 .37 1.15 .9 l1.24 3.97 1.23 -4 c.15 -.48 .49 -.86 1.08 -.86 A1 1 0 0 1 32 13.03 a2 2 0 0 1 -.07 .45 l-2 5.63 c-.24 .7 -.7 1 -1.24 1 h-.07 c-.54 0 -1 -.32 -1.2 -.96 l-1.25 -3.95 -1.26 3.95 c-.2 .64 -.66 .95 -1.2 .95 h-.07 c-.53 0 -1 -.3 -1.23 -.99 M2.1 12.65 a1.1 1.1 0 0 0 -1.45 -.55 1.06 1.06 0 0 0 -.53 1.45 l2.43 5.29 c.38 .83 .79 1.26 1.54 1.26 .8 0 1.16 -.47 1.54 -1.26 l2.14 -4.67 a.3 .3 0 0 1 .31 -.2 .34 .34 0 0 1 .34 .34 v4.53 c0 .69 .38 1.26 1.12 1.26 s1.15 -.57 1.15 -1.26 v-3.7 c0 -.7 .51 -1.17 1.2 -1.17 s1.16 .47 1.16 1.17 v3.7 c0 .69 .38 1.26 1.12 1.26 s1.15 -.57 1.15 -1.26 v-3.7 c0 -.7 .51 -1.17 1.2 -1.17 s1.16 .47 1.16 1.17 v3.7 c0 .69 .39 1.26 1.13 1.26 s1.14 -.57 1.14 -1.26 v-4.21 c0 -1.55 -1.24 -2.63 -2.73 -2.63 s-2.43 1.04 -2.43 1.04 C14.28 12.4 13.59 12 12.44 12 c-1.23 0 -2.3 1.04 -2.3 1.04 A2.8 2.8 0 0 0 8.08 12 C7 12 6.14 12.48 5.62 13.68 l-1.55 3.67z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.41 19.11
          moveTo(x = 22.41f, y = 19.11f)
          // l -1.91 -5.54
          lineToRelative(dx = -1.91f, dy = -5.54f)
          // a 2 2 0 0 1 -0.1 -0.54
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.1f,
            dy1 = -0.54f,
          )
          // a 1.03 1.03 0 0 1 1.07 -1.01
          arcToRelative(
            a = 1.03f,
            b = 1.03f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.07f,
            dy1 = -1.01f,
          )
          // c 0.55 0 0.92 0.35 1.08 0.86
          curveToRelative(
            dx1 = 0.55f,
            dy1 = 0.0f,
            dx2 = 0.92f,
            dy2 = 0.35f,
            dx3 = 1.08f,
            dy3 = 0.86f,
          )
          // l 1.2 3.98
          lineToRelative(dx = 1.2f, dy = 3.98f)
          // L 25 12.9
          lineTo(x = 25.0f, y = 12.9f)
          // c 0.16 -0.53 0.57 -0.89 1.14 -0.89
          curveToRelative(
            dx1 = 0.16f,
            dy1 = -0.53f,
            dx2 = 0.57f,
            dy2 = -0.89f,
            dx3 = 1.14f,
            dy3 = -0.89f,
          )
          // h 0.13
          horizontalLineToRelative(dx = 0.13f)
          // c 0.58 0 0.99 0.37 1.15 0.9
          curveToRelative(
            dx1 = 0.58f,
            dy1 = 0.0f,
            dx2 = 0.99f,
            dy2 = 0.37f,
            dx3 = 1.15f,
            dy3 = 0.9f,
          )
          // l 1.24 3.97
          lineToRelative(dx = 1.24f, dy = 3.97f)
          // l 1.23 -4
          lineToRelative(dx = 1.23f, dy = -4.0f)
          // c 0.15 -0.48 0.49 -0.86 1.08 -0.86
          curveToRelative(
            dx1 = 0.15f,
            dy1 = -0.48f,
            dx2 = 0.49f,
            dy2 = -0.86f,
            dx3 = 1.08f,
            dy3 = -0.86f,
          )
          // A 1 1 0 0 1 32 13.03
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 32.0f,
            y1 = 13.03f,
          )
          // a 2 2 0 0 1 -0.07 0.45
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.07f,
            dy1 = 0.45f,
          )
          // l -2 5.63
          lineToRelative(dx = -2.0f, dy = 5.63f)
          // c -0.24 0.7 -0.7 1 -1.24 1
          curveToRelative(
            dx1 = -0.24f,
            dy1 = 0.7f,
            dx2 = -0.7f,
            dy2 = 1.0f,
            dx3 = -1.24f,
            dy3 = 1.0f,
          )
          // h -0.07
          horizontalLineToRelative(dx = -0.07f)
          // c -0.54 0 -1 -0.32 -1.2 -0.96
          curveToRelative(
            dx1 = -0.54f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = -0.32f,
            dx3 = -1.2f,
            dy3 = -0.96f,
          )
          // l -1.25 -3.95
          lineToRelative(dx = -1.25f, dy = -3.95f)
          // l -1.26 3.95
          lineToRelative(dx = -1.26f, dy = 3.95f)
          // c -0.2 0.64 -0.66 0.95 -1.2 0.95
          curveToRelative(
            dx1 = -0.2f,
            dy1 = 0.64f,
            dx2 = -0.66f,
            dy2 = 0.95f,
            dx3 = -1.2f,
            dy3 = 0.95f,
          )
          // h -0.07
          horizontalLineToRelative(dx = -0.07f)
          // c -0.53 0 -1 -0.3 -1.23 -0.99
          curveToRelative(
            dx1 = -0.53f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = -0.3f,
            dx3 = -1.23f,
            dy3 = -0.99f,
          )
          // M 2.1 12.65
          moveTo(x = 2.1f, y = 12.65f)
          // a 1.1 1.1 0 0 0 -1.45 -0.55
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.45f,
            dy1 = -0.55f,
          )
          // a 1.06 1.06 0 0 0 -0.53 1.45
          arcToRelative(
            a = 1.06f,
            b = 1.06f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.53f,
            dy1 = 1.45f,
          )
          // l 2.43 5.29
          lineToRelative(dx = 2.43f, dy = 5.29f)
          // c 0.38 0.83 0.79 1.26 1.54 1.26
          curveToRelative(
            dx1 = 0.38f,
            dy1 = 0.83f,
            dx2 = 0.79f,
            dy2 = 1.26f,
            dx3 = 1.54f,
            dy3 = 1.26f,
          )
          // c 0.8 0 1.16 -0.47 1.54 -1.26
          curveToRelative(
            dx1 = 0.8f,
            dy1 = 0.0f,
            dx2 = 1.16f,
            dy2 = -0.47f,
            dx3 = 1.54f,
            dy3 = -1.26f,
          )
          // l 2.14 -4.67
          lineToRelative(dx = 2.14f, dy = -4.67f)
          // a 0.3 0.3 0 0 1 0.31 -0.2
          arcToRelative(
            a = 0.3f,
            b = 0.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.31f,
            dy1 = -0.2f,
          )
          // a 0.34 0.34 0 0 1 0.34 0.34
          arcToRelative(
            a = 0.34f,
            b = 0.34f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.34f,
            dy1 = 0.34f,
          )
          // v 4.53
          verticalLineToRelative(dy = 4.53f)
          // c 0 0.69 0.38 1.26 1.12 1.26
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.69f,
            dx2 = 0.38f,
            dy2 = 1.26f,
            dx3 = 1.12f,
            dy3 = 1.26f,
          )
          // s 1.15 -0.57 1.15 -1.26
          reflectiveCurveToRelative(
            dx1 = 1.15f,
            dy1 = -0.57f,
            dx2 = 1.15f,
            dy2 = -1.26f,
          )
          // v -3.7
          verticalLineToRelative(dy = -3.7f)
          // c 0 -0.7 0.51 -1.17 1.2 -1.17
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.7f,
            dx2 = 0.51f,
            dy2 = -1.17f,
            dx3 = 1.2f,
            dy3 = -1.17f,
          )
          // s 1.16 0.47 1.16 1.17
          reflectiveCurveToRelative(
            dx1 = 1.16f,
            dy1 = 0.47f,
            dx2 = 1.16f,
            dy2 = 1.17f,
          )
          // v 3.7
          verticalLineToRelative(dy = 3.7f)
          // c 0 0.69 0.38 1.26 1.12 1.26
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.69f,
            dx2 = 0.38f,
            dy2 = 1.26f,
            dx3 = 1.12f,
            dy3 = 1.26f,
          )
          // s 1.15 -0.57 1.15 -1.26
          reflectiveCurveToRelative(
            dx1 = 1.15f,
            dy1 = -0.57f,
            dx2 = 1.15f,
            dy2 = -1.26f,
          )
          // v -3.7
          verticalLineToRelative(dy = -3.7f)
          // c 0 -0.7 0.51 -1.17 1.2 -1.17
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.7f,
            dx2 = 0.51f,
            dy2 = -1.17f,
            dx3 = 1.2f,
            dy3 = -1.17f,
          )
          // s 1.16 0.47 1.16 1.17
          reflectiveCurveToRelative(
            dx1 = 1.16f,
            dy1 = 0.47f,
            dx2 = 1.16f,
            dy2 = 1.17f,
          )
          // v 3.7
          verticalLineToRelative(dy = 3.7f)
          // c 0 0.69 0.39 1.26 1.13 1.26
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.69f,
            dx2 = 0.39f,
            dy2 = 1.26f,
            dx3 = 1.13f,
            dy3 = 1.26f,
          )
          // s 1.14 -0.57 1.14 -1.26
          reflectiveCurveToRelative(
            dx1 = 1.14f,
            dy1 = -0.57f,
            dx2 = 1.14f,
            dy2 = -1.26f,
          )
          // v -4.21
          verticalLineToRelative(dy = -4.21f)
          // c 0 -1.55 -1.24 -2.63 -2.73 -2.63
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.55f,
            dx2 = -1.24f,
            dy2 = -2.63f,
            dx3 = -2.73f,
            dy3 = -2.63f,
          )
          // s -2.43 1.04 -2.43 1.04
          reflectiveCurveToRelative(
            dx1 = -2.43f,
            dy1 = 1.04f,
            dx2 = -2.43f,
            dy2 = 1.04f,
          )
          // C 14.28 12.4 13.59 12 12.44 12
          curveTo(
            x1 = 14.28f,
            y1 = 12.4f,
            x2 = 13.59f,
            y2 = 12.0f,
            x3 = 12.44f,
            y3 = 12.0f,
          )
          // c -1.23 0 -2.3 1.04 -2.3 1.04
          curveToRelative(
            dx1 = -1.23f,
            dy1 = 0.0f,
            dx2 = -2.3f,
            dy2 = 1.04f,
            dx3 = -2.3f,
            dy3 = 1.04f,
          )
          // A 2.8 2.8 0 0 0 8.08 12
          arcTo(
            horizontalEllipseRadius = 2.8f,
            verticalEllipseRadius = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.08f,
            y1 = 12.0f,
          )
          // C 7 12 6.14 12.48 5.62 13.68
          curveTo(
          x1 = 7.0f,
          y1 = 12.0f,
          x2 = 6.14f,
          y2 = 12.48f,
          x3 = 5.62f,
          y3 = 13.68f,
        )
        // l -1.55 3.67z
        lineToRelative(dx = -1.55f, dy = 3.67f)
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
      .also { _logoVmwareAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _logoVmwareAlt: ImageVector? = null
