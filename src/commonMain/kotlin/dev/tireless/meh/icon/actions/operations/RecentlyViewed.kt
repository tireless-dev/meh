// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RecentlyViewed: ImageVector
  get() {
    val current = _recentlyViewed
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RecentlyViewed",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.59 22.0 15.0 16.41 15.0 7.0 17.0 7.0 17.0 15.58 22.0 20.59 20.59 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.59 22
          moveTo(x = 20.59f, y = 22.0f)
          // L 15 16.41
          lineTo(x = 15.0f, y = 16.41f)
          // L 15 7
          lineTo(x = 15.0f, y = 7.0f)
          // L 17 7
          lineTo(x = 17.0f, y = 7.0f)
          // L 17 15.58
          lineTo(x = 17.0f, y = 15.58f)
          // L 22 20.59
          lineTo(x = 22.0f, y = 20.59f)
          // L 20.59 22z
          lineTo(x = 20.59f, y = 22.0f)
          close()
        }
        // M16 2 A14 14 0 0 0 6 6.23 V2 H4 v8 h8 V8 H7.08 A12 12 0 1 1 4 16 H2 A14 14 0 1 0 16 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // A 14 14 0 0 0 6 6.23
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 6.23f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 7.08
          horizontalLineTo(x = 7.08f)
          // A 12 12 0 1 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 16.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // A 14 14 0 1 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
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
      .also { _recentlyViewed = it }
  }

@Suppress("ObjectPropertyName")
private var _recentlyViewed: ImageVector? = null
