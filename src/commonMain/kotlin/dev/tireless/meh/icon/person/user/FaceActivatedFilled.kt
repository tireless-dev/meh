// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceActivatedFilled: ImageVector
  get() {
    val current = _faceActivatedFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceActivatedFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m-4.5 9 A2.5 2.5 0 1 1 9 13.5 a2.5 2.5 0 0 1 2.5 -2.5 M16 24 a8.1 8.1 0 0 1 -7 -4 h14 a8.1 8.1 0 0 1 -7 4 m4.5 -8 a2.5 2.5 0 1 1 2.5 -2.5 2.5 2.5 0 0 1 -2.5 2.5
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
          // a 2.5 2.5 0 0 1 2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = -2.5f,
          )
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // a 8.1 8.1 0 0 1 -7 -4
          arcToRelative(
            a = 8.1f,
            b = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = -4.0f,
          )
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // a 8.1 8.1 0 0 1 -7 4
          arcToRelative(
            a = 8.1f,
            b = 8.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.0f,
            dy1 = 4.0f,
          )
          // m 4.5 -8
          moveToRelative(dx = 4.5f, dy = -8.0f)
          // a 2.5 2.5 0 1 1 2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = -2.5f,
          )
          // a 2.5 2.5 0 0 1 -2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.5f,
            dy1 = 2.5f,
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
      .also { _faceActivatedFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _faceActivatedFilled: ImageVector? = null
