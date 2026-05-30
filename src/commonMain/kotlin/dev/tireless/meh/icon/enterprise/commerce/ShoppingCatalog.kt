// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShoppingCatalog: ImageVector
  get() {
    val current = _shoppingCatalog
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ShoppingCatalog",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="4" x="17.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 24
          moveTo(x = 17.0f, y = 24.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="24.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 24
          moveTo(x = 24.0f, y = 24.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="17.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 17
          moveTo(x = 17.0f, y = 17.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="24.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 17
          moveTo(x = 24.0f, y = 17.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M28 11 h-6 V7 c0 -1.7 -1.3 -3 -3 -3 h-6 c-1.7 0 -3 1.3 -3 3 v4 H4 c-.6 0 -1 .4 -1 1 v.2 l1.9 12.1 c.1 1 1 1.7 2 1.7 H15 v-2 H6.9 L5.2 13 H28z M12 7 c0 -.6 .4 -1 1 -1 h6 c.6 0 1 .4 1 1 v4 h-8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 11
          moveTo(x = 28.0f, y = 11.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // c 0 -1.7 -1.3 -3 -3 -3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.7f,
            dx2 = -1.3f,
            dy2 = -3.0f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // c -1.7 0 -3 1.3 -3 3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = 1.3f,
            dx3 = -3.0f,
            dy3 = 3.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // c -0.6 0 -1 0.4 -1 1
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = 0.4f,
            dx3 = -1.0f,
            dy3 = 1.0f,
          )
          // v 0.2
          verticalLineToRelative(dy = 0.2f)
          // l 1.9 12.1
          lineToRelative(dx = 1.9f, dy = 12.1f)
          // c 0.1 1 1 1.7 2 1.7
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 1.0f,
            dx2 = 1.0f,
            dy2 = 1.7f,
            dx3 = 2.0f,
            dy3 = 1.7f,
          )
          // H 15
          horizontalLineTo(x = 15.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6.9
          horizontalLineTo(x = 6.9f)
          // L 5.2 13
          lineTo(x = 5.2f, y = 13.0f)
          // H 28z
          horizontalLineTo(x = 28.0f)
          close()
          // M 12 7
          moveTo(x = 12.0f, y = 7.0f)
          // c 0 -0.6 0.4 -1 1 -1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.6f,
            dx2 = 0.4f,
            dy2 = -1.0f,
            dx3 = 1.0f,
            dy3 = -1.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // c 0.6 0 1 0.4 1 1
          curveToRelative(
            dx1 = 0.6f,
            dy1 = 0.0f,
            dx2 = 1.0f,
            dy2 = 0.4f,
            dx3 = 1.0f,
            dy3 = 1.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
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
      .also { _shoppingCatalog = it }
  }

@Suppress("ObjectPropertyName")
private var _shoppingCatalog: ImageVector? = null
