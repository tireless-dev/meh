// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinOuter: ImageVector
  get() {
    val current = _joinOuter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JoinOuter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 6 a10 10 0 0 0 -4 .84 10 10 0 0 1 0 18.32 A10 10 0 1 0 20 6 M10 16 a10 10 0 0 1 6 -9.16 10 10 0 1 0 0 18.32 A10 10 0 0 1 10 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 6
          moveTo(x = 20.0f, y = 6.0f)
          // a 10 10 0 0 0 -4 0.84
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 0.84f,
          )
          // a 10 10 0 0 1 0 18.32
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 18.32f,
          )
          // A 10 10 0 1 0 20 6
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 6.0f,
          )
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // a 10 10 0 0 1 6 -9.16
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = -9.16f,
          )
          // a 10 10 0 1 0 0 18.32
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 18.32f,
          )
          // A 10 10 0 0 1 10 16
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 16.0f,
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
      .also { _joinOuter = it }
  }

@Suppress("ObjectPropertyName")
private var _joinOuter: ImageVector? = null
