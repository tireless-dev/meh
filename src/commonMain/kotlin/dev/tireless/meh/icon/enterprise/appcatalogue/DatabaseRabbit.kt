// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseRabbit: ImageVector
  get() {
    val current = _databaseRabbit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DatabaseRabbit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17.94 20.73 c0 -2.46 1.87 -3.67 5.13 -3.67 h2.05 v-.88 c0 -1.33 -.67 -2.11 -2.23 -2.11 a3.1 3.1 0 0 0 -2.74 1.51 l-1.75 -1.56 a5 5 0 0 1 4.7 -2.3 c3.24 0 4.96 1.54 4.96 4.28 v5.65 h1.2 V24 h-1.64 a2.2 2.2 0 0 1 -2.23 -2.07 h-.13 c-.4 1.54 -1.7 2.35 -3.5 2.35 -2.44 0 -3.82 -1.4 -3.82 -3.55 m7.18 -.32 v-1.58 h-1.89 c-1.54 0 -2.3 .53 -2.3 1.47 v.39 c0 .96 .67 1.45 1.82 1.45 1.31 0 2.37 -.6 2.37 -1.73 M6.97 24 H3.94 V7.95 h7.24 c2.92 0 4.74 1.93 4.74 4.97 a4.4 4.4 0 0 1 -3 4.55 l3.3 6.53 h-3.38 l-3 -6.19 H6.98Z m3.91 -8.74 a1.7 1.7 0 0 0 1.89 -1.81 v-1.06 a1.67 1.67 0 0 0 -1.89 -1.8 h-3.9 v4.67Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.94 20.73
          moveTo(x = 17.94f, y = 20.73f)
          // c 0 -2.46 1.87 -3.67 5.13 -3.67
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -2.46f,
            dx2 = 1.87f,
            dy2 = -3.67f,
            dx3 = 5.13f,
            dy3 = -3.67f,
          )
          // h 2.05
          horizontalLineToRelative(dx = 2.05f)
          // v -0.88
          verticalLineToRelative(dy = -0.88f)
          // c 0 -1.33 -0.67 -2.11 -2.23 -2.11
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.33f,
            dx2 = -0.67f,
            dy2 = -2.11f,
            dx3 = -2.23f,
            dy3 = -2.11f,
          )
          // a 3.1 3.1 0 0 0 -2.74 1.51
          arcToRelative(
            a = 3.1f,
            b = 3.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.74f,
            dy1 = 1.51f,
          )
          // l -1.75 -1.56
          lineToRelative(dx = -1.75f, dy = -1.56f)
          // a 5 5 0 0 1 4.7 -2.3
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.7f,
            dy1 = -2.3f,
          )
          // c 3.24 0 4.96 1.54 4.96 4.28
          curveToRelative(
            dx1 = 3.24f,
            dy1 = 0.0f,
            dx2 = 4.96f,
            dy2 = 1.54f,
            dx3 = 4.96f,
            dy3 = 4.28f,
          )
          // v 5.65
          verticalLineToRelative(dy = 5.65f)
          // h 1.2
          horizontalLineToRelative(dx = 1.2f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h -1.64
          horizontalLineToRelative(dx = -1.64f)
          // a 2.2 2.2 0 0 1 -2.23 -2.07
          arcToRelative(
            a = 2.2f,
            b = 2.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.23f,
            dy1 = -2.07f,
          )
          // h -0.13
          horizontalLineToRelative(dx = -0.13f)
          // c -0.4 1.54 -1.7 2.35 -3.5 2.35
          curveToRelative(
            dx1 = -0.4f,
            dy1 = 1.54f,
            dx2 = -1.7f,
            dy2 = 2.35f,
            dx3 = -3.5f,
            dy3 = 2.35f,
          )
          // c -2.44 0 -3.82 -1.4 -3.82 -3.55
          curveToRelative(
            dx1 = -2.44f,
            dy1 = 0.0f,
            dx2 = -3.82f,
            dy2 = -1.4f,
            dx3 = -3.82f,
            dy3 = -3.55f,
          )
          // m 7.18 -0.32
          moveToRelative(dx = 7.18f, dy = -0.32f)
          // v -1.58
          verticalLineToRelative(dy = -1.58f)
          // h -1.89
          horizontalLineToRelative(dx = -1.89f)
          // c -1.54 0 -2.3 0.53 -2.3 1.47
          curveToRelative(
            dx1 = -1.54f,
            dy1 = 0.0f,
            dx2 = -2.3f,
            dy2 = 0.53f,
            dx3 = -2.3f,
            dy3 = 1.47f,
          )
          // v 0.39
          verticalLineToRelative(dy = 0.39f)
          // c 0 0.96 0.67 1.45 1.82 1.45
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.96f,
            dx2 = 0.67f,
            dy2 = 1.45f,
            dx3 = 1.82f,
            dy3 = 1.45f,
          )
          // c 1.31 0 2.37 -0.6 2.37 -1.73
          curveToRelative(
            dx1 = 1.31f,
            dy1 = 0.0f,
            dx2 = 2.37f,
            dy2 = -0.6f,
            dx3 = 2.37f,
            dy3 = -1.73f,
          )
          // M 6.97 24
          moveTo(x = 6.97f, y = 24.0f)
          // H 3.94
          horizontalLineTo(x = 3.94f)
          // V 7.95
          verticalLineTo(y = 7.95f)
          // h 7.24
          horizontalLineToRelative(dx = 7.24f)
          // c 2.92 0 4.74 1.93 4.74 4.97
          curveToRelative(
            dx1 = 2.92f,
            dy1 = 0.0f,
            dx2 = 4.74f,
            dy2 = 1.93f,
            dx3 = 4.74f,
            dy3 = 4.97f,
          )
          // a 4.4 4.4 0 0 1 -3 4.55
          arcToRelative(
            a = 4.4f,
            b = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 4.55f,
          )
          // l 3.3 6.53
          lineToRelative(dx = 3.3f, dy = 6.53f)
          // h -3.38
          horizontalLineToRelative(dx = -3.38f)
          // l -3 -6.19
          lineToRelative(dx = -3.0f, dy = -6.19f)
          // H 6.98z
          horizontalLineTo(x = 6.98f)
          close()
          // m 3.91 -8.74
          moveToRelative(dx = 3.91f, dy = -8.74f)
          // a 1.7 1.7 0 0 0 1.89 -1.81
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.89f,
            dy1 = -1.81f,
          )
          // v -1.06
          verticalLineToRelative(dy = -1.06f)
          // a 1.67 1.67 0 0 0 -1.89 -1.8
          arcToRelative(
            a = 1.67f,
            b = 1.67f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.89f,
            dy1 = -1.8f,
          )
          // h -3.9
          horizontalLineToRelative(dx = -3.9f)
          // v 4.67z
          verticalLineToRelative(dy = 4.67f)
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
      .also { _databaseRabbit = it }
  }

@Suppress("ObjectPropertyName")
private var _databaseRabbit: ImageVector? = null
