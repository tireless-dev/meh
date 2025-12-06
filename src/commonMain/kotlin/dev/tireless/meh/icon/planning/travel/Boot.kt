// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Boot: ImageVector
  get() {
    val current = _boot
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Boot",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 17 h-6 a1 1 0 0 1 -1 -1 V4 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 v-6 a5 5 0 0 0 -5 -5 m3 5 v2 h-4 v-5 h1 a3 3 0 0 1 3 3 M15 4 v2 h-4 v2 h4 v2 h-4 v2 h4 v2 h-4 v2 h4 a3 3 0 0 0 3 3 h3 v5 h-6.84 l-3 -1 H5 V4Z m10 24 v-1 h-2 v1 h-2 v-1 h-2 v1 h-2 v-1 h-2 v1 h-2 v-1 h-2 v1 H5 v-3 h5.84 l3 1 H27 v2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 17
          moveTo(x = 24.0f, y = 17.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 1 1 0 0 1 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // m 3 5
          moveToRelative(dx = 3.0f, dy = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // a 3 3 0 0 1 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // M 15 4
          moveTo(x = 15.0f, y = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 3 3 0 0 0 3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 3.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h -6.84
          horizontalLineToRelative(dx = -6.84f)
          // l -3 -1
          lineToRelative(dx = -3.0f, dy = -1.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // m 10 24
          moveToRelative(dx = 10.0f, dy = 24.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 5.84
          horizontalLineToRelative(dx = 5.84f)
          // l 3 1
          lineToRelative(dx = 3.0f, dy = 1.0f)
          // H 27
          horizontalLineTo(x = 27.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
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
      .also { _boot = it }
  }

@Suppress("ObjectPropertyName")
private var _boot: ImageVector? = null
