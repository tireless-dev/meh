// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceNeutral: ImageVector
  get() {
    val current = _faceNeutral
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceNeutral",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m0 26 a12 12 0 1 1 12 -12 12 12 0 0 1 -12 12
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
          // a 12 12 0 0 1 -12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -12.0f,
            dy1 = 12.0f,
          )
        }
        // M11.5 11 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5 m9 0 a2.5 2.5 0 1 0 2.5 2.5 2.5 2.5 0 0 0 -2.5 -2.5
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
        }
        // <rect width="12" height="2" x="10.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 20
          moveTo(x = 10.0f, y = 20.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
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
      .also { _faceNeutral = it }
  }

@Suppress("ObjectPropertyName")
private var _faceNeutral: ImageVector? = null
