// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.instruments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Box: ImageVector
  get() {
    val current = _box
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Box",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 21 h-8 a2 2 0 0 1 -2 -2 v-2 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2 v2 a2 2 0 0 1 -2 2 m-8 -4 v2 h8 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 21
          moveTo(x = 20.0f, y = 21.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m -8 -4
          moveToRelative(dx = -8.0f, dy = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
        }
        // M28 4 H4 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 v16 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V12 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 m-2 24 H6 V12 h20Z m2 -18 H4 V6 h24z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 4
          moveTo(x = 28.0f, y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // V 12
          verticalLineTo(y = 12.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // m -2 24
          moveToRelative(dx = -2.0f, dy = 24.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 20z
          horizontalLineToRelative(dx = 20.0f)
          close()
          // m 2 -18
          moveToRelative(dx = 2.0f, dy = -18.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
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
      .also { _box = it }
  }

@Suppress("ObjectPropertyName")
private var _box: ImageVector? = null
