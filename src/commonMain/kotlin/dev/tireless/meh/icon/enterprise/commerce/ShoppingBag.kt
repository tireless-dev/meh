// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingBag: ImageVector
  get() {
    val current = _shoppingBag
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ShoppingBag",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.76 11.35 A1 1 0 0 0 28 11 h-6 V7 a3 3 0 0 0 -3 -3 h-6 a3 3 0 0 0 -3 3 v4 H4 a1 1 0 0 0 -1 1.15 L4.88 24.3 a2 2 0 0 0 2 1.7 h18.26 a2 2 0 0 0 2 -1.7 L29 12.15 a1 1 0 0 0 -.24 -.8 M12 7 a1 1 0 0 1 1 -1 h6 a1 1 0 0 1 1 1 v4 h-8Z m13.14 17 H6.86 L5.17 13 h21.66Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.76 11.35
          moveTo(x = 28.76f, y = 11.35f)
          // A 1 1 0 0 0 28 11
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 11.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 1 1 0 0 0 -1 1.15
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.15f,
          )
          // L 4.88 24.3
          lineTo(x = 4.88f, y = 24.3f)
          // a 2 2 0 0 0 2 1.7
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 1.7f,
          )
          // h 18.26
          horizontalLineToRelative(dx = 18.26f)
          // a 2 2 0 0 0 2 -1.7
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -1.7f,
          )
          // L 29 12.15
          lineTo(x = 29.0f, y = 12.15f)
          // a 1 1 0 0 0 -0.24 -0.8
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.24f,
            dy1 = -0.8f,
          )
          // M 12 7
          moveTo(x = 12.0f, y = 7.0f)
          // a 1 1 0 0 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // m 13.14 17
          moveToRelative(dx = 13.14f, dy = 17.0f)
          // H 6.86
          horizontalLineTo(x = 6.86f)
          // L 5.17 13
          lineTo(x = 5.17f, y = 13.0f)
          // h 21.66z
          horizontalLineToRelative(dx = 21.66f)
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
      .also { _shoppingBag = it }
  }

@Suppress("ObjectPropertyName")
private var _shoppingBag: ImageVector? = null
