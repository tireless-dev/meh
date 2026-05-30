// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrangeVertical: ImageVector
  get() {
    val current = _arrangeVertical
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ArrangeVertical",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="28" x="27.0" y="2.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 27 2
          moveTo(x = 27.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 28
          verticalLineToRelative(dy = 28.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M20 15 h-8 a2 2 0 0 1 -2 -2 V7 a2 2 0 0 1 2 -2 h8 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-8 -8 v6 h8 V7z m0 10 h8 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 h-8 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 m8 8 v-6 h-8 v6z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 15
          moveTo(x = 20.0f, y = 15.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m -8 -8
          moveToRelative(dx = -8.0f, dy = -8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
          close()
          // m 0 10
          moveToRelative(dx = 0.0f, dy = 10.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // m 8 8
          moveToRelative(dx = 8.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
        }
        // <rect width="2" height="28" x="3.0" y="2.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 3 2
          moveTo(x = 3.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 28
          verticalLineToRelative(dy = 28.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _arrangeVertical = it }
  }

@Suppress("ObjectPropertyName")
private var _arrangeVertical: ImageVector? = null
