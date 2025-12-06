// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InformationSquare: ImageVector
  get() {
    val current = _informationSquare
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InformationSquare",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 22.0 17.0 14.0 13.0 14.0 13.0 16.0 15.0 16.0 15.0 22.0 12.0 22.0 12.0 24.0 20.0 24.0 20.0 22.0 17.0 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 22
          moveTo(x = 17.0f, y = 22.0f)
          // L 17 14
          lineTo(x = 17.0f, y = 14.0f)
          // L 13 14
          lineTo(x = 13.0f, y = 14.0f)
          // L 13 16
          lineTo(x = 13.0f, y = 16.0f)
          // L 15 16
          lineTo(x = 15.0f, y = 16.0f)
          // L 15 22
          lineTo(x = 15.0f, y = 22.0f)
          // L 12 22
          lineTo(x = 12.0f, y = 22.0f)
          // L 12 24
          lineTo(x = 12.0f, y = 24.0f)
          // L 20 24
          lineTo(x = 20.0f, y = 24.0f)
          // L 20 22
          lineTo(x = 20.0f, y = 22.0f)
          // L 17 22z
          lineTo(x = 17.0f, y = 22.0f)
          close()
        }
        // M16 8 a1.5 1.5 0 1 0 1.5 1.5 A1.5 1.5 0 0 0 16 8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 8
          moveTo(x = 16.0f, y = 8.0f)
          // a 1.5 1.5 0 1 0 1.5 1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.5f,
            dy1 = 1.5f,
          )
          // A 1.5 1.5 0 0 0 16 8
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 8.0f,
          )
        }
        // M26 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v20 a2 2 0 0 1 -2 2 M6 6 v20 h20 V6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // M 6 6
          moveTo(x = 6.0f, y = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 6z
          verticalLineTo(y = 6.0f)
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
      .also { _informationSquare = it }
  }

@Suppress("ObjectPropertyName")
private var _informationSquare: ImageVector? = null
