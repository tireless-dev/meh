// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FaceNeutralFilled: ImageVector
  get() {
    val current = _faceNeutralFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FaceNeutralFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 M9 13.5 a2.5 2.5 0 1 1 2.5 2.5 A2.5 2.5 0 0 1 9 13.5 M22 22 H10 v-2 h12Z m-1.5 -6 a2.5 2.5 0 1 1 2.5 -2.5 2.5 2.5 0 0 1 -2.5 2.5
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
          // M 9 13.5
          moveTo(x = 9.0f, y = 13.5f)
          // a 2.5 2.5 0 1 1 2.5 2.5
          arcToRelative(
            a = 2.5f,
            b = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.5f,
            dy1 = 2.5f,
          )
          // A 2.5 2.5 0 0 1 9 13.5
          arcTo(
            horizontalEllipseRadius = 2.5f,
            verticalEllipseRadius = 2.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 13.5f,
          )
          // M 22 22
          moveTo(x = 22.0f, y = 22.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
          // m -1.5 -6
          moveToRelative(dx = -1.5f, dy = -6.0f)
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
      .also { _faceNeutralFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _faceNeutralFilled: ImageVector? = null
