// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ErrorOutline: ImageVector
  get() {
    val current = _errorOutline
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ErrorOutline",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="18" x="14.9" y="7.2" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.999642 10.555278
          moveTo(x = 8.999642f, y = 10.555278f)
          // l 1.4142135 -1.4142135
          lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
          // l 12.7279215 12.7279215
          lineToRelative(dx = 12.7279215f, dy = 12.7279215f)
          // l -1.4142135 1.4142135z
          lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
          close()
        }
        // M16 2 A13.9 13.9 0 0 0 2 16 a13.9 13.9 0 0 0 14 14 13.9 13.9 0 0 0 14 -14 A13.9 13.9 0 0 0 16 2 m0 26 a12 12 0 1 1 12 -12 12.04 12.04 0 0 1 -12 12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // A 13.9 13.9 0 0 0 2 16
          arcTo(
            horizontalEllipseRadius = 13.9f,
            verticalEllipseRadius = 13.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // a 13.9 13.9 0 0 0 14 14
          arcToRelative(
            a = 13.9f,
            b = 13.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // a 13.9 13.9 0 0 0 14 -14
          arcToRelative(
            a = 13.9f,
            b = 13.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // A 13.9 13.9 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 13.9f,
            verticalEllipseRadius = 13.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // a 12 12 0 1 1 12 -12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 12.0f,
            dy1 = -12.0f,
          )
          // a 12.04 12.04 0 0 1 -12 12
          arcToRelative(
            a = 12.04f,
            b = 12.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -12.0f,
            dy1 = 12.0f,
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
      .also { _errorOutline = it }
  }

@Suppress("ObjectPropertyName")
private var _errorOutline: ImageVector? = null
