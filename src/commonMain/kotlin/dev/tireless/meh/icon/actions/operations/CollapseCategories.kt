// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CollapseCategories: ImageVector
  get() {
    val current = _collapseCategories
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CollapseCategories",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="14" height="2" x="14.0" y="25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 25
          moveTo(x = 14.0f, y = 25.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <polygon points="7.17 26.0 4.59 28.58 6.0 30.0 10.0 26.0 6.0 22.0 4.58 23.41 7.17 26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.17 26
          moveTo(x = 7.17f, y = 26.0f)
          // L 4.59 28.58
          lineTo(x = 4.59f, y = 28.58f)
          // L 6 30
          lineTo(x = 6.0f, y = 30.0f)
          // L 10 26
          lineTo(x = 10.0f, y = 26.0f)
          // L 6 22
          lineTo(x = 6.0f, y = 22.0f)
          // L 4.58 23.41
          lineTo(x = 4.58f, y = 23.41f)
          // L 7.17 26z
          lineTo(x = 7.17f, y = 26.0f)
          close()
        }
        // <rect width="14" height="2" x="14.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 15
          moveTo(x = 14.0f, y = 15.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <polygon points="7.17 16.0 4.59 18.58 6.0 20.0 10.0 16.0 6.0 12.0 4.58 13.41 7.17 16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.17 16
          moveTo(x = 7.17f, y = 16.0f)
          // L 4.59 18.58
          lineTo(x = 4.59f, y = 18.58f)
          // L 6 20
          lineTo(x = 6.0f, y = 20.0f)
          // L 10 16
          lineTo(x = 10.0f, y = 16.0f)
          // L 6 12
          lineTo(x = 6.0f, y = 12.0f)
          // L 4.58 13.41
          lineTo(x = 4.58f, y = 13.41f)
          // L 7.17 16z
          lineTo(x = 7.17f, y = 16.0f)
          close()
        }
        // <rect width="14" height="2" x="14.0" y="5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 5
          moveTo(x = 14.0f, y = 5.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -14z
          horizontalLineToRelative(dx = -14.0f)
          close()
        }
        // <polygon points="7.17 6.0 4.59 8.58 6.0 10.0 10.0 6.0 6.0 2.0 4.58 3.41 7.17 6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.17 6
          moveTo(x = 7.17f, y = 6.0f)
          // L 4.59 8.58
          lineTo(x = 4.59f, y = 8.58f)
          // L 6 10
          lineTo(x = 6.0f, y = 10.0f)
          // L 10 6
          lineTo(x = 10.0f, y = 6.0f)
          // L 6 2
          lineTo(x = 6.0f, y = 2.0f)
          // L 4.58 3.41
          lineTo(x = 4.58f, y = 3.41f)
          // L 7.17 6z
          lineTo(x = 7.17f, y = 6.0f)
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
      .also { _collapseCategories = it }
  }

@Suppress("ObjectPropertyName")
private var _collapseCategories: ImageVector? = null
