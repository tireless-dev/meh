// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceActivatedAdd: ImageVector
  get() {
    val current = _faceActivatedAdd
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceActivatedAdd",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 4.0 26.0 4.0 26.0 0.0 24.0 0.0 24.0 4.0 20.0 4.0 20.0 6.0 24.0 6.0 24.0 10.0 26.0 10.0 26.0 6.0 30.0 6.0 30.0 4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 4
          moveTo(x = 30.0f, y = 4.0f)
          // L 26 4
          lineTo(x = 26.0f, y = 4.0f)
          // L 26 0
          lineTo(x = 26.0f, y = 0.0f)
          // L 24 0
          lineTo(x = 24.0f, y = 0.0f)
          // L 24 4
          lineTo(x = 24.0f, y = 4.0f)
          // L 20 4
          lineTo(x = 20.0f, y = 4.0f)
          // L 20 6
          lineTo(x = 20.0f, y = 6.0f)
          // L 24 6
          lineTo(x = 24.0f, y = 6.0f)
          // L 24 10
          lineTo(x = 24.0f, y = 10.0f)
          // L 26 10
          lineTo(x = 26.0f, y = 10.0f)
          // L 26 6
          lineTo(x = 26.0f, y = 6.0f)
          // L 30 6
          lineTo(x = 30.0f, y = 6.0f)
          // L 30 4z
          lineTo(x = 30.0f, y = 4.0f)
          close()
        }
        // M11.5 11 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5 m9 0 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5 M9 20 a8.13 8.13 0 0 0 14 0Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.5 11
          moveTo(x = 11.5f, y = 11.0f)
          // a 2.5 2.5 0 1 0 2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.5f,
            dy1 = 2.5f,
          )
          // a 2.5 2.5 0 0 0 -2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.5f,
            dy1 = -2.5f,
          )
          // m 9 0
          moveToRelative(dx = 9.0f, dy = 0.0f)
          // a 2.5 2.5 0 1 0 2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.5f,
            dy1 = 2.5f,
          )
          // a 2.5 2.5 0 0 0 -2.5 -2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.5f,
            dy1 = -2.5f,
          )
          // M 9 20
          moveTo(x = 9.0f, y = 20.0f)
          // a 8.13 8.13 0 0 0 14 0z
          arcToRelative(
            a = 8.13f,
            b = 8.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M27.82 14 A12 12 0 1 1 16 4 V2 a14 14 0 1 0 14 14 15 15 0 0 0 -.16 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.82 14
          moveTo(x = 27.82f, y = 14.0f)
          // A 12 12 0 1 1 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
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
          // a 15 15 0 0 0 -0.16 -2z
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.16f,
            dy1 = -2.0f,
          )
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
      .also { _faceActivatedAdd = it }
  }

@Suppress("ObjectPropertyName")
private var _faceActivatedAdd: ImageVector? = null
