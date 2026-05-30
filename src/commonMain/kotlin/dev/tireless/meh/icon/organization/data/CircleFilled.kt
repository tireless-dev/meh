// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CircleFilled: ImageVector
  get() {
    val current = _circleFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CircleFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="16.0" radius="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // a 10 10 0 1 1 20 0
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 20.0f,
            dy1 = 0.0f,
          )
          // a 10 10 0 1 1 -20 0z
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -20.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M16 30 a14 14 0 1 1 14 -14 14 14 0 0 1 -14 14 m0 -26 a12 12 0 1 0 12 12 A12 12 0 0 0 16 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 14 14 0 1 1 14 -14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 14.0f,
            dy1 = -14.0f,
          )
          // a 14 14 0 0 1 -14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 14.0f,
          )
          // m 0 -26
          moveToRelative(dx = 0.0f, dy = -26.0f)
          // a 12 12 0 1 0 12 12
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 12.0f,
            dy1 = 12.0f,
          )
          // A 12 12 0 0 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
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
      .also { _circleFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _circleFilled: ImageVector? = null
