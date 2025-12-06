// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CatalogPublish: ImageVector
  get() {
    val current = _catalogPublish
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CatalogPublish",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.0 20.0 21.4 21.4 18.8 24.0 28.0 24.0 28.0 26.0 18.8 26.0 21.4 28.6 20.0 30.0 15.0 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // L 21.4 21.4
          lineTo(x = 21.4f, y = 21.4f)
          // L 18.8 24
          lineTo(x = 18.8f, y = 24.0f)
          // L 28 24
          lineTo(x = 28.0f, y = 24.0f)
          // L 28 26
          lineTo(x = 28.0f, y = 26.0f)
          // L 18.8 26
          lineTo(x = 18.8f, y = 26.0f)
          // L 21.4 28.6
          lineTo(x = 21.4f, y = 28.6f)
          // L 20 30
          lineTo(x = 20.0f, y = 30.0f)
          // L 15 25z
          lineTo(x = 15.0f, y = 25.0f)
          close()
        }
        // <rect width="8" height="2" x="14.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 15
          moveTo(x = 14.0f, y = 15.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="8" height="2" x="14.0" y="8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 8
          moveTo(x = 14.0f, y = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // M13 28 H8 v-4 h2 v-2 H8 v-5 h2 v-2 H8 v-5 h2 V8 H8 V4 h18 v16 h2 V4 a2 2 0 0 0 -2 -2 H8 a2 2 0 0 0 -2 2 v4 H4 v2 h2 v5 H4 v2 h2 v5 H4 v2 h2 v4 a2 2 0 0 0 2 2 h5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 28
          moveTo(x = 13.0f, y = 28.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
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
      .also { _catalogPublish = it }
  }

@Suppress("ObjectPropertyName")
private var _catalogPublish: ImageVector? = null
