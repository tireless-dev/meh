// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JoinRight: ImageVector
  get() {
    val current = _joinRight
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JoinRight",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 6 a10 10 0 0 0 -4 .84 10 10 0 0 1 0 18.32 A10 10 0 1 0 20 6
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
        }
        // M20 16 a8 8 0 0 0 -6.25 -7.8 A10 10 0 0 1 16 6.84 a10 10 0 0 1 0 18.32 10 10 0 0 1 -2.25 -1.36 A8 8 0 0 0 20 16
        path {
          // M 20 16
          moveTo(x = 20.0f, y = 16.0f)
          // a 8 8 0 0 0 -6.25 -7.8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.25f,
            dy1 = -7.8f,
          )
          // A 10 10 0 0 1 16 6.84
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 6.84f,
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
          // a 10 10 0 0 1 -2.25 -1.36
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.25f,
            dy1 = -1.36f,
          )
          // A 8 8 0 0 0 20 16
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 16.0f,
          )
        }
        // M10 16 a10 10 0 0 0 3.75 7.8 8 8 0 0 0 0 -15.6 A10 10 0 0 0 10 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 16
          moveTo(x = 10.0f, y = 16.0f)
          // a 10 10 0 0 0 3.75 7.8
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.75f,
            dy1 = 7.8f,
          )
          // a 8 8 0 0 0 0 -15.6
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -15.6f,
          )
          // A 10 10 0 0 0 10 16
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 16.0f,
          )
        }
        // M12 24 a8 8 0 1 1 1.75 -15.8 A10 10 0 0 1 16 6.84 a10 10 0 1 0 0 18.32 10 10 0 0 1 -2.25 -1.36 A8 8 0 0 1 12 24
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 24
          moveTo(x = 12.0f, y = 24.0f)
          // a 8 8 0 1 1 1.75 -15.8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.75f,
            dy1 = -15.8f,
          )
          // A 10 10 0 0 1 16 6.84
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 6.84f,
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
          // a 10 10 0 0 1 -2.25 -1.36
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.25f,
            dy1 = -1.36f,
          )
          // A 8 8 0 0 1 12 24
          arcTo(
            horizontalEllipseRadius = 8.0f,
            verticalEllipseRadius = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 24.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _joinRight = it }
  }

@Suppress("ObjectPropertyName")
private var _joinRight: ImageVector? = null
