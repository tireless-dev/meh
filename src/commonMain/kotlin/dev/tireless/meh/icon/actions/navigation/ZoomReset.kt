// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZoomReset: ImageVector
  get() {
    val current = _zoomReset
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ZoomReset",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22.45 21 A11 11 0 0 0 25 14 10.99 10.99 0 0 0 6 6.47 V2 H4 v8 h8 V8 H7.33 a8.98 8.98 0 1 1 -2.1 8 H3.2 A11 11 0 0 0 14 25 a11 11 0 0 0 7 -2.55 L28.59 30 30 28.59Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.45 21
          moveTo(x = 22.45f, y = 21.0f)
          // A 11 11 0 0 0 25 14
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 14.0f,
          )
          // A 10.99 10.99 0 0 0 6 6.47
          arcTo(
            horizontalEllipseRadius = 10.99f,
            verticalEllipseRadius = 10.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 6.47f,
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
          // H 7.33
          horizontalLineTo(x = 7.33f)
          // a 8.98 8.98 0 1 1 -2.1 8
          arcToRelative(
            a = 8.98f,
            b = 8.98f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.1f,
            dy1 = 8.0f,
          )
          // H 3.2
          horizontalLineTo(x = 3.2f)
          // A 11 11 0 0 0 14 25
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 25.0f,
          )
          // a 11 11 0 0 0 7 -2.55
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = -2.55f,
          )
          // L 28.59 30
          lineTo(x = 28.59f, y = 30.0f)
          // L 30 28.59z
          lineTo(x = 30.0f, y = 28.59f)
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
      .also { _zoomReset = it }
  }

@Suppress("ObjectPropertyName")
private var _zoomReset: ImageVector? = null
