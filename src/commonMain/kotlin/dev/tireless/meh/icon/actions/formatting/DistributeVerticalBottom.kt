// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DistributeVerticalBottom: ImageVector
  get() {
    val current = _distributeVerticalBottom
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DistributeVerticalBottom",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 28
          moveTo(x = 2.0f, y = 28.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M24 26 H8 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h16 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m0 -6 H8 v4 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 26
          moveTo(x = 24.0f, y = 26.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
        }
        // <rect width="28" height="2" x="2.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 12
          moveTo(x = 2.0f, y = 12.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M20 10 h-8 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 m0 -6 h-8 v4 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 10
          moveTo(x = 20.0f, y = 10.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _distributeVerticalBottom = it }
  }

@Suppress("ObjectPropertyName")
private var _distributeVerticalBottom: ImageVector? = null
