// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ViewFilled: ImageVector
  get() {
    val current = _viewFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ViewFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="16.0" radius="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // m -4 0
          moveToRelative(dx = -4.0f, dy = 0.0f)
          // a 4 4 0 1 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 1 1 -8 0z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M30.94 15.66 A16.7 16.7 0 0 0 16 5 16.7 16.7 0 0 0 1.06 15.66 a1 1 0 0 0 0 .68 A16.7 16.7 0 0 0 16 27 a16.7 16.7 0 0 0 14.94 -10.66 1 1 0 0 0 0 -.68 M16 22.5 a6.5 6.5 0 1 1 6.5 -6.5 6.5 6.5 0 0 1 -6.5 6.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.94 15.66
          moveTo(x = 30.94f, y = 15.66f)
          // A 16.7 16.7 0 0 0 16 5
          arcTo(
            horizontalEllipseRadius = 16.7f,
            verticalEllipseRadius = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 5.0f,
          )
          // A 16.7 16.7 0 0 0 1.06 15.66
          arcTo(
            horizontalEllipseRadius = 16.7f,
            verticalEllipseRadius = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 1.06f,
            y1 = 15.66f,
          )
          // a 1 1 0 0 0 0 0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 0.68f,
          )
          // A 16.7 16.7 0 0 0 16 27
          arcTo(
            horizontalEllipseRadius = 16.7f,
            verticalEllipseRadius = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 27.0f,
          )
          // a 16.7 16.7 0 0 0 14.94 -10.66
          arcToRelative(
            a = 16.7f,
            b = 16.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.94f,
            dy1 = -10.66f,
          )
          // a 1 1 0 0 0 0 -0.68
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -0.68f,
          )
          // M 16 22.5
          moveTo(x = 16.0f, y = 22.5f)
          // a 6.5 6.5 0 1 1 6.5 -6.5
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.5f,
            dy1 = -6.5f,
          )
          // a 6.5 6.5 0 0 1 -6.5 6.5
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.5f,
            dy1 = 6.5f,
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
      .also { _viewFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _viewFilled: ImageVector? = null
