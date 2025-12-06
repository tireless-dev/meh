// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsTransactionServerZos: ImageVector
  get() {
    val current = _cicsTransactionServerZos
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsTransactionServerZos",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="28.0" cy="10.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 10
          moveTo(x = 28.0f, y = 10.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M18 29 h-7 v-2 h7 c4.96 0 9 -4.04 9 -9 v-4 h2 v4 c0 6.07 -4.93 11 -11 11
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 29
          moveTo(x = 18.0f, y = 29.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // c 4.96 0 9 -4.04 9 -9
          curveToRelative(
            dx1 = 4.96f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = -4.04f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // c 0 6.07 -4.93 11 -11 11
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 6.07f,
            dx2 = -4.93f,
            dy2 = 11.0f,
            dx3 = -11.0f,
            dy3 = 11.0f,
          )
        }
        // M16 21 a5 5 0 1 1 .01 -10.01 A5 5 0 0 1 16 21 m0 -8 a3 3 0 1 0 0 6 3 3 0 0 0 0 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 21
          moveTo(x = 16.0f, y = 21.0f)
          // a 5 5 0 1 1 0.01 -10.01
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.01f,
            dy1 = -10.01f,
          )
          // A 5 5 0 0 1 16 21
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 21.0f,
          )
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // a 3 3 0 1 0 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
          // a 3 3 0 0 0 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
        }
        // <circle cx="4.0" cy="22.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 22
          moveTo(x = 4.0f, y = 22.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M5 18 H3 v-4 C3 7.93 7.93 3 14 3 h7 v2 h-7 c-4.96 0 -9 4.04 -9 9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 18
          moveTo(x = 5.0f, y = 18.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // C 3 7.93 7.93 3 14 3
          curveTo(
            x1 = 3.0f,
            y1 = 7.93f,
            x2 = 7.93f,
            y2 = 3.0f,
            x3 = 14.0f,
            y3 = 3.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // c -4.96 0 -9 4.04 -9 9z
          curveToRelative(
            dx1 = -4.96f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = 4.04f,
            dx3 = -9.0f,
            dy3 = 9.0f,
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
      .also { _cicsTransactionServerZos = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsTransactionServerZos: ImageVector? = null
