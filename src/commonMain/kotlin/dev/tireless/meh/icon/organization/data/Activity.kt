// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Activity: ImageVector
  get() {
    val current = _activity
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Activity",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 29 a1 1 0 0 1 -.92 -.62 L6.33 17 H2 v-2 h5 a1 1 0 0 1 .92 .62 L12 25.28 l8.06 -21.63 A1 1 0 0 1 21 3 a1 1 0 0 1 .93 .68 L25.72 15 H30 v2 h-5 a1 1 0 0 1 -.95 -.68 L21 7 l-8.06 21.35 A1 1 0 0 1 12 29
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 29
          moveTo(x = 12.0f, y = 29.0f)
          // a 1 1 0 0 1 -0.92 -0.62
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.92f,
            dy1 = -0.62f,
          )
          // L 6.33 17
          lineTo(x = 6.33f, y = 17.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 1 1 0 0 1 0.92 0.62
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.92f,
            dy1 = 0.62f,
          )
          // L 12 25.28
          lineTo(x = 12.0f, y = 25.28f)
          // l 8.06 -21.63
          lineToRelative(dx = 8.06f, dy = -21.63f)
          // A 1 1 0 0 1 21 3
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 21.0f,
            y1 = 3.0f,
          )
          // a 1 1 0 0 1 0.93 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.93f,
            dy1 = 0.68f,
          )
          // L 25.72 15
          lineTo(x = 25.72f, y = 15.0f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // a 1 1 0 0 1 -0.95 -0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.95f,
            dy1 = -0.68f,
          )
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // l -8.06 21.35
          lineToRelative(dx = -8.06f, dy = 21.35f)
          // A 1 1 0 0 1 12 29
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 29.0f,
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
      .also { _activity = it }
  }

@Suppress("ObjectPropertyName")
private var _activity: ImageVector? = null
