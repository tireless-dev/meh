// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseRedis: ImageVector
  get() {
    val current = _databaseRedis
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DatabaseRedis",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M25.72 22 H25.6 a3.4 3.4 0 0 1 -3.31 2.28 c-3.01 0 -4.7 -2.28 -4.7 -6.3 0 -4 1.69 -6.26 4.7 -6.26 a3.3 3.3 0 0 1 3.31 2.25 h.12 V6.98 h2.94 V24 h-2.94Z m0 -2.12 v-3.81 c0 -1.18 -1.09 -1.93 -2.49 -1.93 a2.56 2.56 0 0 0 -2.55 2.82 v2.07 a2.54 2.54 0 0 0 2.55 2.8 c1.4 0 2.49 -.7 2.49 -1.95 M6.56 24 H3.52 V7.95 h7.25 c2.92 0 4.73 1.93 4.73 4.97 a4.4 4.4 0 0 1 -2.99 4.55 l3.3 6.53 h-3.39 l-2.99 -6.19 H6.56Z m3.9 -8.74 a1.7 1.7 0 0 0 1.9 -1.81 v-1.06 a1.67 1.67 0 0 0 -1.9 -1.8 h-3.9 v4.67Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.72 22
          moveTo(x = 25.72f, y = 22.0f)
          // H 25.6
          horizontalLineTo(x = 25.6f)
          // a 3.4 3.4 0 0 1 -3.31 2.28
          arcToRelative(
            a = 3.4f,
            b = 3.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.31f,
            dy1 = 2.28f,
          )
          // c -3.01 0 -4.7 -2.28 -4.7 -6.3
          curveToRelative(
            dx1 = -3.01f,
            dy1 = 0.0f,
            dx2 = -4.7f,
            dy2 = -2.28f,
            dx3 = -4.7f,
            dy3 = -6.3f,
          )
          // c 0 -4 1.69 -6.26 4.7 -6.26
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -4.0f,
            dx2 = 1.69f,
            dy2 = -6.26f,
            dx3 = 4.7f,
            dy3 = -6.26f,
          )
          // a 3.3 3.3 0 0 1 3.31 2.25
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.31f,
            dy1 = 2.25f,
          )
          // h 0.12
          horizontalLineToRelative(dx = 0.12f)
          // V 6.98
          verticalLineTo(y = 6.98f)
          // h 2.94
          horizontalLineToRelative(dx = 2.94f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h -2.94z
          horizontalLineToRelative(dx = -2.94f)
          close()
          // m 0 -2.12
          moveToRelative(dx = 0.0f, dy = -2.12f)
          // v -3.81
          verticalLineToRelative(dy = -3.81f)
          // c 0 -1.18 -1.09 -1.93 -2.49 -1.93
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.18f,
            dx2 = -1.09f,
            dy2 = -1.93f,
            dx3 = -2.49f,
            dy3 = -1.93f,
          )
          // a 2.56 2.56 0 0 0 -2.55 2.82
          arcToRelative(
            a = 2.56f,
            b = 2.56f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.55f,
            dy1 = 2.82f,
          )
          // v 2.07
          verticalLineToRelative(dy = 2.07f)
          // a 2.54 2.54 0 0 0 2.55 2.8
          arcToRelative(
            a = 2.54f,
            b = 2.54f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.55f,
            dy1 = 2.8f,
          )
          // c 1.4 0 2.49 -0.7 2.49 -1.95
          curveToRelative(
            dx1 = 1.4f,
            dy1 = 0.0f,
            dx2 = 2.49f,
            dy2 = -0.7f,
            dx3 = 2.49f,
            dy3 = -1.95f,
          )
          // M 6.56 24
          moveTo(x = 6.56f, y = 24.0f)
          // H 3.52
          horizontalLineTo(x = 3.52f)
          // V 7.95
          verticalLineTo(y = 7.95f)
          // h 7.25
          horizontalLineToRelative(dx = 7.25f)
          // c 2.92 0 4.73 1.93 4.73 4.97
          curveToRelative(
            dx1 = 2.92f,
            dy1 = 0.0f,
            dx2 = 4.73f,
            dy2 = 1.93f,
            dx3 = 4.73f,
            dy3 = 4.97f,
          )
          // a 4.4 4.4 0 0 1 -2.99 4.55
          arcToRelative(
            a = 4.4f,
            b = 4.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.99f,
            dy1 = 4.55f,
          )
          // l 3.3 6.53
          lineToRelative(dx = 3.3f, dy = 6.53f)
          // h -3.39
          horizontalLineToRelative(dx = -3.39f)
          // l -2.99 -6.19
          lineToRelative(dx = -2.99f, dy = -6.19f)
          // H 6.56z
          horizontalLineTo(x = 6.56f)
          close()
          // m 3.9 -8.74
          moveToRelative(dx = 3.9f, dy = -8.74f)
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
      .also { _databaseRedis = it }
  }

@Suppress("ObjectPropertyName")
private var _databaseRedis: ImageVector? = null
