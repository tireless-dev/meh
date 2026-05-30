// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabasePostgreSQL: ImageVector
  get() {
    val current = _databasePostgreSQL
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DatabasePostgreSQL",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.98 28.88 c-4.05 0 -5.59 -1.06 -5.59 -2.83 a2.2 2.2 0 0 1 2.14 -2.3 v-.26 a2 2 0 0 1 -1.54 -2 c0 -1.24 1.06 -1.86 2.2 -2.11 v-.1 a3.6 3.6 0 0 1 -2.18 -3.49 c0 -2.44 1.73 -4.07 4.97 -4.07 a7 7 0 0 1 2.1 .3 v-.4 a1.53 1.53 0 0 1 1.7 -1.74 h1.86 v2.25 h-2.56 v.33 a3.6 3.6 0 0 1 1.87 3.33 c0 2.42 -1.7 4.02 -4.97 4.02 a7 7 0 0 1 -1.84 -.2 1.2 1.2 0 0 0 -.85 1.08 q-.02 .9 1.56 .9 h3.22 c2.95 0 4.21 1.26 4.21 3.42 0 2.5 -1.7 3.86 -6.3 3.86 m1.5 -4.74 h-4.1 a1.5 1.5 0 0 0 -.62 1.24 c0 .92 .69 1.47 2.53 1.47 h1.47 c1.91 0 2.76 -.48 2.76 -1.5 0 -.75 -.55 -1.21 -2.05 -1.21 m.66 -8.17 v-.39 c0 -1.21 -.76 -1.84 -2.16 -1.84 s-2.16 .62 -2.16 1.84 v.4 c0 1.19 .76 1.83 2.16 1.83 s2.16 -.64 2.16 -1.84 M4.6 24 V7.95 h7.22 c2.97 0 4.76 2 4.76 4.97 0 2.99 -1.79 4.96 -4.76 4.96 H7.64 V24Z m3.04 -8.74 h3.9 a1.7 1.7 0 0 0 1.9 -1.81 v-1.06 a1.67 1.67 0 0 0 -1.9 -1.8 h-3.9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.98 28.88
          moveTo(x = 22.98f, y = 28.88f)
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
          // a 7 7 0 0 1 2.1 0.3
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.1f,
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
          // h 1.86
          horizontalLineToRelative(dx = 1.86f)
          // v 2.25
          verticalLineToRelative(dy = 2.25f)
          // h -2.56
          horizontalLineToRelative(dx = -2.56f)
          // v 0.33
          verticalLineToRelative(dy = 0.33f)
          // a 3.6 3.6 0 0 1 1.87 3.33
          arcToRelative(
            a = 3.6f,
            b = 3.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.87f,
            dy1 = 3.33f,
          )
          // c 0 2.42 -1.7 4.02 -4.97 4.02
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.42f,
            dx2 = -1.7f,
            dy2 = 4.02f,
            dx3 = -4.97f,
            dy3 = 4.02f,
          )
          // a 7 7 0 0 1 -1.84 -0.2
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.84f,
            dy1 = -0.2f,
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
          // c 2.95 0 4.21 1.26 4.21 3.42
          curveToRelative(
            dx1 = 2.95f,
            dy1 = 0.0f,
            dx2 = 4.21f,
            dy2 = 1.26f,
            dx3 = 4.21f,
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
          // c 1.91 0 2.76 -0.48 2.76 -1.5
          curveToRelative(
            dx1 = 1.91f,
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
          // M 4.6 24
          moveTo(x = 4.6f, y = 24.0f)
          // V 7.95
          verticalLineTo(y = 7.95f)
          // h 7.22
          horizontalLineToRelative(dx = 7.22f)
          // c 2.97 0 4.76 2 4.76 4.97
          curveToRelative(
            dx1 = 2.97f,
            dy1 = 0.0f,
            dx2 = 4.76f,
            dy2 = 2.0f,
            dx3 = 4.76f,
            dy3 = 4.97f,
          )
          // c 0 2.99 -1.79 4.96 -4.76 4.96
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 2.99f,
            dx2 = -1.79f,
            dy2 = 4.96f,
            dx3 = -4.76f,
            dy3 = 4.96f,
          )
          // H 7.64
          horizontalLineTo(x = 7.64f)
          // V 24z
          verticalLineTo(y = 24.0f)
          close()
          // m 3.04 -8.74
          moveToRelative(dx = 3.04f, dy = -8.74f)
          // h 3.9
          horizontalLineToRelative(dx = 3.9f)
          // a 1.7 1.7 0 0 0 1.9 -1.81
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.9f,
            dy1 = -1.81f,
          )
          // v -1.06
          verticalLineToRelative(dy = -1.06f)
          // a 1.67 1.67 0 0 0 -1.9 -1.8
          arcToRelative(
            a = 1.67f,
            b = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = -1.8f,
          )
          // h -3.9z
          horizontalLineToRelative(dx = -3.9f)
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
      .also { _databasePostgreSQL = it }
  }

@Suppress("ObjectPropertyName")
private var _databasePostgreSQL: ImageVector? = null
