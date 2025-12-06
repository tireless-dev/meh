// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScisTransparentSupply: ImageVector
  get() {
    val current = _scisTransparentSupply
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScisTransparentSupply",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 23 v3 H8.5 a4.5 4.5 0 0 1 0 -9 H9 v-2 H8.5 a6.5 6.5 0 0 0 0 13 H23 v3 h8 v-8Z m6 6 h-4 v-4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 23
          moveTo(x = 23.0f, y = 23.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
          // a 4.5 4.5 0 0 1 0 -9
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -9.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8.5
          horizontalLineTo(x = 8.5f)
          // a 6.5 6.5 0 0 0 0 13
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 13.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // m 6 6
          moveToRelative(dx = 6.0f, dy = 6.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M21 22 h-2 v-3 h-6 v3 h-2 v-3 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2Z m-5 -6 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m0 -4 a1 1 0 1 0 1 1 1 1 0 0 0 -1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 22
          moveTo(x = 21.0f, y = 22.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
          // m -5 -6
          moveToRelative(dx = -5.0f, dy = -6.0f)
          // a 3 3 0 1 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // a 3 3 0 0 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // m 0 -4
          moveToRelative(dx = 0.0f, dy = -4.0f)
          // a 1 1 0 1 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
        }
        // M23.5 4 H9 V1 H1 v8 h8 V6 h14.5 a4.5 4.5 0 0 1 0 9 H23 v2 h.5 a6.5 6.5 0 0 0 0 -13 M7 7 H3 V3 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 4
          moveTo(x = 23.5f, y = 4.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 1
          verticalLineTo(y = 1.0f)
          // H 1
          horizontalLineTo(x = 1.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 14.5
          horizontalLineToRelative(dx = 14.5f)
          // a 4.5 4.5 0 0 1 0 9
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 9.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 6.5 6.5 0 0 0 0 -13
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -13.0f,
          )
          // M 7 7
          moveTo(x = 7.0f, y = 7.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _scisTransparentSupply = it }
  }

@Suppress("ObjectPropertyName")
private var _scisTransparentSupply: ImageVector? = null
