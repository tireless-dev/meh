// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseMongodb: ImageVector
  get() {
    val current = _databaseMongodb
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DatabaseMongodb",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25.35 28.88 c-4.05 0 -5.59 -1.06 -5.59 -2.83 a2.2 2.2 0 0 1 2.14 -2.3 v-.26 a2 2 0 0 1 -1.54 -2 c0 -1.24 1.06 -1.86 2.2 -2.11 v-.1 a3.6 3.6 0 0 1 -2.18 -3.49 c0 -2.44 1.73 -4.07 4.97 -4.07 a7 7 0 0 1 2.09 .3 v-.4 a1.53 1.53 0 0 1 1.7 -1.74 H31 v2.25 h-2.55 v.33 a3.6 3.6 0 0 1 1.86 3.33 c0 2.42 -1.7 4.03 -4.96 4.03 a7 7 0 0 1 -1.84 -.21 1.2 1.2 0 0 0 -.85 1.08 q-.02 .9 1.56 .9 h3.22 c2.94 0 4.2 1.26 4.2 3.42 0 2.5 -1.7 3.86 -6.3 3.86 m1.5 -4.74 h-4.1 a1.5 1.5 0 0 0 -.62 1.24 c0 .92 .69 1.47 2.53 1.47 h1.47 c1.9 0 2.76 -.48 2.76 -1.5 0 -.75 -.55 -1.21 -2.05 -1.21 m.66 -8.17 v-.39 c0 -1.21 -.76 -1.84 -2.16 -1.84 s-2.16 .62 -2.16 1.84 v.4 c0 1.19 .76 1.83 2.16 1.83 s2.16 -.64 2.16 -1.84 M2.23 7.95 h3.43 l4.12 7.84 h.09 l4.07 -7.84 h3.29 V24 h-2.88 V12.48 h-.09 l-1.24 2.55 -3.29 6.07 -3.29 -6.07 -1.24 -2.55 H5.1 V24 H2.24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.35 28.88
          moveTo(x = 25.35f, y = 28.88f)
          // c -4.05 0 -5.59 -1.06 -5.59 -2.83
          curveToRelative(
            dx1 = -4.05f,
            dy1 = 0.0f,
            dx2 = -5.59f,
            dy2 = -1.06f,
            dx3 = -5.59f,
            dy3 = -2.83f,
          )
          // a 2.2 2.2 0 0 1 2.14 -2.3
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.14f,
            dy1 = -2.3f,
          )
          // v -0.26
          verticalLineToRelative(dy = -0.26f)
          // a 2 2 0 0 1 -1.54 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.54f,
            dy1 = -2.0f,
          )
          // c 0 -1.24 1.06 -1.86 2.2 -2.11
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.24f,
            dx2 = 1.06f,
            dy2 = -1.86f,
            dx3 = 2.2f,
            dy3 = -2.11f,
          )
          // v -0.1
          verticalLineToRelative(dy = -0.1f)
          // a 3.6 3.6 0 0 1 -2.18 -3.49
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.18f,
            dy1 = -3.49f,
          )
          // c 0 -2.44 1.73 -4.07 4.97 -4.07
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.44f,
            dx2 = 1.73f,
            dy2 = -4.07f,
            dx3 = 4.97f,
            dy3 = -4.07f,
          )
          // a 7 7 0 0 1 2.09 0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.09f,
            dy1 = 0.3f,
          )
          // v -0.4
          verticalLineToRelative(dy = -0.4f)
          // a 1.53 1.53 0 0 1 1.7 -1.74
          arcToRelative(
            a = 1.53f,
            b = 1.53f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.7f,
            dy1 = -1.74f,
          )
          // H 31
          horizontalLineTo(x = 31.0f)
          // v 2.25
          verticalLineToRelative(dy = 2.25f)
          // h -2.55
          horizontalLineToRelative(dx = -2.55f)
          // v 0.33
          verticalLineToRelative(dy = 0.33f)
          // a 3.6 3.6 0 0 1 1.86 3.33
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.86f,
            dy1 = 3.33f,
          )
          // c 0 2.42 -1.7 4.03 -4.96 4.03
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.42f,
            dx2 = -1.7f,
            dy2 = 4.03f,
            dx3 = -4.96f,
            dy3 = 4.03f,
          )
          // a 7 7 0 0 1 -1.84 -0.21
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.84f,
            dy1 = -0.21f,
          )
          // a 1.2 1.2 0 0 0 -0.85 1.08
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.85f,
            dy1 = 1.08f,
          )
          // q -0.02 0.9 1.56 0.9
          quadToRelative(
            dx1 = -0.02f,
            dy1 = 0.9f,
            dx2 = 1.56f,
            dy2 = 0.9f,
          )
          // h 3.22
          horizontalLineToRelative(dx = 3.22f)
          // c 2.94 0 4.2 1.26 4.2 3.42
          curveToRelative(
            dx1 = 2.94f,
            dy1 = 0.0f,
            dx2 = 4.2f,
            dy2 = 1.26f,
            dx3 = 4.2f,
            dy3 = 3.42f,
          )
          // c 0 2.5 -1.7 3.86 -6.3 3.86
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.5f,
            dx2 = -1.7f,
            dy2 = 3.86f,
            dx3 = -6.3f,
            dy3 = 3.86f,
          )
          // m 1.5 -4.74
          moveToRelative(dx = 1.5f, dy = -4.74f)
          // h -4.1
          horizontalLineToRelative(dx = -4.1f)
          // a 1.5 1.5 0 0 0 -0.62 1.24
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.62f,
            dy1 = 1.24f,
          )
          // c 0 0.92 0.69 1.47 2.53 1.47
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.92f,
            dx2 = 0.69f,
            dy2 = 1.47f,
            dx3 = 2.53f,
            dy3 = 1.47f,
          )
          // h 1.47
          horizontalLineToRelative(dx = 1.47f)
          // c 1.9 0 2.76 -0.48 2.76 -1.5
          curveToRelative(
            dx1 = 1.9f,
            dy1 = 0.0f,
            dx2 = 2.76f,
            dy2 = -0.48f,
            dx3 = 2.76f,
            dy3 = -1.5f,
          )
          // c 0 -0.75 -0.55 -1.21 -2.05 -1.21
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.75f,
            dx2 = -0.55f,
            dy2 = -1.21f,
            dx3 = -2.05f,
            dy3 = -1.21f,
          )
          // m 0.66 -8.17
          moveToRelative(dx = 0.66f, dy = -8.17f)
          // v -0.39
          verticalLineToRelative(dy = -0.39f)
          // c 0 -1.21 -0.76 -1.84 -2.16 -1.84
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.21f,
            dx2 = -0.76f,
            dy2 = -1.84f,
            dx3 = -2.16f,
            dy3 = -1.84f,
          )
          // s -2.16 0.62 -2.16 1.84
          reflectiveCurveToRelative(
            dx1 = -2.16f,
            dy1 = 0.62f,
            dx2 = -2.16f,
            dy2 = 1.84f,
          )
          // v 0.4
          verticalLineToRelative(dy = 0.4f)
          // c 0 1.19 0.76 1.83 2.16 1.83
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.19f,
            dx2 = 0.76f,
            dy2 = 1.83f,
            dx3 = 2.16f,
            dy3 = 1.83f,
          )
          // s 2.16 -0.64 2.16 -1.84
          reflectiveCurveToRelative(
            dx1 = 2.16f,
            dy1 = -0.64f,
            dx2 = 2.16f,
            dy2 = -1.84f,
          )
          // M 2.23 7.95
          moveTo(x = 2.23f, y = 7.95f)
          // h 3.43
          horizontalLineToRelative(dx = 3.43f)
          // l 4.12 7.84
          lineToRelative(dx = 4.12f, dy = 7.84f)
          // h 0.09
          horizontalLineToRelative(dx = 0.09f)
          // l 4.07 -7.84
          lineToRelative(dx = 4.07f, dy = -7.84f)
          // h 3.29
          horizontalLineToRelative(dx = 3.29f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h -2.88
          horizontalLineToRelative(dx = -2.88f)
          // V 12.48
          verticalLineTo(y = 12.48f)
          // h -0.09
          horizontalLineToRelative(dx = -0.09f)
          // l -1.24 2.55
          lineToRelative(dx = -1.24f, dy = 2.55f)
          // l -3.29 6.07
          lineToRelative(dx = -3.29f, dy = 6.07f)
          // l -3.29 -6.07
          lineToRelative(dx = -3.29f, dy = -6.07f)
          // l -1.24 -2.55
          lineToRelative(dx = -1.24f, dy = -2.55f)
          // H 5.1
          horizontalLineTo(x = 5.1f)
          // V 24
        verticalLineTo(y = 24.0f)
        // H 2.24z
        horizontalLineTo(x = 2.24f)
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
      .also { _databaseMongodb = it }
  }

@Suppress("ObjectPropertyName")
private var _databaseMongodb: ImageVector? = null
