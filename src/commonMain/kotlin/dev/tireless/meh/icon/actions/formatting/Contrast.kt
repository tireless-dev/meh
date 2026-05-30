// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Contrast: ImageVector
  get() {
    val current = _contrast
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Contrast",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.37 11.84 a14 14 0 0 0 -1.06 -2.51 A14 14 0 0 0 25.9 6.1 a14 14 0 1 0 0 19.8 14 14 0 0 0 2.41 -3.23 14 14 0 0 0 1.06 -2.51 14 14 0 0 0 0 -8.32 M4 16 A12 12 0 0 1 16 4 v24 A12 12 0 0 1 4 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.37 11.84
          moveTo(x = 29.37f, y = 11.84f)
          // a 14 14 0 0 0 -1.06 -2.51
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.06f,
            dy1 = -2.51f,
          )
          // A 14 14 0 0 0 25.9 6.1
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.9f,
            y1 = 6.1f,
          )
          // a 14 14 0 1 0 0 19.8
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 19.8f,
          )
          // a 14 14 0 0 0 2.41 -3.23
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.41f,
            dy1 = -3.23f,
          )
          // a 14 14 0 0 0 1.06 -2.51
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.06f,
            dy1 = -2.51f,
          )
          // a 14 14 0 0 0 0 -8.32
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.32f,
          )
          // M 4 16
          moveTo(x = 4.0f, y = 16.0f)
          // A 12 12 0 0 1 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // A 12 12 0 0 1 4 16
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
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
      .also { _contrast = it }
  }

@Suppress("ObjectPropertyName")
private var _contrast: ImageVector? = null
