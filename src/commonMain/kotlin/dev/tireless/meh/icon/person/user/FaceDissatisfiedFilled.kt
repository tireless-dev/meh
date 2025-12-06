// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceDissatisfiedFilled: ImageVector
  get() {
    val current = _faceDissatisfiedFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceDissatisfiedFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m-4.5 9 A2.5 2.5 0 1 1 9 13.5 a2.5 2.5 0 0 1 2.54 -2.5Z m9.64 12.92 a6 6 0 0 0 -10.28 0 l-1.71 -1 a8 8 0 0 1 13.7 0Z M20.5 16 a2.5 2.5 0 0 1 0 -5 2.5 2.5 0 0 1 0 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m -4.5 9
          moveToRelative(dx = -4.5f, dy = 9.0f)
          // A 2.5 2.5 0 1 1 9 13.5
          arcTo(
            horizontalEllipseRadius = 2.5f,
            verticalEllipseRadius = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 13.5f,
          )
          // a 2.5 2.5 0 0 1 2.54 -2.5z
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.54f,
            dy1 = -2.5f,
          )
          close()
          // m 9.64 12.92
          moveToRelative(dx = 9.64f, dy = 12.92f)
          // a 6 6 0 0 0 -10.28 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -10.28f,
            dy1 = 0.0f,
          )
          // l -1.71 -1
          lineToRelative(dx = -1.71f, dy = -1.0f)
          // a 8 8 0 0 1 13.7 0z
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 13.7f,
            dy1 = 0.0f,
          )
          close()
          // M 20.5 16
          moveTo(x = 20.5f, y = 16.0f)
          // a 2.5 2.5 0 0 1 0 -5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -5.0f,
          )
          // a 2.5 2.5 0 0 1 0 5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 5.0f,
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
      .also { _faceDissatisfiedFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _faceDissatisfiedFilled: ImageVector? = null
